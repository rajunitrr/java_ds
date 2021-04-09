package com.raju.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLTypeDemo {

	
	 private static String convertDocumentToString(Document doc) {
	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer;
	        try {
	            transformer = tf.newTransformer();
	            // below code to remove XML declaration
	            // transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	            StringWriter writer = new StringWriter();
	            transformer.transform(new DOMSource(doc), new StreamResult(writer));
	            String output = writer.getBuffer().toString();
	            return output;
	        } catch (TransformerException e) {
	            e.printStackTrace();
	        }
	        
	        return null;
	    }
	 
	private static HashMap<String, String> constructParamMap(String customVarXML) {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		//docBuilderFactory.setIgnoringElementContentWhitespace(true);
		//docBuilderFactory.setNamespaceAware(true);
		DocumentBuilder docBuilder = null;
		Document doc = null;
		InputSource is = new InputSource();
		HashMap<String, String> paramMap = null;
		try {
			if (customVarXML == null) {
				System.out.println("Custom Variable XML is null");
				return paramMap;
			}
			paramMap = new HashMap<String, String>();
			//customVarXML =trimXMLString(customVarXML);
			customVarXML = customVarXML.replaceAll(">[\\s\r\n]*<", "><");
			System.out.println("After trim"+customVarXML);
			is.setCharacterStream(new StringReader(customVarXML));
			//is.setEncoding(StandardCharsets.UTF_8.toString());
			docBuilder = docBuilderFactory.newDocumentBuilder();
			doc = docBuilder.parse(is);
			NodeList customVariables = doc.getDocumentElement().getChildNodes();
			if (customVariables != null && customVariables.getLength() > 0) {
				for (int i = 0; i < customVariables.getLength(); i++) {
					Node node = customVariables.item(i);
					if (node != null) {
						String customVarKey = node.getNodeName();
						String customVarVal = node.getTextContent();
						customVarVal = (customVarVal == null) ? "" : customVarVal;
						paramMap.put(customVarKey.trim(), customVarVal.trim());
					} else {
						continue;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	//	String utf8EncodedString = new String(paramMap., StandardCharsets.UTF_8);
		return paramMap;
	}

	public static String trimXMLString	(String input) {
	    BufferedReader reader = new BufferedReader(new StringReader(input));
	    StringBuffer result = new StringBuffer();
	    try {
	        String line;
	        while ( (line = reader.readLine() ) != null)
	            result.append(line.trim());
	        return result.toString();
	    } catch (IOException e) {
	       e.printStackTrace();
	    }
	    return null;
	}
	public static void main(String[] args) {
		String customXML = "<customvariables>"
				+ " <FF1>raju</FF1> </customvariables>";
		System.out.println("input XML\n "+customXML);
		HashMap<String, String> customData = constructParamMap(customXML);
		System.out.println(customData);
		Set<Entry<String, String>> customEntries = customData.entrySet();
		/*
		 * int i = 0; for (Map.Entry<String, String> keyPair : customEntries) {
		 * System.out.println("key" + keyPair.getKey()); System.out.println("value" +
		 * keyPair.getValue()); }
		 */

	}

}
