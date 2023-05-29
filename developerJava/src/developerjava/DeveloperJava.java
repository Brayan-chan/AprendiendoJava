package developerjava;
import java.util.Scanner;

/**
 *
 * @author Brayan Chan
 */
public class DeveloperJava {
    static Scanner input = new Scanner(System.in);
    
    public static void mostrarOpciones() {
        System.out.println("\u001B[37m");
        System.out.println("===================OPCIONES===================");
        String opcion = "0";
        
        while (!opcion.equals("3")) {
            System.out.println("1. Tema 1: Codigo");
            System.out.println("2. Tema 2: Salida");
            System.out.println("3. Salir");
            
            opcion = input.next();
            input.nextLine();
            
            switch (opcion) {
                case "1":
                    System.out.println("Tema 1: Codigo\n");
                    System.out.println("Los humanos utilizamos programas informaticos\n"
                            + "para comunicarnos con las maquinas. Sin programas\n"
                            + "informaticos, no tendriamos smartphones, paginas we ni\n"
                            + "exploracion del expacio exterior.");
                    System.out.println("Aprender algo de programacion puede ayudarte a inovar y\n"
                            + "crear soluciones diferentes a los problemas, lo que te dara\n"
                            + "una ventaja competitiva en este mundo impulsado por la\n"
                            + "tecnologia.\n");
                    String salto5 = input.nextLine();
                    pregunta1Tema1();
                            
                    break;
                
                case "2":
                    
                    System.out.println("No quieras correr antes de saber caminar!");
                    System.out.println("Se te otorga acceso bajo su responsabilidad!");
                    System.out.println("Si escribes 'salir' te regresara al inicio");
                    System.out.println("Piensalo!");
                    String advertencia = input.nextLine(); // Leer la entrada del usuario en la advertencia
                if (advertencia.isEmpty() || advertencia.equalsIgnoreCase("salir")) {
                    if (advertencia.equalsIgnoreCase("salir")) {
                        System.out.println("Redirigiendo...");
                        mostrarOpciones();
                    }
                    System.out.println("Tema 2: Salida\n");
                    System.out.println("La mayoria de los programas estan diseñados\n"
                                    + "para producir (Salidas). He aqui algunos ejemplos: \n"
                                    + "-Notificaciones (Tienes un mensaje nuevo)\n"
                                    + "Game Over, aparece en pantallas al momento de jugar a\n"
                                    + "videojuegos\n"
                                    + "-El saldo de tu cuenta al consultar tu aplicacion de banca\n"
                                    + "en linea.\n\n");
                            System.out.println("La salida mas sencilla consiste en mostrar un mensaje en\n"
                                    + "la pantalla.");
                            String salto0 = input.nextLine();
                            pregunta2Tema1();
                } else {
                    System.out.println("Opción incorrecta");
                }
                break;

                case "3":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } 
        
    }
    
    public static void leccion2Tema2() {
        System.out.println("Saliendo...");
        String opcion = "0";
        if (!opcion.equals("1")) {
            System.out.println("@Sistemas BCA");
        }
    }
    
    public static void leccionAprendida1() {
        System.out.println("Impresionante! Has completado tu primera leccion.\n"
                + "Recuerda los siguientes puntos importantes:\n"
                + "1. Puedes escribir codigo que genere salidas con la\n"
                + "declaracion " + "\u001B[36m" + "System.out.println()");
        System.out.println("2. La instruccion 'println' debe ir seguida de un parentesis.\n\n");
        System.out.println("Que es lo siguiente?\n"
                + "En la proxima leccion, crearas codigo con multiples lineas y\n"
                + "diferentes tipos de datos.");
        //29/05/2023, AGREGAR LECCION 2
        leccion2Tema2();
    }
    
    public static void pregunta2Tema1() {
        System.out.println("Hora de una pregunta preparado?\n");
                    String salto3 = input.nextLine();
                    System.out.println("Las notificaciones y el texto que aparece en pantalla son\n"
                            + "ejemplos de salidas de programas informaticos?\n");
                    String opcion3 = "0";
                    
                    while (!opcion3.equals("2")){
                        System.out.println("1. Falso\n");
                        System.out.println("2. Verdadero\n");
                        System.out.println("Ingresa una opcion...");
                        System.out.println("\u001B[37m");
                        opcion3 = input.next();
                        
                        switch (opcion3) {
                            case "1":
                                //color rojo opciones incorrectas "\u001B[31m"
                                System.out.println("\u001B[31m" + "RESPUESTA INCORRECTA");
                                System.out.println("\u001B[37m");
                                break;
                                
                            case "2":
                                //color cyan opciones correctas "\u001B[36m"
                                System.out.println("\u001B[36m" + "RESPUESTA CORRECTA");
                                String salto7 = input.nextLine();
                                System.out.println("\u001B[37m");
                                String salto8 = input.nextLine();
                                System.out.println("Salida\n");
                                System.out.println("Los programadores usan salidas todo el tiempo para\n"
                                        + "comprobar que el ordenador sigue las instrucciones dadas\n"
                                        + "y solucionar problemas con el codigo.\n"
                                        + "La siguiente linea de codigo muestra el eslogan de Java en\n"
                                        + "la pantalla como salida:\n");
                                System.out.println("System.out.println(''Write once, run anywhere!'')");
                                String salto9 = input.nextLine();
                                System.out.println("Write once, run anuwhere!");
                                String salto10 = input.nextLine();
                                System.out.println("Hora de ponerte a prueba, preparado!...");
                                String salto11 = input.nextLine();
                                System.out.println("Escribe la linea de codigo que produzca 'New message'\n");
                                System.out.println("System.out.println(_________);");
                                
                                String respuesta1 = input.nextLine();
                                if (respuesta1.equalsIgnoreCase("''New message''")) {
                                    System.out.println("\u001B[36m" +"RESPUESTA CORRECTA");
                                    System.out.println("\u001B[37m");
                                    System.out.println("Simulator-The Code Playgroud\n");
                                    System.out.println("Listo para escribir y ejecutar codigo real?\n");
                                    System.out.println("\u001B[36m" +"CODE PLAYGROUND");
                                    System.out.println("System.out.println(''Welcome to the Code Playground'');");
                                    System.out.println("Opime ENTER para intentarlo");
                                    String salto12 = input.nextLine();
                                    System.out.println("Welcome to the Code Playground\n");
                                    System.out.println("Recuerda que esto es algo basico, te falta\n"
                                            + "aprender muchas cosas, tal como las otras lineas de\n"
                                            + "codigo que van antes del comando para imprimir\n"
                                            + "el cual estas lineas de codigo hacen que el programa\n"
                                            + "funcione correctamente");
                                    System.out.println("No te preocupes a lo largo del curso\n"
                                            + "aprenderas sobre esto mucho exito.");
                                    String salto13 = input.nextLine();
                                    System.out.println("Hora de escribir algo de codigo!\n");
                                    System.out.println("Completa la linea de codigo, que genere\n"
                                            + "'Game Over'\n");
                                    System.out.println("System.out.______(''Game Over'')");
                                    System.out.println("\u001B[37m");
                                    String respuesta2 = input.nextLine();
                                    if (respuesta2.equalsIgnoreCase("println")) {
                                        System.out.println("Game Over");
                                        System.out.println("\u001B[36m" +"RESPUESTA CORRECTA");
                                        System.out.println("\u001B[37m");
                                        System.out.println("La instruccion println debe ir seguida de un parentesis\n\n"
                                                + "Completa y crea una linea de codigo que se ejecute sin errores\n");
                                        System.out.println("System.out.println___''You Win!'' ___;");
                                        System.out.println("\u001B[37m");
                                        String respuesta3 = input.nextLine();
                                        if (respuesta3.equalsIgnoreCase("(''You Win!'')")) {
                                            System.out.println("You Win!");
                                            System.out.println("\u001B[36m" +"RESPUESTA CORRECTA");
                                            System.out.println("\u001B[37m");
                                            System.out.println("Crea una linea de codigo que se ejecute sin errores\n");
                                            System.out.println("System.___.____(''Great progress!'');");
                                            System.out.println("\u001B[37m");
                                            String respuesta4 = input.nextLine();
                                            if (respuesta4.equalsIgnoreCase("out.println")) {
                                                System.out.println("Great progress!");
                                                System.out.println("\u001B[36m" +"RESPUESTA CORRECTA");
                                                System.out.println("\u001B[37m");
                                                leccionAprendida1();
                                            } else {
                                                
                                                System.out.println("RESPUESTA INCORRECTA");
                                                System.out.println("\u001B[37m");
                                                leccionAprendida1();
                                            }
                                        } else {
                                            
                                            System.out.println("RESPUESTA INCORRECTA");
                                            System.out.println("\u001B[37m");
                                        }
                                    } else {
                                        
                                        System.out.println("RESPUESTA INCORRECTA");
                                        System.out.println("\u001B[37m");
                                    }
                                    
                                    
                                } else {
                                    
                                    System.out.println("RESPUESTA INCORRECTA");
                                    System.out.println("\u001B[37m");
                                }
                                break;

                                
                            default:
                                System.out.println("No existe la opcion");
                                System.out.println("Saliendo del programa...");
                                break;
                        }
                    
                    }
    }
    
    public static void pregunta1Tema1() {
        System.out.println("Hora de una pregunta preparado?\n");
                    String salto2 = input.nextLine();
                    System.out.println("¿Que es un lenguaje de programacion?\n");
                    String opcion2 = "0";
                    
                    while (!opcion2.equals("2")){
                        System.out.println("1. Un lenguaje utilizado por las maquinas para\n"
                                + "comunicarse con los extraterrestres\n");
                        System.out.println("2. Un lenguaje utilizado por los humanos para\n"
                                + "comunicarse con las maquinas");
                        System.out.println("Ingresa una opcion...");
                        System.out.println("\u001B[37m");
                        opcion2 = input.next();
                        
                        switch (opcion2) {
                            case "1":
                                //color rojo opciones incorrectas "\u001B[31m"
                                System.out.println("\u001B[31m" + "RESPUESTA INCORRECTA");
                                System.out.println("\u001B[37m");
                                break;
                                
                            case "2":
                                //color cyan opciones correctas "\u001B[36m"
                                System.out.println("\u001B[36m" + "RESPUESTA CORRECTA");
                                String salto5 = input.nextLine();
                                System.out.println("\u001B[37m");
                                String salto6 = input.nextLine();
                                System.out.println("Tema 2: Salida\n");
                                System.out.println("La mayoria de los programas estan diseñados\n"
                                        + "para producir (Salidas). He aqui algunos ejemplos: \n"
                                        + "-Notificaciones (Tienes un mensaje nuevo)\n"
                                        + "Game Over, aparece en pantallas al momento de jugar a\n"
                                        + "videojuegos\n"
                                        + "-El saldo de tu cuenta al consultar tu aplicacion de banca\n"
                                        + "en linea.\n\n");
                                System.out.println("La salida mas sencilla consiste en mostrar un mensaje en\n"
                                        + "la pantalla.");
                                
                                pregunta2Tema1();
                                break;
                                
                            default:
                                System.out.println("No existe la opcion");
                                System.out.println("Saliendo del programa...");
                                break;
                        }
                    }
    }
    
    public static void main(String[] args) {
        System.out.println("==================BIENVENIDO==================");
        
        System.out.println("=============CURSO DE JAVA BASICO=============\n");
        System.out.println("Oprime ENTER para empezar con el curso");
        System.out.println("Ingrese la palabra (salir) para salir del programa");
                String opcion = null;
        if (opcion == "salir"){
            System.out.println("Saliendo del programa...");
        }
        String salto = input.nextLine();
        System.out.println("Ingresaste al programa...\n");
        System.out.println("BIENVENIDO A JAVA!\n");
        System.out.println("Java es uno de los lenguajes de programacion mas\n"
                + "populares\n");
        System.out.println("El lema de Java es "+ "\u001B[36m"+"Write once, run anywhere... " + "\n"
                + "(Escribe una vez, ejecuta en cualquier sitio). " + "Los programas Java\n"
                + "pueden ejecutarse en distintas plataformas, como moviles,\n"
                + "ordenadores de sobremesa y otros sistemas portatiles.\n"
                + "Puedes utilizar Java para crear apps, juegos, aplicaciones\n"
                + "bancarias, aplicaciones web y mucho mas...");
        String salto1 = input.nextLine();
        
        mostrarOpciones();
        
    }
    
}
