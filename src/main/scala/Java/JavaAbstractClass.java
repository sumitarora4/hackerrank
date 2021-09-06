package Java;


import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}


class MyBook extends Book {

    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String title = s.nextLine();

        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);

        System.out.println("title is:" + new_novel.getTitle());
        s.close();
    }
}

