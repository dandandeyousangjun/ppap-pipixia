/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.music.test;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Json2 {
    List<MyModel> result = MyModel.me.find("select * from my_table");
    renderJson(result);
    
}
