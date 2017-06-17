package koans

import org.junit.Test

class Booleans {
    @Test
    public void "Comparing booleans"() {
        boolean predicate = true
        // ------------ START EDITING HERE ----------------------
        boolean left = true
        boolean right = false
        predicate = left == right
        // ------------ STOP EDITING HERE  ----------------------
        assert predicate == false
    }

    @Test
    public void "Collections as booleans"() {

        List list = []
        // ------------ START EDITING HERE ----------------------
        list.add(true);
        list.add(false);
        // ------------ STOP EDITING HERE  ----------------------
        assert list, "The list needs to be filled"

    }

    @Test
    public void "String truth"() {

        String s1
        String s2 = ''
        // ------------ START EDITING HERE ----------------------
        s1='true'
        s2='false'
        // ------------ STOP EDITING HERE  ----------------------
        assert s1, "Null is not truthy"
        assert s2, "An empty string is not truthy"

    }

    @Test
    public void "Numerical truth"() {

        int one = 1
        int negative = -1
        int zero = 0
        // ------------ START EDITING HERE ----------------------
        zero=zero+1
        // ------------ STOP EDITING HERE  ----------------------
        assert one, "positive integers are truthy"
        assert negative, "negative integers are truthy"
        assert zero, "0 Is not truthy"

    }

    @Test
    public void "truth"() {
        List truthy
        List falsy
        // ------------ START EDITING HERE ----------------------
        truthy=[1, -1, 2]
        falsy=[null,0,false]
        // ------------ STOP EDITING HERE  ----------------------
        //Don't worry. We'll explain how the code beneath works later.
        assert truthy.toSet().size() > 2, "Assign 3 different truthy values"
        truthy.each {
            assert it, "$it is not truthy"
        }
        assert falsy.toSet().size() > 2, "Assign 3 different falsy values"
        falsy.each {
            assert !it, "$it is not falsy"
        }
    }
}