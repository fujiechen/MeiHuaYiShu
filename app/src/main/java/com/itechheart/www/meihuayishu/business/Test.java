package com.itechheart.www.meihuayishu.business;

import com.itechheart.www.meihuayishu.application.Main;
import com.itechheart.www.meihuayishu.application.Services;

public class Test {
    public static void main(String[] args) {
        Main.startUp();
        CalculateTotal cal = new CalculateTotal();
        cal.getTotalTitle();
        System.out.println(cal.toString());
    }
}
