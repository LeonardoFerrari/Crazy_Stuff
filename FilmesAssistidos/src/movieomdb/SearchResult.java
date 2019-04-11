/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieomdb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ricarte
 */
public class SearchResult {
    private List<MovieCard> Search;
    private int totalResults;
    private boolean Response;
    
    public SearchResult() {
        Search = new ArrayList<>();
    }
    
    public int getTotalResults() {
        return totalResults;
    }
    
    public boolean validResponse() {
        return Response;
    }
    
    public List<MovieCard> getResults() {
        return Collections.unmodifiableList(Search);
    }
}
