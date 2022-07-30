package max.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegisterController {

	@Autowired
	RegisterBean registerBean;
	@Autowired
	RegistValidation registValidation;
	@Autowired
	RegisterDAO registerDAO;
	
	@RequestMapping(value="open",method=RequestMethod.GET)
	public ModelAndView openJSP() {
		return new ModelAndView("register","opn",registerBean);
	}
	
	@RequestMapping(value="submit", method=RequestMethod.POST)
	public String submitLogin(@ModelAttribute("opn")RegisterBean registerBean, BindingResult br ) {
		registValidation.validate(registerBean, br);
		if(br.hasErrors()) {
			return "register";
		}
		System.out.println(registerBean.getPhone());
		return "success";
	}
	
	@ModelAttribute("slist")
	public List<StateBean> getStateList() {
		List<StateBean> state = registerDAO.getState();
		return state;
	}
	
//	@ModelAttribute("dlist")
//	public List<DistBean> getDistList() {
//		List<DistBean> dist = registerDAO.getDist();
//		return dist;
//	}

}
