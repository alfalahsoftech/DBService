package com.alfalahsoftech.jdk8;

import java.util.Arrays;
import java.util.List;

import com.alfalahsoftech.demo.TopicController;
import com.alfalahsoftech.demo.Topics;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserServiceImpl implements IUserService, ICrudService {

	
	@Override
	public List<Topics> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crateTopics() {
	System.out.println("UserServiceImpl.crateTopics()");
	try {
		System.out.println("Before Conversion Json====>  "  +TopicController.topics);
		String json = new ObjectMapper().writeValueAsString(TopicController.topics);
		System.out.println("After Conversion Json====>  "  +json);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//		ICrudService.super.crateTopics();
	
	}

	public static void main(String[] args) {
		IUserService uSrvc= new UserServiceImpl();
		uSrvc.crateTopics();
		IUserService.getTimeZone("US");
		ICrudService iSrvc= new UserServiceImpl();
		iSrvc.crateTopics();
	}

	

}
