import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 =new Cachorro("Puppy", 25, "Marron", 5.5, 5, "Nada");

        System.out.println(cachorro1.getNumeroCachorros());

        Cachorro cachorro2 =new Cachorro("Rex", 10, "Branco", 10.5, 5, "Nada");

        System.out.println(cachorro2.getNumeroCachorros());
        // serve para a soma das classes e não dos objetos
        System.out.println(cachorro1.getNumeroCachorros());




//        cachorro1.setNome("Puppy");
//        cachorro1.setAltura(25);
//        cachorro1.setCor("marron");
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoRabo(5);
//        cachorro1.setEstadoEspirito("Nada");
//
//        cachorro2.setNome("Rex");
//        cachorro2.setAltura(10);
//        cachorro2.setCor("Branco");
//        cachorro2.setPeso(10.5);
//        cachorro2.setTamanhoRabo(5);
//        cachorro2.setEstadoEspirito("Nada");

//        System.out.println("Rex tem seu id: " + cachorro2);
//        System.out.println("Puppy tem seu id: "+ cachorro1);

//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
////cuidado para não perder a referencia do objeto
//        //cachorro2 = cachorro1;
//
//        System.out.println("---------------------------");
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
    }
}