package middlewaredemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.omg.CORBA.portable.InvokeHandler;

public class MiddleWareDemo {

	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
//		String className = "MiddleWare";
//		String methodName = "toUpperCase";
//		Class[] paramString = new Class[1];
//		paramString[0] = String.class;
//		
//		Class cls = Class.forName("middlewaredemo.MiddleWare");
//		
//		Object obj = cls.newInstance();
//		
//		Method  method = cls.getDeclaredMethod(methodName, paramString);
//		 String temp = (String) method.invoke(obj, new String("hello"));
//		 
//		 System.out.println(temp);
//		 
		String className = "middlewaredemo.MiddleWare";
		String methodName = "invokeMethod";
		Class paramType[] = new Class[1];
		Object paramValue[] = new Object[1];
		paramType[0] = String.class;
		Class cls = Class.forName("middlewaredemo.MiddleWare");
		//Object obj = cls.newInstance();
		//Method  method = cls.getDeclaredMethod(className, methodName,paramString,obj);
		MiddleWare.invokeMethod(className, methodName, paramType, paramValue);
		
	}

}
