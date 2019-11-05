package libary

class Book {
    String code
    String title
    String authors
    String edition
    String language
    Integer pageCount
    Long unitPrice
    Date publicAt
    Integer stockQty
    Boolean status

    static belongsTo = [subject:Subject]


    static constraints = {
        title nullable: false
        authors nullable: true
        edition nullable: true
        language nullable: true
        pageCount nullable: false,min: 1
        unitPrice nullable: true
        publicAt nullable: true
        stockQty nullable: false
        status nullable: false
    }
}
