package cn.zyf.design.pattern.singleton;

public class LazyTwo {

	private LazyTwo() {
		
	}
	
	private static LazyTwo lazyTwo = null;
	//synchronized修饰静态方法，锁住整个类，每次调用都需要获取锁，效率低下。
	public static synchronized LazyTwo getInstance() {
		if(lazyTwo==null) {
			lazyTwo = new LazyTwo();
		}
		return lazyTwo;
	}
}
