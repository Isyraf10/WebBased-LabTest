package com.lab.model;

public class SessionBean {


    private int session_id;
    private String student_name;
    private String branch_location;
    private String lesson_type;
    private String status;

    // Empty constructor 
    public SessionBean() {}

    public SessionBean(int session_Id, String student_name,String branch_location, String lesson_type, String status) {
        this.session_id= session_id;
        this.student_name= student_name;
        this.branch_location= branch_location;
        this.lesson_type= lesson_type;
        this.status= status;
    }

    //Getters & Setters 
    public int getSessionId(){ 
        return session_id;}
    public void setSessionId(int session_id){ 
        this.session_id = session_id; }

    public String getStudentName(){ 
        return student_name; }
    public void setStudentName(String student_name){ 
        this.student_name = student_name; }

    public String getBranchLocation(){ 
        return branch_location; }
    public void setBranchLocation(String branch_location){ 
        this.branch_location = branch_location; }

    public String getLessonType(){ 
        return lesson_type; }
    public void setLessonType(String lesson_type) { 
        this.lesson_type = lesson_type; }
    
    public String getStatus(){ 
        return status; }
    public void setStatus(String status){ 
        this.status = status; }
}
