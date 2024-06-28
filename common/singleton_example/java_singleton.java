// 생성자를 감추고 정적 메서드를 통해 오직 하나의 인스턴스만 반환하도록
public class Singleton1 {
  private static Singleton1 instance;

  private Singleton1() {
  }

  // Java의 멀티 스레드 환경에서는 생성자 호출이 여러번 발생할 가능성이 있음 
  // public static Singleton1 getInstance() {
  //   if (instance == null) {
  //     instance = new Singleton1();
  //   }
  //   return instance;
  // }

  // Java의 멀티 스레드 환경에서는 synchronized 키워드 권장
  // 하지만 성능 저하가 예상됨
  public static synchronized Singleton1 getInstance() {
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }
}

// 정적 멤버 선언 시에 인스턴스를 초기화시킴
// 클래스 로딩 시에 미리 인스턴스가 생성됨
// 단점: 인스턴스를 사용하지 않을 경우에도 미리 생성하기 때문에 필요하지 않은 비용 발생
public class Singleton2 {
  private final static Singleton2 instance = new Singleton2();

  private Singleton2() {
  }

  public static synchronized Singleton2 getInstance() {
    return instance;
  }
}

// 정적 멤버 선언 방식에 대한 해법으로 내부 맴버 클래스 안에서 정적 멤버로 선언
class Singleton3 {
  private static class singleInstanceHolder {
    private static final Singleton3 INSTANCE = new Singleton3();
  }
  public static Singleton getInstance() {
    return singleInstanceHolder.INSTANCE;
  }
}
