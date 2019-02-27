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
public class Project extends Model<Project> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 赛事Id
     */
    private String matchId;

    /**
     * 项目名字
     */
    private String name;

    /**
     * 项目分类
     */
    private String classification;

    /**
     * 项目等级
     */
    private String grade;

    /**
     * 项目简介
     */
    private String introduce;

    /**
     * 项目背景
     */
    private String background;

    /**
     * 项目优势
     */
    private String advantage;

    /**
     * 项目市场分析
     */
    private String marketAnalysis;

    /**
     * 项目技术因素
     */
    private String technicalFactor;

    /**
     * 商业模式
     */
    private String businessModel;

    /**
     * 财务分析
     */
    private String financialAnalysis;

    /**
     * 风险预测及制约因素
     */
    private String riskAndConstraint;

    /**
     * 发展规划与创业愿景
     */
    private String planningAndVision;

    /**
     * 项目立项经费使用预算
     */
    private String fundAndBudget;

    /**
     * 项目预期成果
     */
    private String expectedResult;

    /**
     * 学院意见ID
     */
    private String collegeOpinionId;

    /**
     * 申请人承诺ID
     */
    private String applicantPromiseId;

    /**
     * 学校意见ID
     */
    private String universityOpinionId;

    /**
     * 团队id
     */
    private String teamId;

    /**
     * 审核状态
     */
    private String status;

    /**
     * 状态修改时间
     */
    private LocalDateTime changeTime;

    /**
     * 资助金额
     */
    private Integer supportSum;

    /**
     * 是否已并无法修改
     */
    private Integer isEnable;

    /**
     * 结项时间
     */
    private LocalDateTime deadlineTime;

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

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getMarketAnalysis() {
        return marketAnalysis;
    }

    public void setMarketAnalysis(String marketAnalysis) {
        this.marketAnalysis = marketAnalysis;
    }

    public String getTechnicalFactor() {
        return technicalFactor;
    }

    public void setTechnicalFactor(String technicalFactor) {
        this.technicalFactor = technicalFactor;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public String getFinancialAnalysis() {
        return financialAnalysis;
    }

    public void setFinancialAnalysis(String financialAnalysis) {
        this.financialAnalysis = financialAnalysis;
    }

    public String getRiskAndConstraint() {
        return riskAndConstraint;
    }

    public void setRiskAndConstraint(String riskAndConstraint) {
        this.riskAndConstraint = riskAndConstraint;
    }

    public String getPlanningAndVision() {
        return planningAndVision;
    }

    public void setPlanningAndVision(String planningAndVision) {
        this.planningAndVision = planningAndVision;
    }

    public String getFundAndBudget() {
        return fundAndBudget;
    }

    public void setFundAndBudget(String fundAndBudget) {
        this.fundAndBudget = fundAndBudget;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getCollegeOpinionId() {
        return collegeOpinionId;
    }

    public void setCollegeOpinionId(String collegeOpinionId) {
        this.collegeOpinionId = collegeOpinionId;
    }

    public String getApplicantPromiseId() {
        return applicantPromiseId;
    }

    public void setApplicantPromiseId(String applicantPromiseId) {
        this.applicantPromiseId = applicantPromiseId;
    }

    public String getUniversityOpinionId() {
        return universityOpinionId;
    }

    public void setUniversityOpinionId(String universityOpinionId) {
        this.universityOpinionId = universityOpinionId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(LocalDateTime changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(Integer supportSum) {
        this.supportSum = supportSum;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public LocalDateTime getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(LocalDateTime deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static final String ID = "id";

    public static final String MATCH_ID = "match_id";

    public static final String NAME = "name";

    public static final String CLASSIFICATION = "classification";

    public static final String GRADE = "grade";

    public static final String INTRODUCE = "introduce";

    public static final String BACKGROUND = "background";

    public static final String ADVANTAGE = "advantage";

    public static final String MARKET_ANALYSIS = "market_analysis";

    public static final String TECHNICAL_FACTOR = "technical_factor";

    public static final String BUSINESS_MODEL = "business_model";

    public static final String FINANCIAL_ANALYSIS = "financial_analysis";

    public static final String RISK_AND_CONSTRAINT = "risk_and_constraint";

    public static final String PLANNING_AND_VISION = "planning_and_vision";

    public static final String FUND_AND_BUDGET = "fund_and_budget";

    public static final String EXPECTED_RESULT = "expected_result";

    public static final String COLLEGE_OPINION_ID = "college_opinion_id";

    public static final String APPLICANT_PROMISE_ID = "applicant_promise_id";

    public static final String UNIVERSITY_OPINION_ID = "university_opinion_id";

    public static final String TEAM_ID = "team_id";

    public static final String STATUS = "status";

    public static final String CHANGE_TIME = "change_time";

    public static final String SUPPORT_SUM = "support_sum";

    public static final String IS_ENABLE = "is_enable";

    public static final String DEADLINE_TIME = "deadline_time";

    public static final String CREATE_TIME = "create_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Project{" +
        "id=" + id +
        ", matchId=" + matchId +
        ", name=" + name +
        ", classification=" + classification +
        ", grade=" + grade +
        ", introduce=" + introduce +
        ", background=" + background +
        ", advantage=" + advantage +
        ", marketAnalysis=" + marketAnalysis +
        ", technicalFactor=" + technicalFactor +
        ", businessModel=" + businessModel +
        ", financialAnalysis=" + financialAnalysis +
        ", riskAndConstraint=" + riskAndConstraint +
        ", planningAndVision=" + planningAndVision +
        ", fundAndBudget=" + fundAndBudget +
        ", expectedResult=" + expectedResult +
        ", collegeOpinionId=" + collegeOpinionId +
        ", applicantPromiseId=" + applicantPromiseId +
        ", universityOpinionId=" + universityOpinionId +
        ", teamId=" + teamId +
        ", status=" + status +
        ", changeTime=" + changeTime +
        ", supportSum=" + supportSum +
        ", isEnable=" + isEnable +
        ", deadlineTime=" + deadlineTime +
        ", createTime=" + createTime +
        "}";
    }
}
