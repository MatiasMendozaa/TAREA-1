package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Direccion {
    private String direccion;
    private Cliente c;
    private DocTributario dt;

    /**
     *
     * @param cliente: puntero a cliente
     * @param dt: puntero al documento tributario elegido por el cliente
     */
    public Direccion(Cliente cliente, DocTributario dt){
        this.dt=dt;
        c=cliente;
        dt.settRut(c.gettRut());
        dt.settFecha(c.gettFecha());
        dt.settNombre(c.gettNomnbre());
        dt.settDireccion(c.gettAddress());
        direccion=c.gettAddress();
    }

    /**
     *
     * @return retornamos la fecha asociada al día de la compra
     */
    public String gettFecha(){
        return c.gettFecha();
    }

    /**
     *
     * @return retornamos la dirección del cliente
     */
    public String gettAddress(){
        return c.gettAddress();
    }

    /**
     *
     * @return retornamos el nombre del cliente
     */
    public String gettNombre(){
        return c.gettNomnbre();
    }

    /**
     *
     * @return retornamos el número del documento tributario
     */
    public String gettNum(){
        return dt.gettNum();
    }
}