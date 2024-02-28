package top.fhcy.study.service.impl;

import org.springframework.stereotype.Service;
import top.fhcy.common.utils.CodeUtils;
import top.fhcy.study.entity.Study;
import top.fhcy.study.mapper.StudyMapper;
import top.fhcy.study.service.StudyService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudyServiceImpl implements StudyService {

    @Resource
    private StudyMapper studyMapper;

    @Override
    public List<Study> listAll() {
        return studyMapper.selectList(null);
    }

    @Override
    public Study save(String name, String description) {
        Study study = new Study();
        study.setCode(CodeUtils.getUuid());
        study.setName(name);
        study.setDescription(description);
        studyMapper.insert(study);
        return study;
    }
}
