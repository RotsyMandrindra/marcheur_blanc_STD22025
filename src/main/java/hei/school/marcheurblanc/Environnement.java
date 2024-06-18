package hei.school.marcheurblanc;

import hei.school.marcheurblanc.localisation.Lieu;
import hei.school.marcheurblanc.localisation.Rue;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Getter
@AllArgsConstructor

public class Environnement {
    private Lieu lieu1;
    private Lieu lieu2;
    private List<Rue> rues;
    private Map<Lieu, List<Lieu>> lieuxAccessibles;

    public Environnement(Map<Lieu, List<Lieu>> lieuxAccessibles) {
        this.lieuxAccessibles = lieuxAccessibles;
    }

}
