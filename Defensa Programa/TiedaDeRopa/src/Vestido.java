// Subclase Vestido que extiende de Prenda
class Vestido extends Prenda {
    private String talla;

    // Constructor de Vestido que llama al constructor de Prenda y establece la talla
    public Vestido(String nombreProducto, String codigo, double precio, double costo, String descripcion, String talla) {
        super(nombreProducto, codigo, precio, descripcion);
        this.talla = talla;
        setCosto(costo);
    }

    // Implementación del método calcularGanancia
    @Override
    public double calcularGanancia() {
        return precio - getCosto();
    }

    // Implementación del método obtenerTalla
    @Override
    public String obtenerTalla() {
        return talla;
    }
}