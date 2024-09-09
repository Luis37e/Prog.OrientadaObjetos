abstract class Prenda {
    public String nombreProducto;
    public String codigo;
    public double precio;
    private double costo;
    public String descripcion;

    public Prenda(String nombreProducto, String codigo, double precio, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public abstract double calcularGanancia();

    public abstract String obtenerTalla();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Código: " + codigo);
        System.out.println("Precio: $" + precio);
        System.out.println("Costo: $" + getCosto());
        System.out.println("Descripción: " + descripcion);
        System.out.println("Talla: " + obtenerTalla());
    }
}