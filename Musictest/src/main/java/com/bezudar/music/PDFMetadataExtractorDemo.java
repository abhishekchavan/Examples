package com.bezudar.music;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.pdf.PDFParser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Singaram Subramanian Extract metadata of an audio file using Apache Tika API
 * 
 */

public class PDFMetadataExtractorDemo {

	public static void main(String[] args) {

		// This audio file has metadata embedded in XMP (Extensible Metadata Platform) standard
		// created by Adobe Systems Inc. XMP standardizes the definition, creation, and
		// processing of extensible metadata.

		String audioFileLoc = "C://Users//abhishek1136//Desktop//Music//Rockstar-2011-320Kbps(Songs.PK)//JaspersoftETL_Pro_UG_v41b_EN.pdf";

		try {

			InputStream input = new FileInputStream(new File(audioFileLoc));
			ContentHandler handler = new DefaultHandler();
			Metadata metadata = new Metadata();
			Parser parser = new PDFParser();
			ParseContext parseCtx = new ParseContext();
			parser.parse(input, handler, metadata, parseCtx);
			input.close();

			// List all metadata
			String[] metadataNames = metadata.names();

			for (String name : metadataNames) {
				System.out.println(name + ": " + metadata.get(name));
			}

			// Retrieve the necessary info from metadata
			// Names - title, xmpDM:artist etc. - mentioned below may differ based
			// on the standard used for processing and storing standardized and/or
			// proprietary information relating to the contents of a file.

			// System.out.println("Title: " + metadata.get("title"));
			// System.out.println("Artists: " + metadata.get("xmpDM:artist"));
			// System.out.println("Genre: " + metadata.get("xmpDM:genre"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (TikaException e) {
			e.printStackTrace();
		}
	}
}
