package libary

class ImportBook {
    String code
    Long totalBooks
    Date importDate
    Long createdBy

    //static belongsTo = [supplier:Supplier,staff:Staff]
    //static hasMany = [book:Book]


    static constraints = {
        code nullable: false
        totalBooks nullable: true
        importDate nullable: true
        createdBy nullable: false
    }
}
