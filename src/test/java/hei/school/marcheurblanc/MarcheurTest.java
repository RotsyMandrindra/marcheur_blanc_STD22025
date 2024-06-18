package hei.school.marcheurblanc;

import hei.school.marcheurblanc.localisation.Carte;
import hei.school.marcheurblanc.localisation.Lieu;
import hei.school.marcheurblanc.localisation.Rue;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarcheurTest {
    private static final Logger log = LoggerFactory.getLogger(MarcheurTest.class);

    @Test
    void test_Bjarni(){
        Lieu HEI = new Lieu("HEI");
        Lieu Pullman = new Lieu("Pullman");
        Lieu balancoire = new Lieu("balancoire");
        Lieu sekolintsika = new Lieu("sekolintsika");
        Lieu marais = new Lieu("marais");
        Lieu nexta = new Lieu("nexta");
        Lieu BoulevardDeLEurope = new Lieu("BoulevardDeLEurope");
        Lieu ESTI = new Lieu("ESTI");

        Rue rue1 = new Rue(HEI, Pullman, "Andriatsihoarana");
        Rue rue2 = new Rue(Pullman, nexta, "");
        Rue rue3 = new Rue(HEI, sekolintsika, "");
        Rue rue4 = new Rue(sekolintsika, marais, "");
        Rue rue5 = new Rue(HEI, balancoire, "");
        Rue rue6 = new Rue(Pullman, balancoire, "Ranaivo");
        Rue rue7 = new Rue(ESTI, balancoire, "");
        Rue rue8 = new Rue(balancoire, BoulevardDeLEurope, "");
        Rue rue9 = new Rue(BoulevardDeLEurope, ESTI, "");

        List<Lieu> lieux = new ArrayList<>();
        lieux.add(marais);
        lieux.add(sekolintsika);
        lieux.add(HEI);
        lieux.add(balancoire);
        lieux.add(Pullman);
        lieux.add(nexta);
        lieux.add(BoulevardDeLEurope);
        lieux.add(ESTI);

        List<Rue> rues = new ArrayList<>();
        rues.add(rue1);
        rues.add(rue2);
        rues.add(rue3);
        rues.add(rue4);
        rues.add(rue5);
        rues.add(rue6);
        rues.add(rue7);
        rues.add(rue8);

        Carte carte = new Carte(lieux, rues, HEI, ESTI);

        Marcheur bjarni = new Marcheur("Bjarni");

        Marcher marcher = new Marcher(bjarni, carte);

        List<Lieu> lieus = marcher.marcher(HEI, ESTI);

        assertEquals(ESTI, lieus.getLast());

        System.out.println(lieus);
    }
}
