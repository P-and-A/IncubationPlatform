package com.incubationplatform.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcf
 * @since 2019-02-27
 */
public class MessageVideo extends Model<MessageVideo> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    /**
     * 视频链接
     */
    private String vedioUrl;

    /**
     * 标题图片
     */
    @TableField("titleImage")
    private String titleImage;

    /**
     * 来源
     */
    private String source;

    /**
     * 内容
     */
    private String content;

    /**
     * 0表示存在，1表示删除
     */
    private Integer status;

    private LocalDateTime createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVedioUrl() {
        return vedioUrl;
    }

    public void setVedioUrl(String vedioUrl) {
        this.vedioUrl = vedioUrl;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static final String ID = "id";

    public static final String TITLE = "title";

    public static final String VEDIO_URL = "vedio_url";

    public static final String TITLEIMAGE = "titleImage";

    public static final String SOURCE = "source";

    public static final String CONTENT = "content";

    public static final String STATUS = "status";

    public static final String CREATE_TIME = "create_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MessageVideo{" +
        "id=" + id +
        ", title=" + title +
        ", vedioUrl=" + vedioUrl +
        ", titleImage=" + titleImage +
        ", source=" + source +
        ", content=" + content +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
