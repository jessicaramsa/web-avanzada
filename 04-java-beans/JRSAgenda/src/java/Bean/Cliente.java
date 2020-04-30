package Bean;

/**
 *
 * @author jessicaramsa
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String calle;
    private String colonia;
    private String rfc;
    private String telefono;
    private String email;

    public Cliente(int idCliente, String nombre, String calle, String colonia,
            String rfc, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.colonia = colonia;
        this.rfc = rfc;
        this.telefono = telefono;
        this.email = email;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre
                + ", calle=" + calle + ", colonia=" + colonia + ", rfc=" + rfc
                + ", telefono=" + telefono + ", email=" + email + '}';
    }
}
