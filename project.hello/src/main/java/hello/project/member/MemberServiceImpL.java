package hello.project.member;

public class MemberServiceImpL implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpL(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
