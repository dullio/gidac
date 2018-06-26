package br.com.va4e.gidac.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Example;
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

	void delete(Long id);
	
	void delete(Member entity);
	
	void delete(Iterable<? extends Member> entities);
	
	void deleteAll();

	<S extends Member> S findOne(Example<S> example) ;
	
	<S extends Member> Page<S> findAll(Example<S> example, Pageable pageable) ;
	
	<S extends Member> long count(Example<S> example) ;

	<S extends Member> boolean exists(Example<S> example);

	Page<Member> findAll(Pageable pageable);
	
	List<Member> findAll();

	List<Member> findAll(Sort sort) ;

	
	void flush() ;

	<S extends Member> S saveAndFlush(S entity);

	<S extends Member> List<S> findAll(Example<S> example);
	
	<S extends Member> List<S> findAll(Example<S> example, Sort sort);



}