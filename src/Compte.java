import java.lang.System;

public class Compte {

    private String numero ;
    private double solde;
    static  int nbCompte=0 ;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getNbCompte() {
        return nbCompte;
    }

    public static void setNbCompte(int nbCompte) {
        Compte.nbCompte = nbCompte;
    }

    public Compte() {
        this.numero="";
        this.solde=0;
        nbCompte++;

    }


    public void deposer (double montant){
        if(montant< 0){
            System.out.println("merci de saisir un montant positive");
        }

        else {
            this.solde += montant;
            System.out.println("Virement bien reçu "+ montant);
        }
    }
    public void retirer (double montant){
        if(montant > this.solde){
            System.out.println("solde insuffisant");
        }

        else {
            this.solde -= montant;
            System.out.println("un montant "+ montant + "  est bien retirer Votre solde actuel est "+this.getSolde());
        }
    }
    public void afficherInfoCompte (){
        System.out.println("Votre compte "+ this.numero + "  Votre solde actuel est "+this.getSolde());
    }
    public void afficherNbrComptes (){
        System.out.println("Nombres des comptes sont "+ Compte.getNbCompte());
    }
}
