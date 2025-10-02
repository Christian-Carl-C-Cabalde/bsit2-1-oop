interface Borrowable {
    void borrowItem(String borrowerName);
    void returnItem();
    boolean isAvailable();
    int getBorrowingPeriod();
    default String getBorrowingStatus() { return isAvailable() ?
            "Available for borrowing" : "Currently borrowed"; }
}

abstract class LibraryItem {
    protected String itemId = "";
    protected String title = "";
    protected String author = "";
    protected boolean isCheckedOut = true;
    protected String borrowerName = "";

    public LibraryItem (String itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemInfo(){
        return
    }

    public String checkOut(String borrowerName){
        return borrowerName;
    }

    public String checkIn(){
        return
    }

    public abstract void getItemType();

    public abstract double calculateLateFee(int daysLate);
}


