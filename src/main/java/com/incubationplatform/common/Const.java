package com.incubationplatform.common;

/**
 * @author liaochaofan
 * @date 2019/3/1 11:01
 */
public class Const {

    public enum ProjectStatus{
        CollegePass(10,"学院审核通过"),
        CollegeNoPass(11,"学院审核未通过"),
        SchoolPass(20,"学校审核通过"),
        SchoolNoPass(21,"学校审核未通过");
        //审核状态码
        private int code;
        //审核状态
        private String status;

        ProjectStatus(int code, String status) {
            this.code = code;
            this.status = status;
        }

        public int getCode() {
            return code;
        }

        public String getStatus() {
            return status;
        }
    }
    public interface MessageClassification{
        String ANNOUNCEMENTS = "通知公告";
    }

}
