package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class OrdenCompra {  
    private String date;
    private String estado;
    private DetalleOrden detalle;
    private float PeT,IT,PCIT,PSIT;
    private DocTributario dt;
    private Pago pago;
    private float monto;

    /**
     *
     * @param det: puntero del detalle de orden
     * @param fecha: fecha del día de compra
     * @param dt: puntero del documento tributario
     * @param p: puntero de pago
     */
    public OrdenCompra(DetalleOrden det,String fecha, DocTributario dt, Pago p){
        detalle=det;
        date=fecha;
        IT=detalle.calcIvaTotal();
        PSIT=detalle.calcPrecioSITotal();
        PCIT=detalle.calcPrecioCITotal();
        PeT=detalle.calPesoTotal();
        this.dt=dt;
        pago=p;
        pago.settFecha(date);
        pago.settPrecioTotal(PCIT);
        monto=pago.gettMonto();
        if(this.calcPrecio()>=monto){
            this.estado="rechazada";
        }else{
            this.estado="preparando orden para envío";
        }
    }

    /**
     *
     * @return: retornamos el precio sin iva total
     */
    public float calcPrecioSinIva(){
        return PSIT;
    }

    /**
     *
     * @return: retornamos valor del iva total
     */
    public float calcIva(){
        return IT;
    }

    /**
     *
     * @return: retornamos el precio con iva total
     */
    public float calcPrecio(){
        return PCIT;
    }

    /**
     *
     * @return retornamos el peso total de los artículos
     */
    public float calPeso(){
        return PeT;
    }
    
    /**
     *
     * @return: string que sirve para ordenar y separar diferentes secciones en nuestra orden de compra
     */
    public String separador(){
        return "------------------------------------------------------------------------------------------------------------------------------";
    }

    /**
     *
     * @return: string que contiene toda la información de la orden de compra
     */
    @Override
    public String toString(){
        return (this.separador()+"\n*******DATOS DEL CLIENTE*******\nNombre: "+dt.gettNombre()+ " | Direccion: "+dt.gettDire()+" | Rut: "+dt.gettRut()+" | Numero: "+dt.gettNum()+ detalle.toString()+"\n"+this.separador()+"\n*******TIPO DE DOCUMENTO*******\n"+dt.toString()+"\n"+this.separador()+"\n"+pago.toString()+"\n"+this.separador()+"\nEstado de orden: "+estado+"\n"+this.Pago());
    }

    /**
     *
     * @return: retornamos la fecha del día de compra
     */
    public String gettFecha(){
        return date;
    }

    /**
     *
     * @return: retornamos el estado de la orden de compra
     */
    public String gettEstado(){
        return estado;
    }

    /**
     *
     * @return retornamos un string que nos dice si la orden fue rechazada o aceptada
     */
    public String Pago(){
        if(this.calcPrecio()>=monto){
            return "ORDEN RECHAZADA, MONTO INSUFICIENTE";
        }else{
            return "ORDEN REALIZADA CON EXITO";
        }
    }
}