import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        System.out.println("Масса обоих бойцов: " + (firstBoxerWeight + secondBoxerWeight) + " кг.");
        System.out.println("Разница в весе: " + (secondBoxerWeight - firstBoxerWeight) + " кг.");

        /* не вижу смысла применять в таких рассчетах остаток от деления, потому что в случае, когда
        * вес будет отличаться более, чем в 2 раза, рассчёты будут некорректными. Сделаем так:*/

        System.out.println(abs(firstBoxerWeight - secondBoxerWeight));
    }
}