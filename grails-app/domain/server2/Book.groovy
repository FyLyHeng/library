package server2

class Book {
    String code
    String title
    String authors
    String edition
    String language
    Integer pageCount
    String bookBarcode
    Long unitPrice
    Date publicDate
    Integer stockQty

    //double requiredDeposit
    //static belongsTo = [subject:Subject]


    static constraints = {
        title nullable: false
        authors nullable: true
        edition nullable: true
        language nullable: true
        pageCount nullable: false,min: 1
        bookBarcode nullable: false
        unitPrice nullable: true
        publicDate nullable: true
        stockQty nullable: false
    }
}
