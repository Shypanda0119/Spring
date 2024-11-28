package hello.project;

import hello.project.member.Grade;
import hello.project.member.Member;
import hello.project.member.MemberService;
import hello.project.member.MemberServiceImpL;
import hello.project.order.Order;
import hello.project.order.OrderService;
import hello.project.order.OrderServiceImpL;

import java.awt.*;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpL();
        OrderService orderService = new OrderServiceImpL();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
