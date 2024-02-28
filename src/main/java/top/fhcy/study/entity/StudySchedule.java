package top.fhcy.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("study_schedule")
public class StudySchedule {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String code;

    private String studyCode;

    private String studyDate;

    private Boolean isComplete;
}
