package main;

public class ClienteLinea extends Cliente{

    private String correo;

    public ClienteLinea(int id, String nombre, String correo) {
        super(id, nombre);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString(){
        return super.toString() + " Correo: " + this.correo;
    }
}
