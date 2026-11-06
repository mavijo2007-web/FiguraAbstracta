public class Pentagono extends Figura {
    private int Perimetro;
    private int apotema;

    public Pentagono(String tipo, int Perimetro, int apotema) {
        super(tipo);
        this.setPerimetro(Perimetro);
        this.setApotema(apotema);
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(int Perimetro) {
        this.Perimetro = Perimetro;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return (double) (this.Perimetro * this.apotema) / 2;
    }

}
