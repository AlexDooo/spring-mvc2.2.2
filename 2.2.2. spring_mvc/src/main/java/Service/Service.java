package Service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import web.controller.Car;

import java.util.List;
@Controller
public interface Service {
    List<Car> getCars(@RequestParam("count") Integer count);
}
