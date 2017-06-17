package koans

import org.junit.Test

class Strings {
    @Test
    public void "Many ways to quote a 'String'"() {

        // ------------ START EDITING HERE ----------------------
        String s = 'Leerdammerkaas, carpaccio, \nwat een combinatio'
        // ------------ STOP EDITING HERE  ----------------------
        println s
        assert s.contains('\n')

    }

    @Test
    public void "Many ways to quote a /String/"() {
        String s1, s2, s3
        // ------------ START EDITING HERE ----------------------
        s1="this is a string ' in the middle"
        s2='this is a string " in the middle'
        s3='this is a string / in the middle'
        // ------------ STOP EDITING HERE  ----------------------
        assert s1.contains(/'/)
        assert s2.contains('"')
        assert s3.contains('/')

    }

    @Test
    public void "GString"() {

        String name = 'Zanger Rinus'
        String greeting
        // ------------ START EDITING HERE ----------------------
        greeting='Hello '+name
        // ------------ STOP EDITING HERE  ----------------------
        assert greeting == 'Hello Zanger Rinus'

    }

    @Test
    public void "Multiline strings"() {
        // ------------ START EDITING HERE ----------------------
        String s = '''Het is tijd, \nde hoogste tijd,
        u wordt bedankt voor weer \n'n avond gezelligheid,
        dag mevrouw en dag meneer,
        u komt hier toch weer.
        '''
        println(s)
        // ------------ STOP EDITING HERE  ----------------------
        assert s.count('\n') == 6, 'Add some new lines to the song.'

    }
}