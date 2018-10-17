package cn.zyf.design.pattern.decorator;

public interface LoginForThirdService extends LoginService{

	public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

}
