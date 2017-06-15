package i_introduction

import org.junit.Assert
import org.junit.Test

class TwitterResponseParserTest {
    @Test
    void "parse the twitter response and get the user id"() {
        def parser = new TwitterResponseParser()
        def usersIds = parser.parse("src/test/resources/sample_twitter_response.xml")
        Assert.assertTrue(usersIds.contains("14498554"))
    }
}
