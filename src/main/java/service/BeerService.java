package service;

import model.Beer;
import java.util.UUID;

public interface BeerService {
    Beer getBeerByID(UUID id);
}
