package com.eergun.mobilet.entity;

import com.eergun.mobilet.entity.enums.JobTitle;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblemployee")
public class Employee extends Person{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long wage;
	JobTitle jobTitle;
}