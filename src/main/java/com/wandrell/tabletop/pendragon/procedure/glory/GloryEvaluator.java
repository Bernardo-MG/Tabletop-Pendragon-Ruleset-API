package com.wandrell.tabletop.pendragon.procedure.glory;

import com.wandrell.tabletop.pendragon.model.character.PendragonCharacter;

public interface GloryEvaluator {

    public Integer getGlory();

    public String getName();

    public Boolean isApplicable(final PendragonCharacter character);

}
