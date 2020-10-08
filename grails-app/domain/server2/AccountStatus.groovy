package server2

class AccountStatus {
    String name
    String description

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
