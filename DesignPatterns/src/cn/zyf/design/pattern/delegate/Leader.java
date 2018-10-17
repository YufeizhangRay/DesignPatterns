package cn.zyf.design.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements Task{

	private Map<String, Task> tasks = new HashMap<String, Task>();
	
	public Leader() {
		tasks.put("登录", new EmployeeA());
		tasks.put("注册", new EmployeeB());
	}

	//leader自己不干活，而是直接全盘委托给别人
	@Override
	public void doing(String task) {
		tasks.get(task).doing(task);;
	}
}
