package com.riptide.xml.sax.parsers;

import java.io.File;

import javax.xml.parsers.*;


public class MovieXmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(new File("./src/moviedetails.xml"), new MovieXmlHandler());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
