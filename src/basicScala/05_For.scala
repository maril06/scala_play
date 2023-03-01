package basicScala

object For {
  
   def main(args:Array[String]) : Unit = {
     
      println("================for문========================")
     // 굳이 x에 대한 변수 선언을 하지 않아도 됨.
     // to는 <=와 같은 의미이다.
     for(x <- 1 to 10){
    	 print("x의 값은 " + x + ",")
     }
       
     /*
      *  자바의 경우
      *  for(int i=0; i<10; i++){
      *  }
      */
      println()
      println("========================================")
      
      // until은 미만 이라는 의미를 가지고 있다.
      for(x<- 1 until 10){
    	  print("x의 값은 " + x + ",")
      }
      
      println()  
      println("========================================")
      
      
      println()
      println("================while과 do while========================")
      
      
      //while
      var a = 0
      
      while(a<20){
        
        print(a + ",")
        
        a = a + 1
      }
      println()
      
      //do while
      var b = 0
      
      do{
        print(b + ",")
        b = b + 1
      }while(b<20)
        
      println()  
  	  println("=====================================================")
  	  
  	  
  	  println("======================이중for문======================")
  	  //반복문 이중 for문.
  	  
  	  for(x <- 1 until 5 ; y <- 1 until 5){
  	    
  	    print(x + "*" + y + "=" + x*y + ",  ")
  	  }
  	  
      println()  
  	  println("=====================================================")
  	  
  	  
  	  println("======================조건이 있는 반복======================")
  	  // if조건을 만족하는 1~10까지의 정수를 반복함.
  	  for(i <- (1 to 10) if (i%2 == 0)){
  	    println(i)
  	  }
  	  
  	  
  	  
   }
   
   
   
   
   
}