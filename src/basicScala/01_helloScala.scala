package basicScala

object Ex_1_1 {
  /*
   * 처음부터 단 하나의 인스턴스만 생성 가능한 싱글턴 객체이다.
   *
   *
   * 스칼라에서는 모든 것이 객체이며 +와 같은 연산자도 함수 형태를 가지는 객체이다! 함수도 객체!
   *
   * */
  def main(args: Array[String]): Unit = {
    // 함수는 def로 정의. 매개변수명을 먼저 써주고, 자바의 void와 동일한 Unit을 반환한다 (즉, 아무것도 반환하지 않는다는것을 명시적으로 표현)
    println("헬로 스칼라")
  }

  /*
 * 자바의 경우.
 *
public class Ex_1_2 {

	public static void main(String[] args) {
		System.out.println("헬로 자바");
	}
}
*/
}