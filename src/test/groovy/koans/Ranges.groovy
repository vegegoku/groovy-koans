package koans

import org.junit.Test

class Ranges {

    @Test
    public void "syntax of range"() {
        def from1to100 = 1..100
        assert from1to100.from == 1
        assert from1to100.to == 100
        assert from1to100.size() == 100

        def sumOfNumbersFrom0To100 = 0
        // ------------ START EDITING HERE ----------------------
        sumOfNumbersFrom0To100 = from1to100.sum()
        // ------------ STOP EDITING HERE  ----------------------
        assert sumOfNumbersFrom0To100 == 5050
    }


    String returnHelloIfInRange(int x) {
        // ------------ START EDITING HERE ----------------------
        int upperBound = 20
        if (x >= 0 && x <= upperBound) {
            return "Hello"
        }
        // ------------ STOP EDITING HERE  ----------------------
        return "Oops! not in range"
    }

    @Test
    public void "replace conditions with ranges"() {

        assert returnHelloIfInRange(10) == 'Hello'

    }

    @Test
    void "Specifying ranges"() {

        assert (0..10).contains(0)

        assert (0..10).contains(5)
        // ------------ START EDITING HERE ----------------------
        def x = 0..10
        // ------------ STOP EDITING HERE  ----------------------
        assert x.contains(10)

        //Half-exclusive ranges
        assert (0..<10).contains(9)

        // ------------ START EDITING HERE ----------------------
        def y = 0..10
        // ------------ STOP EDITING HERE  ----------------------
        assert y.contains(10)

        // explicit constructor
        def z = new IntRange(0, 10)
        assert z.contains(5)
        // ------------ START EDITING HERE ----------------------
        def a = 10..0
        // ------------ STOP EDITING HERE  ----------------------
        assert a == (10..0)

        //Bounds checking
        assert (0.0..1.0).contains(1.0)
        assert (0.0..1.0).containsWithinBounds(0.5)

        // ------------ START EDITING HERE ----------------------
        def fractionsFrom0to10 = (0.0..10.0)
        // ------------ STOP EDITING HERE  ----------------------
        assert fractionsFrom0to10.containsWithinBounds(3.3)

        //String ranges
        assert ('a'..'c').contains('b')

        // ------------ START EDITING HERE ----------------------
        def languageOfthreeLetters = 'x'..'xxx'
        // ------------ STOP EDITING HERE  ----------------------
        languageOfthreeLetters.contains('xxx')

        // date ranges
        def today = new Date()
        def yesterday = today - 1 // the date minus one day
        assert (today..yesterday).size() == 2

        // ------------ START EDITING HERE ----------------------
        def later30days = today + 3
        def next30days = today..later30days
        // ------------ STOP EDITING HERE  ----------------------
        assert next30days.contains(today)

    }

    @Test
    void "Ranges are objects"() {
        def result = ''
        (5..9).each { element ->
            result += element
        }
        assert result == '56789'

        def lettersFromMtoZ
        // ------------ START EDITING HERE ----------------------
        lettersFromMtoZ = ''
        ('m'..'z').each { element ->
            lettersFromMtoZ += element
        }
        // ------------ STOP EDITING HERE  ----------------------
        assert lettersFromMtoZ == 'mnopqrstuvwxyz'

        // Ranges for classification

        // ------------ START EDITING HERE ----------------------
        def b = 1..5
        // ------------ STOP EDITING HERE  ----------------------
        assert 5 in b, "specify a range that contain 5"
        assert b.isCase(5)


        BigDecimal insuranceRate
        def age = 36
        switch (age) {
            case 16..20: insuranceRate = 0.05; break
        // ------------ START EDITING HERE ----------------------
            case 21..50: insuranceRate = 0.06; break
        // ------------ STOP EDITING HERE  ----------------------
            case 51..65: insuranceRate = 0.07; break
            default: throw new IllegalArgumentException()
        }
        assert insuranceRate == 0.06, "add the missing switch case to make it pass"

    }

    @Test
    void "Custom ranges: weekdays"() {
        def mon = new Weekday('Mon')
        def fri = new Weekday('Fri')
        def worklog = ''
        for (day in mon..fri) {
            // ------------ START EDITING HERE ----------------------
            worklog=worklog+day+' '
            // ------------ STOP EDITING HERE  ----------------------
        }
        assert worklog == 'Mon Tue Wed Thu Fri '
    }

}

class Weekday implements Comparable {
    static final DAYS = [
            'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'
    ]
    private int index = 0

    Weekday(String day) {
        index = DAYS.indexOf(day)
    }

    Weekday next() {
        return new Weekday(DAYS[(index + 1) % DAYS.size()])
    }

    Weekday previous() {
        return new Weekday(DAYS[index - 1])
    }

    int compareTo(Object other) {
        return this.index <=> other.index
    }

    String toString() {
        return DAYS[index]
    }
}
