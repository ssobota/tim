package tim.wat.laboratorium;
import java.util.Map;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/average")
public class SredniaController
{

    @Autowired
    SredniaService sredniaService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Map<String,Object> getaverage(@RequestBody NaLiczby numbers)
    {
        Map<String,Object> model = new HashMap<>();
        double average = sredniaService.getaverage(numbers.getNumbers());
        model.put("average",average);
        return model;
    }
}


