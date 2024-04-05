package EscolaController.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SuppressWarnings("unused")
public class EscolaController {

	@GetMapping("/jogador")
    public String cadastroJogadorGet() {        
    
    return "CadastroJogador";

      }
 }