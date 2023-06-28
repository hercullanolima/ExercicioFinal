public class Main {
    public static void main(String[] args) {

        //VARIÁVEIS PRIMITIVAS
        int valor1 = 12;
        int valor2 = valor1;
        double valor5 = 3.59;
        float valor7 = 2.6f;
        char valor9 = 'C';
        byte valor10 = 127;
        long valor11 = 9874645473887L;

        //VARIÁVEIS WHAPPER
        
        Integer valor3 = Integer.valueOf(52);
        Integer valor4 = Integer.valueOf(valor3);
        Double valor6 = Double.valueOf(343);
        Float valor8 = Float.valueOf(2.2f);
        Character valor12 = Character.valueOf('C');
        Byte valor13 = 127;
        Long valor14 = 7777766665556L;

        System.out.println("--- VARIÁVEIS PRIMITIVAS ---");
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor5);
        System.out.println(valor7);
        System.out.println(valor9);
        System.out.println(valor10);
        System.out.println(valor11);

        valor3 = 20;
        System.out.println("--- VARIÁVEIS WRAPPER ---");
        System.out.println(valor3);
        System.out.println(valor4);
        System.out.println(valor6);
        System.out.println(valor8);
        System.out.println(valor12);
        System.out.println(valor13);
        System.out.println(valor14);

    }
}