package br.com.va4e.gidac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.Member;



@RepositoryRestResource(path = "members",itemResourceRel = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {

	
}