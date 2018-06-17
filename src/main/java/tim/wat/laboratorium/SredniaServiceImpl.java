package tim.wat.laboratorium;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SredniaServiceImpl implements SredniaService
{

    @Override
    public double getaverage(List<Integer> numbers)
    {
        if (numbers == null) {
            return -1;
        }
        double average = 0;

        for(Integer n: numbers)
        {
            average += n;
        }
        average /= numbers.size();
        return average;
    }
}
