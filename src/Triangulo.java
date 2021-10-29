public class Triangulo {
    private int altura;
    private int base;
    private int area;

    private Triangulo(){
        this.altura = 10;
        this.base = 10;
        this.area = calcArea(10, 10);
    }

    public Triangulo(int altura, int base){
        this.altura = altura;
        this.base = base;
        this.area = calcArea(altura, base);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    private int calcArea(int altura, int base){
        int area;
        area = (base*altura)/2;
        return area;
    }


    public void mostra(){
        System.out.println("A altura do triangulo é: "+getAltura());
        System.out.println("A base do triangulo é: "+getBase());
        System.out.println("A area do triangulo é: "+getArea());
    }

    public static void main(String args[]) {

        Triangulo triangulo1 = new Triangulo();
        triangulo1.mostra();

        Triangulo triangulo2 = new Triangulo(7,5);
        triangulo2.mostra();

    }

}
