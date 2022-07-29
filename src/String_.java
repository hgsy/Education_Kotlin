public class String_ {
    String str1 = "hello";
    String str2 = "hello";
    //new 연산자를 사용하지 않고 같은 문자열을 선언하면
    //둘이 가리키는 hello 안스턴스는 동일한 인스턴스

    String str3 = new String("hello");
    String str4 = new String("hello");
    //new 연산자를 사용하면 인스턴스를 무조건 새롭게 생성
    //결과적으로 두 변수는 다른 인스턴스를 가리킴.

    //문자열을 비교할 때 equals를 사용하지 않았음에도 정상적인 결과가 출력되는 경우는
    //new 연산자를 사용하지않아 같은 인스턴스를 사용하고 있기 떄문에 생기는 우연임.

    //equals 가 아닌 == 로 참조변수를 비교하면 인스턴스의 주소를 비교함.

    //하지만 메모리를 아끼기 위해서는 String은 new를 사용하지 않는 것이 좋다.

    //String은 불변 클래스로 String이 인스턴스가 될 떄 가지던 값을 나중에 수정 불가하다
    //String은 문자열과 관련된 다양한 메소드를 가지고 있다. 메소드를 호출한다 하더라도 String은 내부의 값이 변하지 않는다.
    //String이 가지고 있는 메소드중 String을 반환하는 메소드는 모두 새로운 String을 생성해서 반환한다.

}