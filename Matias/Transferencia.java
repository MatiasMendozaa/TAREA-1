package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    /**
     *
     * @param monto: monto a cancelar
     * @param banco: banco elegido por el cliente
     * @param num: número
     */
    public Transferencia(float monto, String banco, String num){
        super(monto);
        this.banco=banco;
        numCuenta=num;
    }

    /**
     *
     * @return: retornamos el banco del cliente
     */
    public String gettBanco(){
        return banco;
    }

    /**
     *
     * @return retornamos el número
     */
    public String gettNum(){
        return numCuenta;
    }

    /**
     *
     * @return string acorde a la transferencia
     */
    @Override
    public String toString() {
        return "*******DATOS DE PAGO******\nTipo: Transferencia | Banco: "+this.gettBanco()+" | Numero de cuenta: "+this.numCuenta+ " | Monto: "+super.gettMonto();
    }
}