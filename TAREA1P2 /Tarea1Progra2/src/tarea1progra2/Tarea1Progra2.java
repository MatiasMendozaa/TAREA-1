package tarea1progra2;

public class Tarea1Progra2 {

    public static void main(String[] args) {
        Articulo p=new Articulo("Polera", "manga corta", 5000f,1.5f);
        Articulo b= new Articulo("Buzo", "algodon unisex", 10000f,2f);
        Articulo e= new Articulo("Franela", "algodon ", 10000f,2f);
        Articulo a=new Articulo("Juego de tazas", "6 unidades", 7000f, 1f);
        Articulo m=new Articulo("Mouse inalámbrico", "hasta 3600 de dpi", 30000f, 0.150f);
        
        DetalleOrden o1=new DetalleOrden();
        DetalleOrden o2=new DetalleOrden();
        DetalleOrden o3= new DetalleOrden();
        
        o1.addArticulo(3, p);
        o1.addArticulo(4, b);
        o1.addArticulo(4, e);
        
        o2.addArticulo(1, a);
        o2.addArticulo(1, m);
        
        o3.addArticulo(3, p);
        o3.addArticulo(1, e);
        o3.addArticulo(1, m);
        
        Transferencia trans=new Transferencia(3000f, "Banco Santander", "932435465");
        Tarjeta t=new Tarjeta(500000f, "Credito", "328671", 3);
        Efectivo efec=new Efectivo(32000f);
        Efectivo efec2=new Efectivo(100000f);
        
        Boleta boleta = new Boleta("NUM32");
        Factura f=new Factura("NUM4371");
        Boleta b2= new Boleta("NUM564");
        
        OrdenCompra orden = new OrdenCompra(o1,"24 de enero",boleta,t);
        OrdenCompra orden2 = new OrdenCompra(o2,"9 de octubre", f, trans);
        OrdenCompra orden3 = new OrdenCompra(o3, "14 de septiembre", b2, efec2);
        
        Cliente c1 = new Cliente("Cristóbal Henríquez", "20532060-9", "Tres Oriente 361",orden);
        Cliente c2 = new Cliente("Benjamin Alarcón", "19864986-k", "Las Rastras 890", orden2);
        Cliente c3 = new Cliente("Sofia Castillo", "22987567-2", "Los poetas 345", orden3);
                
        Direccion d1 = new Direccion(c1,boleta);
        Direccion d2 = new Direccion(c2, f);
        Direccion d3 = new Direccion(c3, b2);
        
        System.out.println(orden.toString()+"\n\n\n");
        System.out.println(orden2.toString()+"\n\n\n");
        System.out.println(orden3.toString());
    }
}