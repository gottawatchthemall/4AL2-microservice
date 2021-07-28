package com.example.membershipmanager.request;

import lombok.Data;
import lombok.experimental.Accessors;

public class WorkerParticipateToProjectRequest {
  private int projectId;
  private int userId;

  public WorkerParticipateToProjectRequest(int projectId, int userId) {
    this.projectId = projectId;
    this.userId = userId;
  }

  public int getProjectId() {
    return projectId;
  }

  public void setProjectId(int projectId) {
    this.projectId = projectId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
