package main;

public class Producto implements IProducto {

    private int id;
    private int precio;

    public Producto(int id, int precio) {
        this.id = id;
        this.precio = precio;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
