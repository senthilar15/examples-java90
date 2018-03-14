module mod.consumer{


	//exports com.example.mod.consumer;
	/*for Services loader API*/
	requires mod.service;
	uses com.example.mod.calc.service.Calculate;

}