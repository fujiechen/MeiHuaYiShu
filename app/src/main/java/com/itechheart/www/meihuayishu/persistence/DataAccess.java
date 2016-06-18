package com.itechheart.www.meihuayishu.persistence;

import java.util.ArrayList;

import com.itechheart.www.meihuayishu.application.*;

public class DataAccess {
    private String dbName;
    private String dbType = "stub";
    private ArrayList<ArrayList> guaList;

    public DataAccess(String dbName) { this.dbName = dbName; }

    public DataAccess() { this(Main.dbName); }

    public void open(String dbPath) {
        guaList = new ArrayList<ArrayList>();
        ArrayList<String> guaDetail;

        //1. 乾为天
        guaDetail = new ArrayList<String>();
        guaDetail.add("111111");
        guaDetail.add("乾为天");
        guaList.add(guaDetail);

        //2. 天泽履
        guaDetail = new ArrayList<String>();
        guaDetail.add("111011");
        guaDetail.add("天泽履");
        guaList.add(guaDetail);

        //3. 天火同人
        guaDetail = new ArrayList<String>();
        guaDetail.add("111101");
        guaDetail.add("天火同人");
        guaList.add(guaDetail);

        //4. 天雷无妄
        guaDetail = new ArrayList<String>();
        guaDetail.add("111001");
        guaDetail.add("天雷无妄");
        guaList.add(guaDetail);

        //5. 天风姤
        guaDetail = new ArrayList<String>();
        guaDetail.add("111110");
        guaDetail.add("天风姤");
        guaList.add(guaDetail);

        //6. 天水讼
        guaDetail = new ArrayList<String>();
        guaDetail.add("111010");
        guaDetail.add("天水讼");
        guaList.add(guaDetail);

        //7. 天山遁
        guaDetail = new ArrayList<String>();
        guaDetail.add("111100");
        guaDetail.add("天山遁");
        guaList.add(guaDetail);

        //8. 天地否
        guaDetail = new ArrayList<String>();
        guaDetail.add("111000");
        guaDetail.add("天地否");
        guaList.add(guaDetail);

        //9. 泽天夬
        guaDetail = new ArrayList<String>();
        guaDetail.add("011111");
        guaDetail.add("泽天夬");
        guaList.add(guaDetail);

        //10. 兑为泽
        guaDetail = new ArrayList<String>();
        guaDetail.add("011011");
        guaDetail.add("兑为泽");
        guaList.add(guaDetail);

        //11. 泽火革
        guaDetail = new ArrayList<String>();
        guaDetail.add("011101");
        guaDetail.add("泽火革");
        guaList.add(guaDetail);

        //12. 泽雷随
        guaDetail = new ArrayList<String>();
        guaDetail.add("011001");
        guaDetail.add("泽雷随");
        guaList.add(guaDetail);

        //13. 泽风大过
        guaDetail = new ArrayList<String>();
        guaDetail.add("011110");
        guaDetail.add("泽风大过");
        guaList.add(guaDetail);

        //14. 泽水困
        guaDetail = new ArrayList<String>();
        guaDetail.add("011010");
        guaDetail.add("泽水困");
        guaList.add(guaDetail);

        //15. 泽山咸
        guaDetail = new ArrayList<String>();
        guaDetail.add("011100");
        guaDetail.add("泽山咸");
        guaList.add(guaDetail);

        //16. 泽地萃
        guaDetail = new ArrayList<String>();
        guaDetail.add("011000");
        guaDetail.add("泽地萃");
        guaList.add(guaDetail);

        //17. 火天大有
        guaDetail = new ArrayList<String>();
        guaDetail.add("101111");
        guaDetail.add("火天大有");
        guaList.add(guaDetail);

        //18. 火泽睽
        guaDetail = new ArrayList<String>();
        guaDetail.add("101011");
        guaDetail.add("火泽睽");
        guaList.add(guaDetail);

        //19. 离为火
        guaDetail = new ArrayList<String>();
        guaDetail.add("101101");
        guaDetail.add("离为火");
        guaList.add(guaDetail);

        //20. 火雷噬盍
        guaDetail = new ArrayList<String>();
        guaDetail.add("101001");
        guaDetail.add("火雷噬盍");
        guaList.add(guaDetail);

        //21. 火风鼎
        guaDetail = new ArrayList<String>();
        guaDetail.add("101110");
        guaDetail.add("火风鼎");
        guaList.add(guaDetail);

        //22. 火水未济
        guaDetail = new ArrayList<String>();
        guaDetail.add("101010");
        guaDetail.add("火水未济");
        guaList.add(guaDetail);

        //23. 火山旅
        guaDetail = new ArrayList<String>();
        guaDetail.add("101100");
        guaDetail.add("火山旅");
        guaList.add(guaDetail);

        //24. 火地晋
        guaDetail = new ArrayList<String>();
        guaDetail.add("101000");
        guaDetail.add("火地晋");
        guaList.add(guaDetail);

        //25. 雷天大壮
        guaDetail = new ArrayList<String>();
        guaDetail.add("001111");
        guaDetail.add("雷天大壮");
        guaList.add(guaDetail);

        //26. 雷泽归妹
        guaDetail = new ArrayList<String>();
        guaDetail.add("001011");
        guaDetail.add("雷泽归妹");
        guaList.add(guaDetail);

        //27. 雷火丰
        guaDetail = new ArrayList<String>();
        guaDetail.add("001101");
        guaDetail.add("雷火丰");
        guaList.add(guaDetail);

        //28. 震为雷
        guaDetail = new ArrayList<String>();
        guaDetail.add("001001");
        guaDetail.add("震为雷");
        guaList.add(guaDetail);

        //29. 雷风恒
        guaDetail = new ArrayList<String>();
        guaDetail.add("001110");
        guaDetail.add("雷风恒");
        guaList.add(guaDetail);

        //30. 雷水解
        guaDetail = new ArrayList<String>();
        guaDetail.add("001010");
        guaDetail.add("雷水解");
        guaList.add(guaDetail);

        //31. 雷山小过
        guaDetail = new ArrayList<String>();
        guaDetail.add("001100");
        guaDetail.add("雷山小过");
        guaList.add(guaDetail);

        //32. 雷地豫
        guaDetail = new ArrayList<String>();
        guaDetail.add("001000");
        guaDetail.add("雷地豫");
        guaList.add(guaDetail);

        //33. 凤天小畜
        guaDetail = new ArrayList<String>();
        guaDetail.add("110111");
        guaDetail.add("凤天小畜");
        guaList.add(guaDetail);

        //34. 风泽中孚
        guaDetail = new ArrayList<String>();
        guaDetail.add("110011");
        guaDetail.add("风泽中孚");
        guaList.add(guaDetail);

        //35. 风火家人
        guaDetail = new ArrayList<String>();
        guaDetail.add("110101");
        guaDetail.add("风火家人");
        guaList.add(guaDetail);

        //36. 风雷益
        guaDetail = new ArrayList<String>();
        guaDetail.add("110001");
        guaDetail.add("风雷益");
        guaList.add(guaDetail);

        //37. 巽为风
        guaDetail = new ArrayList<String>();
        guaDetail.add("110110");
        guaDetail.add("巽为风");
        guaList.add(guaDetail);

        //38. 风水涣
        guaDetail = new ArrayList<String>();
        guaDetail.add("110010");
        guaDetail.add("风水涣");
        guaList.add(guaDetail);

        //39. 风山渐
        guaDetail = new ArrayList<String>();
        guaDetail.add("110100");
        guaDetail.add("风山渐");
        guaList.add(guaDetail);

        //40. 风地观
        guaDetail = new ArrayList<String>();
        guaDetail.add("110000");
        guaDetail.add("风地观");
        guaList.add(guaDetail);

        //41. 水天需
        guaDetail = new ArrayList<String>();
        guaDetail.add("010111");
        guaDetail.add("水天需");
        guaList.add(guaDetail);

        //42. 水泽节
        guaDetail = new ArrayList<String>();
        guaDetail.add("010011");
        guaDetail.add("水泽节");
        guaList.add(guaDetail);

        //43. 水火既济
        guaDetail = new ArrayList<String>();
        guaDetail.add("010101");
        guaDetail.add("水火既济");
        guaList.add(guaDetail);

        //44. 水雷屯
        guaDetail = new ArrayList<String>();
        guaDetail.add("010001");
        guaDetail.add("水雷屯");
        guaList.add(guaDetail);

        //45. 水风井
        guaDetail = new ArrayList<String>();
        guaDetail.add("010110");
        guaDetail.add("水风井");
        guaList.add(guaDetail);

        //46. 坎为水
        guaDetail = new ArrayList<String>();
        guaDetail.add("010010");
        guaDetail.add("坎为水");
        guaList.add(guaDetail);

        //47. 水山蹇
        guaDetail = new ArrayList<String>();
        guaDetail.add("010100");
        guaDetail.add("水山蹇");
        guaList.add(guaDetail);

        //48. 水地比
        guaDetail = new ArrayList<String>();
        guaDetail.add("010000");
        guaDetail.add("水地比");
        guaList.add(guaDetail);

        //49. 山天大畜
        guaDetail = new ArrayList<String>();
        guaDetail.add("100111");
        guaDetail.add("山天大畜");
        guaList.add(guaDetail);

        //50. 山泽损
        guaDetail = new ArrayList<String>();
        guaDetail.add("100011");
        guaDetail.add("山泽损");
        guaList.add(guaDetail);

        //51. 山火贲
        guaDetail = new ArrayList<String>();
        guaDetail.add("100101");
        guaDetail.add("山火贲");
        guaList.add(guaDetail);

        //52. 山雷颐
        guaDetail = new ArrayList<String>();
        guaDetail.add("100001");
        guaDetail.add("山雷颐");
        guaList.add(guaDetail);

        //53. 山风蛊
        guaDetail = new ArrayList<String>();
        guaDetail.add("100110");
        guaDetail.add("山风蛊");
        guaList.add(guaDetail);

        //54. 山水蒙
        guaDetail = new ArrayList<String>();
        guaDetail.add("100010");
        guaDetail.add("山水蒙");
        guaList.add(guaDetail);

        //55. 艮为山
        guaDetail = new ArrayList<String>();
        guaDetail.add("100100");
        guaDetail.add("艮为山");
        guaList.add(guaDetail);

        //56. 山地剥
        guaDetail = new ArrayList<String>();
        guaDetail.add("100000");
        guaDetail.add("山地剥");
        guaList.add(guaDetail);

        //57. 地天泰
        guaDetail = new ArrayList<String>();
        guaDetail.add("000111");
        guaDetail.add("地天泰");
        guaList.add(guaDetail);

        //58. 地泽临
        guaDetail = new ArrayList<String>();
        guaDetail.add("000011");
        guaDetail.add("地泽临");
        guaList.add(guaDetail);

        //59. 地火明夷
        guaDetail = new ArrayList<String>();
        guaDetail.add("000101");
        guaDetail.add("地火明夷");
        guaList.add(guaDetail);

        //60. 地雷复
        guaDetail = new ArrayList<String>();
        guaDetail.add("000101");
        guaDetail.add("地雷复");
        guaList.add(guaDetail);

        //61. 地风升
        guaDetail = new ArrayList<String>();
        guaDetail.add("000110");
        guaDetail.add("地风升");
        guaList.add(guaDetail);

        //62. 地水师
        guaDetail = new ArrayList<String>();
        guaDetail.add("000010");
        guaDetail.add("地水师");
        guaList.add(guaDetail);

        //63. 地山谦
        guaDetail = new ArrayList<String>();
        guaDetail.add("000100");
        guaDetail.add("地山谦");
        guaList.add(guaDetail);

        //64. 坤为地
        guaDetail = new ArrayList<String>();
        guaDetail.add("000000");
        guaDetail.add("坤为地");
        guaList.add(guaDetail);

    }

    public void close() { System.out.println("Closed " + dbType + " database" + dbName); }

    public String findTitleByCode(String code) {
        String title = "";
        boolean find = false;
        for(int i = 0; i < guaList.size() && !find; i++) {
            if(guaList.get(i).get(0).equals(code))
                title = (String)(guaList.get(i).get(1));
        }
        return title;
    }
}
