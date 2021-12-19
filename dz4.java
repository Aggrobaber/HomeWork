/**
 * Java2 HomeWork#4
 *
 * @author Vladimir Gomenyuk
 * @version 18.12.2021-19.12.2021
 */

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_0 = '0';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU_WON!!!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_0)) {
                System.out.println("AI WON!!!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!fillTable(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!fillTable(x, y));
        table[y][x] = SIGN_0;
    }

    boolean fillTable(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isWin(char ch) {
        boolean isWin = false;
        boolean horizontally;
        boolean vertically;
        boolean diagonalL = true;
        boolean diagonalR = true;
        for (int i = 0; i < table.length; i++) {
            horizontally = true;
            for (int j = 0; j < table.length; j++) {
                horizontally = horizontally & (table[i][j] == ch);
            }
            isWin = isWin || horizontally;
            vertically = true;
            for (int j = 0; j < table.length; j++) {
                vertically = vertically & (table[j][i] == ch);
            }
            isWin = isWin || vertically;
            diagonalL = diagonalL & (table[i][i] == ch);
            diagonalR = diagonalR & (table[table.length - i - 1][i] == ch);
        }
        return isWin || diagonalL || diagonalR;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}