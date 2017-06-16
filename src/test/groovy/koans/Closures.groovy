package koans

import org.junit.Test

class Closures {

    @Test
    public void "Closures "() {

        Closure hello = { String name -> println "Hello $name" }
        hello('Frans')
        Closure times = { i1, i2 -> i1 * i2 }
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert plusOne(1) == 2
        assert plus(1, 2) == 3

    }

    @Test
    public void "Closures.call()"() {

        // ------------ START EDITING HERE ----------------------
        def plusOne
        // ------------ STOP EDITING HERE  ----------------------
        assert plusOne(1) == 2
        assert plusOne.call(5) == 6

    }

    @Test
    public void "Closure without arguments"() {

        // ------------ START EDITING HERE ----------------------
        def noArg = { 'Closure without arguments.' }
        // ------------ STOP EDITING HERE  ----------------------
        assert noArg() == 'Sieneke'

    }

    @Test
    public void "it parameter in closures"() {
        Closure hello = { println "Hello $it" }
        hello('Dries')
        // ------------ START EDITING HERE ----------------------
        Closure plusOne = { 5 }
        // ------------ STOP EDITING HERE  ----------------------
        assert plusOne(1) == 2
        assert plusOne('Marco') == 'Marco1'

    }

    def runThreeTimes(Closure closure) {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "Closure as method parameter"() {
        runThreeTimes { println 'shalalalie' }
    }


    def times(int amount, Closure closure) {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "Closure as last method parameter"() {
        times(2) { println 'shalalala' }
        times 2, { println 'shalalalie' }
        times(1, { println 'shalalalie' })
    }

    @Test
    public void "Bound parameters"() {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        int runAmount = 0
        Closure run = { runAmount++ }
        threeTimes(run)
        assert runAmount == 3

    }

    @Test
    public void "Default parameters"() {

        def greet = { greeting, name -> "${greeting} ${name}" }
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert greet('Roy') == 'hello Roy'

    }

}
