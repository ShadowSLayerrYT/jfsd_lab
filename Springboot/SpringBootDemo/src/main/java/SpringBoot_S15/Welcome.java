package SpringBoot_S15;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {
  @GetMapping("/welcome")
  public String welcomePage() {
    return "This is welcome Page";
  }
  //@GetMapping("/home")
  //public String homePage() {
  //  return "This is Home Page";
  //}
}