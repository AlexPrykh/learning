package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Напишите программу, которая сначала считывает информацию о книге от пользователя.
    Подробности, которые необходимо запросить для каждой книги, включают название,
    количество страниц и год публикации. Ввод пустой строки в качестве названия книги
    завершает процесс чтения.

    После этого пользователя спрашивают, что следует распечатать. Если пользователь вводит «все»,
    печатаются все детали: названия книг, номера страниц и годы публикации.
    Однако, если пользователь вводит строку «имя», печатаются только названия книг.

    Вероятно, имеет смысл реализовать класс, вызываемый Book для представления книги.
    Всего для этого упражнения доступны две точки.

    Пример вывода:

    Название: Убить пересмешника
    Страниц: 281
    Год публикации: 1960
    Название: Краткая история времени
    Страниц: 256
    Год публикации: 1988
    Название: Beautiful Code
    Pages: 593
    Год публикации: 2007
    Название: Имя ветра
    Страниц: 662
    Год публикации : 2007
    Название:

    Какая информация будет напечатана? everything
    Убить пересмешника, 281 страница, 1960
    Краткая история времени, 256 страниц, 1988
    Красивый код, 593 страницы, 2007
    Имя ветра, 662 страницы, 2007

    Название: Убить пересмешника
    Страниц: 281
    Год публикации: 1960
    Название: Краткая история времени
    Страниц: 256
    Год публикации: 1988
    Название: Beautiful Code
    Pages: 593
    Год публикации: 2007
    Название: Имя ветра
    Страниц: 662
    Год публикации : 2007
    Название:

    Какая информация будет напечатана? name
    Убить пересмешника
    Краткая история времени
    Красивый код
    Имя ветра
 */
public class Books {
    private String name;
    private int numberOfPages;
    private int yearOfPublication;

    public Books(String name, int numberOfPages, int yearOfPublication) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getInfo(String mode) {
        if ("everything".equals(mode)) {
            return "Title of the book: " + getName() +
                    "\nPages: " + getNumberOfPages() +
                    "\nPublication year: " + getYearOfPublication();
        }

        if ("name".equals(mode)) {
            return "Title of the book: " + getName();
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter a book name:");
            String bookName = sc.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.println("Please, enter a number of pages");
            int numberOfPages = Integer.parseInt(sc.nextLine());

            System.out.println("Please, enter year of publication:");
            int yearOfPublication = Integer.parseInt(sc.nextLine());

            books.add(new Books(bookName, numberOfPages, yearOfPublication));
        }

        System.out.println("What information will be printed?");
        String output = sc.nextLine();
        for (Books book : books) {
            System.out.println(book.getInfo(output));
        }
    }
}
