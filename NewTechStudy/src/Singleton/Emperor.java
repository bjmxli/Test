package Singleton;
/**
 * 懒汉
 * */
public class Emperor {
   //set the construction function
   private Emperor(){
	   
   }
   //create a object
   private static Emperor instance;
   
   private String order = "I am the Emperor";

	public String getOrder() {
		return order;
	}
	
	public void setOrder(String order) {
		this.order = order;
	}
  
	public static Emperor getInstance(){
		if(instance == null){
			instance =new Emperor();
		}
		return instance;
	}
}
