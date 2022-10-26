import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        QPGDriver QPG = new QPGDriver();

        String[] testTags = {"#Tag1", "#Tag2"};
        QPG.publishPost(new TextPost("Chente", testTags, "Este es un texto de prueba"));
        QPG.publishPost(new VideoPost("Chentio", testTags, "google.com", 256, 30));
        QPG.publishPost(new EmojiPost("Chentio", testTags, ":'-)"));

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println(
                "Menu" + "\n" + 
                "---------------------------------------------"+ "\n" + 
                "1. Ver todos los posts" + "\n" +
                "2. Publicar post" + "\n" + 
                "3. Dar like a un post" + "\n" + 
                "4. Comentar un post" + "\n" + 
                "5. Ver posts en una fecha particular" + "\n" + 
                "6. Ver posts con un tag particular" + "\n" + 
                "7. Darle play a un post" + "\n" + 
                "8. Salir" + "\n" + 
                "---------------------------------------------"
            );
            System.out.print("Ingrese una opcion: ");
            String input = sc.next();
            switch (input) {
                case "1":
                    for (Post post : QPG.getPublishedPosts()) {
                        System.out.println(post.getInfoString());
                    }
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                case "6":
                    
                    break;
                case "7":
                    
                    break;
                case "8":
                    exit = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida.");
                    break;
            }
        }
        sc.close();
    }
}