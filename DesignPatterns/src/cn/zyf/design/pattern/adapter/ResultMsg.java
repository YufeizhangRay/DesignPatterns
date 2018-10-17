package cn.zyf.design.pattern.adapter;

public class ResultMsg {

	private String code;
	private String msg;
	private MemberInfo memberInfo;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	public ResultMsg(String code, String msg, MemberInfo memberInfo) {
		this.code = code;
		this.msg = msg;
		this.memberInfo = memberInfo;
	}

	@Override
	public String toString() {
		return "ResultMsg [code=" + code + ", msg=" + msg + ", memberInfo=" + memberInfo + "]";
	}

}
