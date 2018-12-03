package cn.zyf.design.pattern.singleton;

/**
 * 懒汉式单例 在外部需要使用的时候才进行实例化
 */
public class LazyOne {

	private LazyOne() {

	}

	// 静态块，公共内存区域
	private static LazyOne lazyOne = null;

	// 调用方法之前，先判断
	// 如果没有初始化，将其进行初始化,并且赋值
	// 将该实例缓存好
	public static LazyOne getInstance() {
		if (lazyOne == null) {
			// 两个线程都会进入这个if里面，存在线程安全问题
			lazyOne = new LazyOne();
		}
		// 如果已经初始化，直接返回之前已经保存好的结果
		return lazyOne;
	}
}
