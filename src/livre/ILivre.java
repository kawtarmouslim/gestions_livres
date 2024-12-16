package livre;

public interface ILivre {
    public  Livre AjouterLivre(Livre livre);
    public Livre AfficherLivre(Livre livre);
    public Livre AfficherLivreId(int id);
    public void supprimerLivre(int id);

    Livre AfficherLivreId(Livre livre, int id);

    void supprimerLivre();

    public Livre ModifierLivre(Livre livre);
}
