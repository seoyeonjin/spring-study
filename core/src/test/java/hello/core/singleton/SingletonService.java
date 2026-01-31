package hello.core.singleton;

public class SingletonService {

    // static 으로 가짐
    // 자기자신에 대한 참조 생성해서 넣어놓는다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // 실수로 만들지 못하도록 private 생성자 생성
    private SingletonService() {
    }

    public  void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
