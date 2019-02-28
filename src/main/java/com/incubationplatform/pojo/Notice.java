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
public class Notice extends Model<Notice> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 被通知者id
     */
    private String receiverId;

    /**
     * 结果
     */
    private String result;

    /**
     * 通知者id
     */
    private String informerId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private Integer classification;

    /**
     * 通知失效时间
     */
    private LocalDateTime delineTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInformerId() {
        return informerId;
    }

    public void setInformerId(String informerId) {
        this.informerId = informerId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public LocalDateTime getDelineTime() {
        return delineTime;
    }

    public void setDelineTime(LocalDateTime delineTime) {
        this.delineTime = delineTime;
    }

    public static final String ID = "id";

    public static final String TITLE = "title";

    public static final String CONTENT = "content";

    public static final String RECEIVER_ID = "receiver_id";

    public static final String RESULT = "result";

    public static final String INFORMER_ID = "informer_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CLASSIFICATION = "classification";

    public static final String DELINE_TIME = "deline_time";

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Notice{" +
        "id=" + id +
        ", title=" + title +
        ", content=" + content +
        ", receiverId=" + receiverId +
        ", result=" + result +
        ", informerId=" + informerId +
        ", createTime=" + createTime +
        ", classification=" + classification +
        ", delineTime=" + delineTime +
        "}";
    }
}
