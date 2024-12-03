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

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpL(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpL(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}


