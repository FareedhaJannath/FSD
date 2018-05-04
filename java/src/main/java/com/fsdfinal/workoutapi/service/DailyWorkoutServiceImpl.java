/**
 * 
 */
package com.fsdfinal.workoutapi.service;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdfinal.workoutapi.dao.DailyWorkoutDAO;
import com.fsdfinal.workoutapi.dao.WorkoutDAO;
import com.fsdfinal.workoutapi.to.DailyWorkoutRequestTO;
import com.fsdfinal.workoutapi.to.DailyWorkoutResponseTO;
import com.fsdfinal.workoutapi.valueobject.DailyWorkout;
import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
@Service
public class DailyWorkoutServiceImpl implements DailyWorkoutService {
	@Autowired
	private WorkoutDAO workoutDAO;
	
	@Autowired
	private DailyWorkoutDAO dailyWorkoutDAO;
	 
	/**
	 * @see com.fsdfinal.workoutapi.service.DailyWorkoutService#getDailyWorkouts()
	 */
	@Override
	public List<DailyWorkout> getDailyWorkouts() {
		List<DailyWorkout> dailyWorkouts = dailyWorkoutDAO.getDailyWorkouts();
		return dailyWorkouts;
	}
	
	@Override
	public DailyWorkoutResponseTO saveDailyWorkout(DailyWorkoutRequestTO dailyWorkoutTO){
		DailyWorkoutResponseTO responseTO= new DailyWorkoutResponseTO();
		DailyWorkout dailyWorkout =new DailyWorkout();
		boolean success= false;
		
		dailyWorkout.setComment(dailyWorkoutTO.getComment());
		dailyWorkout.setStartDate(dailyWorkoutTO.getStartDate());
		dailyWorkout.setEndDate(dailyWorkoutTO.getEndDate());
		DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date startTime=null;
		Date endTime =null;
		try{
			startTime= sdf.parse(dailyWorkoutTO.getStartTime());
			endTime=   sdf.parse(dailyWorkoutTO.getEndTime());
		}catch(ParseException e){}
		
		dailyWorkout.setStartTime(new Time(startTime.getTime()));
		dailyWorkout.setEndTime(new Time(endTime.getTime()));
		dailyWorkout.setStatus(dailyWorkoutTO.getStatus());
		Workout workout = workoutDAO.getWorkoutById(dailyWorkoutTO.getWorkoutId());
		dailyWorkout.setWorkout(workout);
		success= dailyWorkoutDAO.saveDailyWorkout(dailyWorkout);
		responseTO.setSuccess(success);
		if(success){		
			if(responseTO.getMessage()==null) 
				responseTO.setMessage("Workout Saved Successfully");
		}
		else{
			if(responseTO.getMessage()==null) 
			responseTO.setMessage("Workout Save Failed");
		}
		return responseTO;
	}

	@Override
	public DailyWorkoutResponseTO deleteDailyWorkout(DailyWorkoutRequestTO dailyWorkoutTO) {
		DailyWorkoutResponseTO responseTO= new DailyWorkoutResponseTO();
		 DailyWorkout dailyWorkout = dailyWorkoutDAO.getDailyWorkoutById(dailyWorkoutTO.getDailyWorkoutId());
		 if(dailyWorkout!=null){
			 dailyWorkoutDAO.deleteDailyWorkout(dailyWorkout);
			 responseTO.setMessage("daily Workout Deleted successfully!!");
			 responseTO.setSuccess(true);
		 }else{
			 responseTO.setMessage("Daily Workout does not exist!!");
			 responseTO.setSuccess(false);
		 }
		 return responseTO;
	}
		

}
