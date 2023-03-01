package basicScala

object Ex_2_1 {
  def main(args:Array[String]) : Unit = {
    //var는 일반적인 변수,
    //val은 자바로치면 final 변수.
    //스칼라는 알아서 변수 자료형을 할당해줌.
    var a = "변수입니다"
    val b = "final 변수입니다"
    
    a= "바꿀 수 있음"
    //b= "바꿀수 없음"
    
    println(a)
    
    /****************************************/
    
    //스칼라는 변수를 초기화하지 않고 선언만 하면 컴파일 에러가 나게됨.
    //var c
    
    //따라서, 아래와 같이 초기화가 필요하다.
    var d = 10
    
    
    // null이나, None으로 초기화가 가능하며, None이 권장된다.
    var e = null
    var f = None
    
    
    //필요하다면 자료형을 직접 명시적으로 선언하여 해당 자료형으로만 저장되게 할 수 있다.
    var g : Int = 10
    
    //g = "string을 넣으면? 에러가난다."
    
    
    // 스칼라에서는 var 또는 val의 선언을 생략하고 변수를 선언할 수 없다.
    
    
  }
}