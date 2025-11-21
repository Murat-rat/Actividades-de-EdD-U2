package com.example.sortsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sortsapi.dto.RequestCadena;
import com.example.sortsapi.service.SortService;

//Se encarga de recibir las peticinoes
@RestController//Configuracion de controlador con una tag
@RequestMapping("/api/sort") //Configuracion del endpoint de la api
public class SortController {
    @Autowired
    SortService service;

    @PostMapping("/bubble")
    public int[] bubbleSort(@RequestBody RequestCadena request){
        //@RequestBody se usa para mandar en formato en json

        //Recibe el string y lo convierte a un array de strings
        //El metodo split los se separa por comas
        String[] partes = request.getCadena().split(",");
        int[] numeros = new int[partes.length]; //Declaracion de el arreglo de numeros

        for (int i = 0; i < partes.length; i++) {
            try {
                numeros[i] = Integer.parseInt(partes[i]); 
            } catch (Exception e) {
                numeros[i] = 0;
            }
        }

        return service.sort(numeros);
    }

    @PostMapping("/selection")
    public int[] SelectionSort(@RequestBody RequestCadena request) {
        String[] partes= request.getCadena().split(",");
        int [] numeros = new int[partes.length];

        for (int i = 0; i < partes.length; i++) { 
            numeros[i] = Integer.parseInt(partes[i]);
        }

        return service.selectionSort(numeros);
    }

    @PostMapping("/insertion")
    public int[] insertionSort(@RequestBody RequestCadena request) {
        String[] partes= request.getCadena().split(",");
        int [] numeros = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]); 
        }

        return service.insertionSort(numeros);
    }
}