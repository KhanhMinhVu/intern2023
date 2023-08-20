package com.example.interntest.controller.dto.response;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfitAllDaysResponse {
    List<ProfitPerDay> profits;
}
