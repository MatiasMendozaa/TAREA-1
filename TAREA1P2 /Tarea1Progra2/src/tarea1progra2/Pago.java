package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public abstract class Pago {
    private float monto, precio;
    private String date;

    /**
     *
     * @param monto: monto a cancelar
     */
    public Pago(float monto){
        this.monto=monto;
    }

    /**
     *
     * @param d: seteamos la fecha de compra
     */
    public void settFecha(String d){
        date=d;
    }

    /**
     *
     * @param p: seteamos el precio total a cancelar
     */
    public void settPrecioTotal(float p){
        precio=p;
    }

    /**
     *
     * @return retornamos el precio
     */
    public float gettPrecio(){
        return precio;
    }

    /**
     *
     * @return retornamos el monto
     */
    public float gettMonto(){
        return monto;
    }

    /**
     *
     * @return retornamos la fecha
     */
    public String gettFecha(){
        return date;
    }

    /**
     *
     * @return método abstracto que retorna un string diferente de acuerdo al método de pago
     */
    abstract public String toString();
}