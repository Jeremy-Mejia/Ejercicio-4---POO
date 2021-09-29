/*************************************************************************************************************
Vista.java
Autor: Jeremy Mejía
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Ejercicio No. 4
Vista
*************************************************************************************************************/

/*************************************************************************************************************
Librería
*************************************************************************************************************/

import java.util.Scanner;
import java.util.Random;

/*************************************************************************************************************
Clase Vista
*************************************************************************************************************/

class Vista {
    

/*************************************************************************************************************
Variables globales
*************************************************************************************************************/

    Scanner scan = new Scanner(System.in);

    private int op;
    private int ope;
    private int golp;
    private int enem; 
    private String nombre;
    int varEnemigo = (int)(Math.random()*3+1);
    int varEnemigo2 = (int)(Math.random()*2+1);
	int var = (int)(Math.random()*2+1);
    int jugador = (int)(Math.random()*3+1);

    public void vista(){
        do{
            System.out.println("\nBienvenido a la batalla." +
            "\n¿Deseas iniciar el juego? \n 1. Si \n 2. No \n"  +
            "Selecciona un número: ");
            ope = scan.nextInt();
            
            if (ope > 2 || ope < 1){
                System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
            }   
        }while(ope > 2 || ope < 1);
        

        if(ope == 1){
            System.out.println("\nIngresa tu nombre:");
            nombre = scan.next();

            if (var == 1){
                Combatiente com = new Combatiente();
                int vidaGuerrero = com.vidasGuerrero(); 
                System.out.println("\n" + nombre + " serás un Guerrero y cuentas con " + 
                vidaGuerrero + " vidas");
                do{
                    System.out.println("\nPresiona 1 para continuar: ");
                    op = scan.nextInt(); 
                    if (op > 1 || op < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    }  
                }while(op > 1 || op < 1);

                do{
                    int vidaEnemigos = com.vidasEnemigos();
                    System.out.println("\nEstás en una batalla con " + jugador + " enemigos ¿que deseas hacer?" +
                    "\nCada enemigo cuenta con "+ vidaEnemigos +" vidas"
                    + "\n1. Golpear \n2. Herir \nSelecciona un número:"); 
                    enem = scan.nextInt(); 
                    if (enem > 2 || enem < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    } 
                }while(enem > 2 || enem < 1);

                do{
                    System.out.println("\nSelecciona con un número al enemigo que deseas atacar:");
                    golp = scan.nextInt();

                    if (golp > jugador || golp < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    } 
                }while(golp > jugador || golp < 1);
                
                if (enem == 1){
                    int vidaEnemigos = com.vidasEnemigos();
                    vidaEnemigos = vidaEnemigos - 1; 
                    System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                    if(varEnemigo == 1){
                        vidaGuerrero = vidaGuerrero - 1;
                        System.out.println("\nEl Jefe de los enemigos te ha herido dando veneno " + 
                        nombre + " ahora tienes " + vidaGuerrero + " vidas");
                    }
                    if(varEnemigo == 2){
                        vidaGuerrero = vidaGuerrero - 2;
                        System.out.println("\nEl Jefe de los enemigos te ha golpeado muy fuerte " + 
                        nombre + " ahora tienes " + vidaGuerrero + " vidas");
                    }
                    if(varEnemigo == 3){
                        vidaGuerrero = vidaGuerrero - 5;
                        System.out.println("\nEl Jefe de los enemigos te ha matado " + 
                        nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        Vista vs = new Vista();
                        vs.Game();
                    }

                    do{
                        System.out.println("Aún tienes una batalla con " + jugador + " enemigos ¿que deseas hacer?" +
                        "\nCada enemigo cuenta con 3 vidas, pero el enemigo " + golp + " tiene " + vidaEnemigos + " vidas"
                        + "\n1. Golpear \n2. Herir \nSelecciona un número:");
                        enem = scan.nextInt();
                        if (enem > 2 || enem < 1){
                            System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                        } 
                    }while(enem > 2 || enem < 1);

                    if (enem == 1){
                        vidaEnemigos = vidaEnemigos - 1; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");
                        
                        if(varEnemigo == 1){
                            vidaGuerrero = vidaGuerrero - 1;
                            System.out.println("\nEl Jefe de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 2){
                            vidaGuerrero = vidaGuerrero - 2;
                            System.out.println("\nEl Jefe de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 3){
                            vidaGuerrero = vidaGuerrero - 5;
                            System.out.println("\nEl Jefe de los enemigos te ha matado " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                            Vista vs = new Vista();
                            vs.Game();
                        }
                    }
                    if (enem == 2){
                        vidaEnemigos = vidaEnemigos - 2; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");
                        
                        if(varEnemigo == 1){
                            vidaGuerrero = vidaGuerrero - 1;
                            System.out.println("\nEl Jefe de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 2){
                            vidaGuerrero = vidaGuerrero - 2;
                            System.out.println("\nEl Jefe de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 3){
                            vidaGuerrero = vidaGuerrero - 5;
                            System.out.println("\nEl Jefe de los enemigos te ha matado " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                            Vista vs = new Vista();
                            vs.Game();
                        }
                    }
                    System.out.println("\nVolvemos al inicio");
                    Vista vs = new Vista();
                    vs.vista();
                }
                if (enem == 2){
                    int vidaEnemigos = com.vidasEnemigos();
                    vidaEnemigos = vidaEnemigos - 2; 
                    System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                    if(varEnemigo == 1){
                        vidaGuerrero = vidaGuerrero - 1;
                        System.out.println("\nEl Jefe de los enemigos te ha herido dando veneno " + 
                        nombre + " ahora tienes " + vidaGuerrero + " vidas");
                    }
                    if(varEnemigo == 2){
                        vidaGuerrero = vidaGuerrero - 2;
                        System.out.println("\nEl Jefe de los enemigos te ha golpeado muy fuerte " + 
                        nombre + " ahora tienes " + vidaGuerrero + " vidas");
                    }
                    if(varEnemigo == 3){
                        vidaGuerrero = vidaGuerrero - 5;
                        System.out.println("\nEl Jefe de los enemigos te ha matado " + 
                        nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        Vista vs = new Vista();
                        vs.Game();
                    }
                     
                    do{
                        System.out.println("Aún tienes una batalla con " + jugador + " enemigos ¿que deseas hacer?" +
                        "\nCada enemigo cuenta con 3 vidas, pero el jugador " + golp + " tiene " + vidaEnemigos + " vidas"
                        + "\n1. Golpear \n2. Herir \nSelecciona un número:");
                        enem = scan.nextInt();
                        if (enem > 2 || enem < 1){
                            System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                        } 
                    }while(enem > 2 || enem < 1);

                    if (enem == 1){
                        vidaEnemigos = vidaEnemigos - 1; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                        if(varEnemigo == 1){
                            vidaGuerrero = vidaGuerrero - 1;
                            System.out.println("\nEl Jefe de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 2){
                            vidaGuerrero = vidaGuerrero - 2;
                            System.out.println("\nEl Jefe de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 3){
                            vidaGuerrero = vidaGuerrero - 5;
                            System.out.println("\nEl Jefe de los enemigos te ha matado " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                            Vista vs = new Vista();
                            vs.Game();
                        }
                    }
                    if (enem == 2){
                        vidaEnemigos = vidaEnemigos - 2; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");
                         
                        if(varEnemigo == 1){
                            vidaGuerrero = vidaGuerrero - 1;
                            System.out.println("\nEl Jefe de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 2){
                            vidaGuerrero = vidaGuerrero - 2;
                            System.out.println("\nEl Jefe de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                        }
                        if(varEnemigo == 3){
                            vidaGuerrero = vidaGuerrero - 5;
                            System.out.println("\nEl Jefe de los enemigos te ha matado " + 
                            nombre + " ahora tienes " + vidaGuerrero + " vidas");
                            Vista vs = new Vista();
                            vs.Game();
                        }
                    }
                    System.out.println("\nVolvemos al inicio");
                    Vista vs = new Vista();
                    vs.vista();
                }

                
            }

            if (var == 2){
                Combatiente com = new Combatiente();
                int vidaExplorador = com.vidasExplorador(); 
                System.out.println("\n" + nombre + " serás un Explorador y cuentas con " + 
                vidaExplorador + " vidas");

                do{
                    System.out.println("\nPresiona 1 para continuar: ");
                    op = scan.nextInt();

                    if (op > 1 || op < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    }  
                }while(op > 1 || op < 1);
                
                do{
                    int vidaEnemigos = com.vidasEnemigos();
                    System.out.println("\nEstás en una batalla con " + jugador + " enemigos ¿que deseas hacer?" +
                    "\nCada enemigo cuenta con " + vidaEnemigos+ " vidas"  
                    + "\n1. Golpear \n2. Herir \n3. Matar \nSelecciona un número:");
                    enem = scan.nextInt();

                    if (enem > 3 || enem < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    } 
                }while(enem > 3 || enem < 1);
                
                do{
                    System.out.println("\nSelecciona con un número al enemigo que deseas atacar:");
                    golp = scan.nextInt();

                    if (golp > jugador || golp < 1){
                        System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                    } 
                }while(golp > jugador || golp < 1);

                if (enem == 1){
                    
                    int vidaEnemigos = com.vidasEnemigos();
                    vidaEnemigos = vidaEnemigos - 1; 
                    System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                    if(varEnemigo2 == 1){
                        vidaExplorador = vidaExplorador - 1;
                        System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                        nombre + " ahora tienes " + vidaExplorador + " vidas");
                    }
                    if(varEnemigo2 == 2){
                        vidaExplorador = vidaExplorador - 2;
                        System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                        nombre + " ahora tienes " + vidaExplorador + " vidas");
                    }
                    
                    do{
                        System.out.println("Aún tienes una batalla con " + jugador + " enemigos ¿que deseas hacer?" +
                        "\nCada enemigo cuenta con 3 vidas, pero el enemigo " + golp + " tiene " + vidaEnemigos + " vidas"
                        + "\n1. Golpear \n2. Herir \n3. Matar \nSelecciona un número:");
                        enem = scan.nextInt();
                        if (enem > 3 || enem < 1){
                            System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                        } 
                    }while(enem > 3 || enem < 1);
            
                    if (enem == 1){
                        vidaEnemigos = vidaEnemigos - 1; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                        if(varEnemigo2 == 1){
                            vidaExplorador = vidaExplorador - 1;
                            System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                        if(varEnemigo2 == 2){
                            vidaExplorador = vidaExplorador - 2;
                            System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                    }
                    if (enem == 2){
                        vidaEnemigos = vidaEnemigos - 2; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                        if(varEnemigo2 == 1){
                            vidaExplorador = vidaExplorador - 1;
                            System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                        if(varEnemigo2 == 2){
                            vidaExplorador = vidaExplorador - 2;
                            System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                    }
                    if (enem == 3){
                        System.out.println("\nEl enemigo " + golp + " ha muerto ");

                        if(varEnemigo2 == 1){
                            vidaExplorador = vidaExplorador - 1;
                            System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                        if(varEnemigo2 == 2){
                            vidaExplorador = vidaExplorador - 2;
                            System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                    }
                    System.out.println("\nVolvemos al inicio");
                    Vista vs = new Vista();
                    vs.vista();
                }
                if (enem == 2){
                    int vidaEnemigos = com.vidasEnemigos();
                    vidaEnemigos = vidaEnemigos - 2; 
                    System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                    if(varEnemigo2 == 1){
                        vidaExplorador = vidaExplorador - 1;
                        System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                        nombre + " ahora tienes " + vidaExplorador + " vidas");
                    }
                    if(varEnemigo2 == 2){
                        vidaExplorador = vidaExplorador - 2;
                        System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                        nombre + " ahora tienes " + vidaExplorador + " vidas");
                    }
                     
                    do{
                        System.out.println("Aún tienes una batalla con " + jugador + " enemigos ¿que deseas hacer?" +
                        "\nCada enemigo cuenta con 3 vidas, pero el jugador " + golp + " tiene " + vidaEnemigos + " vidas"
                        + "\n1. Golpear \n2. Herir \n3. Matar \nSelecciona un número:");
                        enem = scan.nextInt();
                        if (enem > 3 || enem< 1){
                            System.out.println("\nHaz marcado una opción inválida, intenta de nuevo");
                        } 
                    }while(enem > 3 || enem < 1);
            
                    if (enem == 1){
                        vidaEnemigos = vidaEnemigos - 1; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                        if(varEnemigo2 == 1){
                            vidaExplorador = vidaExplorador - 1;
                            System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                        if(varEnemigo2 == 2){
                            vidaExplorador = vidaExplorador - 2;
                            System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                    }
                    if (enem == 2){
                        vidaEnemigos = vidaEnemigos - 2; 
                        System.out.println("\nEl enemigo " + golp + " ahora tiene " + vidaEnemigos  + " vidas");

                        if(varEnemigo2 == 1){
                            vidaExplorador = vidaExplorador - 1;
                            System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                        if(varEnemigo2 == 2){
                            vidaExplorador = vidaExplorador - 2;
                            System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                    }
                    if (enem == 3){
                        System.out.println("\nEl enemigo " + golp + " ha muerto ");

                        if(varEnemigo2 == 1){
                            vidaExplorador = vidaExplorador - 1;
                            System.out.println("\nUno de los enemigos te ha herido dando veneno " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                        if(varEnemigo2 == 2){
                            vidaExplorador = vidaExplorador - 2;
                            System.out.println("\nUno de los enemigos te ha golpeado muy fuerte " + 
                            nombre + " ahora tienes " + vidaExplorador + " vidas");
                        }
                    }
                    System.out.println("\nVolvemos al inicio");
                    Vista vs = new Vista();
                    vs.vista();
                }
                if (enem == 3){
                    
                    System.out.println("\nEl enemigo " + golp + " ha muerto ");
                }
            }
            
        }
        if(ope == 2){
            System.out.println("\n***** Hasta pronto *****");
        }
    }

    public void Game(){
        System.out.println("\nEl juego a terminado");
        System.out.println("\nVolvemos al inicio");
        Vista vs = new Vista();
        vs.vista();
    }



}
