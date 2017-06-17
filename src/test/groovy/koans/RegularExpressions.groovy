package koans

import org.junit.Test

class RegularExpressions {

    @Test
    public void "Pattern"() {
        // ------------ START EDITING HERE ----------------------
        def pattern = ~/([^\s]+)/
        // ------------ STOP EDITING HERE  ----------------------
        assert pattern instanceof java.util.regex.Pattern, "This is the same as Pattern.compile"
        assert pattern.matcher('oliebollenkraam').matches(), "Make a pattern that matches oliebollenkraam"
    }

    @Test
    public void "Matcher"() {

        def matcher = "123" =~ /\d/
        // ------------ START EDITING HERE ----------------------
        def song ='lalalala'
        // ------------ STOP EDITING HERE  ----------------------
        assert matcher
        assert song =~ /(la){3,}+/, "compose a catchy song"

    }

    @Test
    public void "matches"() {

        // ------------ START EDITING HERE ----------------------
        def goodSongRegex= ~/^([^0-9]*)$/
        // ------------ STOP EDITING HERE  ----------------------
        assert !('shalalalie 123' ==~ goodSongRegex), 'A good song does not contain numbers'
        assert 'Ze gelooft in mij' ==~ goodSongRegex

    }

}