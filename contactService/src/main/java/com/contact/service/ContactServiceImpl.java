package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list=List.of(
			new Contact(1L,"a@a.com","aa",11L),
			new Contact(4L,"ss@a.com","fewf",11L),
			new Contact(2L,"fews@a.com","gr",12L),
			new Contact(3L,"f@a.com","esda",13L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
