package com.bezudar.music;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Abhishek Chavan
 * 
 */

public class AudioMetadataExtractorDemo {

	public static void main(String[] args) {

		String audioFileLoc = "C://Users//abhishek1136//Desktop//Music//Mora Saiyaan Mose Bole na-Fuzon.MP3";

		try {

			InputStream input = new FileInputStream(new File(audioFileLoc));
			ContentHandler handler = new DefaultHandler();
			Metadata metadata = new Metadata();
			Parser parser = new Mp3Parser();// Notice the Parser Used. If this parser is changed and I input a PDF File and user
											// PdfParser the metadata for the PDF File can be retrieved
			ParseContext parseCtx = new ParseContext();
			parser.parse(input, handler, metadata, parseCtx);
			input.close();

			// List all metadata
			String[] metadataNames = metadata.names();

			for (String name : metadataNames) {
				System.out.println(name + ": " + metadata.get(name));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
