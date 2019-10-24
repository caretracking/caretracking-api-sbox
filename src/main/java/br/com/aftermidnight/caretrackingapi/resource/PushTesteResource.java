package br.com.aftermidnight.caretrackingapi.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push")
public class PushTesteResource {

	@Autowired
	private ApplicationEventPublisher publisher; //publicador de application event
	

	@GetMapping
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("API");
	}
	
	
	@GetMapping("/push/{msg}")
	public ResponseEntity<String> push(@PathVariable String msg) {
		 return msg != null ? ResponseEntity.ok(msg) : ResponseEntity.notFound().build();
	}	
	
}
	