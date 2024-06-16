package com.example.springsecurityrestclient.schedular;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@AllArgsConstructor
public class CronService {

	
  @Autowired
  private RestClient restClientPassword;

  @Scheduled(cron = "0 */1 * * * *")
  public void performCronTask() {
	 String response= restClientPassword.get().uri("/products").retrieve().body(String.class);
	 System.err.println(response);
	 
	 response= restClientPassword.get().uri("/"+1l).retrieve().body(String.class);
	 System.err.println(response);
  }
}
