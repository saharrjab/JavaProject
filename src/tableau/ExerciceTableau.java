package tableau;

import java.util.Scanner;

public class ExerciceTableau {
    int id;
    String [] listeNoms;
    int [] listesNotes;

    public static void main(String[] args) {
        ExerciceTableau exercice = new ExerciceTableau();
        exercice.listeNoms = new String[]{"Ali", "Sami", "Mouna" };
        exercice.listesNotes = new int[]{14, 17, 13};
//        System.out.println("Nom:" + exercice.listeNoms[0] + "-Note:" + exercice.listesNotes[0]);

        System.out.println("====Affichage du  tableau===");
        for (int i = 0; i <exercice.listeNoms.length; i++) {
            System.out.println("Noms : " +exercice.listeNoms[i]+  " _ Notes :" + exercice.listesNotes[i]);
        }

    }}

