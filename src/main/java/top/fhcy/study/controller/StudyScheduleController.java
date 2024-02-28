package top.fhcy.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fhcy.common.result.Result;
import top.fhcy.study.biz.StudyScheduleBiz;
import top.fhcy.study.vo.StudyScheduleDetailVo;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudyScheduleController {

    @Resource
    private StudyScheduleBiz studyScheduleBiz;

    /**
     * 查询所有日程
     * @return StudyScheduleDetailVo list
     */
    @GetMapping("/studySchedule/listAll")
    public Result<List<StudyScheduleDetailVo>> listALl() {
        List<StudyScheduleDetailVo> studyScheduleDetailVoList = studyScheduleBiz.listAll();
        return Result.success(studyScheduleDetailVoList);
    }
}
