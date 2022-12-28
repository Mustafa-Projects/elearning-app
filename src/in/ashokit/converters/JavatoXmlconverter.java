package in.ashokit.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.ashokit.Passenger;
import in.ashokit.Ticket;

public class JavatoXmlconverter {
	public static void main(String[] args) throws Exception {
		Passenger passenger = new Passenger();
		
		passenger.setFname("Raju");
		passenger.setLname("rani");
		passenger.setPhno(1234567890l);
		
		
		
		
		Ticket ticket = new Ticket();
		
		ticket.setTicketId(1234);
		ticket.setStatus("Approved");
		ticket.setFrom("Hyd");
		ticket.setTo("pune");
		ticket.setPrice(550.50);
		ticket.setProvider("indigo");
		ticket.setPassenger(passenger);
		
		
		//convert java obj data into xml file using jax-b
		JAXBContext jaxbContext = JAXBContext.newInstance(Ticket.class);
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		marshaller.marshal(ticket,new File("ticket.xml"));
		
		System.out.println("XML File Created successfully...");
		
	}

}
