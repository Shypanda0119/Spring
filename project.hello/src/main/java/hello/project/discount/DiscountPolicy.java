package hello.project.discount;

import hello.project.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
