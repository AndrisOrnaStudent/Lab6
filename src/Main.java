public class Main {

    public static void main(String[] args) {
        Book p = new Book("Books from the attic", "The O'Brien Press (05 October. 2020)", "Alice Taylor",12);
        Book q = new Book("ONCE UPON A TYNE", "SPHERE (03 September. 2020)", "Anthony David McPartlin",23);
        Book r = new Book("A PAGE FROM MY LIFE", "HARPERCOLLINSIRELAND (29 October. 2020)", "Ray D'Arcy",45);
        Book s = new Book("ONE FOR EVERYONE", "GILL BOOKS (09 October. 2020)", "Kathleen Watkins ",15);

        Book [] books = {p,q,r,s}; // putting books in array

        p.setSortingMethod(2); // choose sorting method

        sortBooks(books);

    }
    public static void sortBooks(Book [] input)
    {
        for(int i = 0; i < input.length -1; i++)
        {
            int least = i;

            for(int j = i+1; j < input.length; j++)
            {
                if(input[j].compareTo(input[least]) < 1)
                {
                    least = j;
                }
            }
            swap(input, i, least);
        }

        for(Book i : input)
        {
            System.out.println(i);
        }
    }

    public static void swap(Book [] input, int i, int j)
    {
        Book temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}
