package cn.edu.chd.domain;

/**
 * 课程实体类
 */
public class Course {
    //课程号
    private int id;
    //课程名称
    private String name;
    //学时
    private int hour;
    //学分
    private float credit;
    //课程描述
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hour=" + hour +
                ", credit=" + credit +
                ", description='" + description + '\'' +
                '}';
    }
}
