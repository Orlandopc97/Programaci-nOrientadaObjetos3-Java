//Clase hija que hereda (extiende) de la clase madre persona
public class Empleado extends Persona{


    //ATRIBUTOS(caracteristicas) de la clase(objeto)
    //Variables globales
    //Atributos propios
    int numLegajo;
    String cargo;
    double sueldo;



    //METODOS CONSTRUCTORES

    //CONSTRUCTOR VACIO (Se utiliza cuando se crea un objeto que los datos se llenan mas adelante)
    public Empleado(){
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
                    //atributos de herencia de clase madre Persona
    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
                    //atributos propios
                    int numLegajo, String cargo, double sueldo) {
        //La palabra reservada SUPER se utiliza para la asignacion de valor para los atributos heredados de la clase madre, como si estuviera llamando el constructor de la clase madre
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }


    //METODOS GETTERS AND SETTERS
    //METODO GETTER (Traer) // Obtener los datos para hacer una operacion, mostrarlos por pantalla
    public int getNumLegajo() {
        return numLegajo;
    }
    //METODO SETTER (Colocar) // Se puede colocar o establecer valores a cada atributo
    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    //METODOS
    //modificador de acceso
    //tipo de dato a devolver
    //nombre del metodo(verbo en infinitivo)

}
