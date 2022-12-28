package com.tuespot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.genertatepdf.service.GeneratePdf;


@Component
@RestController
@RequestMapping("/pdf")
public class Runner implements ApplicationRunner {

	private GeneratePdf generatePdf;
	
	
	@Autowired
	public Runner(GeneratePdf generatePdf) {
		this.generatePdf = generatePdf;
	}

	
	@Override
	@GetMapping("/pdf")
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" application start run");
		generatePdf.pdfCreation();
		System.out.println("pdf file got created");
	}
}
