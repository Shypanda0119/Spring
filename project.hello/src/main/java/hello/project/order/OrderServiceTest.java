package hello.project.order;

import hello.project.member.Grade;
import hello.project.member.Member;
import hello.project.member.MemberService;
import hello.project.member.MemberServiceImpL;
import hello.project.order.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpL();
    OrderService orderService = new OrderServiceImpL();

    @Test
    public void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
