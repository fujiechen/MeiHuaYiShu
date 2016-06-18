package com.itechheart.www.meihuayishu.business;

import com.itechheart.www.meihuayishu.application.Main;
import com.itechheart.www.meihuayishu.application.Services;
import com.itechheart.www.meihuayishu.objects.*;
import com.itechheart.www.meihuayishu.persistence.*;

public class FindGuaTitle {
    private Gua gua;
    private String title;
    private String code;
    private DataAccess dataAccess;

    public FindGuaTitle(String dbName) {
        dataAccess = Services.getDataAccess(dbName);
        gua = null;
        title = null;
        code = null;
    }

    public FindGuaTitle() {
        dataAccess = Services.getDataAccess(Main.dbName);
        gua = null;
        title = null;
        code = null;
    }

    public String findGuaTitle(Gua gua) {
        this.gua = gua;
        HalfGua top = gua.getTop();
        HalfGua bottom = gua.getBottom();
        code = "";

        code += top.getYao(0);
        code += top.getYao(1);
        code += top.getYao(2);

        code += bottom.getYao(0);
        code += bottom.getYao(1);
        code += bottom.getYao(2);

        title = dataAccess.findTitleByCode(code);

        return title;
    }
}
