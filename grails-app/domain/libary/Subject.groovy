package libary

class Subject {
    String code
    String name

    static hasMany = [books:Book]

    static constraints = {
    }
}
