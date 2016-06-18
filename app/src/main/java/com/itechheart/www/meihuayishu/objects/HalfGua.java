package com.itechheart.www.meihuayishu.objects;

public class HalfGua {
    int[] gua;

    public HalfGua() {
        gua = new int[3];
    }

    public void setBenGua(int sum) {
        int mod = sum % 8;
        switch(mod) {
            case 1:
                gua[0] = 1;
                gua[1] = 1;
                gua[2] = 1;
                break;
            case 2:
                gua[0] = 0;
                gua[1] = 1;
                gua[2] = 1;
                break;
            case 3:
                gua[0] = 1;
                gua[1] = 0;
                gua[2] = 1;
                break;
            case 4:
                gua[0] = 0;
                gua[1] = 0;
                gua[2] = 1;
                break;
            case 5:
                gua[0] = 1;
                gua[1] = 1;
                gua[2] = 0;
                break;
            case 6:
                gua[0] = 0;
                gua[1] = 1;
                gua[2] = 0;
                break;
            case 7:
                gua[0] = 1;
                gua[1] = 0;
                gua[2] = 0;
                break;
            case 0:
                gua[0] = 0;
                gua[1] = 0;
                gua[2] = 0;
                break;
        }
    }

    public void set(int index, int yao) {
        gua[index] = yao;
    }

    public void setReverse(int index) {
        if(gua[index] == 1)
            gua[index] = 0;
        else
            gua[index] = 1;
    }

    public void setGua(int[] gua) {this.gua = gua; }

    public void setThreeNumber(int a, int b, int c) {
        gua[0] = a;
        gua[1] = b;
        gua[2] = c;
    }

    public int[] getGua() {
        return gua.clone();
    }

    public int getYao(int index) { return  gua[index]; }

    public String toString() {
        return gua[0] + " " + gua[1] + " " + gua[2];
    }

    public String getPicCode() {
        String string = toString();
        if(string.equals("1 1 1"))
            return "gua_1";
        else if(string.equals("0 1 1"))
            return "gua_2";
        else if(string.equals("1 0 1"))
            return "gua_3";
        else if(string.equals("0 0 1"))
            return "gua_4";
        else if(string.equals("1 1 0"))
            return "gua_5";
        else if(string.equals("0 1 0"))
            return "gua_6";
        else if(string.equals("1 0 0"))
            return "gua_7";
        else
            return "gua_8";
    }
}
