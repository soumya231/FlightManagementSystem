package com.capgemini.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.capgemini.entity.Schedule;
import com.capgemini.entity.ScheduleFlight;

@Repository
public interface ScheduleDao extends JpaRepository<ScheduleFlight,Integer> {

	//void exists(ScheduleFlight scheduleFlight);

	/*@Query("Select d from ScheduleFlight d")
	ScheduleFlight getData();

	@Query("select s from ScheduleFlight s where s.scheduleId=?1")
	int fetchScheduleId(int sid);
*/
		
 
	
}
