package com.wandrell.tabletop.pendragon.framework.service;

public interface PendragonLocalizationService {

    public String getAdditionalBelongingsString(final String key);

    public String getButtonString(final String key);

    public String getDerivedAttributeString(final String key);

    public String getFamilyCharacteristicString(final String key);

    public String getLabelString(final String key);

    public String getRollTableString(String key);

    public String getSkillString(final String key);

    public String getTitleString(final String key);

    public String getTraitString(final String key);

}