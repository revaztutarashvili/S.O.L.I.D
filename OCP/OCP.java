
/*აქ მოვიყვან ლეგოს მაგალითს OCP-ის დარღვევით, რადგან ყოველი ახალი ტიპის შენობის პროექტისთვის კოდის
მოდიფიცირება იქნება საჭირო*/
public class LegoBuilder {
    public void build(String blockType) {

        if (blockType.equals("House")) {
            System.out.println(("Building House..."));
        }

        else (blockType.equals("Skyscraper")) {
                System.out.println("Building skyscraper...");
        }

        else if (blockType.equals("BusinessOffice")) {
            System.out.println("Building business office...");
        }
    }
}


/*____________________________________________________________________________________________
აქ კი მოვიყვან შესწორებულ მაგალითს, ანუ როდესაც შემიძლია ინტერფეისი დავაიმპლეტირო კლასში შენობის
ტიპების მიხედვით და მექნება კოდი რომელსაც ყოველ ახალ მიზანს მოვარგებ ძირეული კოდის შეუცვლელად.
* */

//შევქმენი ინტერფეისი რომელიც მიუწვდომელი იქნება შესაცვლელად
interface LegoBlock {
    void build();
}

//შევქმენი კლასი რომელიც იყენებს ძირეულ კოდს და აფართოებს მას ის რომ ვერ ცვლის ფერენთ კოდში არაფერს
class SkyscraperBlock implements LegoBlock {
    public void build() {
        System.out.println("Building skyscraper...");
    }
}
//შევქმენი კლასი რომელიც იყენებს ძირეულ კოდს და აფართოებს მას ის რომ ვერ ცვლის ფერენთ კოდში არაფერს
class BusinessOfficeBlock implements LegoBlock {
    public void build() {
        System.out.println("Building business office...");
    }
}

class LegoBuilder {
    public void build(LegoBlock block) {
        block.build();
    }
}

