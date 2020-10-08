package server2

class MemberType {
    String name
    String description

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
