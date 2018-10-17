package cn.zyf.design.pattern.delegate;

public class EmployeeB implements Task{

	@Override
	public void doing(String task) {
		System.out.println("我是员工A，我开始干"+task+"工作");
	}

}
