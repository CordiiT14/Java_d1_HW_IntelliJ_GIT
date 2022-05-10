import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer epson;

    @Before
    public void before(){
        epson = new Printer();
    }
    @Test
    public void hasSheetsOfPaper(){
        assertEquals(100, epson.getPaperSheets());
    }

}
