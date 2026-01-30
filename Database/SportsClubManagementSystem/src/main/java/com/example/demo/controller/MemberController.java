package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

@RestController
@RequestMapping("member")
public class MemberController {

	@Autowired
	MemberService memberService;

	@PostMapping("add")
	public String addMember(@RequestBody Member member)
	{
		memberService.saveMember(member);
		return MessageConstants.MEMBER_ADDED;
	}
	
	@GetMapping("get/{id}")
	Member getMember(@PathVariable int id)
	{
		return memberService.getMember(id);
	}
	
	@GetMapping("getAll")
	List<Member> getAllMembers()
	{
		return memberService.getAllMembers();
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteMember(@PathVariable int id)
	{
		memberService.deleteMember(id);
		return MessageConstants.MEMBER_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllMembers(@RequestBody Member member)
	{
		memberService.deleteAllMembers(member);
		return MessageConstants.ALL_MEMBERS_DELETED;
	}
	
	@PutMapping("update")
	public String updateMember(@RequestBody Member member)
	{
		memberService.updateMember(member);
		return MessageConstants.MEMBER_UPDATED;
	}

}
