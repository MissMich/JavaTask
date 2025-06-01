package org.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberStatsTest {
    @Test
    public void testAverageOfAListNumbers() {
        NumberStats<Integer> avgNum = new NumberStats<>();
        List<Integer> numList = Arrays.asList(1,7,4,8,13);
        double expected = 6.6;
        assertEquals(expected, avgNum.avarageNum(numList), 0.0001);
    }

    @Test
    public void testAverageOfListDoubles() {
        NumberStats<Double> doubleAvg = new NumberStats<>();
        List<Double> doubleList = Arrays.asList(12.5, 8.3, 23.8, 30.1);
        double expected = 18.675;
        assertEquals(expected, doubleAvg.avarageNum(doubleList), 0.0001);
    }
}