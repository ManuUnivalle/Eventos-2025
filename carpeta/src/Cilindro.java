public class Cilindro extends Circulo {
    private float altura;
    public Cilindro(float radio, float altura){
        super(radio);
        this.altura = altura;

    }
    public float getArea(){
        return super.getArea() * altura;
    }
}
