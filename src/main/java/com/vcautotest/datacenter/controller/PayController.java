import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler;

@RestController
@RequestMapping(value = "/api/pay")
public class PayController {

  @Autowired
  private PayService payService;

  @GetMapping("/query/{id}")
  public ResultVO<pay> getById(@PathVariable("id") String id) {
        
  }
}