package com.itechheart.www.meihuayishu.business;

import com.itechheart.www.meihuayishu.objects.Gua;
import com.itechheart.www.meihuayishu.objects.HalfGua;

public class CalculateHuGua {
    private Gua huGua;
    private HalfGua top;
    private HalfGua bottom;
    private CalculateBenGua benGuaCal;

    public CalculateHuGua(CalculateBenGua benGuaCal) {
        this.benGuaCal = benGuaCal;
        top = new HalfGua();
        bottom = new HalfGua();
        huGua = new Gua(top, bottom);
        calculate();
    }

    public void calculate() {
        calTop();
        calBottom();
    }

    private void calTop() {
        top.set(0,benGuaCal.getBenGua().getTop().getYao(1) );
        top.set(1,benGuaCal.getBenGua().getTop().getYao(2) );
        top.set(2,benGuaCal.getBenGua().getBottom().getYao(0) );
    }

    private void calBottom() {
        bottom.set(0,benGuaCal.getBenGua().getTop().getYao(2));
        bottom.set(1,benGuaCal.getBenGua().getBottom().getYao(0));
        bottom.set(2,benGuaCal.getBenGua().getBottom().getYao(1));
    }

    public Gua getHuGua() { return huGua; }
}
