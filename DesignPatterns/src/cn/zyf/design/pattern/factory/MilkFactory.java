package cn.zyf.design.pattern.factory;

public class MilkFactory extends AbstractFactory{

	@Override
	public Milk getSanlu() {
		return new Sanlu();
	}

	@Override
	public Milk getYili() {
		return new Yili();
	}

}
