package koans

import org.junit.Test

class CollectionMethods {

    @Test
    public void "Each"() {
        def list = [1, 2, 3]

        list.each {
            println it
        }
    }

    @Test
    public void "collect"() {

        List singers = ['Frans', 'Andre', 'De Havenzangers']

        // ------------ START EDITING HERE ----------------------
        List stringLengths
        // ------------ STOP EDITING HERE  ----------------------

        assert stringLengths == [5, 5, 15]

    }

    @Test
    public void "shorter collect notation"() {
        List singers = ['Frans', 'Andre', 'De Havenzangers']
        List stringLengths = singers*.length()

        assert stringLengths == 'What is this?'
        // ------------ START EDITING HERE ----------------------
        def lowercase
        // ------------ STOP EDITING HERE  ----------------------
        assert lowercase == ['frans', 'andre', 'de havenzangers'], 'Use the * notation to transform the list to lowercase'

    }

    @Test
    public void "findAll"() {
        List singers = ['Frans', 'Andre', 'De Havenzangers', 'Rex Gildo', 'Zanger Rinus']

        // ------------ START EDITING HERE ----------------------
        def singersWithAFiveLetterName
        // ------------ STOP EDITING HERE  ----------------------

        assert singersWithAFiveLetterName.size() == 2

    }

    @Test
    public void "find"() {
        List singers = ['Rex Gildo', 'Frans', 'Andre', 'De Havenzangers']

        // ------------ START EDITING HERE ----------------------
        def firstSingerWithAFiveLetterName = singers.find { false }
        // ------------ STOP EDITING HERE  ----------------------
        assert firstSingerWithAFiveLetterName == 'Frans'

    }

    @Test
    public void "groupBy"() {
        List singers = [
                new Singer(name: 'Roy Donders', country: 'BE'),
                new Singer(name: 'Andre Hazes', country: 'NL'),
                new Singer(name: 'Eddy Wally', country: 'BE'),
                new Singer(name: 'Frans Bauer', country: 'NL'),
                new Singer(name: 'Rex Gildo', country: 'DE'),
        ]
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert singersByCountry['BE'].size() == 2

    }


}

class Singer {
    String name
    String country
}
