package libary

class BookStatus {
    String name
    String description

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
