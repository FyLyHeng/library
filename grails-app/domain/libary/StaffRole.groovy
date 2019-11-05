package libary

class StaffRole {
    String name
    String status
    String description

    static constraints = {
        name nullable: false
        status nullable: false
        description nullable: true
    }
}
