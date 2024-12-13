package hello.project;

import hello.project.discount.DiscountPolicy;
import hello.project.discount.FixDiscountPolicy;
import hello.project.discount.RateDiscountPolicy;
import hello.project.member.MemberRepository;
import hello.project.member.MemberService;
import hello.project.member.MemberServiceImpL;
import hello.project.member.MemoryMemberRepository;
import hello.project.order.OrderService;
import hello.project.order.OrderServiceImpL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        //1번
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpL(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        //1번
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpL(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}

