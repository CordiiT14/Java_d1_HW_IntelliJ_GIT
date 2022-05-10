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

    @Test
    public void canPrint(){
        epson.print(5, 2);
        assertEquals(90, epson.getPaperSheets());
    }

    @Test
    public void insufficientPaperToPrint(){
        epson.print(51, 2);
        assertEquals(100, epson.getPaperSheets());
    }

}
