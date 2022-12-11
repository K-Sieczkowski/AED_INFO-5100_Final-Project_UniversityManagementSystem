/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class WorkQueueDirectory {
    private ArrayList<WorkRequest> workQueueList;
    
    public WorkQueueDirectory(){
        workQueueList = new ArrayList();
    }
    
    public void addRequestToQueue(WorkRequest workRequest){
        workQueueList.add(workRequest);
    }

    public ArrayList<WorkRequest> getWorkQueueList() {
        return workQueueList;
    }

    public void setWorkQueueList(ArrayList<WorkRequest> workQueueList) {
        this.workQueueList = workQueueList;
    }
    
    
}
