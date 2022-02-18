/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import my.model.Menu;

/**
 *
 * @author khushpreetkaurgulati
 */
@WebService
public class MenuList {
    @WebMethod(operationName = "GetAllMenuItems")
    @WebResult(name = "MenuList")
    public List<Menu> getList()
    {
        
        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Item-1","Chicken Curry",300));
        menu.add(new Menu("Item-2","Fish Curry",200));
        menu.add(new Menu("Item-3","Mutton Curry",300));
        menu.add(new Menu("Item-4","Egg Curry",100));
        return menu;
    }
    }
    

