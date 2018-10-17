package cn.zyf.design.pattern.singleton;

public class LazyTwo {

	private LazyTwo() {
		
	}
	
	private static LazyTwo lazyTwo = null;
	
	public static synchronized LazyTwo getInstance() {
		if(lazyTwo==null) {
			lazyTwo = new LazyTwo();
		}
		return lazyTwo;
	}
}
