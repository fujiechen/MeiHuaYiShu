package com.itechheart.www.meihuayishu.test.business;

import com.itechheart.www.meihuayishu.business.CalculateBenGua;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateBenGuaTest {
    private CalculateBenGua benGua;

    public CalculateBenGuaTest() {
        benGua = new CalculateBenGua();
    }

    @Test
    public void testCalculation() {
        System.out.println(benGua.toString());
    }
}
