/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplemed.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *
 * @author ansua
 */
public class DateUtil {
    
    public static Date startOfDay(Date data) {        
        Instant i = Instant.ofEpochMilli(data.getTime());
        LocalDateTime ldtStart = LocalDateTime.ofInstant(i, ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        
        ZonedDateTime zdt = ldtStart.atZone(ZoneId.systemDefault());
        Date sod = Date.from(zdt.toInstant());
        
        return sod;        
    }
    
    public static Date endOfDay(Date data) {        
        Instant i = Instant.ofEpochMilli(data.getTime());
        LocalDateTime ldtEnd = LocalDateTime.ofInstant(i, ZoneId.systemDefault()).toLocalDate().plusDays(1).atStartOfDay();
        
        ZonedDateTime zdt = ldtEnd.atZone(ZoneId.systemDefault());
        Date sod = Date.from(zdt.toInstant());
        
        return sod;        
    }
    
    public static LocalDateTime ldt(Date data) {
        
        Instant i = Instant.ofEpochMilli(data.getTime());
        LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
        
        return ldt;
    }
    
}
