package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Cliente {
    private String nombre, dir, fecha;
    private String rut;
    private OrdenCompra or;

    /**
     *
     * @param nombre: nombre del cliente
     * @param rut: rut del cliente
     * @param direccion: dirección del cliente
     * @param orden: puntero a la orden de dicho cliente
     */
    public Cliente(String nombre, String rut, String direccion, OrdenCompra orden){
        dir=direccion;
        this.nombre=nombre;
        this.rut=rut;
        or=orden;
        fecha=or.gettFecha();
    }

    /**
     *
     * @return retornamos el nombre del cliente
     */
    public String gettNomnbre(){
        return nombre;
    }

    /**
     *
     * @return retornamos el rut del cliente
     */
    public String gettRut(){
        return rut;
    }

    /**
     *
     * @return retornamos la dirección del cliente
     */
    public String gettAddress(){
        return dir;
    }

    /**
     *
     * @return retornamos la fecha de compra
     */
    public String gettFecha(){
        return fecha;
    }
}