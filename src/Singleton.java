public  class Singleton {
	private static Singleton instance; 
	private Singleton() {}
	public static Singleton getInstance() {
		if (instance == nul) { 
			instance = new Singleton();
		}
		return instance;
	}
}
