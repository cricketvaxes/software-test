package homework1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testhomework {
    String result;
    int a[] = {2,3,3,4};
    int b[] = {2,2,5,5};
    int c[] = {2,3,4,1};
    Homework1 t = new Homework1();
    
    @Test
    public void test1(){
		result = t.triangle(a[0], b[0], c[0]);
        assertEquals("equilateral",result);
    }
    @Test
    public void test2(){
        result = t.triangle(a[1], b[1], c[1]);
        assertEquals("isosceles",result);
    }
    @Test
    public void test3(){
        result = t.triangle(a[2], b[2], c[2]);
        assertEquals("scalene",result);
    }
    @Test
    public void test4(){
        result = t.triangle(a[3], b[3], c[3]);
        assertEquals("can't be a triangle!",result);
    }
}
