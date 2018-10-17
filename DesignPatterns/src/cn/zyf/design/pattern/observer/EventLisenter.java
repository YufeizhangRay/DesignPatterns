package cn.zyf.design.pattern.observer;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件的注册和监听
 */
public class EventLisenter {

	// Map相当于是一个注册器
	@SuppressWarnings("rawtypes")
	protected Map<Enum, Event> events = new HashMap<Enum, Event>();

	@SuppressWarnings("rawtypes")
	public void addLisenter(Enum eventType, Object target, Method callback) {
		// 注册事件
		// 用反射调用这个方法
		events.put(eventType, new Event(target, callback));
	}

	private void trigger(Event e) {
		e.setSource(this);
		try {
			e.getCallback().invoke(e.getTarget(), e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	protected void trigger(Enum call) {
		if (!this.events.containsKey(call)) {
			return;
		}
		trigger(this.events.get(call).setTrigger(call.toString()));
	}

}
