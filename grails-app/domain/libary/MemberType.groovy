package libary

class MemberType {
    String name
    String description

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
