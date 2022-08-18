package com.vti.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.NewDTO;
import com.vti.service.INewService;

//@Controller
@RestController
public class NewAPI {
  
  @Autowired
  private INewService newService; 
  
  //  @ResponseBody // Khi sử dụng RestController thì không cần dùng Anotation này nữa
  //	@RequestMapping(value = "/new", method = RequestMethod.POST) = @PostMapping 
  @PostMapping(value = "/new")
  public NewDTO createNew(@RequestBody NewDTO model) {
	  return newService.save(model); 
  } 
    
  @PutMapping(value = "/new")
  public NewDTO updateNew(@RequestBody NewDTO model) {
	  return model; 
  }
  
  @DeleteMapping(value = "/new")
  public void deleteNew(@RequestBody long[] ids) {
	  
  }
}
