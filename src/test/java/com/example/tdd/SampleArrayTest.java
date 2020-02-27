package com.example.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class SampleArrayTest {

    SampleArray sampleArray = new SampleArray();

    @Test
    void sizeTest(){
        assertEquals(0, sampleArray.size());
    }

    @Test
    void addTest(){
        sampleArray.add("foo");
        assertEquals(1, sampleArray.size());
    }

    @Test
    void getTest(){
        sampleArray.add("foo");
        assertEquals("foo", sampleArray.get(0));
        assertEquals(1, sampleArray.size());
    }

    @Test
    void removeTest(){
        assertEquals(0, sampleArray.size());

        sampleArray.add("foo1");
        sampleArray.add("foo2");
        sampleArray.add("foo3");
        sampleArray.add("foo4");
        sampleArray.add("foo5");

        assertEquals(5, sampleArray.size());

        assertEquals("foo1", sampleArray.get(0));
        assertEquals("foo2", sampleArray.get(1));
        assertEquals("foo3", sampleArray.get(2));
        assertEquals("foo4", sampleArray.get(3));
        assertEquals("foo5", sampleArray.get(4));

        sampleArray.remove(2);

        assertEquals(4, sampleArray.size());

        assertEquals("foo1", sampleArray.get(0));
        assertEquals("foo2", sampleArray.get(1));
        assertEquals("foo4", sampleArray.get(2));
        assertEquals("foo5", sampleArray.get(3));
        assertEquals(null, sampleArray.get(4));

        sampleArray.remove(0);

        assertEquals(3, sampleArray.size());

        assertEquals("foo2", sampleArray.get(0));
        assertEquals("foo4", sampleArray.get(1));
        assertEquals("foo5", sampleArray.get(2));
        assertEquals(null, sampleArray.get(3));
        assertEquals(null, sampleArray.get(4));
    }
}
