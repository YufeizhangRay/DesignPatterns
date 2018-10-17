package cn.zyf.design.pattern.template;

public class Test {

	public static void main(String[] args) {

        MemberDao memberDao = new MemberDao(null);
        memberDao.query();
    }

}
