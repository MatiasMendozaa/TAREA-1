package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Efectivo extends Pago{
    
    /**
     *
     * @param monto: monto a cancelar
     */
    public Efectivo(float monto){
        super(monto);
    }

    /**
     *
     * @return: retornamos el vuelto en caso de que el cliente pague con efectivo
     */
    public float calcDevolucion(){
        return super.gettMonto()-super.gettPrecio();
    }

    /**
     *
     * @return retornamos un string de acorde al método de pago
     */
    @Override
    public String toString() {
        return "*******DATOS DE PAGO******\nTipo: efectivo | Precio a pagar: "+super.gettPrecio()+" CLP | Monto dado: "+super.gettMonto()+" CLP | Vuelto: "+this.calcDevolucion()+" CLP";
    }
}