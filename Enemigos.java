/*************************************************************************************************************
Enemigos.java
Autor: Jeremy Mejía
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Ejercicio No. 4
Enemigos
*************************************************************************************************************/

class Enemigos {

    public int golpearExplorador(int vidaEnemigos){
        vidaEnemigos = vidaEnemigos - 1; 
        return vidaEnemigos; 
    }

    public int herirExplorador(int vidaEnemigos){
        vidaEnemigos = vidaEnemigos - 2; 
        return vidaEnemigos; 
    }


    public int golpearGuerrero(int vidaEnemigoJefe){
        vidaEnemigoJefe = vidaEnemigoJefe - 1; 
        return vidaEnemigoJefe; 
    }

    public int herirGuerrero(int vidaEnemigoJefe){
        vidaEnemigoJefe = vidaEnemigoJefe - 2; 
        return vidaEnemigoJefe; 
    }

   
    
}
