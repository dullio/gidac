package br.com.va4e.gidac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.Member;



@RepositoryRestResource(exported = false)
public interface MemberRepository extends JpaRepository<Member, Long> {
	
	List<Member> findByUserName(String username);

/*	@Query("SELECT c from Member c WHERE "
			//+ "CASE WHEN :#{#example.active} is not null THEN c.active=:#{#example.active} END "
			//+ "CASE WHEN :#{#example.active} is not null THEN AND c.active=:#{#example.active} END  AND"
			+ "c.firstName LIKE CONCAT(COALESCE(:#{#example.firstName},''),'%') "
			+ "AND c.lastName LIKE CONCAT(COALESCE(:#{#example.lastName},''),'%') "
			+ "AND c.userName LIKE CONCAT(COALESCE(:#{#example.userName},''),'%') "
			+ "AND c.cpf LIKE CONCAT(COALESCE(:#{#example.cpf},''),'%') "
			+ "AND c.rg LIKE CONCAT(COALESCE(:#{#example.rg},''),'%') "			
			+ "AND c.birthday = COALESCE(:#{#example.birthday},c.birthday) "
			+ "AND c.gender LIKE CONCAT(COALESCE(:#{#example.gender},''),'%') ")
			//+ "AND c.active = COALESCE(:#{#example.active != null ? (!#example.active ? NULL : #example.active) : NULL},COALESCE(c.active,FALSE)) "
			
	public List<Member> getFilteredMembers(@Param(value = "example") Member example, Pageable pageable);*/
}