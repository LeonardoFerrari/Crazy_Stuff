/*
 * Faculdade de Tecnologia, UNICAMP
 * Professor responsável: Ivan L. M. Ricarte
 */

package filmesassistidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ricarte at ft.unicamp.br
 */
public class WatchedMovie implements java.io.Serializable {
    private final String imdbId;
    private final String title;
    private final String year;
    private String director;
    private final List<String> actors;
    private String runtime;
    private String imdbRating;
    private double myRating;
    private List<LocalDate> watchedOn;
    
    public WatchedMovie(String id, String title, String year) {
        imdbId = id;
        this.title = title;
        this.year = year;
        actors = new ArrayList<>();
        watchedOn = new ArrayList<>();
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getYear() {
        return year;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String name) {
        director = name;
    }
    
    public void addActor(String name) {
        actors.add(name);
    }
    
    public List<String> getActors() {
        return Collections.unmodifiableList(actors);
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public double getMyRating() {
        return myRating;
    }

    public void setMyRating(double myRating) {
        this.myRating = myRating;
    }

    public List<LocalDate> getWatchedOn() {
        return watchedOn;
    }
    
    public int getWatchedCount() {
        return watchedOn.size();
    }

    public void addWatchedOn(LocalDate watchedOn) {
        this.watchedOn.add(watchedOn);
    }

    @Override
    public String toString() {
        StringBuffer actorsList = new StringBuffer();
        for (String actor : actors) {
            actorsList.append(actor + "; ");
        }
        StringBuffer watchedList = new StringBuffer();
        for (LocalDate d : watchedOn) {
            watchedList.append(d.toString() + "; ");
        }
        return "WatchedMovie{" + "imdbId=" + imdbId + ", title=" + title + ", year=" + year + ", director=" + director + ", actors=" + actorsList + ", runtime=" + runtime + ", imdbRating=" + imdbRating + ", myRating=" + myRating + ", watchedOn=" + watchedList + '}';
    }

    public String getImdbId() {
        return imdbId;
    }
    
    
}
