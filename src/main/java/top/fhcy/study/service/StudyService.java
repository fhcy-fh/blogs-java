package top.fhcy.study.service;

import top.fhcy.study.entity.Study;

import java.util.List;

public interface StudyService {

    List<Study> listAll();

    Study save(String name, String description);

}
