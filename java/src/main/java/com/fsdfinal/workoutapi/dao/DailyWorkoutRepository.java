/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsdfinal.workoutapi.valueobject.DailyWorkout;

/**
 * @author Fareedha
 *
 */
@Repository
public interface DailyWorkoutRepository extends CrudRepository<DailyWorkout,Long>{

	
	public List<DailyWorkout> findAll();
	
	@SuppressWarnings("unchecked")
	public DailyWorkout save(DailyWorkout dailyWorkout);
	
	/**
	 * @param 
	 * @return
	 */
	public DailyWorkout findByDailyWorkoutId(Integer dailyWorkoutId);
	 
	public void delete(DailyWorkout dailyWorkout);

}
