package com.sematec.bootcamp.eight.androidadvancedfarvardin98;

import com.sematec.bootcamp.eight.androidadvancedfarvardin98.old.MainActivity;
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.old.TestJava;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    MainActivity activity;

    @Before
    public void setup() {
        activity = new MainActivity();
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkNumber() {
        int age = activity.calculateAge(2019, 1919);
        assertEquals(100, age);
    }


    @Test
    public void checkDiv() {
        int result = activity.division(20, 10);
        assertEquals(2, result);
    }

    @Test
    public void checkDivWithZero() {
        int result = activity.division(20, 0);
        assertEquals(0, result);
    }

    @Test
    public void testLikePicture() {
        String mockId = "Pouya";
        TestJava tj = new TestJava();
        String result = tj.likePicture(mockId);
        assertEquals(mockId, result);
    }


    @Test(expected = IllegalStateException.class)
    public void testLikePictureException() {
        String mockId = null;
        TestJava tj = new TestJava();
        String result = tj.likePicture(mockId);
    }


}