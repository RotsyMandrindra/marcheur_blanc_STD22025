package hei.school.marcheurblanc;

import hei.school.marcheurblanc.localisation.Carte;
import hei.school.marcheurblanc.localisation.Lieu;
import hei.school.marcheurblanc.localisation.Rue;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Data
@NoArgsConstructor

public class Marcheur {
    private String nom;
    private List<Lieu> lieuDejaVisite;

    public Marcheur(String nom) {
        this.nom = nom;
        this.lieuDejaVisite = new ArrayList<>();
    }

}
