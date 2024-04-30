package br.com.ScreenPhrases.PhrasesScreen.Controller;



import br.com.ScreenPhrases.PhrasesScreen.SerieDTO.FraseDTO;
import br.com.ScreenPhrases.PhrasesScreen.Service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }
}

