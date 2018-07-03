package br.com.va4e.gidac.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.va4e.gidac.entity.Member;
import br.com.va4e.gidac.exception.RestResponseEntityExceptionHandler;
import br.com.va4e.gidac.repository.MemberRepository;

@RestController
@RequestMapping("/api")
public class MemberController {

	/*
	 * CRUD Methods
	 * 
	 * 
	 * 
	 */

	@Autowired
	MemberRepository memberRepository;

	@GetMapping("/members")
	public ResponseEntity<List<Member>> findAll() {

		List<Member> members = memberRepository.findAll();

		if (members == null) {

			return new ResponseEntity<List<Member>>(members, HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	}

	@GetMapping("/members/{id}")
	public ResponseEntity<?> getMember(@PathVariable("id") long id) {

		Member member = memberRepository.findOne(id);

		if (member == null) {

			return new ResponseEntity<Member>(member, HttpStatus.NOT_FOUND);

		}

		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}

	@PostMapping("/members")
	public ResponseEntity<?> createMember(@Valid @RequestBody Member member, UriComponentsBuilder ucBuilder) {

		Member memberEx = new Member();

    	memberEx.setFirstName(member.getFirstName());
    	memberEx.setLastName(member.getLastName());
    	
    	
    	/*ExampleMatcher matcher = ExampleMatcher.matching()
    			.withMatcher("firstname", match -> match.ignoreCase().exact())
    			.withMatcher("lastname", match -> match.ignoreCase().exact())
    			
    			.withMatcher("firstname", endsWith())
    			  .withMatcher("lastname", startsWith().ignoreCase())
                          
    			  .withStringMatcherEnding();   */
             
    	Example<Member> example = Example.of(memberEx);
    	
    	List<Member> results = memberRepository.findAll(example);
    	
    	if(!results.isEmpty()) {
    		
    		return new ResponseEntity<Member>(member, HttpStatus.CONFLICT);
    		
    	}

		results = memberRepository.findByUserName(member.getUserName());

		if (!results.isEmpty()) {

			return new ResponseEntity<Member>(member, HttpStatus.CONFLICT);

		}

		memberRepository.save(member);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/member/{id}").buildAndExpand(member.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

}
