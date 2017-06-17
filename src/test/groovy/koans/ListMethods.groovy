package koans

import groovy.transform.Canonical
import org.junit.Test

class ListMethods {
    @Test
    void "flatten"() {
        def list = [1, 2, [2, 3]]
        // ------------ START EDITING HERE ----------------------
        def result = [1, 2, 2, 3]
        // ------------ STOP EDITING HERE  ----------------------
        assert list.flatten() == result
    }

    @Test
    void "intersect"() {
        def integers = [1, 2, 3]
        // ------------ START EDITING HERE ----------------------
        def result = [3, 1]
        // ------------ STOP EDITING HERE  ----------------------
        assert integers.intersect([4, 3, 1]) == result
    }

    @Test
    void "disjoint"() {
        assert [1, 2, 3].disjoint([4, 5, 6])

        // ------------ START EDITING HERE ----------------------
        def list = [5, 6, 7]
        // ------------ STOP EDITING HERE  ----------------------
        assert list.disjoint([2, 3, 4])
    }

    @Test
    void "Treating a list like a stack"() {
        def list = [1, 2, 3]
        def popped = list.pop()
        assert popped == 3
        assert list == [1, 2]

        // ------------ START EDITING HERE ----------------------
        popped = list.pop()
        // ------------ STOP EDITING HERE  ----------------------
        assert popped == 2
        assert list == [1]
    }

    @Test
    void "reverse"() {
        assert [1, 2].reverse() == [2, 1]


        def original = (0..100).toList()
        // ------------ START EDITING HERE ----------------------
        def reversed = original.reverse()
        // ------------ STOP EDITING HERE  ----------------------
        assert reversed == original[-1..0]
    }

    @Test
    void "sort"() {
        assert [3, 1, 2].sort() == [1, 2, 3]

        def letters = ['x', 'b', 'm', 'w']
        // ------------ START EDITING HERE ----------------------
        def sortedLetters = letters.sort()
        // ------------ STOP EDITING HERE  ----------------------
        assert sortedLetters[-1] == 'x'
    }

    @Test
    void "sort using custom comparators"() {
        def list = [[1, 0], [0, 1, 2]]
        list = list.sort { a, b -> a[0] <=> b[0] }
        assert list == [[0, 1, 2], [1, 0]]

        def employees = [
                new Employee(age: 24, name: 'James'),
                new Employee(age: 35, name: 'Icard'),
                new Employee(age: 33, name: 'Ana'),
                new Employee(age: 28, name: 'Ada'),
                new Employee(age: 26, name: 'James'),
                new Employee(age: 51, name: 'Noah'),
                new Employee(age: 78, name: 'Gary')
        ]

        // ------------ START EDITING HERE ----------------------
        def sortedByAge = employees.sort({ e1, e2 -> e1.age <=> e2.age })
        // ------------ STOP EDITING HERE  ----------------------
        assert sortedByAge[-1].name == 'Gary'
    }

    @Test
    void "remove by index/value"() {
        def list = ['a', 'b', 'c']
        list.remove(2)
        assert list == ['a', 'b']
        list.remove('b')
        assert list == ['a']

        def xlist = ['if', 'you', 'never', 'try', 'you', 'will', 'never', 'know']
        // ------------ START EDITING HERE ----------------------
        xlist.remove(0)
        xlist.remove(0)
        xlist.remove(0)
        xlist.remove(0)
        xlist.remove(0)
        // ------------ STOP EDITING HERE  ----------------------
        assert xlist.size() == 3
        assert xlist.contains('know')

        // ------------ START EDITING HERE ----------------------
        xlist.remove('know')
        // ------------ STOP EDITING HERE  ----------------------
        assert !xlist.contains('know')
        assert xlist.size() == 2
    }

    @Test
    void "removeAll"() {
        def list = ['a', 'b', 'b', 'c']
        list.removeAll(['b', 'c'])
        assert list == ['a']

        def integers = [1, 2, 3]
        // ------------ START EDITING HERE ----------------------
        integers.removeAll([1, 3])
        // ------------ STOP EDITING HERE  ----------------------
        assert integers == [2]
    }

    @Test
    void "collect"() {
        def integers = [1, 2, 3]
        integers.collect { println "it = $it" }

        // ------------ START EDITING HERE ----------------------
        def doubled = integers.collect({ it * 2 })
        // ------------ STOP EDITING HERE  ----------------------
        assert doubled == [2, 4, 6]
    }

    @Test
    void "findAll"() {
        def odd = [1, 2, 3].findAll { item ->
            item % 2 == 1
        }
        assert odd == [1, 3]

        def from0To10 = (0..10).toList()
        // ------------ START EDITING HERE ----------------------
        def result = from0To10.findAll({ item ->
            item in [1, 2, 4, 8]
        })
        // ------------ STOP EDITING HERE  ----------------------
        assert result == [1, 2, 4, 8]
    }

    @Test
    void "unique"() {
        def x = [1, 1, 1]
        assert [1] == new HashSet(x).toList()
        assert [1] == x.unique()

        def binaries = [0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0
                        , 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1]
        // ------------ START EDITING HERE ----------------------
        def result = binaries.toSet().toList()
        // ------------ STOP EDITING HERE  ----------------------
        assert result == [0, 1]

    }

    @Test
    void "grep"() {
        def x = [1, null, 1]
        assert [1, 1] == x.findAll { it != null }
        assert [1, 1] == x.grep { it }

        def shootingStar = ['Its late and Im awake, staring at the wall',
                            'Open up my window, head floats out the door',
                            'No one else around, the shimmer takes my eye',
                            'I lift my head, blinded by the sky']

        // ------------ START EDITING HERE ----------------------
        def linesThatContainsMy = shootingStar.find { "$it".contains('my') }
        // ------------ STOP EDITING HERE  ----------------------
        assert !linesThatContainsMy.contains('Its late and Im awake, staring at the wall')
    }

