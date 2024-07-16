package com.example.bt_hien_thi_gia_vi_voi_sandwich;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SandwichRepository {
    public List<String> save(String lettuce, String tomato, String mustard, String sprouts) {
        List<String> condiments = new ArrayList<>();

        if (!lettuce.isEmpty()) {
            condiments.add(lettuce);
        }
        if (!tomato.isEmpty()) {
            condiments.add(tomato);
        }
        if (!mustard.isEmpty()) {
            condiments.add(mustard);
        }
        if (!sprouts.isEmpty()) {
            condiments.add(sprouts);
        }

        return condiments;
    }
}
