//Clase hija que hereda(extiende) de la clase madre persona
public class Consultor extends Persona {


    //ATRIBUTOS(caracteristicas) de la clase(objeto)
    //Variables globales
    //Atributos propios
    String nombreConsultora;
    int numConsultor;


    //METODOS CONSTRUCTORES

    //CONSTRUCTOR VACIO (Se utiliza cuando se crea un objeto que los datos se llenan mas adelante)
    public Consultor(){
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    //atributos de herencia de clase madre Persona
    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
                     //atributos propios
                     String nombreConsultora, int numConsultor) {
        //La palabra reservada SUPER se utiliza para la asignacion de valor para los atributos heredados de la clase madre, como si estuviera llamando el constructor de la clase madre
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultor = numConsultor;
    }

    //METODOS GETTERS AND SETTERS
    //METODO GETTER (Traer) // Obtener los datos para hacer una operacion, mostrarlos por pantalla
    public String getNombreConsultora() {
        return nombreConsultora;
    }
    //METODO SETTER (Colocar) // Se puede colocar o establecer valores a cada atributo
    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }


    //METODOS
    //modificador de acceso
    //tipo de dato a devolver
    //nombre del metodo(verbo en infinitivo)
}
