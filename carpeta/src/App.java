public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.getArea());
        Cilindro cilindro = new Cilindro(6, 10);
        System.out.println(cilindro.getArea());

    }
}
