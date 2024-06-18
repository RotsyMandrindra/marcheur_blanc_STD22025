package hei.school.marcheurblanc;

import hei.school.marcheurblanc.localisation.Carte;
import hei.school.marcheurblanc.localisation.Lieu;
import hei.school.marcheurblanc.localisation.Rue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Marcher {
    private Marcheur marcheur;
    private Carte carte;

    public List<Lieu> marcher(Lieu depart, Lieu arrive){
        Random random = new Random();
        do{
            List<Rue> rueDispo = carte.savoirLesRuesDisponibles(depart);
            Rue choisirUneRue = rueDispo.get(random.nextInt(rueDispo.size()));
            depart = choisirUneRue.savoirLeLieuAuBoutDeLaRue(depart);
            marcheur.getLieuDejaVisite().add(depart);
        }while (!depart.equals(arrive));
        return marcheur.getLieuDejaVisite();
    }
}
