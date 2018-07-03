package br.com.va4e.gidac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.va4e.gidac.entity.MemberAddress;


@RepositoryRestResource(exported = false)
public interface MemberAddressRepository extends JpaRepository<MemberAddress, Long> {

	
	
	<S extends MemberAddress> S save(MemberAddress memberAddress);
	//TODO: Verificar se é necessário associar o endereço ao membro manualmente.

	void delete(MemberAddress memberAddress);

	

	
}