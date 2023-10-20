import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class EspritArrayList implements University  {
        private ArrayList<Etudiant> listEtudiant = new ArrayList<>();

        @Override
        public void ajouterEtudiant(Etudiant e) {
            listEtudiant.add(e);
        }

        @Override
        public boolean rechercherEtudiant(Etudiant e) {
            return listEtudiant.contains(e);
        }

        @Override
        public boolean rechercherEtudiant(String nom) {
            for (Etudiant e : listEtudiant) {
                if (e.getNom().equals(nom)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void supprimerEtudiant(Etudiant e) {
            listEtudiant.remove(e);
        }

        @Override
        public void displayEtudiants() {
            System.out.println(listEtudiant);
        }

    @Override
    public void trierEtudiantsParId() {
        Comparator<Etudiant> idComparator = new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        };
        Collections.sort(listEtudiant, idComparator);
    }

    @Override
    public void trierEtudiantsParNom() {

        Comparator<Etudiant> nomComparator = new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return e1.getNom().compareTo(e2.getNom());
            }
        };
        Collections.sort(listEtudiant, nomComparator);
    }
    }



