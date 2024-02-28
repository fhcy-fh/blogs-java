package top.fhcy.study.biz.impl;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import top.fhcy.study.biz.StudyScheduleBiz;
import top.fhcy.study.entity.Study;
import top.fhcy.study.entity.StudySchedule;
import top.fhcy.study.service.StudyScheduleService;
import top.fhcy.study.service.StudyService;
import top.fhcy.study.vo.StudyScheduleDetailVo;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class StudyScheduleBizImpl implements StudyScheduleBiz {

    @Resource
    private StudyScheduleService studyScheduleService;

    @Resource
    private StudyService studyService;

    @Override
    public List<StudyScheduleDetailVo> listAll() {
        List<StudySchedule> studyScheduleList = studyScheduleService.listAll();
        List<Study> studyList = studyService.listAll();
        Map<String, Study> studyMap = studyList.stream().collect(Collectors.toMap(Study::getCode, Function.identity()));
        List<StudyScheduleDetailVo> result = Lists.newArrayList();
        studyScheduleList.forEach(item -> {
            StudyScheduleDetailVo studyScheduleDetailVo = new StudyScheduleDetailVo();
            studyScheduleDetailVo.setCode(item.getCode());
            studyScheduleDetailVo.setStudyCode(item.getStudyCode());
            studyScheduleDetailVo.setStudyDate(item.getStudyDate());
            studyScheduleDetailVo.setIsComplete(item.getIsComplete());
            if (studyMap.containsKey(item.getStudyCode())) {
                Study study = studyMap.get(item.getStudyCode());
                studyScheduleDetailVo.setStudyName(study.getName());
                studyScheduleDetailVo.setStudyDescription(study.getDescription());
            }
            result.add(studyScheduleDetailVo);
        });
        return result;
    }
}
