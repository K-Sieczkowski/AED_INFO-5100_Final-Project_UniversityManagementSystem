/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author ksiec
 */
public class AdvisingRequest extends WorkRequest {
    private String priorityLevel;
    private String advisingType;
    private String comments;

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getAdvisingType() {
        return advisingType;
    }

    public void setAdvisingType(String advisingType) {
        this.advisingType = advisingType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    @Override
    public String toString() {
        return priorityLevel;
    }
    
}
