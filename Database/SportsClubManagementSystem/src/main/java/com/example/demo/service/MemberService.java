package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService {

	void saveMember(Member member);
	
	Member updateMember(Member member);
	
	Member getMember(int id);

	List<Member> getAllMembers();

	void deleteMember(int id);
	
	void deleteAllMembers(Member member);
}
