/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationtp;

import java.util.Scanner;


/**
 *
 * @author Jean-Christophe Tarot formation_gep
 */
public class AmplitudeTableauDimension2Bis {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // CONSTANTE
        final int NL=5;
        final int NC=2;
        // VARIABLES
        int plusGrand, plusPetit, amplitude = 0;

        int[][] tab = new int[NL][NC];
        
        // intitialisation du tableau
        for (int i = 0; i < NL; i++) {
            for (int j = 0; j < NC; j++) {
                System.out.print("Entrer un entier pour "+i+" - "+j+": ");
                tab[i][j] = reader.nextInt();
            }
        }  
        // test des valeurs du tableau
        plusGrand = tab[0][0];
        plusPetit = tab[0][0];
        for (int i = 0; i < NL; i++) {
            for (int j = 0; j < NC; j++) {
                // test plus grand
                if ( tab[i][j] > plusGrand  ) {
                    plusGrand = tab[i][j];
                }
                // test plus petit
                if ( tab[i][j] < plusPetit ) {
                    plusPetit = tab[i][j];
                }
            }
        }         
        // calcule de l'amplitude
        amplitude = plusGrand + plusPetit;
        // affiche l'amplitude
        System.out.printf("Amplitude du Tableau = %d", amplitude);   
    }
}

