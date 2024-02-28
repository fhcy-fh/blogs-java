package top.fhcy.study.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 遗忘曲线时间枚举
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public enum StudyGenerateScheduleEnum {

    day_1(1),
    day_2(2),
    day_4(4),
    day_7(7),
    day_15(15),
    day_30(30),
    day_90(90),
    day_180(180)
    ;

    private Integer num;
}
