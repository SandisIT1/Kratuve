package lv.va.sludinajumuportals.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AvailabilityController //Izveidojam Controller Klasi
{
    public String status = "503 Service Unavailable"; //Defaultais Statuss
    
    //HTML Kods - Poga 'Get'
    public String htmlGet = "<form method=\"get\" action=\"\" class=\"inline\"><button type=\"submit\"class=\"link-button\">\n Get\n</button>\n</form>";
    
    //HTML Kods - Poga 'Post'
    public String htmlPost = "<form method=\"post\" action=\"\" class=\"inline\"><button type=\"submit\"class=\"link-button\">\n Post\n</button>\n</form>";
    
    @GetMapping(value = "/{id}")
    @ResponseBody
    public String getStatus(@PathVariable String id) // Metode - getStatus
    {
        return status+"</br>PathVariable = "+id+htmlPost+htmlGet; //Atgriezam PathVariable
    }
    
    @PostMapping(value = "/{id}")
    @ResponseBody
    public String setStatus(@PathVariable String id) // Metode - setStatus
    {
        if ("503 Service Unavailable".equals(status)) // Situacija-1
        {
            status = "200 OK";
        }
        if ("200 OK".equals(status)) // Situacija-2
        {
            status = "503 Service Unavailable";
        }
        else
        {
            status = "Default"; //Parejas Situacijas
        }
        return status+"</br>  PathVariable = "+id+htmlPost+htmlGet; //Atgriezam PathVariable
    }
}

