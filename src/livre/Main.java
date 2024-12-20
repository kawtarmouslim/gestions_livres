package livre;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Service service=new Service();


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
                System.out.println("Enter la disponibileter de livre");
                boolean disponi=sc.nextBoolean();
                Livre livre=new Livre(nom,type,auteur,date,disponi);
                service.AjouterLivre(livre);
                break;
            case 2:
                System.out.println("Les livres dans la bibliothèque :");
                for (Livre l : service.AfficherLivre()) {
                    System.out.println(l);
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
                sc.nextLine();

                System.out.println("Entrez un nouveau titre :");
                String titre = sc.nextLine();

                System.out.println("Entrez un nouveau type :");
                String typ = sc.nextLine();

                System.out.println("Entrez un nouveau auteur :");
                String autr = sc.nextLine();

                System.out.print("Entrez la date de publication (jj/mm/aaaa) : ");
                String dat = sc.nextLine();
                System.out.println("Enter la disponibilite de livre :");
                boolean disp=sc.nextBoolean();


                Livre livreUpdate = new Livre(titre, typ, autr, dat,disp);


                Livre updatedLivre = service.ModifierLivre(livreUpdate, id1);
                if (updatedLivre != null) {
                    System.out.println("Livre modifié avec succès : " + updatedLivre);
                }else System.out.println("id n'existe pas");

                break;
            case 5:
                System.out.println("Entrez l'ID du livre :");
                int ids= sc.nextInt();
                 service.supprimerLivre(ids);
                System.out.println("suppeimer avec sucee");
            case 6:
                System.out.println("Enter Id de livre emprunte");
                int id2=sc.nextInt();
                Livre livreemp=service.AfficherLivreId(id2);
                Boolean emp=service.empruntLivre(livreemp);
                System.out.println(emp);
                 break;
            case 7:
                System.out.println("Enter Id de livre emprunte");
                int id3=sc.nextInt();
                Livre livreret=service.AfficherLivreId(id3);
                Boolean ret=service.retur(livreret);
                System.out.println(ret);
                break;
            case 8:

                service.rapportLivre();
                break;

            default:
                System.out.println("Option invalide, essayez encore.");
        }
    }
    }

}
