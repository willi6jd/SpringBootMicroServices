package com.plainplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD operations for specimens
 * @author Administrator
 *
 */
public interface ISpecimenService {
	
	/**
	 * Get specimen from persistence layer
	 *@param is a unique lookup
	 *@return a specimen with a matching ID
	 */
	SpecimenDTO fetchByID(int id);
	
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */
	void save(SpecimenDTO specimenDTO);

}