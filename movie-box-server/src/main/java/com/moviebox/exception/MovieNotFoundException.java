package com.moviebox.exception;

/**
 * @author Elham
 * @since 6/26/2020
 */
public class MovieNotFoundException extends Exception {
    public MovieNotFoundException(String msg) {
        super(msg);
    }
}
