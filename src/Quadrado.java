import java.util.ArrayList;
import java.util.List;

public class Quadrado {
    private double lado;
    private double area;

    public Quadrado(double lado){
        this.lado = lado;
        this.area = calcArea(lado);
    }

    public double calcArea(double lado){
        double a = lado*lado;
        return a;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void mostraArea(){
        System.out.println("O lado do quadrado é: "+getLado());
        System.out.println("A area do quadrado é: "+getArea());
    }

    public static void main(String args[]) {

        Quadrado quadrado = new Quadrado(10);
        quadrado.mostraArea();
        System.out.println("\n");
        List<Quadrado> quadrados = new ArrayList<Quadrado>();
        for(int i = 0; i < 10; i++){
            quadrados.add(new Quadrado(Math.random()*10));
        }
        double somaArea = 0;
        for(int i = 0; i < 10; i++){
            somaArea = somaArea + quadrados.get(i).getArea();
            System.out.println("A area do quadrado atual é: "+quadrados.get(i).getArea());
        }

        System.out.println("A soma de todas as areas dos quadrados é: "+somaArea);
    }

}
