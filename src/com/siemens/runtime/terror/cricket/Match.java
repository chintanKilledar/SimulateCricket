/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2021, All Rights Reserved, Confidential
 */
package com.siemens.runtime.terror.cricket;

import java.util.List;

public class Match {
  
  private List<Team> teams;
  
  private String venue;

  private String wonTheToss;

  private String onStrikeBatsman;

  private String nonStikeBatsman;

  private MatchType type;

  private MatchResult result;

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public String getWonTheToss() {
    return wonTheToss;
  }

  public void setWonTheToss(String wonTheToss) {
    this.wonTheToss = wonTheToss;
  }

  public MatchType getType() {
    return type;
  }

  public void setType(MatchType type) {
    this.type = type;
  }

  public MatchResult getResult() {
    return result;
  }

  public void setResult(MatchResult result) {
    this.result = result;
  }

  public String getOnStrikeBatsman() {
    return onStrikeBatsman;
  }

  public void setOnStrikeBatsman(String onStrikeBatsman) {
    this.onStrikeBatsman = onStrikeBatsman;
  }

  public String getNonStikeBatsman() {
    return nonStikeBatsman;
  }

  public void setNonStikeBatsman(String nonStikeBatsman) {
    this.nonStikeBatsman = nonStikeBatsman;
  }

}
