public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private int aceleracao;
    private boolean onoff;
    private Contador vezesLigou;
    private Contador vezesAcelerou;
    private Contador vezesFreou;


    public Carro(String marca, String modelo, String placa, int aceleracao){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.aceleracao = aceleracao;
        this.onoff = false;
        vezesLigou = new Contador();
        vezesAcelerou = new Contador();
        vezesFreou = new Contador();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public boolean isOnoff() {
        return onoff;
    }

    public void setOnoff(boolean onoff) {
        this.onoff = onoff;
    }

    public int getVezesAcelerou() {
        return vezesAcelerou.getCont();
    }


    public int getVezesFreou() {
        return vezesFreou.getCont();
    }

    public int getVezesLigou() {
        return vezesLigou.getCont();
    }

    public void ligar(){
        this.onoff = true;
        this.vezesLigou.increUmaUni();
    }

    public void desligar(){
        this.onoff = false;
    }

    public void freia(){
        this.vezesFreou.increUmaUni();
    }

    public void acelera(){
        this.vezesAcelerou.increUmaUni();
    }

    public void mostra() {
        if (onoff == true) {
            System.out.println("A charanga está voando, pq foguete não tem ré!");
        }else{
            System.out.println("A charanga está morta!");
        }
        System.out.println("Essa é a quantidade de vezes que ligamos nosso querido carro: "+getVezesLigou());
        System.out.println("Essa é a quantidade de vezes que queimamos a pista: "+getVezesAcelerou());
        System.out.println("Essa é a quantidade de vezes que fomos covardes: "+getVezesFreou());
    }

    public static void main(String args[]) {

        Carro charanga = new Carro("Aston Martin", "DBS", "007BOND", 97);
        charanga.ligar();
        charanga.acelera();
        charanga.freia();
        charanga.acelera();
        charanga.acelera();
        charanga.acelera();
        charanga.acelera();
        charanga.acelera();
        charanga.acelera();
        charanga.mostra();
        charanga.desligar();

    }

}
