/*
 * Created on 7 Sep 2017 ( Time 17:05:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nmac.payments.entities.VehicleaccountcontactjunctionC;
import com.nmac.payments.exceptions.VehicleaccountcontactjunctionCNotFoundException;
import com.nmac.payments.repository.VehicleaccountcontactjunctionCRepository;

@Service
@Transactional(rollbackFor=VehicleaccountcontactjunctionCNotFoundException.class)
public class VehicleaccountcontactjunctionCService 
{
	private static Logger logger = LoggerFactory.getLogger(VehicleaccountcontactjunctionCService.class);
	
	@Autowired
	private VehicleaccountcontactjunctionCRepository vehicleaccountcontactjunctioncRepository;
		
	/*
	 * READ methods
	 */
	public Page<VehicleaccountcontactjunctionC> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> findAll VehicleaccountcontactjunctionCs");
		
		return vehicleaccountcontactjunctioncRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<VehicleaccountcontactjunctionC> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> findAll VehicleaccountcontactjunctionCs");
		
		return vehicleaccountcontactjunctioncRepository.findAll();
	}
/*
	public VehicleaccountcontactjunctionC findBySfid(String vehicleaccountcontactjunctionc){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving VehicleaccountcontactjunctionC with sfid:" + vehicleaccountcontactjunctionc);
		
		return vehicleaccountcontactjunctioncRepository.findBySfid(vehicleaccountcontactjunctionc);
		
	}
*/
	public VehicleaccountcontactjunctionC get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving VehicleaccountcontactjunctionC with id:" + id);
		
		VehicleaccountcontactjunctionC elementToGet = vehicleaccountcontactjunctioncRepository.findOne(id);
		
		if (elementToGet == null)
			throw new VehicleaccountcontactjunctionCNotFoundException(id);
		
		return elementToGet;
	}

	public VehicleaccountcontactjunctionC create(VehicleaccountcontactjunctionC vehicleaccountcontactjunctionc) {

		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> create:" + vehicleaccountcontactjunctionc);
			
		return vehicleaccountcontactjunctioncRepository.save(vehicleaccountcontactjunctionc);
	}

	public VehicleaccountcontactjunctionC update(VehicleaccountcontactjunctionC vehicleaccountcontactjunctionc) {
		
		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> create:" + vehicleaccountcontactjunctionc);

		VehicleaccountcontactjunctionC elementToUpdate = vehicleaccountcontactjunctioncRepository.findOne(vehicleaccountcontactjunctionc.getId());
		
		if (elementToUpdate == null)
			throw new VehicleaccountcontactjunctionCNotFoundException(vehicleaccountcontactjunctionc.getName());
		
		elementToUpdate.update(vehicleaccountcontactjunctionc);
		vehicleaccountcontactjunctioncRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public VehicleaccountcontactjunctionC delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> delete:" + id);

		VehicleaccountcontactjunctionC elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new VehicleaccountcontactjunctionCNotFoundException(id);
		
		vehicleaccountcontactjunctioncRepository.delete(elementToDelete);

		return elementToDelete;
	}

}
