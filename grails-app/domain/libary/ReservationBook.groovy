package libary

class ReservationBook {
    String reservationCode
    Double depositAmount = 0.0
    Long totalBooks
    Long createdBy
    Date reservationDate
    Date borrowDate
    Date returnDate

    static constraints = {
        reservationCode nullable: false
        depositAmount nullable: true
        totalBooks nullable: false
        createdBy nullable: false
        reservationDate nullable: false
        borrowDate nullable: false
        returnDate nullable: false
    }
}
