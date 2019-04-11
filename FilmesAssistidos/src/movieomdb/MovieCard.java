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
public class MovieCard {

    private String Title;
    private String Year;
    private String imdbID;
    private String Type;
    private String Poster;

    public String getImdbId() {
        return imdbID;
    }

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

}
