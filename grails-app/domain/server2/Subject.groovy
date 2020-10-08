package server2

class Subject {
    String code
    String name
    String description

    //static hasMany = [books:Book]

    static constraints = {
        code nullable: false
        name nullable: false
        description nullable: true
    }
}
