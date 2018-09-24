package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            ArrayList<String> movieList = new ArrayList<String>();
            Scanner movies = new Scanner(System.in);
            String MovieListTitle;
            System.out.println("Please List your Favorite movies :");
            boolean checkMoreMoviesList = true;//if you don't have any more movies please enter "Enter" key
            while (checkMoreMoviesList) {
                MovieListTitle = movies.nextLine();
                if (!MovieListTitle.isEmpty()) {
                    movieList.add(MovieListTitle);
                    checkMoreMoviesList = true;
                } else {
                    checkMoreMoviesList = false;
                }
            }
            Collections.sort(movieList);
            System.out.println("Your Favorite Movies are:");
            for (String yourFavoriteMovies : movieList) {
                System.out.println(yourFavoriteMovies);
            }
        }
    }

