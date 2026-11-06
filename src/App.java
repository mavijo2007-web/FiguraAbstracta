public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Rombo("Rombo", 10, 5));
        polimorfismo(new Triangulo("Triangulo", 10, 5));
        polimorfismo(new Cuadrado("Cuadrado", 10));
        polimorfismo(new Pentagono("Pentagono", 10, 5, 5));
        polimorfismo(new Circulo("Circulo", 5));
    }
    public static void polimorfismo(Figura figura) {
        System.out.println("El area de la figura " + figura.getTipo() + " es: " + figura.area());
        System.out.println("--------------------------------------------------");
        
    }
}
