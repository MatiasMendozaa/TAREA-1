package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    private int cuotas;

    /**
     *
     * @param monto: monto a cancelar
     * @param tipo: tipo de tarjeta
     * @param num: número
     * @param c: cantidad de cuotas
     */
    public Tarjeta(float monto, String tipo, String num, int c){
        super(monto);
        this.tipo=tipo;
        this.numTransaccion=num;
        cuotas=c;
    }

    /**
     *
     * @return retornamos el tipo de tarjeta
     */
    public String gettTipo(){
        return tipo;
    }

    /**
     *
     * @return retornamos el número
     */
    public String gettNum(){
        return numTransaccion;
    }

    /**
     *
     * @return retornamos string acorde al método de pago elegido por el cliente, en este caso tarjeta
     */
    @Override
    public String toString() {
        return "*******DATOS DE PAGO******\nTipo: tarjeta | Tipo de tarjeta: "+this.gettTipo()+" | Numero de cuotas: "+cuotas+" | Valor de cada cuota: "+super.gettPrecio()/cuotas+" CLP"+" | Num Transaccion: "+this.numTransaccion;
    }
}