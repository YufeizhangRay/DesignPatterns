package cn.zyf.design.pattern.decorator;

public interface LoginService {

	public ResultMsg register(String username,String password);
	
	public ResultMsg login(String username,String password);
}
