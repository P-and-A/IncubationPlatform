package com.incubationplatform.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcf
 * @since 2019-02-27
 */
public class Colleage extends Model<Colleage> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 二级学院名字
     */
    private String name;

    private Integer pid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String PID = "pid";

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Colleage{" +
        "id=" + id +
        ", name=" + name +
        ", pid=" + pid +
        "}";
    }
}
