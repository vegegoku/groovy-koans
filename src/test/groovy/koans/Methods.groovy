package koans

import org.junit.Test

class Methods {

    int plus(int i1, int i2) {
        // ------------ START EDITING HERE ----------------------
        i1 - i2
        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "No return"() {

        assert plus(1, 2) == 3, 'Improve the plus method'

    }

    def fuzzyPlus(int i1, int i2) {
        // ------------ START EDITING HERE ----------------------
        i1 + i2
        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "Dynamic return type"() {
        assert fuzzyPlus(1, 2) == 3, "Don't break this"
        assert fuzzyPlus(100, 1) == 'too much', "Improve the fuzzyPlus method by using an if/else statement"
    }

    // ------------ START EDITING HERE ----------------------
    //add the timesTwo method here
    // ------------ STOP EDITING HERE  ----------------------

    @Test
    public void "timesTwo"() {

        assert timesTwo(2) == 4
        assert timesTwo('leerdammerkaas') == 'leerdammerkaasleerdammerkaas'

    }

    @Test
    public void "methods without braces"() {
        println("Deze brief bind ik vast aan m'n vlieger")
        println "Tot zij hem ontvangt, zij die ik mis"
    }

    def add(value, toAdd = 1) {
        value + toAdd
    }

    // ------------ START EDITING HERE ----------------------
    //add the greet method here
    // ------------ STOP EDITING HERE  ----------------------

    @Test
    public void "method parameters with default values"() {
        assert add(3) == 4

        assert greet('Zangeres zonder naam') == 'hello Zangeres zonder naam', "Define the greet method"
        assert greet() == 'hello stranger', 'Let the greet method have a default parameter.'

    }


    def add(int ... values) {
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "methods with a variable parameter length"() {
        assert add(1, 2, 3) == 6, "add works with 3 parameters"
        assert add(1, 2, 3, 4) == 10, 'add also works with 4 parameters'
    }
}
