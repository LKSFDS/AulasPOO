public class Retangulo {
    private int altura;
    private int largura;
    private int area;
    private int perimetro;
    private int relacao;

    public Retangulo(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
        this.area = calcArea(altura, largura);
        this.perimetro = calcPerimetro(altura, largura);
        this.relacao = calcRelacao(altura, largura);
    }

    private int calcArea(int altura, int largura){
        int a = altura*largura;
        return a;
    }

    private int calcPerimetro(int altura, int largura){
        int a = (2*altura)+(2*largura);
        return a;
    }

    private int calcRelacao(int altura, int largura){
        int a = altura/largura;
        return a;
    }

    public void verifQuadrado(){
        int a = getAltura();
        int b = getLargura();
        if(a == b){
            System.out.println("Esse retangulo é na verdade um quadrado!");
        }else{
            System.out.println("Esse retangulo não é um quadrado!");
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getRelacao() {
        return relacao;
    }

    public void setRelacao(int relacao) {
        this.relacao = relacao;
    }

    public void mostra(){
        System.out.println("A altura do retangulo é: "+getAltura());
        System.out.println("A largura do retangulo é: "+getLargura());
        System.out.println("A area do retangulo é: "+getArea());
        System.out.println("O perimetro do retangulo é: "+getPerimetro());
        System.out.println("A relação entre base e altura é: "+getRelacao());

    }

    public static void main(String args[]) {

       Retangulo retangulo = new Retangulo(10,5);

       retangulo.mostra();
       retangulo.verifQuadrado();

       Retangulo retangulo1 = new Retangulo(10,10);
       retangulo1.mostra();
       retangulo1.verifQuadrado();

    }

}

