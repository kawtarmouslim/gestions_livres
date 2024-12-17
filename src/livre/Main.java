package livre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Service service=new Service();
        List<Livre> list=new ArrayList<>();

    while (true){

        System.out.println("1-Ajouter un livre");
        System.out.println("2-Afficher tous les  livres");
        System.out.println("3-Afficher un livre par  Id");
        System.out.println("4-Modifier un livre");
        System.out.println("5-Supprimer un livre");
        System.out.println("6-Quitter");
        System.out.println("Entrer votre choix:");
        int choix=sc.nextInt();
        sc.nextLine();
        switch (choix){
            case 1:

                System.out.println("Enter le nom de livre:");
                String nom= sc.nextLine();
               System.out.println("Enter le Type  de livre:");
               String type= sc.nextLine();
                System.out.println("Enter le Auteur de livre:");
                String auteur= sc.nextLine();

                String date = "";
                boolean dateValide = false;
                while (!dateValide) {
                    System.out.print("Entrez la date de publication (jj/mm/aaaa) : ");
                    date = sc.nextLine();
                    String[] split = date.split("/");
                    if (split.length == 3 &&
                            split[0].matches("\\d{2}")
                            && split[1].matches("\\d{2}") &&
                            split[2].matches("\\d{4}")) {
                        dateValide = true;
                    } else {
                        System.out.println("La date est invalide. Veuillez entrer au format jj/mm/aaaa.");
                    }
                }

                Livre livre=new Livre(nom,type,auteur,date);
                service.AjouterLivre(livre);
                break;
            case 2:
                System.out.println("Les livres dans la bibliotique");
                for (Livre livre1 : service.livres) {
                    System.out.println(livre1);
                }
                break;
            case 3:
                System.out.println("Entrez l'ID du livre :");
                int id = sc.nextInt();
                 Livre livreId= service.AfficherLivreId(id);
                System.out.println(livreId);

            break;
            case 4:
                System.out.println("Entrez l'ID du livre :");
                int id1 = sc.nextInt();
                System.out.println("Enter un nouveau titre :");
                String titre=sc.nextLine();
                System.out.println("Enter un nouveau type :");
                String typ=sc.nextLine();
                System.out.println("Enter un nouveau auteur :");
                String autr=sc.nextLine();
                break;





            default:
                System.out.println("Option invalide, essayez encore.");
        }
    }
    }

}
