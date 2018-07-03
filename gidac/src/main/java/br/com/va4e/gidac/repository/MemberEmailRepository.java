package br.com.va4e.gidac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.MemberEmail;

@RepositoryRestResource(exported = false)
public interface MemberEmailRepository extends JpaRepository<MemberEmail, Long> {

	// Nai vai funcionar assim emails é hashset 
	//MemberEmail findByEmailAddress(@Param("emails") MemberEmail emails);
	
}