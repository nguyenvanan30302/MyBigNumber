package org.example.task2.service;

import org.example.MyBigNumber;
import org.springframework.stereotype.Service;

@Service
public class NumberService {
    public String addNumberService(String num1, String num2) {
        MyBigNumber myBigNumber = new MyBigNumber();
        return myBigNumber.sum(num1, num2);
    }
}
