public class Rombo extends Figura {
    private int diagonalMayor;
    private int diagonalMenor;

    public Rombo(String tipo, int diagonalMayor, int diagonalMenor) {
        super(tipo);
        this.setDiagonalMayor(diagonalMayor);
        this.setDiagonalMenor(diagonalMenor);
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double area() {
        return (double) (this.diagonalMayor * this.diagonalMenor) / 2;
    }

}
