package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepository memberRepository;
	
	
	@Override
	public void saveMember(Member member) {
		// TODO Auto-generated method stub
		memberRepository.save(member);
	}

	@Override
	public Member getMember(int id) {
		// TODO Auto-generated method stub
		return memberRepository.findById(id).get();
	}

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}

	@Override
	public void deleteMember(int id) {
		// TODO Auto-generated method stub
		memberRepository.deleteById(id);
	}

	@Override
	public void deleteAllMembers(Member member) {
		// TODO Auto-generated method stub
		memberRepository.deleteAll();
	}

	@Override
	public Member updateMember(Member member) {
		// TODO Auto-generated method stub
		return memberRepository.save(member);
	}

}
