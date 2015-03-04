package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.pendragon.model.stats.PendragonSkillBox;

public interface IndividualDifferencesRulesetService {

    public Integer getExcellentSkillValue();

    public Integer getExtraSkillMaxPicks();

    public Integer getExtraSkillValue();

    public Integer getNoCombatSkillsPoints();

    public Integer getSkillRaiseValue();

    public Boolean isAbleToBecomeExcellentSkill(final PendragonSkillBox skill);

    public Boolean isAbleToBecomeExtraSkill(final PendragonSkillBox skill);

    public Boolean isAbleToGetSkillRaise(final PendragonSkillBox skill);

}
