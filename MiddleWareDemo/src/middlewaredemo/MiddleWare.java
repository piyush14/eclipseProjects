package middlewaredemo;

public class MiddleWare {
	
	public static String myToUpperCase(String name){
		 return (name).toUpperCase();
		
	}
	
	public static Object invokeMethod(String className,String methodName,
			Class[] paramTypes,Object paramValues[]){
			System.out.println("HELLO");
		
		Object obj = null;
		return obj;
	}
}
