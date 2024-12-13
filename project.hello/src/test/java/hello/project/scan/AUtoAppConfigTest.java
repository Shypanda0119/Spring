package hello.project.scan;

import hello.project.AutoAppConfig;
import hello.project.member.MemberRepository;
import hello.project.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.assertj.core.api.Assertions.assertThat;

public class AUtoAppConfigTest {

    @Test
    void basicScnan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
