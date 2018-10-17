package cn.zyf.design.pattern.proxy.jdk;

public class Test {

	public static void main(String[] args) {

		try {
			Person obj = (Person) new JDK58().getInstance(new ZhangSan());
			System.out.println(obj.getClass());
			obj.findJob();

			// 原理：
			// 1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
			// 2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口
			// 3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
			// 4、编译新生成的Java代码.class
			// 5、再重新加载到JVM中运行
			// 以上这个过程就叫字节码重组

			// JDK中有个规范，只要要是$开头的一般都是自动生成的

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
