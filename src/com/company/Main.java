package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("In.txt"));
        PrintWriter write = new PrintWriter("Out.txt");
        Kostka k = new Kostka();
        int n = sc.nextInt();
        String w = sc.next();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0) {
                char[][] arr = new char[n][n];
                k.createFirst(0, n, w.length(), arr, w);
                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < n; y++) {
                        write.write(arr[x][y]);
                        write.write(" ");
                    }
                    write.write('\n');
                }
                write.write('\n');
            }
            else{
                char[][] arr = new char[n][n];
                k.createSecond(arr.length/2, n%2, w.length(), arr, w);
                for(int j = 0; j < n; j++){
                    for(int l = 0; l < n; l++){
                        write.write(arr[j][l]);
                        write.write(" ");
                    }
                    write.write("\n");
                }
                write.write("\n");
            }
        }
        write.close();
    }
}