    @Test
    void 'first'() {
        def list = [1, 2, 3]
        assert list.first() == 1

        // ------------ START EDITING HERE ----------------------
        list.remove(0)
        // ------------ STOP EDITING HERE  ----------------------
        assert list.first() == 2
    }

    @Test
    void 'head'() {
        def list = [1, 2, 3]
        assert list.head() == 1

        // ------------ START EDITING HERE ----------------------
        list.remove(0)
        // ------------ STOP EDITING HERE  ----------------------
        assert list.head() == 2
    }

    @Test
    void 'tail'() {
        def list = [1, 2, 3]
        assert list.tail() == [2, 3]
        // ------------ START EDITING HERE ----------------------
        def result = list.tail().tail()
        // ------------ STOP EDITING HERE  ----------------------
        assert list == [1, 2, 3]
        assert result == [3]
    }

    @Test
    void 'last'() {
        def list = [1, 2, 3]
        assert list.last() == 3

        // ------------ START EDITING HERE ----------------------
        list << 9
        // ------------ STOP EDITING HERE  ----------------------
        assert list.last() == 9
    }

    @Test
    void 'count'() {
        def list = [1, 2, 3]
        assert list.count(2) == 1
        // ------------ START EDITING HERE ----------------------
        def result = list.count(4)
        // ------------ STOP EDITING HERE  ----------------------
        assert !result
    }

    @Test
    void 'max/min'() {
        def list = [1, 2, 3]
        assert list.max() == 3
        assert list.min() == 1

        def letters = ['a', 'v', 'm', 'w']
        // ------------ START EDITING HERE ----------------------
        def max = letters.max()
        def min = letters.min()
        // ------------ STOP EDITING HERE  ----------------------
        assert max == 'w'
        assert min == 'a'
    }

    @Test
    void 'find'() {
        def list = [1, 2, 3]
        def even = list.find { item ->
            item % 2 == 0
        }
        assert even == 2

        // ------------ START EDITING HERE ----------------------
        def odd = list.findAll({ item ->
            item % 2 == 1
        })
        // ------------ STOP EDITING HERE  ----------------------
        assert odd == [1, 3]

    }

    @Test
    void 'every'() {
        def list = [1, 2, 3]

        assert list.every { item -> item < 5 }

        // ------------ START EDITING HERE ----------------------
        def result = list.every { i -> i > 5 }
        // ------------ STOP EDITING HERE  ----------------------
        assert result == false
    }

    @Test
    void 'any'() {
        def list = [1, 2, 3]

        assert list.any { item -> item < 2 }

        // ------------ START EDITING HERE ----------------------
        def result = list.any { i -> i > 3 }
        // ------------ STOP EDITING HERE  ----------------------
        assert result == false
    }

    @Test
    void 'each'() {
        def list = [1, 2, 3]
        def store = ''
        list.each { item ->
            // ------------ START EDITING HERE ----------------------
            store+=item
            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == '123'

    }

    @Test
    void 'reveseEach'() {
        def list = [1, 2, 3]
        def store = ''
        list.reverseEach { item ->
            // ------------ START EDITING HERE ----------------------
            store+=item;
            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == '321'
    }

    @Test
    void 'eachWithIndex'() {
        def list = [1, 2, 3]
        def store = ''
        list.eachWithIndex { item, index ->
            // ------------ START EDITING HERE ----------------------
            store+=index+':'+item+' '
            // ------------ STOP EDITING HERE  ----------------------
        }
        assert store == '0:1 1:2 2:3 '
    }

    @Test
    void 'join'() {
        def list = [1, 2, 3]
        assert list.join('-') == '1-2-3'
        // ------------ START EDITING HERE ----------------------
        def csv=list.join(',')
        // ------------ STOP EDITING HERE  ----------------------
        assert csv == '1,2,3'
    }

    @Test
    void 'inject'() {
        def list = [1, 2, 3]
        def result = list.inject(0) { clinks, guests ->
            clinks + guests
        }
        assert result == 0 + 1 + 2 + 3

        // ------------ START EDITING HERE ----------------------
        result=list.inject(1) { clinks, guests ->
            clinks * guests
        }
        println(result)

        // ------------ STOP EDITING HERE  ----------------------
        assert result == 1 * 1 * 2 * 3
    }

    def quickSort(list) {
        if (list.size() < 2) return list
        def pivot = list[list.size().intdiv(2)]
        def left = list.findAll { item -> item < pivot }
        def middle = list.findAll { item -> item == pivot }
        // ------------ START EDITING HERE ----------------------
        def right= list.findAll { item -> item > pivot }
        // ------------ STOP EDITING HERE  ----------------------
        return quickSort(left) + middle + quickSort(right)
    }

    @Test
    void 'list example'() {
        def list = [7, 1, 2, 3, 8, 6]
        assert quickSort(list)[-1] == 8
        assert quickSort([]) == []
        assert quickSort([1]) == [1]
        assert quickSort([1, 2]) == [1, 2]
        assert quickSort([2, 1]) == [1, 2]
        assert quickSort([3, 1, 2]) == [1, 2, 3]
        assert quickSort([3, 1, 2, 2]) == [1, 2, 2, 3]
        assert quickSort([1.0f, 'a', 10, null]) == [null, 1.0f, 10, 'a']
        assert quickSort('bca') == 'abc'.toList()
    }
}

@Canonical
class Employee {
    Integer age
    String name
}