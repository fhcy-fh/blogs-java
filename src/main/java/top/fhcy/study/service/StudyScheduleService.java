package top.fhcy.study.service;

import top.fhcy.study.entity.StudySchedule;

import java.util.List;

public interface StudyScheduleService {

    List<StudySchedule> listAll();

    void save(String studyCode, String studyDate);

}
