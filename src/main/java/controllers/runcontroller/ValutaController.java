package controllers.runcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ValutaController {

    private ArrayList<Valuta> valutaRegister = new ArrayList<>();

    @GetMapping("/load")
    public void load() {
        Valuta sek = new Valuta("SEK",0.85);
        Valuta eur = new Valuta("EUR",8.85);
        Valuta usd = new Valuta("USD", 9.56);
        Valuta gbp = new Valuta("GBP", 11.84);

        valutaRegister.add(sek);
        valutaRegister.add(eur);
        valutaRegister.add(usd);
        valutaRegister.add(gbp);
    }

    @GetMapping("/beregnKurs")
    public double beregnKurs(Valuta val) {
        double kurs=0;
        for (Valuta enVal : valutaRegister) {
            if(enVal.getValuta().equals(val.getValuta())) {
                kurs = enVal.getKurs()*val.getKurs();
            }
        }
        return kurs;
    }
}
