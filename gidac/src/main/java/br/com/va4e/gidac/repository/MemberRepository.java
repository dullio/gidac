package br.com.va4e.gidac.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.Member;



@RepositoryRestResource(path = "members",itemResourceRel = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {

	//******************CRUD Methods***********************
	
	//READ
	
	Member findOne(Long id);
	
	List<Member> findAll();

	List<Member> findAll(Sort sort) ;
	
	//UPDATE and CREATE
	
	<S extends Member> S saveAndFlush(Member entity);
	
	//DELETE

	void delete(Long id) ;
	
}