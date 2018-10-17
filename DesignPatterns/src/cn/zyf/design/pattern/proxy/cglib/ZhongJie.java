package cn.zyf.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ZhongJie implements MethodInterceptor {

	public Object getInstance(Class<?> clazz) throws Exception {
		Enhancer enhancer = new Enhancer();
		// 要把哪个设置为即将生成的新类父类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// 业务的增强
		System.out.println("我是中介：我要帮你找工作，现在已经拿到你的需求");
		System.out.println("开始寻找");
		methodProxy.invokeSuper(o, objects);
		System.out.println("已找到，如果合适的话，就准备办事");
		return null;
	}

}
