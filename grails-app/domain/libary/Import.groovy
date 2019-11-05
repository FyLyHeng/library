package libary

class Import {
    String code
    static belongsTo = [supplier:Supplier,staff:Staff]
    static hasMany = [book:Book]


    static constraints = {
    }
}
