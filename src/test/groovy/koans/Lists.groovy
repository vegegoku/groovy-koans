package koans

import org.junit.Test

class Lists {

    @Test
    public void "Defining lists"() {

        def empty = []
        List<String> singers = ['Frans Bauer', 'Zanger Rinus']

        // ------------ START EDITING HERE ----------------------
        List numbers
        // ------------ STOP EDITING HERE  ----------------------
        assert numbers.size() == 3, 'Define a list with three numbers'

    }

    @Test
    public void "Adding items"() {

        def singers = ['Frans Bauer', 'Zanger Rinus']

        singers << 'Jantje Smit'
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------
        assert singers.size() == 5, 'Add two more great singers'

    }

    @Test
    public void "accessing list items by index"() {

        // ------------ START EDITING HERE ----------------------
        def numbers
        // ------------ STOP EDITING HERE  ----------------------
        assert numbers[1] == 3
        assert numbers[4] == 9
        assert numbers[-2] == 7

    }

    @Test
    public void "Adding lists"() {

        // ------------ START EDITING HERE ----------------------
        def list1 = []
        def list2 = []
        // ------------ STOP EDITING HERE  ----------------------
        assert list1 - list2 == [1, 2]
        assert list1 + list2 == [1, 2, 3, 4]

    }

}
