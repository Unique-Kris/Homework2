public class Main {
    public static void main(String[] args) {

        System.out.println ("Задание 1");
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);

        System.out.println ("Задание 2");
        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println (cat);
        paper = paper +4;
        System.out.println (paper);

        System.out.println ("Задание 3");
        dog = dog - 3.5;
        System.out.println (dog);
        cat = cat - 1.6;
        System.out.println (cat);
        paper = paper - 7639;
        System.out.println (paper);

        System.out.println ("Задание 4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        System.out.println ("Задание 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        System.out.println ("Задание 6");
        var weightBoxerFirst = 78.2;
        var weightBoxerSecond = 82.7;
        var weigtBoxers = weightBoxerFirst + weightBoxerSecond;
        System.out.println("Общий вес боксеров " + weigtBoxers);
        var differenceBoxers = weightBoxerSecond - weightBoxerFirst;
        System.out.println("Разница " + differenceBoxers);

        System.out.println ("Задание 7");
        var remains = weightBoxerSecond % weightBoxerFirst;
        System.out.println("Остаток " + remains);

        System.out.println ("Задание 8");
        var workHours = 640;
        var onePeopleWork = 8;
        var workers = workHours / onePeopleWork;
        System.out.println("Всего работников в компании " + workers + " человек");
        var workers2 = workers + 94;
        var workHours2 = workers2 * 8;
        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + workHours2 + " часов работы может быть поделено между сотрудниками");
    }
}