package libary

class Category {
    String code
    String name

    static hasMany = [subjects:Subject]

    static constraints = {
    }
}
