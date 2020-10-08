package server2

class Category {
    String code
    String name
    String description

    //static hasMany = [subjects:Subject]

    static constraints = {
        code nullable: false
        name nullable: false
        description nullable: true
    }
}
