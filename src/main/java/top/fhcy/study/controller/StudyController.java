package top.fhcy.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.fhcy.common.result.Result;
import top.fhcy.study.biz.StudyBiz;
import top.fhcy.study.dto.StudyAddReq;

import javax.annotation.Resource;

@RestController
public class StudyController {

    @Resource
    private StudyBiz studyBiz;

    /**
     * 添加学习点
     * @param studyAddReq studyAddReq
     * @return null
     */
    @PostMapping("/study/add")
    public Result<String> add(@RequestBody StudyAddReq studyAddReq) {
        studyBiz.add(studyAddReq);
        return Result.success();
    }
}
