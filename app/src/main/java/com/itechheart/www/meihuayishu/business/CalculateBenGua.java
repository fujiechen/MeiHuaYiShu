package com.itechheart.www.meihuayishu.business;

import com.itechheart.www.meihuayishu.objects.Gua;
import com.itechheart.www.meihuayishu.objects.HalfGua;

import java.util.Calendar;

public class CalculateBenGua {
    private Gua benGua;
    private int sum1;
    private int sum2;
    private HalfGua top;
    private HalfGua bottom;

    public CalculateBenGua() {
        sum1 = 0;
        sum2 = 0;
        top = new HalfGua();
        bottom = new HalfGua();
        benGua = new Gua(top, bottom);
        calculate();
    }

    public void calculate() {
        calTop();
        calBottom();
        benGua.setTop(top);
        benGua.setBottom(bottom);
    }

    public void calTop() {
        LunarCalendar lc = new LunarCalendar();
        int year1 = (lc.getChinaYear() - 3) % 10;
        int year2 = (lc.getChinaYear() - 3) % 12;
        int month = lc.getChinaMonth();
        int day = lc.getChinaDay();
        sum1 = year1 + year2 + month + day;
        top.setBenGua(sum1);
    }

    public void calBottom() {
        int shichen = calShiChen();
        sum2 = sum1 + shichen;
        bottom.setBenGua(sum2);
    }

    public int calShiChen() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        int result = 0;

        if(hour == 23 || hour == 0) {
            result = 1;
        } else if(hour == 1 || hour == 2) {
            result = 2;
        } else if(hour == 3 || hour == 4) {
            result = 3;
        } else if(hour == 5 || hour == 6) {
            result = 4;
        } else if(hour == 7 || hour == 8) {
            result = 5;
        } else if(hour == 9 || hour == 10) {
            result = 6;
        } else if(hour == 11 || hour == 12) {
            result = 7;
        } else if(hour == 13 || hour == 14) {
            result = 8;
        } else if(hour == 15 || hour == 16) {
            result = 9;
        } else if(hour == 17 || hour == 18) {
            result = 10;
        } else if(hour == 19 || hour == 20) {
            result = 11;
        } else if(hour == 21 || hour == 22) {
            result = 12;
        }

        return result;
    }

    public Gua getBenGua() { return benGua;}

    public int getSum1() { return sum1; }

    public int getSum2() { return sum2; }
}
