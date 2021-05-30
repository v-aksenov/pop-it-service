package me.aksenov.springstarterjava;

import lombok.AllArgsConstructor;
import me.aksenov.springstarterjava.model.PopIt;
import me.aksenov.springstarterjava.service.PopItDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PopItController {

    private final PopItDao popItDao;

    @GetMapping("/get-by-color")
    public List<PopIt> getByColor(String color) {
        return popItDao.getByColor(color);
    }

    @PutMapping("/add")
    public void putPopIt(@RequestBody PopIt popIt) {
        popItDao.save(popIt);
    }
}
