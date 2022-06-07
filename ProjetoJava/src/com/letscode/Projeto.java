package com.letscode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Projeto {

    public static void main(String[] args) throws IOException  {

        Path pathAtores = Paths.get("OscarAtores.csv");
        Path pathAtrizes = Paths.get("OscarAtrizes.csv");

        List<Listas> listaAtores = readlist(pathAtores);
        List<Listas> listaAtrizes = readlist(pathAtrizes);

    }

    public static List<Listas> readlist(Path indicados) {
        List<Listas> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(indicados)))) {

            String line = br.readLine();
            line = br.readLine();

            while (line != null) {
                String[] vect = line.split(";");
                int Index = Integer.parseInt((vect[0]));
                int Year = Integer.parseInt(vect[1]);
                int Age = Integer.parseInt(vect[2]);
                String Name = vect[3];
                String Movie = vect[4];

                Listas premiacao = new Listas(Index, Year, Age, Name, Movie);

                list.add(premiacao);

                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String MaisJovemAtor(List<Listas> premiados) {
        String atorJovem = premiados.stream().min(Comparator.comparing(Listas::getAge)).get().getName();
        System.out.println("Ator mais jovem a ganhar um Oscar: " + atorJovem);
        return atorJovem;
    }
}



