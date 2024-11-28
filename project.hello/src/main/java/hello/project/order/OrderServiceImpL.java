package hello.project.order;

import hello.project.discount.DiscountPolicy;
import hello.project.discount.FixDiscountPolicy;
import hello.project.member.Member;
import hello.project.member.MemberRepository;
import hello.project.member.MemoryMemberRepository;

public class OrderServiceImpL implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findMember(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
