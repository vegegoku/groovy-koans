package i_introduction

import org.junit.Test

import static org.junit.Assert.assertEquals

class SimplePropertyAccessTest {
    @Test
    void "should return the name of the place the emplyees lives in"() {
        def employees = [new Employee("Jamal", new Place("Amman"))
                         , new Employee("Ahmad", new Place("Zarqa"))]
        def company = new Company(employees)
        def propertyAccess = new SimplePropertyAccess(company)
        assertEquals(propertyAccess.getWhereEmplyeesLivesInPlaceName(),["Amman","Zarqa"])
    }
}