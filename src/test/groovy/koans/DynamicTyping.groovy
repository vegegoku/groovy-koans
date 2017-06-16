package koans

import org.junit.Test

class DynamicTyping {

    @Test
    public void "def"() {
        def variable1 = true
        variable1 = 'The answer to everything'
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert variable1 == 42, 'variable1 has no type, so it may be anything'
        assert variable2 == 'enlightenment', 'Define a new variable'
    }

    @Test
    public void "Runtime typing"() {
        def variable1 = true
        println variable1.class.name
        def variable2
        variable1 = 'The answer to everything'
        println variable1.class.name
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert variable1.class.name == 'java.lang.Integer', 'Give variable1 the correct type'
        assert variable2 instanceof String, 'Give variable2 the correct type'

    }

    @Test
    public void "Calling a method on a dynamic variable"() {
        def variable = 'fortytwo'

        try {
            // ------------ START EDITING HERE ----------------------
            variable.length()  // Invalid method for Boolean type.
            // ------------ STOP EDITING HERE  ----------------------
            assert false, 'Change the type of the variable, so the previous statement will throw an exception'
        } catch (RuntimeException e) {
            assert true, "We want to throw this exception"
        }
    }


}