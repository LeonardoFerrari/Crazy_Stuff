/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieomdb;

import com.google.gson.JsonElement;

/**
 *
 * @author ricarte
 */
public class Movie {

    private String Title;
    private String Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Writer;
    private String Actors;    
    private String Plot;
    private String Language;
    private String Country;
    private String Awards;
    private String Poster;
    private JsonElement Ratings;
    private String Metascore;
    private String imdbRating;
    private String imdbVotes;
    private String imdbID;
    private String Type;
    private String DVD;
    private String BoxOffice;
    private String Production;
    private String Website;
    private boolean Response;

    public String getActors() {
        return Actors;
    }

    public String getDirector() {
        return Director;
    }

    public String getImdbId() {
        return imdbID;
    }

    public String getTitle() {
        return Title;
    }

    public boolean validResponse() {
        return Response;
    }

    public String getYear() {
        return Year;
    }

    public String getRuntime() {
        return Runtime;
    }

    public String getImdbRating() {
        return imdbRating;
    }
    
    

}
