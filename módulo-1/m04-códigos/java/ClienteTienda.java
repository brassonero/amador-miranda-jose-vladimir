package main;

public class ClienteTienda extends Cliente{

    private String telefono;

    public ClienteTienda(int id, String nombre, String telefono) {
        super(id, nombre);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

}
