package com.example.kenshu.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String sum(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    public String subtract(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    public String division(int num1, int num2) {
        System.out.println(num1);
        if (num1 == 0) {
            return "N/A";
        }
        return String.valueOf((double) num1 / num2);
    }

    public String fibonacci(int num1) {
        if (num1 < 1) {
            return "フィボナッチ数を計算するときは1つ目の数字には1以上の値を入力してください";
        }
        List<String> l = new ArrayList<>();
        l.add("1");
        if (num1 == 1) {
            return String.join(", ", l);
        }
        l.add("1");
        if (num1 == 2) {
            return String.join(",", l);
        }
        int j = 1;
        for (int i = 2; i < num1; i++) {
            j += j;
            l.add(String.valueOf(j));
        }
        return String.join(", ", l);
    }

    private int toTest(int num1) {
        if (num1 == -1) {
            throw new IllegalArgumentException("例外スロー時用のテストです");
        }
        if (-1 < num1 && num1 < 11) {
            return (int)(Math.pow(num1,2));
        } else if ((-11 < num1 && num1 < -1) || (10 < num1 && num1 < 21)) {
            return Math.abs(num1);
        } else {
            throw new ArithmeticException("数値が範囲外です");
        }
    }
    private int divide7(double num) {
        BigDecimal val = BigDecimal.valueOf(num);
        return val.divide(BigDecimal.valueOf(7),0, RoundingMode.HALF_UP).intValue();
    }
    private int calcTax(int x, boolean isReduced) {
        BigDecimal tax;
        if (isReduced) {
            tax = BigDecimal.valueOf(8);
        } else {
            tax = BigDecimal.valueOf(10);
        }
        return BigDecimal.valueOf(x)
                .divide(tax,0, RoundingMode.HALF_UP)
                .intValue();
    }
}
