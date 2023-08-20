package com.example.interntest_ma.controller.dto.response;

import com.example.interntest_ma.controller.dto.ProfitPerWeek;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfitAllDaysResponse {
    List<ProfitPerWeek> profits;
}
