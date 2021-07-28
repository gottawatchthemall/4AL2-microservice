package com.example.membershipmanager.request;

public class TradesmanAffectedToProjectRequest {

  private int projectId;
  private int workerId;

  public TradesmanAffectedToProjectRequest(int projectId, int workerId) {
    this.projectId = projectId;
    this.workerId = workerId;
  }

  public int getProjectId() {
    return projectId;
  }

  public void setProjectId(int projectId) {
    this.projectId = projectId;
  }

  public int getWorkerId() {
    return workerId;
  }

  public void setWorkerId(int workerId) {
    this.workerId = workerId;
  }
}
