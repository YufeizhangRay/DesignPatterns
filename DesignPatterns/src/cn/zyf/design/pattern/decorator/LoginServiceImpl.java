package cn.zyf.design.pattern.decorator;

public class LoginServiceImpl implements LoginService{

	/**
	 * 模拟注册方法
	 */
	@Override
	public ResultMsg register(String username, String password) {
		return new ResultMsg("200","注册成功",new MemberInfo(username,password));
	}

	/**
	 * 模拟登陆方法
	 */
	@Override
	public ResultMsg login(String username, String password) {
		return new ResultMsg("200", "登陆成功", new MemberInfo(username,password));
	}

}
