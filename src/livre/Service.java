package livre;

import java.util.ArrayList;
import java.util.List;

public class Service implements ILivre {
    List<Livre> livres;

    public Service() {
        livres = new ArrayList<>();
    }

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
    public Livre AfficherLivre(Livre livre) {
        return livres.get(livres.indexOf(livre));
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
            for (Livre livres:livres){
              if (livres.getId_livre() ==id){
                  livres.setTitre_livre(livres.getTitre_livre());
                  livres.setType_livre(livres.getType_livre());
                  livres.setAuteur_livre(livres.getAuteur_livre());
                  livres.setDt_livre(livres.getDt_livre());
                  Livre livreUp=AfficherLivre(livres);

              }
              return livres;

            }

        return null;
    }

    @Override
    public void supprimerLivre(int id) {
      livres.remove(id-1);
    }






}
