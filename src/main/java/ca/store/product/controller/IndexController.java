package ca.store.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.HttpMessageConverter;

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
	
	@RequestMapping(value = "/json-db-translation/service.html", method = RequestMethod.POST)
    public String postAction(Model model){
		System.out.println("Action");
        // Build URL
        /*StringBuilder url = new StringBuilder().
                        append("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products").
                        append("?rows=9").
                        append("&sort=lastModified").
                        append("&start=0").
                        append("&tag=lclonline/Product_Category/Grocery").
                        append("&view=grid");
        // Call service
        String result = restTemplate.getForObject(url.toString(), String.class);
        model.addAttribute("result", result);*/
		
		String serviceUrl = "http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products";
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("start", "0");
		body.add("rows", "lastModified");
		body.add("view", "grid");
		body.add("tag", "lclonline/Product_Category/Grocery");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", "application/json");
		headers.setContentType(MediaType.APPLICATION_JSON);
		//headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<?> requestEntity = new HttpEntity<Object>(body, headers);
		
		/*List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(new MappingJacksonHttpMessageConverter());    
		messageConverters.add(new FormHttpMessageConverter());
		restTemplate.setMessageConverters(messageConverters);*/
		
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingJacksonHttpMessageConverter());
		restTemplate.setMessageConverters(converters);
		
		System.out.println(restTemplate.exchange(serviceUrl, HttpMethod.POST, requestEntity, String.class));

        return "result";
    }

	
}
