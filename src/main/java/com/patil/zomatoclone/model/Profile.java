package com.patil.zomatoclone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
	int id;
	String name;
	String phone;
	String email;
	String city;
}
