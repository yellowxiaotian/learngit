package com.shangcent.util;

import org.apache.log4j.HTMLLayout;
/**
 * ÷ÿ–¥HTMLLayout
 * @author yellow
 * @time 2015-06-13
 */
public class MailLayoutEvaluator extends HTMLLayout {
    @Override    
    public String getContentType()   
    {     
        return "text/html;charset=UTF-8";  
    }  
}
