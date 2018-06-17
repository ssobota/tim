package tim.wat.laboratorium;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class LiczbyServiceImpl implements LiczbyService
{
    @Override
    public List<Integer> getRandomNumbers(int amount)
    {
        if(amount < 1) {
            return null;
        }

        List<Integer> numbers = new LinkedList<>();
        Random r = new Random();

        for(int i = 0;i<amount;i++)
        {
            numbers.add(r.nextInt(1000));
        }
        return numbers;
    }
}
