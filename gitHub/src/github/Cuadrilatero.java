package github;


public class Cuadrilatero {
    //atributos
    private double alto;
    private double largo;
    //Constructor

    public Cuadrilatero(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }
    //getters y setters
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    //otros metodos adicionales
public double calcularPerimetro(){
        return largo*2+alto*2;
}
public double clacularArea(){
    return largo*alto;
}
public boolean esUnCuadrado(){
        return largo == alto;
    }

}
