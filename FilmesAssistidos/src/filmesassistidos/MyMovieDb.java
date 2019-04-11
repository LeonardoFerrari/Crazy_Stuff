/*
 * Faculdade de Tecnologia, UNICAMP
 * Professor responsável: Ivan L. M. Ricarte
 */
package filmesassistidos;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ricarte at ft.unicamp.br
 */
public class MyMovieDb {
    
    private Map<String, WatchedMovie> myMovies;
    private final String movieStore = "meusfilmes.dat";
    
    public MyMovieDb() {
        Path p = Paths.get(movieStore);
        if (Files.exists(p)) {
            load();            
        } else {
            myMovies = new HashMap<>();
        }
        
    }
    
    public void addMovie(WatchedMovie movie) {
        WatchedMovie stored = myMovies.get(movie.getImdbId());
        if (stored == null) {
            myMovies.put(movie.getImdbId(), movie);
        } else {
            List<LocalDate> watchedList = movie.getWatchedOn();
            LocalDate watched = watchedList.get(watchedList.size() - 1);
            stored.addWatchedOn(watched);
            stored.setMyRating(movie.getMyRating());
        }
        save();
    }
    
    public WatchedMovie getMovie(String id) {
        return myMovies.get(id);
    }
    
    public Collection<WatchedMovie> getAllMovies() {
        return myMovies.values();
    }
    
    private void save() {
        Path p = Paths.get(movieStore);
        
        try {
            OutputStream os = Files.newOutputStream(p);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(myMovies);
        } catch (IOException ex) {
            Logger.getLogger(MyMovieDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void load() {
        Path p = Paths.get(movieStore);
        
        try {
            InputStream is = Files.newInputStream(p);
            ObjectInputStream ois = new ObjectInputStream(is);
            myMovies = (HashMap) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MyMovieDb.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
