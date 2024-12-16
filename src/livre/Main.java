package livre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Service service=new Service();
        List<String> list=new ArrayList<>();

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
                System.out.println("Enter la  date de livre:");
                String date= sc.nextLine();
                String[] split = date.split("/");
                String month = split[0];
                String day = split[1];
                String year = split[2];

                Livre livre=new Livre(nom,type,auteur,date);
                service.AjouterLivre(livre);
                break;
            case 2:
                System.out.println("Les livres dans la bibliotique");
                for (Livre livre1 : service.livres) {
                    System.out.println(livre1);
                }
            case 3:


            default:
                System.out.println("Option invalide, essayez encore.");
        }
    }
    }

}
