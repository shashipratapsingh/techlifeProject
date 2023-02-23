
package com.smart.Contaroller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.entities.AddSubsubCategoryEntity;
import com.smart.entities.AddsubcatagoryEntity;
import com.smart.entities.CompanyProfileEntity;

import com.smart.entities.User;
import com.smart.entities.addcatagoryEntity;
import com.smart.repository.AddCatagory;
import com.smart.repository.CompanyProfileRepository;

import com.smart.repository.Subcatagory;
import com.smart.repository.SubsubcatetoryRepository;
import com.smart.repository.UserRepository;
import com.smart.service.AddCategoryService;
import com.smart.service.ReportSubCategory;
import com.smart.service.SubsubCategoryService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private AddCatagory addCatagory;
	
	@Autowired
	private AddCategoryService addCategoryService; 
/* sub category */
	@Autowired
	private Subcatagory subcatagory;
	
	@Autowired
	private ReportSubCategory reportSubCategory;
	
	/* for add the sub sub categpry */	
	@Autowired
	private SubsubcatetoryRepository subsubcatetoryRepository;
	@Autowired
	private SubsubCategoryService subsubCategoryService;

	/* company profile */
	@Autowired
	private CompanyProfileRepository companyProfileRepository;
	
	
	// dashboard home
	@RequestMapping("/index")
	public String dashboard(Model model,Principal principal) {
		String username=principal.getName();
		
		User user=userRepository.getUserByUserName(username);
		//System.out.println(user);
		return "normal/user_dashboard";
	}
	
	// add the catagory start
		
	@RequestMapping("/addcatogory")
	public String catogory(Model model,Principal principal) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		//System.out.println(user);
         model.addAttribute("addcatagoryEntity", addCategoryService.getAlladdCategoryEntity());
		  return "normal/addcatagory";
	}
	// add catagory end 
	
	//add addcatagory start
	@RequestMapping("/addcatagory")
	public String addcatagoryProcessing(Model model,Principal principal,@ModelAttribute("addcatagoryEntity") addcatagoryEntity addcatagoryEntity) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		addcatagoryEntity.setUsername(user.getName());
		addCatagory.save(addcatagoryEntity);
		
		return "normal/addcatagory";
	}
	
	
/* showing the report of  catagory */
	@RequestMapping("/Subcatogory")
	public String subcatogory(Model model,Principal principal) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		model.addAttribute("addcatagoryEntity", addCategoryService.getAlladdCategoryEntity());
		model.addAttribute("reportSubCategory",reportSubCategory.getReportSubCategory());
		return "normal/Subcatogory";
	}
	/*End showing the report of  catagory */
/* we have going to add sub category in the admin panal Start. */
	@RequestMapping("/Addsubcatagory")
	public String AddsubcatagoryProcessing(Model model,Principal principal,@ModelAttribute("AddsubcatagoryEntity") AddsubcatagoryEntity addsubcatagoryEntity) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		 addsubcatagoryEntity.setUsername(user.getName());
		 subcatagory.save(addsubcatagoryEntity);
		 
		
		return "normal/Subcatogory";
	}
	/* Here we have to redirect the sub-sub category page */ 
	@RequestMapping("/SubSubcatogory")
	public String redirectingSubsubCategoryPage(Model model,Principal principal,@ModelAttribute("AddsubcatagoryEntity") AddsubcatagoryEntity addsubcatagoryEntity) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		
		model.addAttribute("addcatagoryEntity", addCategoryService.getAlladdCategoryEntity());
		model.addAttribute("reportSubCategory",reportSubCategory.getReportSubCategory());
		 model.addAttribute("SubsubCategoryService",subsubCategoryService.getAlladdsubsubCategory());
		return "normal/subsubcategory";
	}
	/*End Here we have to redirect the sub-sub category page*/
	
	
	/* Add the data in sub sub category */ 
	@RequestMapping("/Addsubsubcatagory")
	public String processingSubsubCategoryPage(Model model,Principal principal,@ModelAttribute("AddSubsubCategoryEntity") AddSubsubCategoryEntity addSubsubCategoryEntity) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		
		subsubcatetoryRepository.save(addSubsubCategoryEntity);
		//model.addAttribute("SubsubCategoryService",subsubCategoryService.getAlladdsubsubCategory());
	  
		return "normal/subsubcategory";
	}
	/*End Add the data in sub sub category*/
/*********************************Deleteing Process***********************************************************************/
/* Delete data the sub sub table */
		

  @RequestMapping("/deleteSubsubcategory/{id}") 
  public String Subsubcategory(Model model,Principal principal,@PathVariable("id") int id) {
  {
	 
	  String username=principal.getName(); User
	  user=userRepository.getUserByUserName(username);
	  this.subsubCategoryService.deleteSubSubById(id);
	  return  "normal/subsubcategory"; 
  } 
}
  

		
		
		
		/*
		 * =================================addCategoryDelete=====================
		 */
		 
		
		
		@RequestMapping("/addCategoryDelete/{id}")
		public String category(Model model,Principal principal,@PathVariable("id") int id) 
			{
				System.out.println("hey");
				String username=principal.getName();
				User user=userRepository.getUserByUserName(username);
				this.addCategoryService.deletecategoryById(id);
				return "normal/addcatagory";
				
			}
	
/*************************************** Now We making on the company profile ***********************/	
		@RequestMapping("/companyProfile")
		public String companyProfile(Model model,Principal principal) 
		{
			String username=principal.getName();
			return "normal/companyProfile";
		}
		
		@RequestMapping("/companyprofile")
		public String addcompanyProfile(Model model,Principal principal,@ModelAttribute("CompanyProfileEntity") CompanyProfileEntity companyProfileEntity)
		{
			String username=principal.getName();
			User user=userRepository.getUserByUserName(username);
			companyProfileRepository.save(companyProfileEntity);
			
			return "normal/companyProfile";
		}
		
		
		
		
		
			
		
}
