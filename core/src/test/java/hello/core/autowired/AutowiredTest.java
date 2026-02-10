package hello.core.autowired;

import hello.core.member.Member;
import org.springframework.lang.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        @Autowired(required = false)
        public void setNoBean1(Member member) {
            System.out.println("member = " + member); // 없으면 호출 안 됨(출력 안 됨)
        }

        @Autowired
        public void setNoBean2(@Nullable Member member2) {
            System.out.println("member2 = " + member2); // 호출은 되나, null로 들어옴(출력됨)
        }

        @Autowired
        public void setNoBean3(Optional<Member> member3) {
            System.out.println("member3 = " + member3); // 호출은 되나, Optional.empty로 들어옴(출력됨)
        }
    }
}
