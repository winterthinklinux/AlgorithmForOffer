package beautiful;

public class Singleton_doublecheck {
	private volatile  static Singleton_doublecheck singleton;
	private Singleton_doublecheck(){
	}
	public static Singleton_doublecheck getSingleTon(){
		if(singleton ==null){
			synchronized(Singleton_doublecheck.class){
				if(singleton==null){
					//volatile ∑¿÷π÷∏¡Ó÷ÿ≈≈–Ú
					singleton = new Singleton_doublecheck();
				}
			}
		}
		return singleton;
	}
}
