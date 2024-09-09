class Camiseta extends Prenda {
    private String talla;

    public Camiseta(String nombreProducto, String codigo, double precio, double costo, String descripcion, String talla) {
        super(nombreProducto, codigo, precio, descripcion);
        this.talla = talla;
        setCosto(costo);
    }

    @Override
    public double calcularGanancia() {
        return precio - getCosto();
    }

    @Override
    public String obtenerTalla() {
        return talla;
    }
}