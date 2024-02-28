package top.fhcy.study.service.impl;

import org.springframework.stereotype.Service;
import top.fhcy.common.utils.CodeUtils;
import top.fhcy.study.entity.StudySchedule;
import top.fhcy.study.mapper.StudyScheduleMapper;
import top.fhcy.study.service.StudyScheduleService;

import javax.annotation.Resource;

@Service
public class StudyScheduleServiceImpl implements StudyScheduleService {

    @Resource
    private StudyScheduleMapper studyScheduleMapper;

    @Override
    public void save(String studyCode, String studyDate) {
        StudySchedule studySchedule = new StudySchedule();
        studySchedule.setCode(CodeUtils.getUuid());
        studySchedule.setStudyCode(studyCode);
        studySchedule.setStudyDate(studyCode);
        studyScheduleMapper.insert(studySchedule);
    }
}
