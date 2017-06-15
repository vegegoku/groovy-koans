package ii_basics

import org.junit.Assert
import org.junit.Test

class BookTest  {
    @Test
    void "creating a Book"() {
        def book = new Book("Java Concurrency in Practice", "0321349601", ["Brian Goetz", "Tim Peierls"], "Addison-Wesley")
        def bookCopy=new Book("Java Concurrency in Practice", "0321349601", ["Brian Goetz", "Tim Peierls"], "Addison-Wesley")
        Assert.assertEquals(book.getTitle(),"Java Concurrency in Practice")
        Assert.assertTrue([book].contains(bookCopy))
        Assert.assertTrue(book.toString().contains("title"))
    }
}
