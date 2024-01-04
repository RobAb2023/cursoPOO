import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

       Cachorro cachorro1 = new Cachorro();

       cachorro1.nome = "Puppy";
       cachorro1.altura = 25;
       cachorro1.cor = "marron";
       cachorro1.peso = 5.5;
       cachorro1.tamanhoRabo = 5;

       //cachorro1.latir();
       //System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir(""));
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));

    }
}

//ctr + d (duplica linha)

//        System.out.println(cachorro1);
//Animais.Cachorro@5b2133b1 = endereço da memória
//classe = tipos de um objeto (cachorro1)
//objeto =  objeto em si (Animal)
//métodos = são as ações do objeto

//        System.out.println("Hello world!");

//        byte variavelByte = -127;
//        System.out.println(variavelByte);
//
//        int variavelint = 2147583;
//        System.out.println(variavelint);

//ATALHO sout - System.out.println
//precisa ser publico
//precisa ser estático
//não retorne nada (void)
// void main sempre será letra minuscula
//não é o obrigatorio p nome da variavel (... args)

//* Tipos primitivos de Java
//boolean - único não numérico
//float and double : pontos flutuantes
// os demais são numéricos (bit (-128 até 127), short, jar.int, long)
//short -32768 a 32767 (16 bites) = 2 bits
//char 0 a 65535 (16 bites) = 2 bits
//int  -2 bilhoes a 2 bilhoes (32 bites) = 4 bit
//long -9 trilhoes a 9 trilhoes (62 bytes) = 8 bit