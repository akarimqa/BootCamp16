package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by ahmadkarim on 6/5/16.
 */
public class Search extends CommonAPI{

    @Test
    public void searchNews() throws InterruptedException{
        clickByCss("#search-button");
        Thread.sleep(1000);
        typeByCss("#search-input-field","Politics");
        takeEnterKeys("#search-input-field");
        Thread.sleep(3000);
    }
}
