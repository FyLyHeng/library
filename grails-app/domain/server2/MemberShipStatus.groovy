package server2

class MemberShipStatus {
    String name
    String description

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
