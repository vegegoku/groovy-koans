package i_introduction

import org.junit.Test

import static org.junit.Assert.assertNotNull

class ListingFilesTest {
    @Test
    void "calling the ls-alt command should return the list of files in the current directory"() {
        def process = Runtime.getRuntime().exec "ls-alt"
        assertNotNull process.getText()
    }
}
