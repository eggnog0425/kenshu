package com.example.kenshu.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return String.valueOf(num1 / num2);
    }

    public String fibonacci(int first, int last) {
        if (first < 0) {
            return "1つ目の数字には0以上の値を入力してください";
        }
        List<String> l = new ArrayList<>();
        if (first == 0) {
            l.add("0");
            if (last == 0) {
                return String.join(",", l);
            }
            l.add("1");
            if (last == 1) {
                return String.join(",", l);
            }
            zeroOrOneFibonacci(last, l);
            return String.join(", ",l);
        }
        if (first == 1) {
            l.add("1");
            zeroOrOneFibonacci(last, l);
            return String.join(", ", l);
        }
        int j = 1;
        if (last < first) {
            return "2つ目の数字には1つ目の数字より大きな値を入力してください。";
        }
        for (int i = 0; i < last; i++) {
            j += j;
            if (i < first) {
                continue;
            }
            l.add(String.valueOf(j));
        }
        return String.join(", ", l);
    }
    private void zeroOrOneFibonacci(int last, List l) {
        int j = 1;
        for (int i = 0; i <= last; i++) {
            l.add(String.valueOf(j));
            j += j;
        }
    }
}
