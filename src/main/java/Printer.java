public class Printer {

    private int paperSheets;

    public Printer(){
        this.paperSheets = 100;
    }

    public int getPaperSheets(){
        return paperSheets;
    }

    public void print(int printPages, int numberOfCopies){
        int totalSheets =  printPages * numberOfCopies;
        if (totalSheets < this.paperSheets) {
            paperSheets = paperSheets - totalSheets;
        } else {
            System.out.println("Not enough paper");
        }
    }

}
