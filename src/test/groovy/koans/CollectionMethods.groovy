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
        List stringLengths=singers.collect {"$it".length()}
        // ------------ STOP EDITING HERE  ----------------------

        assert stringLengths == [5, 5, 15]

    }

    @Test
    public void "shorter collect notation"() {
        List singers = ['Frans', 'Andre', 'De Havenzangers']
        List stringLengths = singers*.length()

        assert stringLengths == [5, 5, 15]
        // ------------ START EDITING HERE ----------------------
        def lowercase= singers*.toLowerCase()
        // ------------ STOP EDITING HERE  ----------------------
        assert lowercase == ['frans', 'andre', 'de havenzangers'], 'Use the * notation to transform the list to lowercase'

    }

    @Test
    public void "findAll"() {
        List singers = ['Frans', 'Andre', 'De Havenzangers', 'Rex Gildo', 'Zanger Rinus']

        // ------------ START EDITING HERE ----------------------
        def singersWithAFiveLetterName=singers.findAll {"$it".length()==5}
        // ------------ STOP EDITING HERE  ----------------------

        assert singersWithAFiveLetterName.size() == 2

    }

    @Test
    public void "find"() {
        List singers = ['Rex Gildo', 'Frans', 'Andre', 'De Havenzangers']

        // ------------ START EDITING HERE ----------------------
        def firstSingerWithAFiveLetterName = singers.find { "$it".length()==5 }
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
        def singersByCountry=singers.groupBy {it.country}
        // ------------ STOP EDITING HERE  ----------------------
        assert singersByCountry['BE'].size() == 2

    }


}

class Singer {
    String name
    String country
}