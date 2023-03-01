package basicScala

object AnyVal_AnyRef {
  def main(args:Array[String]) : Unit = {
    
    //기본 자료형 AnyVal (Byte, Short, Int, Long, Char, Boolean, ((Unit))
    
    var a : Int = 5
    
    var b = a
    
    a = 10
    
    println(a)
    println(b)
    
    //참조 자료형 AnyRef
    
    
    
    //type예약어를 이용해 자료형을 별칭화 하기.
    //자료형이 복잡할 경우 별칭을 주어 쉽게 쓸 수 있다.
    
    type Name = String
    val name : Name = "임말자"
    println(name)
    
    
    // (string, int) 쌍인 튜플을 흉내낸 형식
    type Person = (String, Int)
    val person : Person = ("김동욱", 24)
    println(person)
    
    // String을 받고 Int를 반환하는 형식
   type FType = String => Int
   
   val f : FType = text => text.toInt
    
    
  }
}