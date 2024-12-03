package hello.project.order;

import hello.project.discount.DiscountPolicy;
import hello.project.discount.FixDiscountPolicy;
import hello.project.discount.RateDiscountPolicy;
import hello.project.member.Member;
import hello.project.member.MemberRepository;
import hello.project.member.MemoryMemberRepository;

public class OrderServiceImpL implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpL(MemberRepository memberRepository, DiscountPolicy
            discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}