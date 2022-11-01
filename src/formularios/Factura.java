package formularios;

public class Factura {
    
    String cod_prod;
    String nombre;
    String precio;
    String cant;
    
    public Factura(){
        
    }
    
    public Factura(String cod_prod,String nombre,String precio,String cant) {
        
        this.cod_prod = cod_prod;
        this.nombre = nombre;
        this.precio = precio;
        this.cant = cant;
 
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }
    
    
    
    
}



