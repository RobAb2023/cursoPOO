package Animais;
//1°atributos
public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
   public int tamanhoRabo;

   public String estadoEspirito;

   //2°métodos = ação

    public void comer(){}

    public void latir(){
        System.out.println("AU AU");
    }
    public String pegar(){
        return "bola";
    }
    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoEspirito = "Feliz";
        } else if (acao.equals("vai dormir!")) {
            this.estadoEspirito ="Bravo";
        }else{
            this.estadoEspirito = "Neutro";
        }
        return estadoEspirito;
    }
}
