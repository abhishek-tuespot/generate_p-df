package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class TestClass {

	private static String FILE = "/home/tuespot-abhi/pdfGenerate/FirstPdf.pdf";
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
	public static final String IMAGE = "/home/tuespot-abhi/pdfGenerate/backgroung.png";


	
	
	public static void main(String[] args) throws IOException, DocumentException {
	    File file = new File(FILE);
	    file.getParentFile().mkdirs();
	    new TestClass().createPdf(FILE);
	}
	public void createPdf(String dest) throws IOException, DocumentException {
	    Document document = new Document(PageSize.A4.rotate());
	    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
	    document.open();
	    
//	    document.add(new Paragraph("Hello This is my first pdf poc !!!"));
	    PdfContentByte canvas = writer.getDirectContentUnder();
	    Image image = Image.getInstance(IMAGE);
	    image.scaleAbsolute(PageSize.A4.rotate());
	    image.setAbsolutePosition(0, 0);
	    canvas.addImage(image);
	    
//	    heading of pdf 
	    Paragraph paragraph = new Paragraph();
        paragraph.add("Hello World!");
        paragraph.setAlignment(Element.ALIGN_CENTER);
	    
//        text of pdf 
        Paragraph otherParagraph = new Paragraph();
        otherParagraph.add("Welcome to JCG!");
        otherParagraph.setAlignment(Element.ALIGN_CENTER);
        
//      text of pdf 
      Paragraph Paragraph1 = new Paragraph();
      Paragraph1.add("Paragraphs are medium-sized units of writing, longer than sentences, but shorter than sections, chapters, or entire works. Because they connect the “small” ideas of individual sentences to a “bigger” idea, paragraph structure is essential to any writing for organization, flow, and comprehension. \n"
      		+ "\n"
      		+ "Paragraphs are medium-sized units of writing, longer than sentences, but shorter than sections, chapters, or entire works. Because they connect the “small” ideas of individual sentences to a “bigger” idea, paragraph structure is essential to any writing for organization, flow, and comprehension. \n"
      		+ "\n"
      		+ "");
      Paragraph1.setAlignment(Element.ALIGN_LEFT);
      
//        adding the command to add text or image
        document.add(paragraph);
        document.add(otherParagraph);
        document.add(Paragraph1);
	    document.close();
	}

}

