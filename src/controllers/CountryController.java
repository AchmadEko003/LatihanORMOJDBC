/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CountryDAO;
import entities.Country;
import entities.Region;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andi SR
 */
public class CountryController {

    private Connection connection;
    private CountryDAO cdao;
    private Country country;

    public CountryController() {
    }

    public CountryController(Connection connection, CountryDAO cdao, Country country) {
        this.connection = connection;
        this.cdao = cdao;
        this.country = country;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public CountryDAO getCdao() {
        return cdao;
    }

    public void setCdao(CountryDAO cdao) {
        this.cdao = cdao;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean insertCountry(Country country){
    return cdao.insertCountry(country);
    }
    
    public boolean updateCountry(Country country){
    return cdao.updateCountry(country);
    }
     public boolean deleteCountry(Country country){
     return cdao.deleteCountry(country);
     }

}
