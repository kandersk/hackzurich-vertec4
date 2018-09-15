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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Task {
  
  @SerializedName("_id")
  private String id = null;
  @SerializedName("project_id")
  private String projectId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("budget")
  private Long budget = null;
  @SerializedName("start_date")
  private Date startDate = null;
  @SerializedName("end_date")
  private Date endDate = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getBudget() {
    return budget;
  }
  public void setBudget(Long budget) {
    this.budget = budget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return (this.id == null ? task.id == null : this.id.equals(task.id)) &&
        (this.projectId == null ? task.projectId == null : this.projectId.equals(task.projectId)) &&
        (this.name == null ? task.name == null : this.name.equals(task.name)) &&
        (this.description == null ? task.description == null : this.description.equals(task.description)) &&
        (this.budget == null ? task.budget == null : this.budget.equals(task.budget)) &&
        (this.startDate == null ? task.startDate == null : this.startDate.equals(task.startDate)) &&
        (this.endDate == null ? task.endDate == null : this.endDate.equals(task.endDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.budget == null ? 0: this.budget.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  budget: ").append(budget).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
