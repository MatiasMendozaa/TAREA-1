package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public abstract class DocTributario {
    private String numero, rut, fecha, nombre, direccion;

    /**
     *
     * @param numero: número del documento
     */
    public DocTributario(String numero){  
        this.numero=numero;
    }

    /**
     *
     * @param d: seteamos la dirección del cliente
     */
    public void settDireccion(String d){
        direccion=d;
    }

    /**
     *
     * @param r: seteamos el rut del cliente
     */
    public void settRut(String r){
        rut=r;
    }

    /**
     *
     * @param f: seteamos la fecha del día de compra
     */
    public void settFecha(String f){
        fecha=f;
    }

    /**
     *
     * @return: retornamos la dirección del cliente
     */
    public String gettDire(){
        return direccion;
    }

    /**
     *
     * @return: retornamos el rut del cliente
     */
    public String gettRut(){
        return rut;
    }

    /**
     *
     * @return: retornamos la fecha
     */
    public String gettFecha(){
        return fecha;
    }

    /**
     *
     * @return: retornamos el número del documento tributario
     */
    public String gettNum(){
        return numero;
    }

    /**
     *
     * @param n: seteamos el nombre del cliente
     */
    public void settNombre(String n){
        nombre=n;
    }

    /**
     *
     * @return retornamos el nombre del cliente
     */
    public String gettNombre(){
        return nombre;
    }

    /**
     *
     * @return método abstracto que retorna string
     */
    abstract public String toString();
}