package ca.store.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import ca.store.product.dto.RequestDTO;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/*@RequestMapping(value="/products", method = RequestMethod.POST)
	//public @ResponseBody RetunDTO jsonToDtoTranslation(@RequestBody final RequestDTO request){
	public @ResponseBody RetunDTO jsonToDtoTranslation(){
		return RetunDTO;
	}*/
	
	@Autowired
    RestTemplate restTemplate;
	
	@RequestMapping(value = "/service", method = RequestMethod.POST)
    public String postAction(Model model){
		System.out.println("Action");
        // Build URL
        StringBuilder url = new StringBuilder().
                        append("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products").
                        append("?rows=9").
                        append("&sort=lastModified").
                        append("&start=0").
                        append("&tag=lclonline/Product_Category/Grocery").
                        append("&view=grid");
        // Call service
        String result = restTemplate.getForObject(url.toString(), String.class);
        model.addAttribute("result", result);

        return "result";
    }

	
}
