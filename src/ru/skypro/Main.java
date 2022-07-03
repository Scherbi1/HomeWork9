package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author fred = new Author("Fred" , "Vargas");
    Book girl = new Book("Человек наизнанку", fred , 1999);
        System.out.println("Назвиние книги - " + girl.getTitle());
        System.out.println("Имя автора - " + fred.getName());
        System.out.println("Фамилия автора - " + fred.getLastName());
        System.out.println("год выпуска - " + girl.getYear());
        girl.setYear(2000);
        System.out.println("год выпуска - " + girl.getYear());
        Author alex = new Author("Александр" , "Пушкин");
        Book man = new Book("Дубровсикй", alex , 1833);
        System.out.println("Назвиние книги - " + man.getTitle());
        System.out.println("Имя автора - " + alex.getName());
        System.out.println("Фамилия автора - " + alex.getLastName());
        System.out.println("год выпуска - " + man.getYear());

    }
}
