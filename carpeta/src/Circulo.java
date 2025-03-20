
public class Circulo {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea(){
        return (float)(Math.PI*radio*radio);
    }

}
