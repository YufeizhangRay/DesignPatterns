package cn.zyf.design.pattern.decorator;

public class LoginForThirdServiceImpl implements LoginForThirdService{

	//在原有的基础上进行了增强，即装饰
	
	/**
	 * 新增方法
	 */
	@Override
	public ResultMsg loginForQQ(String id) {
		return null;
	}

	/**
	 * 新增方法
	 */
	@Override
	public ResultMsg loginForWechat(String id) {
		return null;
	}

	/**
	 * 原始方法
	 */
	@Override
	public ResultMsg register(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 原始方法
	 */
	@Override
	public ResultMsg login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
