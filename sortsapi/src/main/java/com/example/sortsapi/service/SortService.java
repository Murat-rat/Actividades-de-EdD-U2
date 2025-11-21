package com.example.sortsapi.service;

import org.springframework.stereotype.Service;

//Este es el corazon de la app en donde vive la logica de nuestra api
@Service //Indica que se puede inyectar esta clase en otras clases
public class SortService {
    public int[] sort(int[] arr){
        int n = arr.length;
        boolean swapped=false;
        //Condicionamos con un for para que no se desborde que recorrra el arreglo
        for (int i = 0; i < n-1; i++) {
            swapped=false;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}