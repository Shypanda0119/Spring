package hello.project.member;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpL();

    @Test
    public void join(){
        Member member = new Member(1L, "MemberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
