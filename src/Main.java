public class Main {
    public static void main(String[] args) {
        Compte c1 = new Compte();
        c1.setNumero("957551");
        c1.setSolde(1.75);
        c1.deposer(10000);
        c1.afficherInfoCompte();
        c1.retirer(9000);
        c1.afficherInfoCompte();


        c1.afficherNbrComptes();


    }
}