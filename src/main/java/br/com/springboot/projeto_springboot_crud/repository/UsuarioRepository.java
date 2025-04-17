package br.com.springboot.projeto_springboot_crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.projeto_springboot_crud.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	//upper(trim(u.nome)) upper para ignorar a letra maiúsculas ou minuscula. trim para tirar o espaço depois da variável. 
	@Query(value = "select u from Usuario u where upper(trim(u.nome)) like %?1%")
	List<Usuario> buscarPorNome(String name);
	
	
	
}
