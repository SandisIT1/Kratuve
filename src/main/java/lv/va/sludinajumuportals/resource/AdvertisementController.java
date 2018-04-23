package lv.va.sludinajumuportals.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdvertisementController 
{
    public String htmlGet = 
    //HTML Kods - Get Metode nostradas, kad nospiedisim pogu         
    "<form method=\"get\" action=\"status\" class=\"inline\"><button type=\"submit\" class=\"link-button\">\nGet Status\n</button>\n</form>";
    
    //1) Gadijuma, ja ierakstisim 'http://localhost:9040/' tad izvadis '11. Majasdarbs - A' + 'Get Status' Poga
    @GetMapping(value = "/")
    @ResponseBody
    public String nextTestEndpoint()
    {
        return ("<b>11. MajasDarbs - A Variants</b> <br></br>")+htmlGet;
    }
    
    //2) Gadijuma, ja ierakstisim 'http://localhost:9040/majas' tad izvadis '11.Majasdarbs - B' + Bez 'Get Status' Pogas
    @GetMapping(value = "/majas")
    @ResponseBody
    public String testEndpoint()
    {
        return "<i>11.MajasDarbs - B Variants</i> <br></br>"; //+htmlGet; <-- Nonemam Pogu 
    }
    
}