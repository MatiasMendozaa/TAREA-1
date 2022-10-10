package tarea1progra2;

/**
 *
 * @author Cris y Matías
 */
public class Articulo {
    private int cantidad;
    private float peso;
    private float precio;
    private String nombre;
    private String descripcion;

    /**
     *
     * @param nombre: nombre del artículo a crear
     * @param descripcion: breve descripción del artículo
     * @param precio: precio del artículo
     * @param peso: peso en kg del artículo
     */
    public Articulo(String nombre, String descripcion, float precio, float peso){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.peso=peso;
        this.precio=precio;
    }

    /**
     *
     * @return retornamos nombre del artículo
     */
    public String gettNombre(){
        return nombre;
    }

    /**
     *
     * @return retornamos descripción del artículo
     */
    public String toString(){
        return descripcion;
    }

    /**
     *
     * @return retornamos el peso del artículo
     */
    public float gettPeso(){
        return peso;
    }

    /**
     *
     * @return retornamos el precio sin iva del artículo por una cantidad dada
     */
    public float gettPrecioSI(){
        return precio*cantidad;
    }

    /**
     *
     * @return retornamos el precio con iva del artículo por una cantidad dada
     */
    public float gettPrecioCI(){
        return ((precio*19/100f)+(precio))*cantidad;
    }

    /**
     *
     * @return retornamos el precio del iva del artículo por una cantidad dada
     */
    public float gettIva(){
        return (precio*19/100f)*cantidad;
    }

    /**
     *
     * @param cant: seteamos la cantidad a comprar del artículo
     */
    public void settCant(int cant){
        this.cantidad=cant;
    }

    /**
     *
     * @return retornamos la cantidad del artículo a comprar
     */
    public int gettCant(){
        return cantidad;
    }
}