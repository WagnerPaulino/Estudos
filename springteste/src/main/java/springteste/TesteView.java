package springteste;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class TesteView {
	
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Olá mundo";
	}
	public static void main(String[] args) throws Exception{
		SpringApplication.run(TesteView.class, args);
	}
}
