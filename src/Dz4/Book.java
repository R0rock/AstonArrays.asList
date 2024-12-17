package Dz4;
class Book {
    private String title;
    private int pagesCount;
    private int yearOfPublication;

    public Book(String title, int pagesCount, int yearOfPublication) {
        this.title = title;
        this.pagesCount = pagesCount;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitle() {
        return title;
    }
    public int getPagesCount() {
        return pagesCount;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesCount=" + pagesCount +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
