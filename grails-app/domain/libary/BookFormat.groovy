package libary

//book,newspaper,...
class BookFormat {
    String code
    String name
    String description

    static constraints = {
        code nullable: false
        name nullable: false
        description nullable: true
    }
}
