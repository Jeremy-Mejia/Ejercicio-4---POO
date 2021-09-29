/*************************************************************************************************************
Guerrero.java
Autor: Jeremy Mejía
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Ejercicio No. 4
Guerrero
*************************************************************************************************************/

public class Guerrero extends Combatiente{
     
    public int golpearEnemigos(int vidaEnemigos){
        vidaEnemigos = vidaEnemigos - 1; 
        return vidaEnemigos; 
    }

    public int herirEnemigos(int vidaEnemigos){
        vidaEnemigos = vidaEnemigos - 2; 
        return vidaEnemigos; 
    }

    public int golpearEnemigoJefe(int vidaEnemigoJefe){
        vidaEnemigoJefe = vidaEnemigoJefe - 1; 
        return vidaEnemigoJefe; 
    }

    public int herirEnemigoJefe(int vidaEnemigoJefe){
        vidaEnemigoJefe = vidaEnemigoJefe - 1; 
        return vidaEnemigoJefe; 
    }

}
