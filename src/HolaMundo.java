
abstract class Persona {
    protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método abstracto - polimorfismo
    abstract void mostrarRol();
    
    // Método común
    void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}


class Estudiante extends Persona {
    private double promedio;
    
    public Estudiante(String nombre, int edad, double promedio) {
        super(nombre, edad);
        this.promedio = promedio;
    }
    
    @Override
    void mostrarRol() {
        System.out.println("Soy Estudiante con promedio: " + promedio);
    }
}


class Profesor extends Persona {
    private String materia;
    
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }
    
    @Override
    void mostrarRol() {
        System.out.println("Soy Profesor de " + materia);
    }
}


class Ingeniero extends Persona {
    private String especialidad;
    
    public Ingeniero(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    
    @Override
    void mostrarRol() {
        System.out.println("Soy Ingeniero en " + especialidad);
    }
}


public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("=== POLIMORFISMO Y HERENCIA ===\n");
        
        // Crear objetos de diferentes tipos
        Persona p1 = new Estudiante("Juan", 20, 3.8);
        Persona p2 = new Profesor("María", 45, "Matemáticas");
        Persona p3 = new Ingeniero("Carlos", 35, "Sistemas");
        
        // Array polimórfico
        Persona[] personas = {p1, p2, p3};
        
        // Polimorfismo en acción - cada uno se comporta diferente
        for (Persona p : personas) {
            p.mostrarDatos();
            p.mostrarRol();
            System.out.println();
        }
    }
}
