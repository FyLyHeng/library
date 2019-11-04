package libary

class Return {

    String checkOutCode
    String bookBarcode
    Double depositAmount = 0.0
    Double penaltyAmount=0.0
    Integer totalBooks
    Date issusDate
    Date borrowed
    Date dueDate
    Long overDay
    Long createdBy
    String status

    static hasMany = [bookId:Book]
    static belongsTo = [menber:Member,librarian:Librarian]

    static constraints = {
    }
    def beforeInsert(){
        dueDate = new Date()
    }
}
