package cn.zyf.design.pattern.delegate;

public class EmployeeA implements Task{

	@Override
	public void doing(String task) {
		System.out.println("我是员工B，我开始干"+task+"工作");
	}

}
