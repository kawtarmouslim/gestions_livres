package livre;

import java.util.Date;

public class Livre {
    private static int counter = 0;
    int id_livre;
    String titre_livre;
    String auteur_livre;
    String type_livre;
    String dt_livre;

    public Livre( String titre_livre, String auteur_livre, String type_livre, String dt_livre) {
        this.id_livre = ++counter;
        this.titre_livre = titre_livre;
        this.auteur_livre = auteur_livre;
        this.type_livre = type_livre;
        this.dt_livre = dt_livre;
    }

    public Livre() {
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id_livre=" + id_livre +
                ", titre_livre='" + titre_livre + '\'' +
                ", auteur_livre='" + auteur_livre + '\'' +
                ", type_livre='" + type_livre + '\'' +
                ", dt_livre=" + dt_livre +
                '}';
    }
}
