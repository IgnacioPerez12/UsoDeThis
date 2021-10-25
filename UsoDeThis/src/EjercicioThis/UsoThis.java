/*
*
* EJERCICIO DE PASO POR REFERENCIA
*
*/

package EjercicioThis;

public class UsoThis {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Ignacio", "Pérez");
        System.out.println("Persona 1: " + p1);
        
    }
    
}

class Persona{
        
    String nombre, apellidos;

    //Constructor
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Acceso a Persona con uso de 'this': " + this);
        
        new Imprimir().imprimir(this);
    }
        
}

class Imprimir{
    
    public void imprimir(Persona persona){
        System.out.println("Imprimirmmos persona desde el metodo imprimir = " + persona);
        System.out.println("Imprimimos persona desde el uso 'this' = " + this);
    }
            
}