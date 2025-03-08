class Book
{
    String ISBN;
    String title;
    String author;
    Boolean isAvailable;

    public String getISBN()     { return ISBN;  }
    public String getTitle()    { return title; }
    public String getAuthor()   { return author;}
    public Boolean getIsAvailable() { return isAvailable; }

    //TODO: setters

    public void displayInfo()
    { 
        System.out.println("Books ISBN is : " + ISBN);
        System.out.println("Books bla bla bla");
    }
}   
