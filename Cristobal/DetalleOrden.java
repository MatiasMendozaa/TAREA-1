package tarea1progra2;
import java.util.ArrayList;

/**
 *
 * @author Cris y Matías
 */
public class DetalleOrden {
    private float PSIT, IT, PCIT, PT;
    private int cant;
    private Articulo art;
    private ArrayList <Articulo> lista;

    /**
     *
     */
    public DetalleOrden(){
        lista=new ArrayList<Articulo>();
    }

    /**
     *
     * @param cant: cantidad de artículos a comprar
     * @param ar: pasamos un puntero del artículo
     */
    public void addArticulo(int cant, Articulo ar){
        this.art=ar;
        if(art!=null){
            art.settCant(cant);
            this.cant+=cant;
            lista.add(art);
        }        
    }

    /**
     *
     * @return retornamos el precio sin iva total
     */
    public float calcPrecioSITotal(){
        if(lista.size()!=0){
            float aux=0;
            for(int i=0; i<lista.size(); i++){
                aux=aux+lista.get(i).gettPrecioSI(); 
            }this.PSIT=aux; return PSIT;
        }return 0;
    }

    /**
     *
     * @return retornamos el valor del iva total
     */
    public float calcIvaTotal(){
        if(lista.size()!=0){
            float aux=0;
            for(int i=0;i<lista.size();i++){
                aux=aux+lista.get(i).gettIva();
            }this.IT=aux; return IT;
        }return 0;
    }

    /**
     *
     * @return retornamos el precio con iva total
     */
    public float calcPrecioCITotal(){
        if(lista.size()!=0){
            float aux=0;
            for(int i=0;i<lista.size();i++){
                aux=aux+lista.get(i).gettPrecioCI();
            }this.PCIT=aux; return PCIT;
        }return 0;
    }

    /**
     *
     * @return retornamos el peso total de todos los artículos a comprar
     */
    public float calPesoTotal(){
        if(lista.size()!=0){
            float aux=0;
            for(int i=0;i<lista.size();i++){
                aux=aux+lista.get(i).gettPeso()*lista.get(i).gettCant();
            }this.PT=aux; return PT;
        }return 0;
    }

    /**
     *
     * @return retornamos un string que contiene la informacion al detalle de la orden de compra
     */
    public String toString(){
        if(lista.size()!=0){
            System.out.println("ORDEN DE COMPRA\n------------------------------------------------------------------------------------------------------------------------------\n******DESCRIPCION DE PRODUCTOS*****");
            for(int i=0;i<lista.size();i++){
                System.out.print(("Nombre del producto N°"+(i+1)+": "+lista.get(i).gettNombre()+" | Cantidad:"+lista.get(i).gettCant()+" | Descripción: "+lista.get(i).toString()+"\n"));
            }System.out.println("------------------------------------------------------------------------------------------------------------------------------\n*******RESUMEN DE PAGO*******\nPago Total: "+this.calcPrecioCITotal()+" CLP | Cantidad total de Articulos: "+cant+" | Iva: "+this.calcIvaTotal()+" CLP"+" | Peso Total: "+this.calPesoTotal()+"kg | Precio S/IVA: "+this.calcPrecioSITotal()+" CLP");
        }return "";
    }
}