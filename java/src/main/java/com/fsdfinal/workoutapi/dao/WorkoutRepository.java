/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
@Repository
public interface WorkoutRepository extends CrudRepository<Workout,Long>{

	
	public List<Workout> findAll();
	
	@SuppressWarnings("unchecked")
	public Workout save(Workout workout);
	
	/**
	 * @param 
	 * @return
	 */
	public Workout findByWorkoutId(Integer workoutId);
	
	/**
	 * @param 
	 * @return
	 */
	public Workout findByWorkoutTitle(String workoutTitle);
	
	public void delete(Workout workout);

}
