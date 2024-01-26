/**
 * Represents a novel with information about its title, author, and publication year.
 * Instances of this class are immutable.
 */
public class Novel
{
    private final String title;
    private final String author;
    private final int year;
    /**
     * Constructs a novel with the specified title, author, and publication year.
     *
     * @param title  The title of the novel.
     * @param author The author of the novel.
     * @param year   The publication year of the novel.
     */
    public Novel(final String title,
                 final String author,
                 final int year){
        this.title  = title;
        this.author = author;
        this.year   = year;
    }
    /**
     * Gets the title of the novel.
     *
     * @return The title of the novel.
     */
    public String getTitle(){ return title;}
    /**
     * Gets the author of the novel.
     *
     * @return The author of the novel.
     */
    public String getAuthor(){ return author;}
    /**
     * Gets the publication year of the novel.
     *
     * @return The publication year of the novel.
     */
    public int getYear(){return year;}

}
