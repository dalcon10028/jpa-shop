package jpabook.jpashop.controller;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

//    @PostMapping("members/new")
//    public Long create(@Valid @RequestBody ) {
//        Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());
//        Member member = new Member();
//        member.setName(form.getName());
//        member.setAddress(address);
//
//        return memberService.join(member);
//    }

    @GetMapping("/members")
    public List<Member> list() {
        return memberService.findMembers();
    }
}
