/*
Create a class book which validates the arguments to be non null,
book should have a title, publisher, author, price

3. Using the Comparable interface sort an array of books.
        Allow the user to pass arguments on the command line to state which field to sort onpublic */
class Book implements Comparable<Book> {

    private String title, publisher, author;// variables
    private int price;

    //public static int sortingMethod = 1;  // sorting by title
    public static int sortingMethod = 2;    // sorting by author


    public Book(String title, String publisher, String author,int price)
    {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
    }

    public String toString()
    {
        return "\n\nTitle: " + title + "\nPublisher: " + publisher + "\nAuthor:  " + author + "\nPrice: " + price;
    }

    public void setSortingMethod(int i)
    {
        sortingMethod = i;
    }

    @Override
    public int compareTo(Book o) {
        if (sortingMethod == 1) {       //checks which method entered on line 13
            if (this.title.compareTo(o.title) > 1) { // comparing by title
                return 1;
            }
        }
        else if (sortingMethod == 2) //checks which method entered on line 13
        {
            if (this.author.compareTo(o.author) > 1) { // comparing by author
                return 1;
            }
        }
        else
        {
            if(this.price > o.price) // by price
            {
                return 1;
            }
        }
        return 0;
    }
}
