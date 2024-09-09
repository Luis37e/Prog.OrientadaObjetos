// Subclase Calzado que extiende de Prenda
class Calzado extends Prenda {
    private String talla;

    // Constructor de Calzado que llama al constructor de Prenda y establece la talla
    public Calzado(String nombreProducto, String codigo, double precio, double costo, String descripcion, String talla) {
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