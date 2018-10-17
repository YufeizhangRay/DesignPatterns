package cn.zyf.design.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResiterMap {

	private ResiterMap() {
		
	}
	
	private static Map<String, Object> register = new ConcurrentHashMap<String, Object>();
	
	public static ResiterMap getInstance(String name) {
		if(name == null) {
			name = ResiterMap.class.getName();
		}
		if(register.get(name)==null) {
			try {
				register.put(name, new ResiterMap());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (ResiterMap) register.get(name);
	}
}
