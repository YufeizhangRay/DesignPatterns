package cn.zyf.design.pattern.observer;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		try {
			// 观察者
			Observer observer = new Observer();
			Class<?> clazz = Observer.class;
			Method advice = clazz.getMethod("advice", new Class<?>[] { Event.class });

			// 添加监听器
			Subject subject = new Subject();
			subject.addLisenter(SubjectEventType.ON_ADD, observer, advice);
			subject.addLisenter(SubjectEventType.ON_EDIT, observer, advice);
			subject.addLisenter(SubjectEventType.ON_RMOVE, observer, advice);
			subject.addLisenter(SubjectEventType.ON_QUERY, observer, advice);

			subject.add();
			subject.remove();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
