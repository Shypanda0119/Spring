package hello.project.member;

public interface MemberRepository {
    void save(Member member);

    Member findMember(Long memberId);
}
