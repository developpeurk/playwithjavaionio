package com.lambarki.io.reader;

import java.io.*;

public class MainV2 {
    public static void main(String[] args) {
        // Chemin vers le fichier à lire
        String filePath = "ok.txt"; // Remplace cela par le chemin de ton fichier

        Reader reader = null;

        try {
            File file = new File(filePath);
            reader = new FileReader(file);

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
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    // Gestion de l'exception lors de la fermeture du reader
                    ex.printStackTrace();
                }
            }
        }
    }
}
