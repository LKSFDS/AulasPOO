public class Contador {
    private int cont;

    public Contador(){
        this.cont = 0;
    }

    public Contador(int cont){
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void mostraVal(){
        System.out.println("O Valor atual do contador é: "+getCont());
    }

    public void increUmaUni(){
        this.cont++;
    }

    public void increContVal(int a){
        this.cont = this.cont + a;
    }

    public void decreUmaUni(){
        this.cont--;
    }

    public void decreContVal(int a){
        this.cont = this.cont - a;
    }

    public static void main(String args[]) {

        Contador contador = new Contador();
        contador.mostraVal();
        contador.increUmaUni();
        contador.increContVal(5);
        contador.decreUmaUni();
        contador.decreContVal(2);
        contador.mostraVal();
        System.out.println("\n");
        Contador contador1 = new Contador(10);
        contador1.mostraVal();
        contador1.increUmaUni();
        contador1.increContVal(5);
        contador1.decreUmaUni();
        contador1.decreContVal(3);
        contador1.mostraVal();

    }
}
