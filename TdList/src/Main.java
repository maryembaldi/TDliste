import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1, "Emna",  "Naimi");
        Etudiant e2 = new Etudiant(2, "Maryem",  "Baldi");
        Etudiant e3 = new Etudiant(3, "Asma",  "Jaidi");
        Etudiant e4 = new Etudiant(4, "Ahmed",  "Makni");
        Etudiant e5 = new Etudiant(1, "Sami",  "Makni");
        Etudiant e = new Etudiant(7, "hamdi",  "Aid");

        System.out.println(e1);
        System.out.println(e3);
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e5));

        EspritArrayList l1 = new EspritArrayList();

        l1.ajouterEtudiant(e1);
        l1.ajouterEtudiant(e2);
        l1.ajouterEtudiant(e3);
        l1.ajouterEtudiant(e4);
        l1.ajouterEtudiant(e5);

        System.out.println("Liste des étudiants avant les opérations :");
        l1.displayEtudiants();

        // Recherche d'étudiants
        System.out.println("Rechercher étudiant par objet : " + l1.rechercherEtudiant(e2));
        System.out.println("Rechercher étudiant par nom 'Charlie' : " + l1.rechercherEtudiant("Maryem"));


        // Suppression d'un étudiant
        l1.supprimerEtudiant(e5);

        // Affichage des étudiants après la suppression
        System.out.println("Liste des étudiants après la suppression :");
        l1.displayEtudiants();

        // Tri des étudiants par ID et par Nom
        l1.trierEtudiantsParId();
        System.out.println("Liste des étudiants triés par ID :");
        l1.displayEtudiants();

        l1.trierEtudiantsParNom();
        System.out.println("Liste des étudiants triés par Nom :");
        l1.displayEtudiants();
    }
}

