package hello.project.member;

import hello.project.AppConfig;
import org.junit.jupiter.api.BeforeEach;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

}
