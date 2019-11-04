package libary

class Book {
    Subject code
    String title
    String authors
    Long unitPrice
    String edition
    Integer qty
    Date publicAt
    Boolean isAvailable=true

    static belongsTo = [subject:Subject]


    static constraints = {
    }
}
