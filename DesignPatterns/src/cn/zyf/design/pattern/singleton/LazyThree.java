package cn.zyf.design.pattern.singleton;

/**
 * 懒汉式单例
 * 特点：在外部类被调用的时候内部类才会被加载
 * 内部类一定是要在方法调用之前初始化
 * 巧妙地避免了线程安全问题
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 * 但是也依然无法阻止反射打破单例约束
 */
public class LazyThree {
	
	private boolean initialized = false;

	//默认使用LazyThree的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
	private LazyThree() {
		synchronized (LazyThree.class) {
			if(initialized==false) {
				initialized = true;
			}else {
				throw new RuntimeException("单例模式已被破坏");
			}
		}
	}
	
	public static LazyThree getInstance() {
		//在返回结果以前，一定会先加载内部类
		return LazyHolder.LAZY;
	}
	//默认不加载
	private static class LazyHolder{
		private static final LazyThree LAZY = new LazyThree();
	}
	
}
