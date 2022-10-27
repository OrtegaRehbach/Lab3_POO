import java.util.Scanner;

import javax.swing.text.html.HTML.Tag;

public class App {

    static char NL = '\n';
    static String DIVIDER = "---------------------------------------------------";
    static String MENU = (
        DIVIDER + NL +
        "Menu" + NL + 
        DIVIDER + NL + 
        "1. Ver todos los posts" + NL +
        "2. Publicar post" + NL + 
        "3. Dar like a un post" + NL + 
        "4. Comentar un post" + NL + 
        "5. Ver posts en una fecha particular" + NL + 
        "6. Ver posts con un tag particular" + NL + 
        "7. Darle play a un post" + NL + 
        "8. Salir" + NL + 
        DIVIDER
    );

    static String POST_OPTIONS = (
        "1. Texto" + NL + 
        "2. Emoticon" + NL + 
        "3. Imagen" + NL +
        "4. Audio" + NL +
        "5. Video" + NL + 
        "6. Regresar al menu"
    );
    public static void main(String[] args) {

        QPGDriver QPG = new QPGDriver();

        String[] testTags = {"#Tag1", "#Tag2", "#Tag3"};
        QPG.publishPost(new TextPost("Chente", "Este es un texto de prueba", "#Tag2"));
        QPG.publishPost(new VideoPost("Chentio", "google.com", 256, 30, testTags));
        QPG.publishPost(new EmojiPost("Chentio", ":'-)", testTags));


        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println(MENU);
            System.out.print("Ingrese una opcion: ");
            String input = sc.next();
            System.out.println(DIVIDER);
            switch (input) {
                case "1":
                    if (!QPG.getPublishedPosts().isEmpty()) {
                        System.out.println(
                            DIVIDER + NL + 
                            "Mostrando todos los Posts..." + NL +
                            DIVIDER
                        );
                        for (Post post : QPG.getPublishedPosts()) {
                            System.out.println(post.getInfoString());
                            System.out.println(DIVIDER);
                        }
                    } else {
                        System.out.println("No hay ningun post en el sistema.");
                    }
                    break;
                case "2":
                    boolean exitOption2 = false;
                    while (!exitOption2) {
                        System.out.println(POST_OPTIONS);
                        input = sc.next();
                        System.out.println(DIVIDER);
                        switch (input) {
                            case "1":
                                
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
                                exitOption2 = true;
                                break;
                            default:
                                System.out.println("Por favor, ingrese una opcion valida.");
                                break;
                        }
                    }
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                case "6":
                    for (Post post : QPG.getPostsWithTag(testTags[0])) {
                        System.out.println(post.getInfoString());
                        System.out.println(DIVIDER);
                    }
                    
                    break;
                case "7":
                    
                    break;
                case "8":
                    exit = true;
                    System.out.println(
                        "Saliendo..." + NL +
                        DIVIDER
                    );
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida.");
                    break;
            }
        }
        sc.close();
    }

    public static int getIntUserInput(Scanner sc, String prompt) {
        int input = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(prompt);
                input = sc.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido");
                System.out.println(DIVIDER);
            }
        }
        return input;
    }

    public static double getDoubleUserInput(Scanner sc, String prompt) {
        double input = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(prompt);
                input = sc.nextDouble();
                valid = true;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido");
                System.out.println(DIVIDER);
            }
        }
        return input;
    }

    public static String getGradoCientificoString(Scanner sc, String prompt) {
        String input = "";
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            input = sc.next().toLowerCase();
            switch (input) {
                case "master":
                    valid = true;
                    break;

                case "doctor":
                    valid = true;
                    break;
            
                default:
                    System.out.println("El valor ingresado no es valido");
                    System.out.println(DIVIDER);
                    break;
            }
        }
        return input;
    }
}