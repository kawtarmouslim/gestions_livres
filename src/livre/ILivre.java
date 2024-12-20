package livre;

import java.util.List;

public interface ILivre {
 Livre AjouterLivre(Livre livre);
  List<Livre> AfficherLivre();
   void supprimerLivre(int id);
    Livre AfficherLivreId( int id);
    Livre ModifierLivre(Livre livre,int id);
    boolean empruntLivre(Livre livre);
    Boolean retur(Livre livre);
    void rapportLivre();
}
