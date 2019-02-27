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
public class ProjectStatusRecord extends Model<ProjectStatusRecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String projectId;

    private LocalDateTime createTime;

    private String status;


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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static final String ID = "id";

    public static final String PROJECT_ID = "project_id";

    public static final String CREATE_TIME = "create_time";

    public static final String STATUS = "status";

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "ProjectStatusRecord{" +
        "id=" + id +
        ", projectId=" + projectId +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
