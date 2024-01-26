
import java.util.ArrayList;
/**
 * Represents a BookStore that manages a collection of novels.
 */
public class BookStore {
    private final String name;
    private final ArrayList<Novel> novels;
    /**
     * Constructor for creating a BookStore instance.
     *
     * @param name   The name of the BookStore.
     * @param novels The list of novels in the BookStore.
     */

    public BookStore(String name,
                     final ArrayList<Novel> novels) {
        if(name.equalsIgnoreCase("Amazon")) {
            this.name = ("Chapters");
        } else {
            this.name = name;
        }
        this.novels = new ArrayList<>();

    }
    /**
     * add novels in the BookStore with some sample data.
     * Note: This method is not called in the provided code.
     */
    private void addNovel() {

        novels.add(null);
        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(null);
        novels.add(new Novel(null, "author name 1", 0));
        novels.add(new Novel("", null, 0));
        novels.add(new Novel(null, "", 0));
        novels.add(new Novel("title 1", null, 0));
        novels.add(new Novel("", "", 0));
        novels.add(new Novel("", "author name 2", 0));
        novels.add(new Novel("title 2", null, 0));
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));

        System.out.println(novels.size());
        System.out.println(this.name);
    }
    /**
     * Prints titles of all novels in the BookStore.
     */
    public void printAllTitels() {
        for(Novel novel : novels) {
            if(novel != null) {
                if(novel.getTitle() != null) {
                    System.out.println(novel.getTitle().toUpperCase());
                }
            }
        }

    }
    /**
     * Prints titles containing a specified substring.
     *
     * @param substring      The substring to search for in titles.
     * @param caseSensitive  Whether the search is case-sensitive or not.
     */
    public void printTitlesContaining(String substring,
                                      boolean caseSensitive) {
        for(Novel novel : novels) {
            if(novel != null) {
                if(novel.getTitle() != null) {

                    String gettitle;
                    gettitle = novel.getTitle();

                    if(!caseSensitive) {
                        gettitle = gettitle.toLowerCase();
                        substring = substring.toLowerCase();
                    }

                    if(gettitle.contains(substring)) {
                        System.out.println(novel.getTitle());
                    }

                }
            }
        }
    }
    /**
     * Prints titles of a specified length.
     *
     * @param length The length of titles to filter.
     */
    public void printTitlesOfLength(int length) {
        for(Novel novel : novels) {
            if(novel != null) {
                if(novel.getTitle() != null) {

                    String title;
                    title = novel.getTitle();

                    if(title.length() == length) {
                        System.out.println(novel.getTitle());
                    }
                }
            }
        }
    }
    /**
     * Prints author names starting or ending with a specified substring.
     *
     * @param substring  the substring to search for in author names.
     */
    public void printNameStartsEndsWith(String substring) {
        for(Novel novel : novels) {
            if(novel.getTitle() != null) {

                substring = substring.toLowerCase();
                String authorname;
                authorname = novel.getAuthor().toLowerCase();
                {
                    if(substring.toLowerCase() == authorname.toLowerCase()) {
                        System.out.println(novel.getAuthor());
                    }
                }

            }

        }

    }
    /**
     * Gets the longest author name or title based on the specified property.
     *
     * @param property The property to determine whether to find the longest author name or title.
     * @return The longest author name or title.
     */
    public String getLongest(String property) {
        if(property != null) {
            if(property.equalsIgnoreCase("author")) {
                return findLongestAuthorName();
            }else if (property.equalsIgnoreCase("title")){
                return findLongestTitle();
            }
        }
        return null;
    }
    /**
     * Finds and prints the longest author name in the BookStore.
     *
     * @return The longest author name.
     */
    public String findLongestAuthorName(){
        String longestAuthor = null;
        for (Novel novel : novels)
        {
            String author;
            author= novel.getAuthor();
            if(author != null){
                if(longestAuthor == null || author.length() > longestAuthor.length())
                {
                    longestAuthor = author;
                }
            }
        }
        System.out.println(longestAuthor);
        return longestAuthor;

    }
    /**
     * Finds and prints the longest title in the BookStore.
     *
     * @return The longest title.
     */
    public String findLongestTitle() {
        String longestTitle = null;
        for(Novel novel : novels) {
            String title;
            title = novel.getTitle();
            if(title != null) {
                if(novel.getTitle() != null) {
                    if(longestTitle == null || title.length() > longestTitle.length()) {
                        longestTitle = title;
                    }
                }

            }
        }
        System.out.println(longestTitle);
        return longestTitle;

    }
    /**
     * Main method to run the BookStore program.
     *
     * @param args The command-line arguments. The first argument is expected to be the name of the BookStore.
     */
    public void main(String[] args) {
        if(args.length > 0) {
            String BookStoreNsme = args[0];

            ArrayList<Novel> novels = new ArrayList<>();

            BookStore firstBookStore = new BookStore(BookStoreNsme, novels);
            System.out.println("----------");
            firstBookStore.printAllTitels();
            System.out.println("----------");
            firstBookStore.printTitlesContaining("the", false);
            System.out.println("----------");
            firstBookStore.printTitlesContaining("the", true);
            System.out.println("----------");
            firstBookStore.printTitlesOfLength(13);
            System.out.println("----------");
            firstBookStore.printNameStartsEndsWith("aN");
            System.out.println("----------");
            firstBookStore.getLongest("auThOr");
            System.out.println("----------");
            firstBookStore.getLongest("tItLe");
        } else {
            System.out.println("Please provide the name of the BookStore as a command-line argument.");
        }
    }

}




