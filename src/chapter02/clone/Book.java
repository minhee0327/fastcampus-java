package chapter02.clone;

public class Book implements Cloneable{
    private String title;
    private String author;

    public Book(){}
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo(){
        System.out.println(title +" , " + author);
    }

    public Book clone() throws CloneNotSupportedException{
        // 재정의 했지만, String 처럼 immutable 하지 않음.
        return (Book) super.clone();
    }
}
