package cn.zyf.design.pattern.adapter;

public class LoginService {

	//老的注册登陆方法往往需要输入用户名以及密码
	
	/**
	 * 模拟注册方法
	 */
	public ResultMsg register(String username,String password) {
		return new ResultMsg("200", "注册成功", new MemberInfo(username,password));
	}
	
	/**
	 * 模拟登陆方法
	 */
	public ResultMsg login(String username,String password) {
		return new ResultMsg("200", "登陆成功", new MemberInfo(username,password));
	}
}
