package libary

class Account {
    String userName
    String email
    String password
    String role
    String status=true
    static hasOne = [member:Member,staff:Staff]
    static constraints = {

        userName nullable: false
        email email: true
        password nullable: false
        role nullable: false
        status nullable: false
    }
}
