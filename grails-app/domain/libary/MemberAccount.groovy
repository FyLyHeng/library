package libary

class MemberAccount {
    String userName
    String email
    String password
    String role
    String status=true
    static hasOne = [member:Member]

    static constraints = {
        userName nullable: false
        email email: true
        password nullable: false
        role nullable: false
        status nullable: false
    }
}
