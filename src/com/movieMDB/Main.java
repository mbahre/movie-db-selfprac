package com.movieMDB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // How many movies will you want to add to the collection
        System.out.print("How many movies to be added to the collection: ");
        Scanner in = new Scanner(System.in);
        int numOfMovies = in.nextInt();
        Movies[] movie = new Movies[numOfMovies];

        // loop for creating number of movies
        for(int m = 0; m < numOfMovies; m++){
            Movies movie1 = new Movies();
        }
    }
}