package cn.zyf.design.pattern.adapter;

public class Test {

	public static void main(String[] args) {

        LoginForThirdService service = new LoginForThirdService();
        //不改变原来的代码，也要能够兼容新的需求
        System.out.println(service.loginForQQ("123456"));
    }

}
