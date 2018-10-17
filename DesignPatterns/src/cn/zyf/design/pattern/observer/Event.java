package cn.zyf.design.pattern.observer;

import java.lang.reflect.Method;

public class Event {

	// 事件源
	private Object source;
	// 通知目标
	private Object target;
	// 回调
	private Method callback;
	// 触发
	private String trigger;

	public Event(Object target, Method callback) {
		this.target = target;
		this.callback = callback;
	}

	public Object getSource() {
		return source;
	}

	public Event setSource(Object source) {
		this.source = source;
		return this;
	}

	public Object getTarget() {
		return target;
	}

	public Event setTarget(Object target) {
		this.target = target;
		return this;
	}

	public Method getCallback() {
		return callback;
	}

	public Event setCallback(Method callback) {
		this.callback = callback;
		return this;
	}

	public String getTrigger() {
		return trigger;
	}

	public Event setTrigger(String trigger) {
		this.trigger = trigger;
		return this;
	}

	@Override
	public String toString() {
		return "Event [source=" + source + ", target=" + target + ", callback=" + callback + ", trigger=" + trigger
				+ "]";
	}
}