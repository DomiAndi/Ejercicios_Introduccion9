public class Main {
    public static void main(String[] args) {
        //Crea una clase Persona con las siguientes variables:
        //La edad
        //El nombre
        //El teléfono
        //Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        //Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

        Cliente Cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        Cliente.nombre = "Andrea";
        Cliente.edad = 30;
        Cliente.telefono = 2059841;
        Cliente.credito = 750.20;

        System.out.println("El Cliente: " + Cliente.nombre + ", tiene una Edad de: " + Cliente.edad + " Años y su Telefono es: " + Cliente.telefono
                + " y su Credito Disponible es: " + Cliente.credito + "$");

        trabajador.nombre = "Carlos";
        trabajador.edad = 28;
        trabajador.telefono = 932496196;
        trabajador.salario = 3000.30;
        System.out.println("El Trabajador: " + trabajador.nombre + ", tiene una Edad de: " + trabajador.edad + " Años y su Telefono es: " + trabajador.telefono
                + " y su Salario es de: " + trabajador.salario + "$");
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}