package koans

import org.junit.Test

class Maps {

    @Test
    public void "Defining maps"() {

        def emptyMap = [:]
        def three = 3
        Map numbers = [one: 1, 'two': 2, (three): 3]
        // ------------ START EDITING HERE ----------------------
        def rhymeWords=[empty:'spaghetti', silly:'billy', nice:'ice' ]
        // ------------ STOP EDITING HERE  ----------------------
        assert rhymeWords.size() == 3, 'Define a map with three rhymeWords'
        assert rhymeWords['empty'] == 'spaghetti'

    }

    @Test
    public void "Getting/setting map values with get/put"() {

        Map numbers = [1: 'one']
        numbers.put(2, 'two')
        // ------------ START EDITING HERE ----------------------
        numbers.put(3, 'three')
        // ------------ STOP EDITING HERE  ----------------------
        assert numbers.get(3) == 'three'

    }

    @Test
    public void "Getting/setting map values with bracket or dot notation"() {
        Map numbers = [one: 1]

        numbers['two'] = 2
        numbers.three = 3
        // ------------ START EDITING HERE ----------------------
        numbers.four=4
        numbers.five=5
        // ------------ STOP EDITING HERE  ----------------------
        assert numbers['four'] == 4
        assert numbers.five == 5

    }


}