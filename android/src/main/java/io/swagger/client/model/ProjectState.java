/**
 * HackZurich'18 Vertec 4.0
 * API for the HackZurich'18 Vertec 4.0 Project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProjectState {
  
  @SerializedName("_id")
  private String id = null;
  @SerializedName("project_id")
  private String projectId = null;
  @SerializedName("actual")
  private Long actual = null;
  @SerializedName("number_of_tasks")
  private Long numberOfTasks = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getActual() {
    return actual;
  }
  public void setActual(Long actual) {
    this.actual = actual;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getNumberOfTasks() {
    return numberOfTasks;
  }
  public void setNumberOfTasks(Long numberOfTasks) {
    this.numberOfTasks = numberOfTasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectState projectState = (ProjectState) o;
    return (this.id == null ? projectState.id == null : this.id.equals(projectState.id)) &&
        (this.projectId == null ? projectState.projectId == null : this.projectId.equals(projectState.projectId)) &&
        (this.actual == null ? projectState.actual == null : this.actual.equals(projectState.actual)) &&
        (this.numberOfTasks == null ? projectState.numberOfTasks == null : this.numberOfTasks.equals(projectState.numberOfTasks));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.actual == null ? 0: this.actual.hashCode());
    result = 31 * result + (this.numberOfTasks == null ? 0: this.numberOfTasks.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectState {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  actual: ").append(actual).append("\n");
    sb.append("  numberOfTasks: ").append(numberOfTasks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
