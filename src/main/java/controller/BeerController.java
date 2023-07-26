package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.Beer;
import org.springframework.stereotype.Controller;
import service.BeerService;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerByID(UUID id){

        log.debug("Get Beer by ID - in controller ");

        return beerService.getBeerByID(id);
    }
}
