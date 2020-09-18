import com.vcautotest.datacenter.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler;

@RestController
@RequestMapping(value = "/api/cart")
public class CartController {

  @Autowired
  private CartService cartService;

  @GetMapping("/query/{productcode}")
  public ResultVO<cart> getByProductcode(@PathVariable("productcode") String id) {
        
  }
}