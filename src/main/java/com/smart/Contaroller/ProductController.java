package com.smart.Contaroller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.entities.ExpiryEntity;
import com.smart.entities.NewProductAddEntity;
import com.smart.entities.User;
import com.smart.repository.AddNewProductRepository;
import com.smart.repository.ExpiryRepositoty;
import com.smart.repository.UserRepository;
import com.smart.service.AddCategoryService;
import com.smart.service.ReportSubCategory;
import com.smart.service.SubsubCategoryService;

@Controller
@RequestMapping("/user")
public class ProductController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddCategoryService addCategoryService; 
	@Autowired
	private ReportSubCategory reportSubCategory;
	@Autowired
	private SubsubCategoryService subsubCategoryService;
 
	/*start Here going to add new data */
	@Autowired
	private AddNewProductRepository addNewProductRepository;
	@Autowired
	private ExpiryRepositoty expiryRepositoty;
	/*End Here going to add new data */
	
	@RequestMapping("/addnewproduct")
	public String dashboard(Model model,Principal principal) {
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		model.addAttribute("addcatagoryEntity",addCategoryService.getAlladdCategoryEntity());
		model.addAttribute("reportSubCategory",reportSubCategory.getReportSubCategory());
		 model.addAttribute("SubsubCategoryService",subsubCategoryService.getAlladdsubsubCategory());
		
		return "normal/addnewproduct";
	}
	
	@RequestMapping("/newproductadd")
	public String newproductadd(Model model,Principal principal,@ModelAttribute("NewProductAddEntity") NewProductAddEntity newProductAddEntity,@ModelAttribute("ExpiryEntity") ExpiryEntity expiryEntity)
	{
		String username=principal.getName();
		User user=userRepository.getUserByUserName(username);
		newProductAddEntity.setUsername(user.getName());
		addNewProductRepository.save(newProductAddEntity);
		expiryRepositoty.save(expiryEntity);
		
		
		return "normal/addnewproduct";
	}
	
}
