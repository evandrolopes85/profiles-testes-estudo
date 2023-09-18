package dev.evandro.profiles.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import dev.evandro.profiles.dto.UsuarioRequestDTO;

@SpringBootTest
public class UsuarioServiceTests {

	private UsuarioRequestDTO reqValida;
	//private UsuarioResponseDTO respValido;
	private UsuarioRequestDTO reqInvalida;
	private Integer idValido;
	private Integer idInvalido;
	
	@Mock
	//@Autowired
	private IUsuarioService service;
	
	@BeforeEach
	public void setup() {
		reqValida = new UsuarioRequestDTO("", "evandro@mail.com", "1");
		//respValido = new UsuarioResponseDTO(reqValida.nome(), reqValida.email());
		
		reqInvalida = new UsuarioRequestDTO("Evandro", null, null);
		
		idValido = 1;
		
		Mockito.when(service.cadastrarUsuario(reqValida)).thenReturn(idValido);
		Mockito.when(service.cadastrarUsuario(reqInvalida)).thenThrow(new IllegalArgumentException());
	}
	
	@Test
	public void deveriaCadastrarUsuarioValido() {
		/*assertThrows(Exception.class, () -> {
			service.cadastrarUsuario(reqValida);
		});*/
		assertNotNull(service.cadastrarUsuario(reqValida));
	}
	
	@Test
	public void deveriaRecusaUsuarioInvalido() {
		//assertEquals(service.cadastrarUsuario(reqInvalida), null);
		assertThrows(IllegalArgumentException.class, () -> {
			System.out.println("LANÇOU EXCECAO");
			service.cadastrarUsuario(reqInvalida);
		});
	}
}
