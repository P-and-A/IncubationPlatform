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
public class Award extends Model<Award> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 获奖者
     */
    private Integer winnerId;

    private String awardName;

    /**
     * 颁发单位
     */
    private String issuedUnit;

    private LocalDateTime issuedTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getIssuedUnit() {
        return issuedUnit;
    }

    public void setIssuedUnit(String issuedUnit) {
        this.issuedUnit = issuedUnit;
    }

    public LocalDateTime getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(LocalDateTime issuedTime) {
        this.issuedTime = issuedTime;
    }

    public static final String ID = "id";

    public static final String WINNER_ID = "winner_id";

    public static final String AWARD_NAME = "award_name";

    public static final String ISSUED_UNIT = "issued_unit";

    public static final String ISSUED_TIME = "issued_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Award{" +
        "id=" + id +
        ", winnerId=" + winnerId +
        ", awardName=" + awardName +
        ", issuedUnit=" + issuedUnit +
        ", issuedTime=" + issuedTime +
        "}";
    }
}
