 module mod.two{

    /*Deep Reflection Demo */
   opens com.example.mod.reflection;
   exports com.example.mod.reflection;
   

   exports com.example.mod.two;

   /*Transitive Demo 
  
   requires transitive mod.three;*/
   
}