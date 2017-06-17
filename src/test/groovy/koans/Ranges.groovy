package koans

import org.junit.Test

class Ranges {

    @Test
    public void "syntax of range"() {
        def from1to100 = 1..100
        assert from1to100.from == 1
        assert from1to100.to == 100
        assert from1to100.size() == 100

    }
}
