package io.turntabl.project.tranfer;

public class projectTo {
    private Integer p_id;
    private String p_name;
    private String p_description;

    public projectTo(Integer p_id, String p_name, String p_description) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_description = p_description;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    @Override
    public String toString() {
        return "projectTo{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_description='" + p_description + '\'' +
                '}';
    }
}
