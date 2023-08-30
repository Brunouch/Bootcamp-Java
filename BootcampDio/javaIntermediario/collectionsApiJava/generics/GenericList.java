package javaIntermediario.collectionsApiJava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    
    public static void main(String[] args) {
        
        //List sem Generics
        List listaS = new ArrayList();
        listaS.add("Elemento 1");
        listaS.add(10);

        for(Object elemento : listaS){
            String str =  (String)elemento;
            System.out.println(str);
        }

        //List com Generic
        List<String> listaG = new ArrayList<>();
        listaG.add("Elemento 1");
        listaG.add("Elemento 2");

        for(String elemento: listaG){
            System.out.println(elemento);
        }
    }
}
