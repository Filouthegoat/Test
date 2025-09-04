package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Voiture monCompte = new Voiture(100);
// boolean reponse1 = monCompte.estCeQueJeSuisEndetté() // false
        double montantOriginal = monCompte.getSolde();// 100
        monCompte.deposer(20);
        monCompte.retirer(-100030);
        double soldeActuel = monCompte.getSolde(); //100
// boolean reponse2 = monCompte.estCeQueJeSuisEndetté() // truek

    }
}