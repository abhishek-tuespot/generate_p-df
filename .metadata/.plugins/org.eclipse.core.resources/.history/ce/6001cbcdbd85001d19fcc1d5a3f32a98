package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pdf.service.PdfFileService;

@RestController
@RequestMapping("/pdf")
public class Runner  implements ApplicationRunner{

	private PdfFileService fileService;
	
	
	public Runner(PdfFileService fileService) {
		this.fileService = fileService;
	}



	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		fileService.pdfCreation();
		System.out.println("run application");
	}

}
