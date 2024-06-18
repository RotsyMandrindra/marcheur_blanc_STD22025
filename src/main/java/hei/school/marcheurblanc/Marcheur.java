package hei.school.marcheurblanc;

import hei.school.marcheurblanc.localisation.Lieu;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Data
public class Marcheur {
    private String nom;
    private List<Lieu> lieuDejaVisite;
    private Environnement environnement;

    public Marcheur(String nom, Environnement environnement) {
        this.nom = nom;
        this.lieuDejaVisite = new ArrayList<>();
        this.environnement = environnement;
    }

    public List<Lieu> marcher(Lieu depart, Lieu arrive){
        Random random = new Random();
        while (!depart.equals(arrive)){
            Map<Lieu, List<Lieu>> lieuxAccessiblesMap = environnement.getLieuxAccessibles();
            List<Lieu> lieuxDispo = lieuxAccessiblesMap.getOrDefault(depart, new ArrayList<>());

            Lieu choixSuivant = lieuxDispo.isEmpty()? depart : lieuxDispo.get(random.nextInt(lieuxDispo.size()));

            depart = choixSuivant;
            lieuDejaVisite.add(depart);
        }
        return lieuDejaVisite;
    }
}
