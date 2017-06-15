package i_introduction

import org.junit.Test

import static org.junit.Assert.assertEquals

class FileReadrTest {
    @Test
    void "read should return the content of the file"() {
        def reader = new FileReadr()
        assertEquals("Hi, This is a simple content",
                reader.read("src/test/resources/simple_file.txt"))

    }
}
