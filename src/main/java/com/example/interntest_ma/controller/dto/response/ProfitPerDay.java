package com.example.interntest_ma.controller.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfitPerDay {
    Long day;

    Long profit;
}
