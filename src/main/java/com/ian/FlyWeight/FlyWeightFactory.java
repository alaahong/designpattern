package com.ian.FlyWeight;

import java.util.HashMap;
import java.util.Map;

import com.ian.FlyWeight.impl.ConcreteFlyweight;

/**
 * Created by Ian on 15/06/2015.
 */
public class FlyWeightFactory {
    public Map<String, IFlyWeight> map = new HashMap<String, IFlyWeight>();

    public FlyWeightFactory() {
    }

    public IFlyWeight getAnswer(String question) {
        IFlyWeight result = null;
        if (map.containsKey(question)) {
            result = map.get(question);
        } else {
            map.put(question, new ConcreteFlyweight(question));
            result = map.get(question);
        }
        return result;
    }
}
