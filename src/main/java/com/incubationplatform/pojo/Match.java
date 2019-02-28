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
 * @since 2019-02-28
 */
public class Match extends Model<Match> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String content;

    /**
     * 报名开始时间
     */
    private LocalDateTime startTime;

    /**
     * 报名截至时间
     */
    private LocalDateTime endTime;

    /**
     * 二级学院审核最终时间
     */
    private LocalDateTime verifyTime;

    /**
     * 结项时间
     */
    private LocalDateTime finishTime;

    private Integer isEnable;

    private LocalDateTime createTime;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(LocalDateTime verifyTime) {
        this.verifyTime = verifyTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String CONTENT = "content";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String VERIFY_TIME = "verify_time";

    public static final String FINISH_TIME = "finish_time";

    public static final String IS_ENABLE = "is_enable";

    public static final String CREATE_TIME = "create_time";

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Match{" +
        "id=" + id +
        ", name=" + name +
        ", content=" + content +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", verifyTime=" + verifyTime +
        ", finishTime=" + finishTime +
        ", isEnable=" + isEnable +
        ", createTime=" + createTime +
        "}";
    }
}
