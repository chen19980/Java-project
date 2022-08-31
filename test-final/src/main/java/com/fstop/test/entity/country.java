package com.fstop.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "countries")
public class country {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
}
