package com.lambarki.io.reader;

import java.io.*;

public class MainV3 {
    public static void main(String[] args) {
        // Chemin vers le fichier à lire
        String filePath = "ok.txt"; // Remplace cela par le chemin de ton fichier

        try (Reader reader = new FileReader(filePath)) {
            char[] chars = new char[1024];
            StringBuilder sb = new StringBuilder();
            int n;

            while ((n = reader.read(chars)) != -1) {
                sb.append(chars, 0, n);
            }

            String fileContent = sb.toString();
            // Affichage du contenu lu
            System.out.println("Contenu du fichier :");
            System.out.println(fileContent);

            // Utilisation du contenu lu si nécessaire
        } catch (IOException ex) {
            // Gestion des erreurs
            ex.printStackTrace();
        }
    }
}
