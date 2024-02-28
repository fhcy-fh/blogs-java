package top.fhcy.study.biz.impl;

import org.springframework.stereotype.Service;
import top.fhcy.common.utils.DateUtils;
import top.fhcy.study.biz.StudyBiz;
import top.fhcy.study.dto.StudyAddReq;
import top.fhcy.study.entity.Study;
import top.fhcy.study.enums.StudyGenerateScheduleEnum;
import top.fhcy.study.service.StudyScheduleService;
import top.fhcy.study.service.StudyService;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class StudyBizImpl implements StudyBiz {

    @Resource
    private StudyService studyService;

    @Resource
    private StudyScheduleService studyScheduleService;

    @Override
    public void add(StudyAddReq studyAddReq) {
        Study study = studyService.save(studyAddReq.getName(), studyAddReq.getDescription());
        for (StudyGenerateScheduleEnum value : StudyGenerateScheduleEnum.values()) {
            Date date = DateUtils.addDays(new Date(), value.getNum());
            studyScheduleService.save(study.getCode(), DateUtils.formatDate(date));
        }
    }
}
