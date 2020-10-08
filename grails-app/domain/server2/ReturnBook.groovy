package server2

class ReturnBook {

    String code
    String checkOutCode = null
    String reservationCode = null
    Double penaltyAmount = 0.0
    Integer totalBooks
    Date reservationDate = null
    Date borrowedDate = null
    Date returnDate
    Long overDay = 0
    Long createdBy
    String status

    //static hasMany = [bookId:Book]
    //static belongsTo = [member:Member,staff:Staff]

    static constraints = {
        checkOutCode nullable: false
        reservationCode nullable: false
        penaltyAmount nullable: true
        totalBooks nullable: true
        reservationDate nullable: true
        borrowedDate nullable: true
        returnDate nullable: true
        overDay nullable: true
        createdBy nullable: false
        status nullable: true

    }
}
