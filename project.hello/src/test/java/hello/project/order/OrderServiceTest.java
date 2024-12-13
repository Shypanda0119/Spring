package hello.project.order;
import hello.project.AppConfig;
import hello.project.member.MemberService;
import org.junit.jupiter.api.BeforeEach;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }
}
