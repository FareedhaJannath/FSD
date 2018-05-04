drop table workout_tracker.workout_collection;

CREATE TABLE workout_tracker.workout_collection (
workout_id INT AUTO_INCREMENT,
workout_title VARCHAR(100),
workout_note VARCHAR(500),
calories_burn_per_min FLOAT,
category_id INT,
PRIMARY KEY (workout_id));

drop table workout_tracker.workout_active;

CREATE TABLE workout_tracker.workout_active (
workout_act_id INT AUTO_INCREMENT,
workout_id INT,
start_time TIME,
start_date DATE,
end_time TIME,
end_date DATE,
comment VARCHAR(100),
status CHAR(1),
PRIMARY KEY (workout_act_id),
FOREIGN KEY (workout_id) 
REFERENCES workout_collection(workout_id));

select * from workout_active


CREATE TABLE workout_tracker.workout_category(
category_id INT AUTO_INCREMENT,
category_title VARCHAR(100),
PRIMARY KEY (category_id));