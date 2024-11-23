//Clase hija que hereda (extiende) de la clase madre Persona
public class Jefe extends Persona {

    //ATRIBUTOS(caracteristicas) de la clase(objeto)
    //Variables globales
    //Atributos propios
    int idJefe;
    String departamentoJefe;



    //METODOS CONSTRUCTORES

    //CONSTRUCTOR VACIO (Se utiliza cuando se crea un objeto que los datos se llenan mas adelante)
    public Jefe(){
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    //Atributos de herencia de clase madre Persona


    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
                //Atributos propios
                int idJefe, String departamentoJefe) {
        //La palabra reservada SUPER se utiliza para la asignacion de valor para los atributos heredados de la clase madre, como si estuviera llamando el constructor de la clase madre
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    //METODOS GETTERS AND SETTERS
    //METODO GETTER (Traer) // Obtener los datos para hacer una operacion, mostrarlos por pantalla
    public int getIdJefe() {
        return idJefe;
    }
    //METODO SETTER (Colocar) // Se puede colocar o establecer valores a cada atributo
    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }


    //METODOS
    //modificador de acceso
    //tipo de dato a devolver
    //nombre del metodo(verbo en infinitivo)

}
