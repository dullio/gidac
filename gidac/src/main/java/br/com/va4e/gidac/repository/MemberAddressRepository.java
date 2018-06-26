package br.com.va4e.gidac.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.MemberAddress;



@RepositoryRestResource(path = "addresses",itemResourceRel = "members")
public interface MemberAddressRepository extends JpaRepository<MemberAddress, Long> {

	//******************CRUD Methods***********************
	
	//READ
	
	MemberAddress findOne(Long id);
	
	List<MemberAddress> findAll();

	List<MemberAddress> findAll(Sort sort) ;
	
	//UPDATE and CREATE
	
	<S extends MemberAddress> S saveAndFlush(MemberAddress entity);
	
	//DELETE

	void delete(Long id) ;
	
}