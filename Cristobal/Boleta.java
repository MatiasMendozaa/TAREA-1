package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Boleta extends DocTributario{

    /**
     *
     * @param numero
     */
    public Boleta(String numero) {
        super(numero);
    }

    /**
     *
     * @return retornamos la fecha de compra almacenada en la super clase
     */
    @Override
    public String gettFecha() {
        return super.gettFecha();
    }

    /**
     *
     * @return retornamos el nombre del cliente almacenada en superclase
     */
    @Override
    public String gettNombre() {
        return super.gettNombre();
    }

    /**
     *
     * @return retornamos el número
     */
    @Override
    public String gettNum() {
        return super.gettNum(); 
    }

    /**
     *
     * @return retornamos el rut del cliente
     */
    @Override
    public String gettRut() {
        return super.gettRut(); 
    }

    /**
     *
     * @return retornamos un string acorde al documento tributario elegido por el cliente
     */
    @Override
    public String toString() {
        return ("Boleta");
    }

    /**
     *
     * @return retornamos la dirección del cliente
     */
    @Override
    public String gettDire() {
        return super.gettDire();
    }
}