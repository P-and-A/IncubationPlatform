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
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 负责人名字
     */
    private String name;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    private String belongColleage;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private String role;

    /**
     * 该账号是否可用
     */
    private Integer isEnable;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBelongColleage() {
        return belongColleage;
    }

    public void setBelongColleage(String belongColleage) {
        this.belongColleage = belongColleage;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String PASSWORD = "password";

    public static final String PHONE = "phone";

    public static final String BELONG_COLLEAGE = "belong_colleage";

    public static final String CREATE_TIME = "create_time";

    public static final String ROLE = "role";

    public static final String IS_ENABLE = "is_enable";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "id=" + id +
        ", name=" + name +
        ", password=" + password +
        ", phone=" + phone +
        ", belongColleage=" + belongColleage +
        ", createTime=" + createTime +
        ", role=" + role +
        ", isEnable=" + isEnable +
        "}";
    }
}
