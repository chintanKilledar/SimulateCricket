/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2021, All Rights Reserved, Confidential
 */
package com.siemens.runtime.terror.cricket;

import java.util.Map;

public class Team {

  private String name;

  private Map<String, Player> players;

  private Stats stats;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String, Player> getPlayers() {
    return players;
  }

  public void setPlayers(Map<String, Player> players) {
    this.players = players;
  }

  public Stats getStats() {
    return stats;
  }

  public void setStats(Stats stats) {
    this.stats = stats;
  }

}
