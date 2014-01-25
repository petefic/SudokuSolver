/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.Random;

public class Puzzle {

    // 9x9 puzzle
    private int puzzle[][] = new int[9][9];

    // 9x9 array of lists of possible numbers that can go in a square
    private ArrayList<Integer>[][] availableNums = new ArrayList[9][9];

    // set everything up before filling the board
    public int[][] generate() {

        // initialize available numbers array
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                availableNums[i][j] = new ArrayList<Integer>();
            }
        }

        // fill each list of available numbers with 1-9
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int x = 1; x < 10; x++) {
                    availableNums[i][j].add(x);
                }
            }
        }

        // start solving the board at the first square
        solve(0, 0);

        return puzzle;
    }

    // remove numbers to make board solvable
    public int[][] unsolve(int[][] solved) {

        Random gen = new Random();
        int count, x, y;
        count = 0;

        // remove 40 spaces
        while (count < 40) {
            // generate coords of space to clear
            x = gen.nextInt(9);
            y = gen.nextInt(9);

            // confirm generated coords haven't already been cleared
            if (puzzle[x][y] != 0) {
                // clear space
                puzzle[x][y] = 0;
                // find next space
                count++;
            }
        }

        return solved;
    }

    private void solve(int row, int col) {

        Random gen = new Random();
        boolean numFound = false;

        // set current square to empty
        puzzle[row][col] = 0;

        // while we still have numbers to try and have not found a valid number
        while (availableNums[row][col].isEmpty() == false || numFound == false) {

            // pick random number from list of available numbers
            int num = availableNums[row][col].get(gen
                    .nextInt(availableNums[row][col].size()));

            // check if generated number is valid
            if (isLegal(row, col, num) == true) {

                // add number to square
                puzzle[row][col] = num;
                numFound = true;

                // remove added number from list of available numbers
                availableNums[row][col].remove(Integer.valueOf(num));

                break;

            } else {
                // remove number from list of available numbers
                availableNums[row][col].remove(Integer.valueOf(num));
                // if we are out of numbers, stop trying to find a number
                if (availableNums[row][col].isEmpty()) {
                    break;
                }
            }

        }

		// if out of numbers, replenish this squares numbers
        // go back 1 square
        if (availableNums[row][col].isEmpty() == true) {

            for (int x = 1; x < 10; x++) {
                availableNums[row][col].add(x);
            }

            back(row, col);
        } // if a number was added and there are still more empty squares
        // go forward 1 square
        else if (numFound == true && (emptyCheck() == true)) {
            next(row, col);
        }
    }

    // move to the next square
    private void next(int row, int col) {
        if (col == 8) {
            solve(row + 1, 0);
        } else {
            solve(row, col + 1);
        }
    }

    // move to the previous square
    private void back(int row, int col) {
        if (col == 0) {
            solve(row - 1, 8);
        } else {
            solve(row, col - 1);
        }
    }

    private boolean isLegal(int row, int col, int num) {

        // check row
        for (int x = 0; x < 9; x++) {
            if (puzzle[row][x] == num) {
                return false;
            }
        }

        // check col
        for (int x = 0; x < 9; x++) {
            if (puzzle[x][col] == num) {
                return false;
            }
        }

        // check 3x3 section
        int[][] section = new int[3][3];
        section = getSection(row, col);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (section[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // return the 3x3 section the given coordinates are in
    private int[][] getSection(int xPos, int yPos) {

        int[][] section = new int[3][3];
        int xIndex = 3 * (xPos / 3);
        int yIndex = 3 * (yPos / 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                section[i][j] = puzzle[xIndex + i][yIndex + j];
            }
        }

        return section;

    }

	// searches puzzle for empty squares
    // 0 denotes empty
    private boolean emptyCheck() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (puzzle[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}