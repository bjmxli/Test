package Singleton;
/**
 * 懒汉
 * */
public class Emperor1 {
   //set the construction function
   private Emperor1(){
	   
   }
   //create a object
   private static Emperor1 instance=new Emperor1();
   
   private String order = "I am the Emperor";

	public String getOrder() {
		return order;
	}
	
	public void setOrder(String order) {
		this.order = order;
	}
  
	public static Emperor1 getInstance(){
		return instance;
	}
}
