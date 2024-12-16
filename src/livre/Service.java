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
            livres.add(livre);  // Ajouter le livre à la liste
        System.out.println("Livre ajouté avec succès !");
        return livre;
    }

    @Override
    public Livre AfficherLivre(Livre livre) {
        return livres.get(livres.indexOf(livre));
    }

    @Override
    public Livre AfficherLivreId(int id) {
        return null;
    }

    @Override
    public void supprimerLivre(int id) {

    }

    @Override
    public Livre AfficherLivreId(Livre livre, int id) {
        return null;
    }

    @Override
    public void supprimerLivre() {

    }

    @Override
    public Livre ModifierLivre(Livre livre) {
        return null;
    }
}
