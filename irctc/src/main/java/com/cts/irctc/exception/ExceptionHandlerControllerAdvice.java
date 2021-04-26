/***********************************************************************************************************
 * This class ExceptionHandlerControllerAdvice is used to handle different exceptions raised by Controller
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 *
************************************************************************************************************/


package com.cts.irctc.exception;


import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


public class ExceptionHandlerControllerAdvice {
	
	public ModelAndView handleResourceNotFound(final ApplicationException exception, final Model model) {
		
		//Add code here..
		/*
		ModelAndView mv=new ModelAndView();
		mv.setViewName("error");
		mv.addObject("errorMessage","From and to city can't be same");
		//add attribute error and timestamp
		mv.addObject("responseCode","400");//Add code here..
		/*
		 * 
		 */
		return null; //TODO, modify return value
	}
}
