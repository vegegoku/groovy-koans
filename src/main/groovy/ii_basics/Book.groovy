package ii_basics

class Book {
    private String title
    private String ISBN_10
    private List<String> authors
    private String publisher

    Book(String title, String ISBN_10, List<String> authors, String publisher) {
        this.title = title
        this.ISBN_10 = ISBN_10
        this.authors = authors
        this.publisher = publisher
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    String getISBN_10() {
        return ISBN_10
    }

    void setISBN_10(String ISBN_10) {
        this.ISBN_10 = ISBN_10
    }

    List<String> getAuthors() {
        return authors
    }

    void setAuthors(List<String> authors) {
        this.authors = authors
    }

    String getPublisher() {
        return publisher
    }

    void setPublisher(String publisher) {
        this.publisher = publisher
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (!(o instanceof Book)) return false

        Book book = (Book) o

        if (ISBN_10 != book.ISBN_10) return false
        if (authors != book.authors) return false
        if (publisher != book.publisher) return false
        if (title != book.title) return false

        return true
    }

    int hashCode() {
        int result
        result = (title != null ? title.hashCode() : 0)
        result = 31 * result + (ISBN_10 != null ? ISBN_10.hashCode() : 0)
        result = 31 * result + (authors != null ? authors.hashCode() : 0)
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0)
        return result
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ISBN_10='" + ISBN_10 + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
