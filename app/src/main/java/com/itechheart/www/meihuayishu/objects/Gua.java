package com.itechheart.www.meihuayishu.objects;

public class Gua {
    private HalfGua top;
    private HalfGua bottom;

    public Gua(HalfGua top, HalfGua bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public HalfGua getTop() { return top; }

    public HalfGua getBottom() { return  bottom; }

    public void setTop(HalfGua top) { this.top = top; }

    public void setBottom(HalfGua bottom) { this.bottom = bottom; }

    public String toString() {
        return top.toString() + " | " + bottom.toString();
    }

    public String print() {
        String result = "";
        result += determineYinYang(top.getYao(0)) + "\n";
        result += determineYinYang(top.getYao(1)) + "\n";
        result += determineYinYang(top.getYao(2)) + "\n";
        result += determineYinYang(bottom.getYao(0)) + "\n";
        result += determineYinYang(bottom.getYao(1)) + "\n";
        result += determineYinYang(bottom.getYao(2));
        return result;
    }

    public String determineYinYang(int code) {
        if(code == 1)
            return "-----";
        else
            return "-- --";
    }
}
