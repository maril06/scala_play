package basicScala

object If_Else {
   def main(args:Array[String]) : Unit = {
     
     var x= 20
     
     if(x > 15){
       println("15보다 큽니다")
       
     }else if(x < 15){
       println("15보다 작습니다")
       
     }else{
       println("없지")
     }
     
   }
}