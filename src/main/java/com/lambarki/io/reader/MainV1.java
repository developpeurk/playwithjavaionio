package com.lambarki.io.reader;
import java.io.*;

public class MainV1 {
    public static void main(String[] args) {
        // Chemin vers le fichier à lire
        String filePath = "ok.txt"; // Remplace cela par le chemin de ton fichier

        // Déclaration des objets FileReader, BufferedReader et StringBuilder
        File file = new File(filePath);
        try {
            Reader reader = new FileReader(file);
            char[] chars = new char[1024];
            StringBuilder sb = new StringBuilder();

            int n = reader.read(chars); // n peut être < 1024

            while (n > -1) {
                sb.append(chars, 0, n);
                n = reader.read(chars);
            }

            String fileContent = sb.toString();
            System.out.println("Contenu du fichier : ");
            System.out.println(fileContent);

            // Fermeture du flux de lecture
            reader.close();
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
    }
}
