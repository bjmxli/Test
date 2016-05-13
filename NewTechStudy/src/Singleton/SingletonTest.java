package Singleton;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emperor emperor = Emperor.getInstance();
		System.out.println(emperor.getOrder());
	}

}
