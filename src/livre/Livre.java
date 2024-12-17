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

    public int getId_livre() {
        return id_livre;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public String getTitre_livre() {
        return titre_livre;
    }

    public void setTitre_livre(String titre_livre) {
        this.titre_livre = titre_livre;
    }

    public String getAuteur_livre() {
        return auteur_livre;
    }

    public void setAuteur_livre(String auteur_livre) {
        this.auteur_livre = auteur_livre;
    }

    public String getType_livre() {
        return type_livre;
    }

    public void setType_livre(String type_livre) {
        this.type_livre = type_livre;
    }

    public String getDt_livre() {
        return dt_livre;
    }

    public void setDt_livre(String dt_livre) {
        this.dt_livre = dt_livre;
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
