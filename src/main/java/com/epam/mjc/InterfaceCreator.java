package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (x) -> {
            List<Integer> res = new ArrayList<>();
            for (int num : x) {
                res.add(num / divider);
            }
            return res;
        };
    }
}
