package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.dice.Dice;

public interface CharGenPersonalityTraitsService {

    public Integer getFamousTraitValue();

    public Dice getFemaleValorousReduction();

    public Integer getIndividualDifferencesPoints();

    public Integer getRandomPoints();

    public Dice getRandomRoll();

}