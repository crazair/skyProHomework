package sky.pro.homework.hw19;

public class Book {

    private final String name;
    private final Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return author + ": " + name + ": " + yearPublication;
    }

    public String stringBookToPrint(){
        //“The Stand by Stephen King was published in 1978”
        return name + " by " + author + " was published in " + yearPublication;
    }
}
