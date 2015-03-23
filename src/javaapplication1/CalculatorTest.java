package javaapplication1;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    @DataProvider(name = "test1")
    public Object[][] data()
    {
        return new Object[][]
        {new Object[]{new Integer(5),new Integer(2)}};
    }

    @BeforeMethod
    public void BeforeTest1Division()
    {
        System.out.println("BeforeTest");
    }
    @Test(enabled = true, testName = "testDivision")
    public void testDivison() throws Exception {
        Calculator calc = new Calculator();
        calc.set_a(10);
        calc.set_b(5);
        Assert.assertEquals(2.0,calc.divison());
        System.out.println("Test1");
    }
    @AfterMethod
    public void AfterTestDivision()
    {
        System.out.println("AfterTest");
    }

    @Test(enabled = true, testName = "testDivision", dataProvider = "test1")
    public void testDivison1(Integer a, Integer b) throws Exception {
        Calculator calc = new Calculator();
        calc.set_a(a);
        calc.set_b(b);
        Assert.assertEquals(2.5,calc.divison());
        System.out.println("Test2");
    }

    @Test(enabled = false,testName = "testDivisionByZero")
    public void testDivisonByZero() throws Exception {
        Calculator calc = new Calculator();
        calc.set_a(10);
        calc.set_b(0);
        Assert.assertEquals(2.0,calc.divison());
        System.out.println("Test");
    }

    @Test(enabled = false,testName = "testDivisionEmpty")
    public void testDivisonEmpty() throws Exception {
        Calculator calc = new Calculator();
        calc.set_a(10);
       // calc.set_b();
        Assert.assertEquals(3.0,calc.divison());
        System.out.println("Test");
    }
}