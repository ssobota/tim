package tim.wat.laboratorium;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/random")
public class LiczbyController
{

    @Autowired
    LiczbyService liczbyService;
    @RequestMapping(value = "/{amount}", method = RequestMethod.GET)

    public Map<String,Object> getRandomNumbers(@PathVariable("amount") int amount)
    {
        Map<String,Object> model = new HashMap<>();
        List<Integer> numbers = liczbyService.getRandomNumbers(amount);
        model.put("numbers",numbers);
        return model;
    }
}
