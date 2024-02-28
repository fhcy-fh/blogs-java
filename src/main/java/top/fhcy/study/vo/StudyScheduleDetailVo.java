package top.fhcy.study.vo;

import lombok.Data;

@Data
public class StudyScheduleDetailVo {

    private String code;

    private String studyCode;

    private String studyDate;

    private String studyName;

    private String studyDescription;

    private Boolean isComplete;
}
