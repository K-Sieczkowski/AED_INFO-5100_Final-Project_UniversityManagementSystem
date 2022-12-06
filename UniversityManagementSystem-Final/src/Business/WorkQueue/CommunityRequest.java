/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author ksiec
 */
public class CommunityRequest extends WorkRequest {
     String priorityLevel;
     String involvementType;
     String comments;

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getInvolvementType() {
        return involvementType;
    }

    public void setInvolvementType(String involvementType) {
        this.involvementType = involvementType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
}
