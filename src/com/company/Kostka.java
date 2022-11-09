package com.company;

public class Kostka {

    public int x = 0;


    public void createFirst(int k, int n, int wordLength, char arr[][], String text){
        if(n <= 0) return;
        if(n == 1){
            arr[k][arr.length/2] = text.charAt(x++ % wordLength);
            return;
        }
        for(int j = k; j < n + k; j++){
            arr[k][j] = text.charAt((x++) % wordLength);
        }
        for(int i = k + 1; i < n + k - 1; i++){
            arr[i][n - 1 + k] = text.charAt((x++) % wordLength);
        }
        for (int i = n + k - 1; i > k - 1; i--){
            arr[n - 1 + k][i] = text.charAt((x++) % wordLength);
        }
        for (int i = n + k - 2; i > k; i--){
            arr[i][k] = text.charAt((x++) % wordLength);
        }
        createFirst(k + 1, n - 2, wordLength, arr, text);
    }

    public void createSecond(int k, int n, int wordLength, char arr[][], String text){
        if(k < 0) return;
        if(n == 1){
            arr[k][arr.length/2] = text.charAt(x++ % wordLength);
            createSecond(k - 1, n + 2, wordLength, arr, text);
            return;
        }
        else{
            for(int i = n + k - 2; i > k; i--){
                arr[i][k] = text.charAt((x++) % wordLength);
            }
            for (int j = k; j < n + k; j++){
                arr[k][j] = text.charAt((x++) % wordLength);
            }
            for (int i = k + 1; i < n + k - 1; i++){
                arr[i][n - 1 + k] = text.charAt((x++) % wordLength);
            }
            for (int i = n + k - 1; i > k - 1; i--){
                arr[n - 1 + k][i] = text.charAt((x++) % wordLength);
            }
            createSecond(k - 1, n + 2, wordLength, arr, text);
        }
    }

}
