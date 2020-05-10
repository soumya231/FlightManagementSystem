package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.ScheduleFlight;

@Repository
public interface ScheduleDao extends JpaRepository<ScheduleFlight,Integer> {

}
