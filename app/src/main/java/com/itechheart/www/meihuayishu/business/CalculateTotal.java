package com.itechheart.www.meihuayishu.business;

import com.itechheart.www.meihuayishu.objects.*;

public class CalculateTotal {
    private CalculateBenGua benGua;
    private CalculateBianGua bianGua;
    private CalculateHuGua huGua;
    private String benGuaTitle;
    private String bianGuaTitle;
    private String huGuaTitle;
    private FindGuaTitle findGuaTitle;

    public CalculateTotal() {
        benGua = new CalculateBenGua();
        bianGua = new CalculateBianGua(benGua);
        huGua = new CalculateHuGua(benGua);
        findGuaTitle = new FindGuaTitle();
        getTotalTitle();
    }

    public void getTotalTitle() {
        benGuaTitle = findGuaTitle.findGuaTitle(benGua.getBenGua());
        bianGuaTitle = findGuaTitle.findGuaTitle(bianGua.getBianGua());
        huGuaTitle = findGuaTitle.findGuaTitle(huGua.getHuGua());
    }

    public Gua getBenGua() { return benGua.getBenGua(); }

    public Gua getBianGua() { return bianGua.getBianGua(); }

    public Gua getHuGua() { return huGua.getHuGua(); }

    public String getBenGuaPrint() { return benGua.getBenGua().print();}

    public String getBianGuaPrint() { return bianGua.getBianGua().print();}

    public String getHuGuaPrint() { return  huGua.getHuGua().print(); }

    public String getBenGuaTitle() { return benGuaTitle; }

    public String getBianGuaTitle() { return bianGuaTitle; }

    public String getHuGuaTitle() { return huGuaTitle; }

    public String toString() {
        String content = "";
        content += "本卦：\n"+ getBenGuaPrint() + " \n" + benGuaTitle + "\n";
        content += "变卦：\n"+ getBianGuaPrint() + " \n" + bianGuaTitle + "\n";
        content += "互卦：\n"+ getHuGuaPrint() + " \n" + huGuaTitle + "\n";
        return content;
    }
}
