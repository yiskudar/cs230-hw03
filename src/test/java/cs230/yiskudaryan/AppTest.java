package cs230.yiskudaryan;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_c1()
    {
        assertEquals(-8, App.method01(-8,0));
    }

    @Test
    public void test_c2()
    {
        assertEquals(777, App.method01(0,777));
    }
    @Test
    public void test_c3()
    {
        assertEquals(55, App.method01(10,45));
    }
    @Test
    public void test_c4()
    {
        assertEquals(24, App.method01(-4,20));
    }

    @Test
    public void test_c5()
    {
        assertEquals("Young Adolescent", App.method02(8));
    }

    @Test
    public void test_c6()
    {
        assertEquals("Working Age", App.method02(37));
    }

    @Test
    public void test_c7()
    {
        assertEquals("Pensioner", App.method02(73));
    }

    @Test
    public void test_c8()
    {
        assertEquals("", App.method02(0));
    }

    @Test
    public void test_c9()
    {
        assertEquals("", App.method02(0));
    }

    @Test
    public void test_c10()
    {
        assertEquals(false, App.method04(-15));
    }

    @Test
    public void test_c11()
    {
        assertEquals(true, App.method04(5));
    }

    @Test
    public void test_c12()
    {
        assertEquals(false, App.method04(15));
    }

    @Test
    public void test_c13()
    {
        assertEquals(true, App.method04(25));
    }

    @Test
    public void test_c14()
    {
        assertEquals('p', App.method03(80));
    }

    @Test
    public void test_c15()
    {
        assertEquals('P', App.method03(112));
    }

    @Test
    public void test_c16()
    {
        assertEquals('?', App.method03(54));
    }
}
