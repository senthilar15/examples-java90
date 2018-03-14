package com.example.mod.consumer;

import com.example.mod.calc.service.Calculate; //Service Loader API
import java.util.ServiceLoader; //Service Loader API

public class Consumer {

public static void main(String[] a)
{

	/*Service Loader API */

	try{

		ServiceLoader<Calculate> calculate = ServiceLoader.load(Calculate.class);

		 calculate.stream()
		           .map(p -> p.get())
		           .forEach(c ->System.out.println(c.calc(10d, 5d)));
  

	}catch(Exception e){
		e.printStackTrace();
	}
  }
}