module mod.service{

  exports com.example.mod.calc.service;
  provides com.example.mod.calc.service.Calculate with com.example.mod.impl.Sum, com.example.mod.impl.Minus;
  //provides com.example.mod.calc.service.Calculate with com.example.mod.impl.Minus;


}