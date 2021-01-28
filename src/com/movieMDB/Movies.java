package com.movieMDB;

import java.util.Scanner;

public class Movies {

    private String movieName;
    private int yearOfMovie;
    private String category;

    public Movies() {
        System.out.print("Name of the movie you want to add to the collection: ");
        Scanner in = new Scanner(System.in);
        this.movieName = in.nextLine();

        System.out.print("The year the movie was made: ");
        this.yearOfMovie = in.nextInt();
        in.nextLine();

        System.out.print("\n1 Comedy\n2 Romantic\n3 Horror\n4 Action\n5 SciFi\nMovie Category: ");
        this.category = in.nextLine();
        System.out.println(movieName + " has been added successfully.");
    }
}
