package domain.controller;

import domain.Movie;
import domain.User;
import java.util.HashMap;
import java.util.Vector;

public interface Strategy {
    public void set_users(HashMap<Integer, User> _users);
    public void set_movies(HashMap<Integer, Movie> _movies);
    public Vector[] get10Recomendations(int userId);
}
