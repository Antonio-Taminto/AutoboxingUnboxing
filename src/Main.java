/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
        Scrivere una funzione che accetti in input 1 char lo stampi
        Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
        Scrivere una funzione che accetti in input 1 Character lo stampi
        Scrivere un un valore primitivo per int, double e char e fare autoboxing
        Scrivere un oggetto per Integer, Double e Character e fare Unboxing*/
public class Main {
    public static void main(String[] args) {
        int x = 2;
        Integer x2 = x;

        double y = 2.0;
        Double y2 = y;

        char z = 'c';
        Character z2 = z;

        Integer a = 2;
        int a2 = 2;

        Double b = 2.0;
        double b2 = b;

        Character c = 'd';
        char c2 = c;

        sumInt(4,4);
        printChar('a');
        sumInteger(4,4);
        printCharacter('a');

    }
    public static void sumInt(int x , int y){
        System.out.println(x+y);
    }
    public static void printChar(char x){
        System.out.println(x);
    }
    public static void sumInteger(Integer x , Integer y){
        System.out.println(x+y);
    }
    public static void printCharacter(Character x){
        System.out.println(x);
    }
}