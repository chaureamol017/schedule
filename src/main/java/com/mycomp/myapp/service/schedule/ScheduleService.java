package com.mycomp.myapp.service.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

//	@Scheduled(cron = "*/2 * * * * *")
//	void job() throws InterruptedException {
//		System.out.println("Per 2 sec: Current time: " + new Date());
////		Thread.sleep(1000L);
//	}


	@Scheduled(cron = "0 * * * * *")
	void perMin() throws InterruptedException {
		System.out.println("Per min: Current time: " + new Date());
//		Thread.sleep(1000L);
	}
}
