package com.biteNow.v1.data;

import com.biteNow.v1.entity.Menu;

import java.util.*;


public class MenuData {

    public List<Menu> restaurant1 = Arrays.asList(
            new Menu(1,"briyani",100.00,true),
            new Menu(2,"parato",300.00,true),
            new Menu(3,"mutton briyani",500.00,true)
    );

    public List<Menu> restaurant2 = Arrays.asList(
            new Menu(4,"Dosa",20.00,true),
            new Menu(5,"idly",40.0,true),
            new Menu(6,"paniyaram",60.0,true)
    );

    public List<Menu> restaurant3 = Arrays.asList(
            new Menu(7,"Tandoori",1000.00,true),
            new Menu(8,"Masala dosa",40.0,true),
            new Menu(9,"Egg rice",100.0,true)
    );



}
