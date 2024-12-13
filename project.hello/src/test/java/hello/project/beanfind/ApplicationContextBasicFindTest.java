package hello.project.beanfind;

import hello.project.AppConfig;
import hello.project.member.MemberService;
import hello.project.member.MemberServiceImpL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }

    @Test
    @DisplayName("이름 없이 타입만으로 조회")
    void findBeanByType(){
        MemberService memberService = ac.getBean( MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByName2(){
        MemberServiceImpL memberService = ac.getBean("memberService", MemberServiceImpL.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpL.class);
    }

    @Test
    @DisplayName("빈 이름으로 조회X")
    void findBeanByX(){
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> ac.getBean("xxxxx", MemberService.class));
    }
}
