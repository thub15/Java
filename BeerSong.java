//BeerSong
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String Word = "bottles";

        while (beerNum > 0)  {
            if (beerNum == 1) {
                Word = "bottle"; //singular, as in bottle
            } // end if

            System.out.println(beerNum + " " + Word + " of beer on the wall");
            System.out.println(beerNum + " " + Word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;
        } // end while

        if (beerNum > 0) {
            System.out.println(beerNum + " " + Word + " of beer on the wall"); 
        } else {
            System.out.println("No more bottles of beer on the wall");
        } //end else

    } // end main method
} //end class