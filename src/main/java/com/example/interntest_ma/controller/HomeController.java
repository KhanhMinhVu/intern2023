package com.example.interntest_ma.controller;

import com.example.interntest_ma.controller.dto.ProfitPerWeek;
import com.example.interntest_ma.controller.dto.response.ProfitPerDay;
import com.example.interntest_ma.service.ReceiptService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profit")
@AllArgsConstructor
public class HomeController {

    private ReceiptService receiptService;

    @PostMapping("week")
    public ResponseEntity<String> getProfitPerWeek(@RequestBody ProfitPerWeek request) {
        return ResponseEntity.ok(receiptService.getProfitPerWeek(request));
    }

//    @GetMapping("/day")
//    public ResponseEntity<ProfitPerDay> getProfitAllDays() {
//        return ResponseEntity.ok(receiptService.getProfitAllDays());
//
//    }
}
