package org.example;

import java.util.List;

//3. Create a generic class NumberStats<T extends Number> with a method to compute the average of a list.

public class NumberStats<T extends Number> {
    private List<T> numbers;

    public NumberStats(List<T> numbers) {
        this.numbers = numbers;
    }

    public double avarageNum() {
        if  (numbers == null || numbers.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (T num: numbers) {
            sum += num.doubleValue();
        }
        return sum/ numbers.size();
    }
}

//        List<Integer> numList = Arrays.asList(1,4,6,3,10,14,17);
//        NumberStats<Integer> avgNum = new NumberStats<>(numList);
//        System.out.println(avgNum.avarageNum());
