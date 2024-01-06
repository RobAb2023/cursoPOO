package Animais;

public class Cachorro {

    public static int numeroCachorros;
    public String nome;

    public int altura;

    public String cor;

    public double peso;

    public int tamanhoRabo;

    //usar uma referencia de id do objeto mais fácil
    //em geral usa-se documento (id = CPF, RG, Matricula)
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }

    public String estadoEspirito;

    public static void setNumeroCachorros(int numeroCachorros) {
        Cachorro.numeroCachorros = numeroCachorros;
    }



    public Cachorro(String nome, int altura, String cor, double peso, int tamanhoRabo, String estadoEspirito) {
        this.nome = nome;
        this.altura = altura;
        this.cor = cor;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoEspirito = estadoEspirito;

        numeroCachorros ++;
    }

    public static int getNumeroCachorros() {
        return numeroCachorros;
    }
    public String getNome() {
        return nome;
    }

    public int getAltura() {
        return altura;
    }

    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }
}

//variavel estatica = guarda todas os objetos dessa classe