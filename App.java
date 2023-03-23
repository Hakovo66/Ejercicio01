public class App {
    public static void main(String[] args) throws Exception {
        
 suma(5, 5, 5);

    }
    public static void suma (int a, int b, int c){
    
        int resultado = a + b + c;
        System.out.println(resultado);
        
        }
}



public class Ejercicio02 {

    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        miCoche.Agregarpuerta();
        miCoche.Agregarpuerta();
        miCoche.Agregarpuerta();
        miCoche.Agregarpuerta();

        System.out.println(miCoche.puertas);



    }
    
}

class Coche {

    public int puertas = 0;
    public void Agregarpuerta () {
        this.puertas ++;
    }
}



