package cn.zyf.design.pattern.adapter;

public class LoginForThirdService extends LoginService{
	
	//第三方登陆往往直接通过QQ或者微信的用户名就可以登陆，不需要注册以及输入密码

	/**
	 * 模拟注册并登陆
	 */
    public ResultMsg registerAndLogin(String username,String password){
    	//通过调用父类的原始注册和登陆方法，使新的服务方法与原始系统得到兼容，即实现适配
        super.register(username,null);
        return super.login(username,null);
    }


	public ResultMsg loginForQQ(String id) {
		return registerAndLogin(id, null);
	}
	
	public ResultMsg loginForWechat(String id){
        return registerAndLogin(id, null);
    }
	
	public ResultMsg loginByToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        return  null;
    }


}
