package cn.zyf.design.pattern.proxy.cglib;

public class Test {

    public static void main(String[] args) {

        try {
            ZhangSan obj = (ZhangSan)new ZhongJie().getInstance(ZhangSan.class);
            obj.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
