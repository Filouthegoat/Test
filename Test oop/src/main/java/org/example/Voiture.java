package org.example;

public class Voiture {

    private double m_solde;

    // Constructeur
    public Voiture(double soldeInitial) {
        m_solde = soldeInitial;
    }

    public void deposer(double ajout) {
        m_solde = m_solde + ajout;
        System.out.println("qqun a ajouté " + ajout + " dollars");
    }

    public void retirer(double retrait) {
        if (estCeQueJeSuisEndetté()) {
            return;
        }
        m_solde = m_solde - retrait;
        System.out.println("qqun a retiré " + retrait + " dollars");
        return;
    }

    public boolean estCeQueJeSuisEndetté() {
        if (m_solde < 0)
            return true;
        else
            return false;
    }


    public double getSolde() {
        return m_solde;
    }

    public void setSolde(double solde) {
        m_solde = solde;
    }
}