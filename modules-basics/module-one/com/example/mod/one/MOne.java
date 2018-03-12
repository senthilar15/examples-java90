package com.example.mod.one;

import com.example.mod.two.MTwo;
import com.example.mod.reflection.RefDemo;
import java.lang.reflect.Method;

public class MOne {

public void sum(int a, int b){

System.out.println(new MTwo().add(a, b));

}

public static void main(String[] a)
{

 // new MOne().sum(1,2);
 
 try{
	 Class<?> mTwoClazz = Class.forName("com.example.mod.reflection.RefDemo");
	Method m =  RefDemo.class.getDeclaredMethod("callByDeepRef");
    m.setAccessible(true);
	m.invoke(new RefDemo(),new Object[0]);
	// RefDemo m = mTwoClazz.newInstance();
	// m.callByDeepRef();
 }catch(Exception e){
	 
	 e.printStackTrace();
 }
 

}}