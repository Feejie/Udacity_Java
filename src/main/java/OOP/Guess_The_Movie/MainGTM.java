package OOP.Guess_The_Movie;

import OOP.Guess_The_Movie.Game;

public class MainGTM {

    public static void main(String[] args) {

        Game game = new Game("A:/Mine/Java/Udacity_Java/src/main/resources/movies.txt");

        game.start();
    }
}
