package com.example.interntest.controller;

import com.example.interntest.controller.dto.ProfitPerWeek;
import com.example.interntest.controller.dto.response.ProfitAllDaysResponse;
import com.example.interntest.service.ReceiptService;
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

    @GetMapping("/day")
    public ResponseEntity<ProfitAllDaysResponse> getProfitAllDays() {
        return ResponseEntity.ok(receiptService.getProfitAllDays());

    }
}
