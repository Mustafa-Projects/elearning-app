package in.ashokit.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import in.ashokit.Ticket;

public class XmlToJavaConverter {

	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Ticket.class);
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		File xmlFile =new File("ticket.xml");
		
		Ticket ticket = (Ticket)unmarshaller.unmarshal(xmlFile);
		
		System.out.println(ticket.getPassenger());
		System.out.println(ticket);
		

	}

}
