package com.incubationplatform.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcf
 * @since 2019-03-09
 */
public class Link extends Model<Link> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 链接名
     */
    private String name;

    /**
     * 链接图标
     */
    private String img;

    /**
     * 链接路径
     */
    private String url;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String IMG = "img";

    public static final String URL = "url";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Link{" +
        "id=" + id +
        ", name=" + name +
        ", img=" + img +
        ", url=" + url +
        "}";
    }
}
