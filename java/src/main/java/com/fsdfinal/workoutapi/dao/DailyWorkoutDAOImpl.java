/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fsdfinal.workoutapi.valueobject.DailyWorkout;

/**
 * @author Fareedha
 *
 */

@Transactional
@Repository
public class DailyWorkoutDAOImpl implements DailyWorkoutDAO {
	/**
	 * Logger implementation for DAO Layer
	 */
	private static Logger log=Logger.getLogger(DailyWorkoutDAOImpl.class);
	/**
	 * Workout Repository
	 */
	@Autowired
	public DailyWorkoutRepository dailyWorkoutRepository;
	
		
	
	@Override
	public List<DailyWorkout> getDailyWorkouts() {
		log.info("In Get Daily Workouts");
		 return dailyWorkoutRepository.findAll();
	}
	
	/**
	 * @param workout
	 */
	public boolean saveDailyWorkout(DailyWorkout dailyWorkout){
		boolean successSave = false;
		
		
		dailyWorkout = dailyWorkoutRepository.save(dailyWorkout);
		
		if (dailyWorkout.getDailyWorkoutId()!=null)
			successSave=true;
		return successSave;
	}

	@Override
	public DailyWorkout getDailyWorkoutById(Integer workoutId) {
		return dailyWorkoutRepository.findByDailyWorkoutId(workoutId);
	}

	@Override
	public void deleteDailyWorkout(DailyWorkout workout) {
		dailyWorkoutRepository.delete(workout);
	}
	
    
	
	

}
