package server2

class CheckOutBook {
    String checkOutCode
    Double depositAmount = 0.0
    Long totalBooks
    Long createdBy
    Date borrowDate
    Date returnDate

    //static hasMany = [bookId:Book]
    //static belongsTo = [member:Member,staff:Staff]
    static constraints = {
        checkOutCode nullable: false
        depositAmount nullable: false
        createdBy nullable: false
        returnDate nullable: false
        borrowDate nullable: false
        totalBooks nullable: false

    }

}
