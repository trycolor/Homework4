public class Main {
    public static void main(String[] args) {
        // задание 1
int age = 17;
if (age >= 18) {
    System.out.println("Поздравляем с совершеннолетием!");
}
else System.out.println("Прийдется немного подождать");
        //задание 2

        int age1 = 7;
        int age2 = 18;
        int age3 = 25;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18) {
            System.out.println("Закончили школу, иожно поступать в университет");
        }
        if (age3 >= 24) {
            System.out.println("Пора искать работу");
        }
        //задание 3
        int capacity = 102;
        int seat = 60;
        int buyTicket = 61; //количество купленных билетов
        if (buyTicket >= capacity) {
            System.out.println("Свободных мест не осталось");
        }
        if (buyTicket < seat) {
            System.out.println("в вагоне осталось " + (seat - buyTicket) + " сидячих мест и " + (capacity - seat) + "стоячих мест");
        }
        if (buyTicket >= seat) {
            System.out.println("Сидячих мест не осталось, стоячих " + (capacity-buyTicket));
        }

    }


}