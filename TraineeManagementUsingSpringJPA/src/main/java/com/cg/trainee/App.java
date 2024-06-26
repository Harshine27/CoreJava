package com.cg.trainee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.trainee.config.AppConfig;
import com.cg.trainee.entity.Trainee;
import com.cg.trainee.service.TraineeService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TraineeService traineeService = context.getBean("service",TraineeService.class);

		// Add trainees
		traineeService.addTrainee(new Trainee("Divya", "Java"));
		traineeService.addTrainee(new Trainee("Honey", "Javascript"));
		traineeService.addTrainee(new Trainee("harshine", "python"));
		traineeService.addTrainee(new Trainee("prashanti", "sql"));

			//printing 1st trainee info 
			//System.out.println(traineeService.getTraineeById(1));
			
			//removing trainee by id
			traineeService.removeTrainee(2);
			//updating trainee info
			//traineeService.updateTrainee(new Trainee(2,"Lucky", "Trainer"));
		// Get trainees
		List<Trainee> trainees = traineeService.getAllTrainees();
		for (Trainee trainee : trainees) {
			System.out.println("Id = " + trainee.getTraineeId());
			System.out.println("Name = " + trainee.getTraineeName());
			System.out.println("Batch Name = " + trainee.getTraineeBatch());
			System.out.println();
		}
	}
}
