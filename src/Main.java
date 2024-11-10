//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int i = 0;
        for (i=1; i<=10; i++)
            System.out.println(i);

        System.out.println("Задача 2");
        for (i=10; i>=1; i--)
            System.out.println(i);
        System.out.println("Задача 3");
        for (i=0; i<=17; i+=2)
            System.out.println(i);
        System.out.println("Задача 4");
        for (i=10; i>=-10; i-=2)
            System.out.println(i);
        System.out.println("Задача 5");
        for (i=1904; i<=2096; i+=4)
            System.out.println(i + " год является високосным");
        System.out.println("Задача 6");
        for (i=7; i<=98; i+=7)
        System.out.println(i);
        System.out.println("Задача 7");
        for (i=1; i<=512; i*=2)
            System.out.println(i);
        System.out.println("Задача 8");
        var salary = 0;
        for (i=1; i<=12; i++) {
            salary=salary+29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary + " рублей");}
        System.out.println("Задача 9");
        double salary2 = 0;
        double percent = 0;
        for (i=1; i<=12; i++) {
            percent = 0.01 * salary2;
            salary2=salary2+29000+percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary2 + " рублей");}
        System.out.println("Задача 10");
        for (i=1; i<=10; i++) {
            System.out.println("2 * " + i + " = " + 2*i);
        }


    }
}