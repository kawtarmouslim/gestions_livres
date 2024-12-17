package livre;

public interface ILivre {
    public  Livre AjouterLivre(Livre livre);
    public Livre AfficherLivre(Livre livre);
    public void supprimerLivre(int id);
    Livre AfficherLivreId( int id);

    public Livre ModifierLivre(Livre livre,int id);
}
