package br.com.va4e.gidac.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.Member;



@RepositoryRestResource(path = "members",itemResourceRel = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {

	<S extends Member> S save(S entity);
	
	
	Member findOne(Long id);

	boolean exists(Long id);

	long count() ;


	
	void delete(Member entity);
	

	
	List<Member> findAll();

	List<Member> findAll(Sort sort) ;

	




}