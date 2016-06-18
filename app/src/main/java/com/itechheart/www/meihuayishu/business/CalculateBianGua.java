package com.itechheart.www.meihuayishu.business;

import com.itechheart.www.meihuayishu.objects.Gua;
import com.itechheart.www.meihuayishu.objects.HalfGua;

public class CalculateBianGua {
    private Gua bianGua;
    private int sum;
    private HalfGua top;
    private HalfGua bottom;
    private CalculateBenGua benGuaCal;

    public CalculateBianGua(CalculateBenGua benGuaCal) {
        sum = 0;
        this.benGuaCal = benGuaCal;
        top = new HalfGua();
        bottom = new HalfGua();
        bianGua = new Gua(top, bottom);
        calculate();
    }

    public void calculate() {
        sum = benGuaCal.getSum1() + benGuaCal.getSum2();
        int reverseIndex = sum % 6;
        cloneFromBenGua();
        switch (reverseIndex) {
            case 1:
                bottom.setReverse(2);
                break;
            case 2:
                bottom.setReverse(1);
                break;
            case 3:
                bottom.setReverse(0);
                break;
            case 4:
                top.setReverse(2);
                break;
            case 5:
                top.setReverse(1);
                break;
            case 0:
                top.setReverse(0);
                break;
        }
    }

    private void cloneFromBenGua() {
        top.setGua(benGuaCal.getBenGua().getTop().getGua());
        bottom.setGua(benGuaCal.getBenGua().getBottom().getGua());
    }

    public Gua getBianGua() { return bianGua; }
}
