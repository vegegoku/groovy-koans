package koans

import org.junit.Test

class QuestionMark {

    // ------------ START EDITING HERE ----------------------
    def numberAppraiser(int n) {
        n < 10 ? 'low' : 'high'
    }
    // ------------ STOP EDITING HERE  ----------------------

    @Test
    public void "? operator"() {
        assert (true ? 1 : 2) == 1
        assert (false ? 1 : 2) == 2

        // ------------ START EDITING HERE ----------------------
        def isGerman = true
        // ------------ STOP EDITING HERE  ----------------------
        assert (isGerman ? 'Rex Gildo' : 'Andre Hazes') == 'Rex Gildo', "We prefer a German singer for this test"
        assert numberAppraiser(3) == 'low', "Make a function that returns 'low' for numbers under 10 and 'high' for higher numbers."
        assert numberAppraiser(46) == 'high'

    }

    def greatSinger(String suggestion = null) {
        // ------------ START EDITING HERE ----------------------
        suggestion?:'Zanger Rinus'
        // ------------ STOP EDITING HERE  ----------------------
    }

    @Test
    public void "Elvis operator"() {
        assert 1 ?: 2 == 1
        assert 0 ?: 2 == 2

        def name='Rex Gildo'

        assert name ?: 'Frans Bauer' == 'Rex Gildo'
        assert greatSinger('Andre Hazes') == 'Andre Hazes', "Complete the greatSinger method, so it returns the suggestion, or defaults to 'Zanger Rinus'"
        assert greatSinger() == 'Zanger Rinus'
    }

    // ------------ START EDITING HERE ----------------------
    def lower(String s){
        s?.toLowerCase()
    }
    // ------------ STOP EDITING HERE  ----------------------
    @Test
    public void "nullsafe ? operator"() {

        def a
        assert a?.toString() == null

        assert lower('HEB JE EVEN VOOR MIJ') == 'heb je even voor mij', "define the lower method, so it lowers the incoming string and doesn't crash on null."
        assert lower(null) == null

    }

}