package com.example.interntest_ma.service;

import com.example.interntest_ma.controller.dto.ProfitPerWeek;
import com.example.interntest_ma.controller.dto.response.ProfitAllDaysResponse;
import com.example.interntest_ma.controller.dto.response.ProfitPerDay;
import com.example.interntest_ma.entity.Receipt;
import com.example.interntest_ma.repository.ReceiptRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class ReceiptService {

    private final ReceiptRepository receiptRepository;


    public String getProfitPerWeek(ProfitPerWeek request) {
        //get good rice per week
        List<Receipt> receipts;

        if (request.getWeek() == 1) {
            receipts = receiptRepository.findAllByIdBetweenAndActiveIsTrue(1L,7L);
        } else if(request.getWeek() == 2){
            receipts = receiptRepository.findAllByIdBetweenAndActiveIsTrue(8L, 15L);
        } else if(request.getWeek() == 3){
            receipts = receiptRepository.findAllByIdBetweenAndActiveIsTrue(16L, 23L);
        } else {
            receipts = receiptRepository.findAllByIdBetweenAndActiveIsTrue(24L, 30L);
        }
        Long profit = calculateProfit(receipts);
        return "Profit in week" + request.getWeek() + ": " + profit;
    }

//    public ProfitAllDaysResponse getProfitAllDays() {
//        List<Receipt> receipts = receiptRepository.findAll();
//        ProfitAllDaysResponse response = new ProfitAllDaysResponse();
//        response.setProfits(receipts.stream().map(r -> {
//            ProfitPerDay profitPerDay = new ProfitPerDay();
//            profitPerDay.setDay(r.getId());
//            profitPerDay.setProfit(r.getGoodRices() / 5 * 3 / 10 * 18000);
//            return profitPerDay;
//        }).collect(Collectors.toList()));
//        return response;
//    }

    private Long calculateProfit(List<Receipt> receipts) {
        Long sumGoodRice= 0L;
        for (int i =0; i< receipts.size(); i++) {
            sumGoodRice = sumGoodRice + receipts.get(i).getGoodRices();
        }
        return sumGoodRice/5 *3/10*18000;
    }


}
