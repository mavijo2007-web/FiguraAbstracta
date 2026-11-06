public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(String tipo, int lado) {
        super(tipo);
        this.setlado(lado);
    }
    public int getlado() {
        return lado;
    }
    public void setlado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return (double) this.lado * this.lado;
    }
}
