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
public class StudentProject extends Model<StudentProject> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 学生id
     */
    private String userId;

    /**
     * 项目id
     */
    private String productId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static final String ID = "id";

    public static final String USER_ID = "user_id";

    public static final String PRODUCT_ID = "product_id";

    public static final String CREATE_TIME = "create_time";

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "StudentProject{" +
        "id=" + id +
        ", userId=" + userId +
        ", productId=" + productId +
        ", createTime=" + createTime +
        "}";
    }
}
