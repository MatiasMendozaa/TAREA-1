package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Factura extends DocTributario{

    /**
     *
     * @param numero: número documento tributario
     */
    public Factura(String numero) {
        super(numero);
    }

    /**
     *
     * @return retornamos la fecha del día de la compra
     */
    @Override
    public String gettFecha() {
        return super.gettFecha();
    }
    
    /**
     *
     * @return: retornamos el nombre del cliente
     */
    @Override
    public String gettNombre() {
        return super.gettNombre();
    }

    /**
     *
     * @return retornamos el número del documento tributario
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
     * @return retornamos string acorde al doumento tributario elegido por el cliente
     */
    @Override
    public String toString() {
        return "Factura";
    }
}
