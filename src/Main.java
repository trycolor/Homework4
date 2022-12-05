public class Main {
    public static void main(String[] args) {
        // задание 1
int age = 17;
if (age < 18) {
    System.out.println("Прийдется немного подождать");

}
else {
    System.out.println("Поздравляем с совершеннолетием!");
}
        //задание 2-2

        int age1 = 7;
        int age2 = 18;
        int age3 = 23;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
            else {
                System.out.println("в школу только с 7 лет");
            }

        if (age2 >= 18) {
            System.out.println("Закончили школу, иожно поступать в университет");
        }
            else {
                System.out.println("Пока не закончили школу, в университет не поступим");
            }

        if (age3 >= 24) {
            System.out.println("Пора искать работу");
        }
            else {
            System.out.println("Сначала нужно выучиться");

        //задание 2-3
        int capacity = 102;
        int seat = 60;
        int buyTicket = 23; //количество купленных билетов

        if (buyTicket < seat) {
            System.out.println("в вагоне осталось " + (seat - buyTicket) + " сидячих мест и " + (capacity - seat) + "стоячих мест");
        }
        else {
            System.out.println("Сидячих мест не осталось, стоячих " + (capacity-buyTicket));
        }
        int human = 24;
        if (human >= 2 && human <= 6) {
            System.out.println ("Если возраст равен " + human + " то он должен ходить в детский сад");
        }
        if (human >= 7 && human <= 18) {
            System.out.println ("Если возраст равен " + human + " то он должен ходить в школу");

        }
        if (human > 18 && human <24) {
            System.out.println ("Если возраст равен " + human + " то он должен учиться в университете");
        }
        else {
            System.out.println ("Если возраст равен " + human + " то ему пора работать");
        }
        int child = 16;
        if (child < 5) {
            System.out.println("Если ребенку " + child + " лет, то кататься нельзя");
        }
        if (child>5 && child < 14) {
            System.out.println("Если ребенку " + child + " лет, то кататься без взрослых нельзя");
        }
        else {
            System.out.println("Если ребенку " + child + " лет, то можно кататься без взрослого" ) ;

           }}}}




