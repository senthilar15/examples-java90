package com.example.mod.one;

import com.example.mod.two.MTwo;
import com.example.mod.reflection.RefDemo; //Deep reflection 
import java.lang.reflect.Method; //Deep reflection 

//import com.example.mod.transitive.TransitiveDep; //Transitive Dep


public class MOne {

public static void sum(int a, int b){

		System.out.println(new MTwo().add(a, b));

}

public static void main(String[] a)
{

  sum(1,2);

/* Deep reflection */
 try{
	Class<?> mTwoClazz = Class.forName("com.example.mod.reflection.RefDemo");
	Method m =  RefDemo.class.getDeclaredMethod("callByDeepRef");
    m.setAccessible(true);
	m.invoke(new RefDemo(), new Object[0]);
	
 }catch(Exception e){
	 
	 e.printStackTrace();
 }
 /* Deep reflection */


/*

    Transitive Dep



  TransitiveDep dep = new TransitiveDep();
  dep.transitive();

*/

}}