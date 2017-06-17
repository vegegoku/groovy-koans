package koans

import org.junit.Test

class Lists {

    @Test
    public void "Defining lists"() {

        def empty = []
        List<String> singers = ['Frans Bauer', 'Zanger Rinus']

        // ------------ START EDITING HERE ----------------------
        List numbers=[1,2,3]
        // ------------ STOP EDITING HERE  ----------------------
        assert numbers.size() == 3, 'Define a list with three numbers'

    }

    @Test
    public void "Adding items"() {

        def singers = ['Frans Bauer', 'Zanger Rinus']

        singers << 'Jantje Smit'
        // ------------ START EDITING HERE ----------------------
        singers << 'Bo3'
        singers << 'akab'
        // ------------ STOP EDITING HERE  ----------------------
        assert singers.size() == 5, 'Add two more great singers'

    }

    @Test
    public void "accessing list items by index"() {

        // ------------ START EDITING HERE ----------------------
        def numbers=[0,3,2,7,9]
        // ------------ STOP EDITING HERE  ----------------------
        assert numbers[1] == 3
        assert numbers[4] == 9
        assert numbers[-2] == 7

    }

    @Test
    public void "Adding lists"() {

        // ------------ START EDITING HERE ----------------------
        def list1 = [1,2]
        def list2 = [3,4]
        // ------------ STOP EDITING HERE  ----------------------
        assert list1 - list2 == [1, 2]
        assert list1 + list2 == [1, 2, 3, 4]

    }

    @Test
    void "multiply operator with lists"() {
        assert [1] * 3 == [1, 1, 1]
        def list = [1, 2]
        // ------------ START EDITING HERE ----------------------
        list*=2
        // ------------ STOP EDITING HERE  ----------------------
        assert list == [1, 2, 1, 2]

    }

    @Test
    void "plus operator with lists"() {

        assert [1, 2] + 5 == [1, 2, 5]

        def x = [5, 4]
        // ------------ START EDITING HERE ----------------------
        x+=[3]
        // ------------ STOP EDITING HERE  ----------------------
        assert x == [5, 4, 3]

    }

    @Test
    void "minus operator with lists"() {

        def y = [1, 1, 1, 1, 1, 1, 2]
        // ------------ START EDITING HERE ----------------------
        y-=[1,1,1,1,1,1]
        // ------------ STOP EDITING HERE  ----------------------
        assert y == [2]

    }

    @Test
    void "sublist with ranges"() {

        def myList = ['a', 'b', 'c', 'd', 'e', 'f']
        assert myList[0..2] == ['a', 'b', 'c']

        // ------------ START EDITING HERE ----------------------
        def fromDtoF=myList[3..5]
        // ------------ STOP EDITING HERE  ----------------------
        assert fromDtoF == ['d', 'e', 'f']

    }

    @Test
    void "specific indices"() {
        def myList = ['a', 'b', 'c', 'd', 'e', 'f']
        assert myList[0, 2, 4] == ['a', 'c', 'e']
        // ------------ START EDITING HERE ----------------------
        def aAndf=myList[0,5]
        // ------------ STOP EDITING HERE  ----------------------
        assert aAndf == ['a', 'f']
    }

    @Test
    void "altering using ranges"() {
        def myList = ['a', 'b', 'c', 'd', 'e', 'f']

        myList[0..2] = ['x', 'y', 'z']
        assert myList == ['x', 'y', 'z', 'd', 'e', 'f']
        // ------------ START EDITING HERE ----------------------
        myList[4..5]=['r','s']
        // ------------ STOP EDITING HERE  ----------------------
        assert myList == ['x', 'y', 'z', 'd', 'r', 's']

    }

    @Test
    void "removing items in range"() {

        def myList = ['a', 'b', 'c', 'd', 'e', 'f']

        myList[3..5] = []
        assert myList == ['a', 'b', 'c']

        def oneInBinaries = [0, 0, 0, 1]
        // ------------ START EDITING HERE ----------------------
        oneInBinaries[0..1]=[]
        // ------------ STOP EDITING HERE  ----------------------
        assert oneInBinaries == [0, 1]
    }

    @Test
    void "adding items in range"() {
        def myList = ['x', 'y', 'z']
        myList[1..1] = [0, 1, 2]
        assert myList == ['x', 0, 1, 2, 'z']
        def oneInBinaries = [0, 1]
        // ------------ START EDITING HERE ----------------------
        oneInBinaries[0..0]=[0,0,0]
        // ------------ STOP EDITING HERE  ----------------------
        assert oneInBinaries == [0, 0, 0, 1]
    }

    @Test
    void "accessing items from the last"() {
        def list = [1, 2, 3, 4]
        assert list[-1] == 4

        // ------------ START EDITING HERE ----------------------
        def sub =[list[-3], list[-4], list[-1]]
        // ------------ STOP EDITING HERE  ----------------------
        assert sub == [2, 1, 4]
    }

    @Test
    void "adding items using lefshift operator"() {
        def myList = []
        myList << 'a'
        assert myList == ['a']

        // ------------ START EDITING HERE ----------------------
        myList << 'c'
        myList << 's'
        // ------------ STOP EDITING HERE  ----------------------
        assert myList == ['a', 'c', 's']
    }

    @Test
    void "in operator with lists for classification"() {
        def myList = ['a', 'b', 'c']
        assert myList.isCase('a')
        assert 'b' in myList

        // ------------ START EDITING HERE ----------------------
        def falseStatementUsingInWithList= 'x' in myList
        // ------------ STOP EDITING HERE  ----------------------
        assert falseStatementUsingInWithList == false
    }

    @Test
    void "lists as a case in switch statements"() {
        def myList = ['a', 'b', 'c']
        def candidate = 'c'
        switch (candidate) {
            case myList: assert true; break
            default: assert false
        }

        def result

        switch (candidate) {
        // ------------ START EDITING HERE ----------------------
            case myList: result='Whoop'

        // ------------ STOP EDITING HERE  ----------------------
            default: break
        }

        assert result == "Whoop"
    }

    @Test
    void "truthness of lists"() {
        def empty = []
        if (empty) assert false
    }

    @Test
    void "iterate over a list"() {
        def expr = ''

        // ------------ START EDITING HERE ----------------------
        def list=[1,'*',5,'*',2]
        // ------------ STOP EDITING HERE  ----------------------

        for (i in list) {
            expr += i
        }
        assert expr == '1*5*2'
    }


}
