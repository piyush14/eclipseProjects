package com.customannotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;

public class CustomAnnotation {

    

    public static void main(String[] args) throws Exception {

        Class c = Demo.class;
        Method[] m = c.getDeclaredMethods();

        for (int i = 0; i < m.length; i++) {
            if (m[i].getAnnotation(Getter.class) != null) {
                String methodName = m[i].getName().toLowerCase();
                String returnValue = methodName.substring(3, methodName.length());
                
              
                    if (c.getDeclaredField(returnValue) != null) {
                        System.out.print(m[i].getName()+"  Annoted Method");
                        System.out.println();
                   

            }
        }
    }
    }
}

class Demo{
	private int id = 1;
    private int name = 2;
    private int val = 3;

    @Getter
    public int getId() {
        return id;
    }

    @Getter
    public int getName() {
        return name;
    }

    
    public int getVal() {
        return val;
    }
}