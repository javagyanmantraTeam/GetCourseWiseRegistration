package com.course.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.course.dto.ParticipantList;

@Controller
public class ParticipantsController {
	
	@RequestMapping(value="/participant_list.do",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody  List<ParticipantList> courseWiseParticipantsList(HttpServletRequest req,HttpServletResponse res) {
		
		
		String course=req.getParameter("course");
		
		List<ParticipantList> participantList=null;
		if(course.equals("mca")){
		System.out.println("mca is choosen");
		participantList=new ArrayList<ParticipantList>();
		participantList.add(new ParticipantList("23", "raja", "DC"));
		participantList.add(new ParticipantList("21", "raja KUMAR", "VC"));
		participantList.add(new ParticipantList("22", "raja K", "BC"));
		System.out.println(participantList);
		
		}
		return participantList;
	}
	
}
