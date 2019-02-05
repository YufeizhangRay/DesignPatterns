package cn.zyf.design.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResiterMap {

	private static String name;
	
	private ResiterMap() {
		
	}
	
	private static Map<String, Object> register = new ConcurrentHashMap<String, Object>();
	
	public static ResiterMap getInstance() {
		if(name == null) {
			name = ResiterMap.class.getName();
		}
		if(register.get(name)==null) {
			register.put(name, new ResiterMap());
		}
		return (ResiterMap) register.get(name);
	}
}
