package com.incubationplatform.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcf
 * @since 2019-02-27
 */
public class ProjectTecher extends Model<ProjectTecher> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 教师ID号
     */
    private String teacherId;

    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static final String ID = "id";

    public static final String PROJECT_ID = "project_id";

    public static final String TEACHER_ID = "teacher_id";

    public static final String CREATE_TIME = "create_time";

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "ProjectTecher{" +
        "id=" + id +
        ", projectId=" + projectId +
        ", teacherId=" + teacherId +
        ", createTime=" + createTime +
        "}";
    }
}
