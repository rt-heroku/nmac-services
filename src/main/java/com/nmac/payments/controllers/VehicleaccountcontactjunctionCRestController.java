/*
 * Created on 7 Sep 2017 ( Time 17:05:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nmac.payments.model.ResponseMessage;
import com.nmac.payments.entities.VehicleaccountcontactjunctionC;
import com.nmac.payments.services.VehicleaccountcontactjunctionCService;

@Controller
@RequestMapping(value="/api/v1/vehicleaccountcontactjunctionc")
public class VehicleaccountcontactjunctionCRestController {
	
	private static Logger logger = LoggerFactory.getLogger(VehicleaccountcontactjunctionCRestController.class);
	
	@Autowired
	private VehicleaccountcontactjunctionCService vehicleaccountcontactjunctioncService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getAll() {

		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(vehicleaccountcontactjunctioncService.findAll());
		} catch (Exception e) {
			logger.error("VehicleaccountcontactjunctionCController -> getAll", e);
			responseMessage.setError(-1, "Unable to get page for VehicleaccountcontactjunctionC: " + e.getMessage());
		}
		return responseMessage;
	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(vehicleaccountcontactjunctioncService.findAll(page, records));
		} catch (Exception e) {
			logger.error("VehicleaccountcontactjunctionCController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for VehicleaccountcontactjunctionC: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("VehicleaccountcontactjunctionCService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(vehicleaccountcontactjunctioncService.count());
//		} catch (Exception e) {
//			logger.error("VehicleaccountcontactjunctionCController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all VehicleaccountcontactjunctionC: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

//	@RequestMapping(value="/page", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getPage(@RequestParam int page,@RequestParam int size) {
//
//		if (logger.isDebugEnabled())
//			logger.debug("VehicleaccountcontactjunctionCService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(vehicleaccountcontactjunctioncService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("VehicleaccountcontactjunctionCController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all VehicleaccountcontactjunctionC: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}
	
//	@RequestMapping(value="/elements", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getDropDownElements() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("VehicleaccountcontactjunctionCService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(vehicleaccountcontactjunctioncService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("VehicleaccountcontactjunctionCController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for VehicleaccountcontactjunctionC: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable Integer id) {
		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> getOne(" + id + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(vehicleaccountcontactjunctioncService.get(id));
		} catch (Exception e) {
			logger.error("VehicleaccountcontactjunctionCController -> create", e);
			responseMessage.setError(-1,
					"Unable to create VehicleaccountcontactjunctionC: " + id + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody VehicleaccountcontactjunctionC element) {

		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(vehicleaccountcontactjunctioncService.create(element));
		} catch (Exception e) {
			logger.error("VehicleaccountcontactjunctionCController -> create", e);
			responseMessage.setError(-1,
					"Unable to create VehicleaccountcontactjunctionC: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody VehicleaccountcontactjunctionC element) {
		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(vehicleaccountcontactjunctioncService.create(element));
		} catch (Exception e) {
			logger.error("VehicleaccountcontactjunctionCController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit VehicleaccountcontactjunctionC: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("VehicleaccountcontactjunctionCService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			vehicleaccountcontactjunctioncService.delete(id);
		} catch (Exception e) {
			logger.error("VehicleaccountcontactjunctionCController -> delete", e);
			responseMessage.setError(-1, "Unable to delete VehicleaccountcontactjunctionC: " + id + ",Error:"  + e.getMessage());
		}
		return responseMessage;
	}
	
	@ExceptionHandler(Exception.class)
	public @ResponseBody
	String handleException(Exception e, HttpServletResponse response) {
	    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	    return e.getMessage();
	}

}

