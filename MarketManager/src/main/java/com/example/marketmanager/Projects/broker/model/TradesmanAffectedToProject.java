package com.example.marketmanager.Projects.broker.model;

public class TradesmanAffectedToProject {
  private Long userId;
  private Long projectId;

  public TradesmanAffectedToProject(Long userId, Long projectId) {
    this.userId = userId;
    this.projectId = projectId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }
}
