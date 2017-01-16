/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplemed.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author ansua
 */
public class DateUtil {
    
    public Date startOfDay(Date data) {
        
        Instant i1 = Instant.ofEpochMilli(data.getTime());
        LocalDateTime ldt = LocalDateTime.ofInstant(i1, ZoneId.systemDefault());          
        
        Instant i2 = ldt.atStartOfDay(ZoneId.systemDefault()).toInstant();
        Date data = Date.from(instant);           
        
        
        Instant instant = Instant.ofEpochMilli(data.getTime());
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());                
        
    }
    
    
}
