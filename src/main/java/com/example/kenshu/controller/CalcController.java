package com.example.kenshu.controller;

import com.example.kenshu.dto.FormDto;
import com.example.kenshu.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CalcController {

    private final CalcService calcService;

    @Autowired
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @PostMapping(value = "/calc", produces = "text/plain")
    public String calc(FormDto form) {
        if (Objects.isNull(form.getType())) {
            return "";
        }
        switch (form.getType()) {
            case "0":
                return calcService.sum(form.getNum(), form.getNum2());
            case "1":
                return calcService.subtract(form.getNum(), form.getNum2());
            case "2":
                return calcService.multiply(form.getNum(), form.getNum2());
            case "3":
                return calcService.division(form.getNum(), form.getNum2());
            case "4":
                return calcService.fibonacci(form.getNum(), form.getNum2());
            default:
                return "ラジオボタンから選択してください。";
        }
    }
}
