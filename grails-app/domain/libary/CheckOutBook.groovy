package libary

class CheckOutBook {
    String checkOutCode
    String bookBarcode
    Date borrowed
    Date due
    Double depositAmount=0.0
    String bookFormat
    String bookStatus
    Long createdBy
    Date returnDate

    static hasMany = [bookId:Book]
    static belongsTo = [menber:Member,staff:Staff]
    static constraints = {
    }

}
