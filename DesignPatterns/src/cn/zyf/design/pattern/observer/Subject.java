package cn.zyf.design.pattern.observer;

public class Subject extends EventLisenter {

	public void add() {
		System.out.println("调用添加的方法");
		trigger(SubjectEventType.ON_ADD);
	}

	public void remove() {
		System.out.println("调用删除的方法");
		trigger(SubjectEventType.ON_RMOVE);
	}

}
