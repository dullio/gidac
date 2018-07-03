package br.com.va4e.gidac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GidacApplication {

	public static void main(String[] args) {
		SpringApplication.run(GidacApplication.class, args);
	}
	
	
	/* TODO: 
	 * Incluir Segurança (autenticação e autorização)
	 * Definir layout e criar os fragmentos (header, footer, menu, etc...)
	 * Usar HikariCP - ok
	 * Usar Versionamento
	 * Auditoria - dataCriacao dataAtuaizacao e ultimo usuário
	 * Atualizar i18n mensagens
	 * Criar páginas de erro customizadas
	 * Definir profiles local e remoto jar/war
	 * Modelos, anotação hibernate/jpa
	 * Sincronização com Contatos do Gmail.
	 * Envio de emails atraves de modelos
	 * Emails para aniversariantes
	 * Aniversariantes do mês
	 * escolha do tema
	 * escolha idioma
	 * confirmar recebimento de emails
	 * retirar da lista de e-mails destino mas manter cadastro/ tipo newsletters
	 * Login com Facebook e/ou G+
	 * CRUD e repositorios para modelos
	 * Validação dos formulários
	 * utilizat temas e idiomas
	 * Customização das páginas de erro! Whitelabel Error Page
	 * Log em arquivo e console unico (Log4J e AOP)
	 * Definir perfis para os diferentes tipos de base e servidores
	 * MySQL/Derby/TomCat/Spring
	 * Como persistir dados para databases embebed
	 * A utilização dos perfis deve ser dinâmica e caso as bases de dados não exisatam, deverão ser criadas....
	 * Como criar msg internacionalizada com variaveis no meio do texto
	 * Nos campos de auditoria ver os campos que não podem ser nulos e/ou atualizados
	 * layout.html > head, header, body, table, form, nav bar, side, footer, site map, 
	 * css
	 * endereo pelo cep
	 * responsivo
	 * resppnsivo smart, tablet, pc
	 * funcionamento com e sem javascript
	 */
}
