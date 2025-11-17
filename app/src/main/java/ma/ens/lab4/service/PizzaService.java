package ma.ens.lab4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ma.ens.lab4.dao.Idao;
import ma.ens.lab4.entities.Pizza;

public class PizzaService implements Idao<Pizza> {

    List<Pizza> pizzas = null;

    public PizzaService() {
        pizzas = new ArrayList<>();
    }

    @Override
    public boolean create(Pizza o) {
        return pizzas.add(o);
    }

    @Override
    public boolean delete(Pizza o) {
        return pizzas.remove(o);
    }

    @Override
    public boolean update(Pizza o) {
        return false;
    }

    @Override
    public Pizza findById(int id) {
        return pizzas.get(id);
    }

    @Override
    public List<Pizza> findAll() {
        return pizzas;
    }
}
