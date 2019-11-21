package io.turntabl.project.Model;

public class Project {
    private String p_name;
    private String p_description;

    public Project(String p_name, String p_description){
        this.p_name = p_name;
        this.p_description = p_description;
    }

    public String getP_name() {
        return p_name;
    }
    public String getP_description(){
        return p_description;
    }
}
