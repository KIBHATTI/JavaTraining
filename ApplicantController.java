package com.sbi.project.layer5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.project.layer2.Applicant;
import com.sbi.project.layer4.*;

@RestController
@RequestMapping("/applicant")
public class ApplicantController
{
	@Autowired
	ApplicationService applicantService;
	
	
	
	public ApplicantController()
	{
		System.out.println(" ApplicantController Constructor ");
	}
	@RequestMapping("/getApplicants")
	public List<Applicant> getAllApplicants()
	{
		System.out.println("/getApplicants");
		return applicantService.getAllApplicants();
	}
	
	
	@RequestMapping("/{appid}")
	public Applicant getapplicantonappid(@PathVariable("appid") int applicantToSearch) 
	{
		System.out.println("/{appid}");
		boolean applicantfound=false;
		Applicant applicantObj=null;
		List<Applicant> app = new ArrayList<Applicant>();
		app= applicantService.getAllApplicants();
		System.out.println("in applciant on app id");
		for(int i=0;i<app.size();i++)
		{
			System.out.println("in FOR");
			applicantObj=app.get(i);
			if(applicantObj.getApplicantid() == applicantToSearch)
			{
				applicantfound=true;
				break;
			}
		}
		if(applicantfound==true)
		{
			return applicantObj;
		}else
		{
			throw new RuntimeException("in else runtime exception");
			
		}
	}
	
	@RequestMapping("/addApp")
	public String addApplicant(@RequestBody Applicant appToAdd) 
	{
		boolean applicantfound=false;
		Applicant appObj=null;
		List<Applicant> app = new ArrayList<Applicant>();
		app= applicantService.getAllApplicants();
		System.out.println("in adding Applicant");
		for(int i=0;i<app.size();i++)
		{
			System.out.println("in for loop add applicant");
			
			appObj=app.get(i);
			if(appObj.getApplicantid() == appToAdd.getApplicantid())
			{
				applicantfound=true;
				break;
			}
		}
		if(applicantfound==true)
		{
			System.out.println("this record already exist");	
			return "this record already exist";
		}else {
			System.out.println("in else for ad applicant");
			app.add(applicantService.createApplicationService(appObj));
			//app.add(appObj);
			
			return "Applicant addedd"+appObj.toString();
		}
	}
	
	
}
