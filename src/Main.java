public class Main {
public static void main(String[] args) {
    task1 ();
    task2 ();
    task3 ();
    task4 ();
    task5 ();
    task6 ();
    task7 ();
    }
        public static void task1 () {
        System.out.println("Задача 1");
            int human = 17;
            if (human >= 18)
            {System.out.println("Если возраст человека равен "+human+ " он совершеннолетний");}
            if (human < 18)
            {System.out.println("он не достиг совершеннолетия, нужно немного подождать");}}

        public static void task2 () {
            System.out.println("Задача 2");
            byte temperature = 4;
            if (temperature < 5)
            {System.out.println("На улице "+temperature+" градуса, нужно надеть шапку");}
            else
            {System.out.println("На улице "+temperature+" градуса, можно идти без шапки");}



    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte speed = 61;
        if (speed > 60)
        {System.out.println("Если скорость "+speed+" то,придется заплатить штраф");}
        else
        {System.out.println("Если скорость "+speed+" можно ездить спокойно");}

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 24;
        if (age >= 2 && age <= 6)
        {System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить в садик");}
        if (age >= 7 && age <= 18)
        {System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить в школу");}
        if (age >= 19 && age < 24)
        {System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить в университет");}
        else
        {System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить на работу");}



    }
    public static void task5 () {
        System.out.println("Задача 5");
        int years = 7;
        int adult = 12;
        if (years < 5)
        {System.out.println("Если возраст ребенка равен "+years+" , то нельзя кататься на аттракционе");}
        if (adult<18)
        {System.out.println(" Если взрослого нет, то кататься нельзя");}
        else if (years >= 5 && years < 14)
        {System.out.println("Если возраст ребенка равен "+years+" nо можно кататься на аттракционев сопровождении взрослого");}
        else
        {System.out.println("Если возраст ребонка равен "+years+" ,то может кататься без сопровождения взрослого.");}

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int human = 34;
        int seats = human;
        int standingPlaces = human - 62;
        if (human >= 0 && human <= 60)
        {System.out.println(" количество сидячих мест " +seats);}
        if  (human > 61 || standingPlaces > 62)
        {System.out.println(" количество стоячих мест " +standingPlaces );}
        if (human < 102)
        {System.out.println("в вагоне свободно мест " + human);}
        else
        {System.out.println("заняты, все мест в вагоне" );}

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 4;
        int two = 6;
        int three = 5;
        if (three > two && three > one)
        {System.out.println("наибольшее число three " +three );}
        if (two > one && two > three)
        {System.out.println("наибольшее число two " +two );}
        else if (one > two && one > three)
        {System.out.println("наибольшее число one " +one);}
    }
}