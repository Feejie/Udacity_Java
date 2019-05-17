package OOP.Guess_The_Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private String movieList;
    private File file;

    public Game(String movieList) {
        this.movieList = movieList;
        this.file = new File(movieList);
    }

    public String getMovieList() {
        try {
            Scanner fileScanner = new Scanner(file);
            String list = null;
            while (fileScanner.hasNextLine()) {
                list += fileScanner.nextLine() + "\n";
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }

    public String getRandomMovie() {
        String[] arr = getMovieList().split("\n");

        int random = (int) (Math.random() * arr.length);

        return arr[random];
    }

    public void start() {
        String[] arr = getRandomMovie().split("");
        StringBuilder word = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        for (String o: arr) {
            word.append("_");
        }
        String[] wArr = word.toString().split("");
        StringBuilder str;

        String[] mArr = new String[10];
        StringBuilder mLetter;

        int miss = 0;
        String l;

        while (true) {
            str = new StringBuilder();
            mLetter = new StringBuilder();

            for (String o: wArr) {
                str.append(o);
            }

            for (String o: mArr) {
                if (o != null) {
                    mLetter.append(o).append(" ");
                }
            }

            if (!Arrays.asList(wArr).contains("_")) {
                System.out.println("You have guessed '" + str + "' correctly");
                System.out.println("You Win!");
                break;
            } else if (miss == 10){
                System.out.println("You have guessed (" + miss + ") wrong letters");
                System.out.println("You lose");
                break;
            }

            System.out.println("You are guessing: " + str);
            System.out.println("You have guessed (" + miss + ") wrong letters: " + mLetter);

            System.out.println("Guess a letter: ");
            l = scanner.next();

//            if (Arrays.asList(arr).contains(l)) {
//                Arrays.asList(wArr).set(Arrays.asList(arr).indexOf(l), l);
//            } else if (Arrays.asList(arr).contains(" ") && l.equalsIgnoreCase("-")){
//                Arrays.asList(wArr).set(Arrays.asList(arr).indexOf(" "), l);
//            } else {
//                miss++;
//            }

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(l) ||
                        (arr[i].equalsIgnoreCase(" ") && l.equalsIgnoreCase("-"))) {
                    wArr[i] = l;
                    --j;
                } else {
                    j++;
                }

                if (j == arr.length - 1) {
                    mArr[miss] = l;
                    miss++;
                }
            }

        }


    }


}
