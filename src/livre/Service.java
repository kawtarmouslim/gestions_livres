package livre;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service implements ILivre {
    List<Livre> livres=new ArrayList<>();



    @Override
    public Livre AjouterLivre(Livre livre) {
        if (livres.contains(livre))
            System.out.println("déja existe");
        else
            livres.add(livre);

        System.out.println("Livre ajouté avec succès !");
        return livre;
    }

    @Override
    public List<Livre> AfficherLivre() {

        return livres;
    }
    @Override
    public Livre AfficherLivreId( int id) {
        for (Livre livres : livres) {
            if (livres.getId_livre()== id) {
                return livres;
            }
        }
        return null;
    }
    @Override
    public Livre ModifierLivre(Livre livre,int id) {
        for (Livre livreIter : livres) {
            if (livreIter.getId_livre() == id) {
                livreIter.setTitre_livre(livre.getTitre_livre());
                livreIter.setType_livre(livre.getType_livre());
                livreIter.setAuteur_livre(livre.getAuteur_livre());
                livreIter.setDt_livre(livre.getDt_livre());
                return livreIter;
            }
        }
        return null;
    }

    @Override
    public boolean empruntLivre(Livre livre) {
        if (livre.getDisponibilité()){
            livre.setDisponibilité(false);
        }else
        System.out.println("déja emprunt");
        return false;
    }

    @Override
    public Boolean retur(Livre livre) {
            livre.setDisponibilité(true);
        return true;

    }

    @Override
    public void rapportLivre() {


        List<Livre>livresRetour=livres.stream()
                .filter(disponible-> disponible.getDisponibilité())
                .collect(Collectors.toList());
        System.out.println("les livre retours sont :");
               System.out.println(livresRetour);
        List<Livre>livresEmprunt=livres.stream()
                .filter(emprunt-> !emprunt.getDisponibilité())
                .collect(Collectors.toList());
        System.out.println("les livre emprunt sont :");
        System.out.println(livresEmprunt);

    }
    @Override
    public void supprimerLivre(int id) {
      livres.remove(id);
    }






}
