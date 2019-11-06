package libary

class MemberAccount {
    String userName
    String email
    String password
    //static hasOne = [member:Member]

    static constraints = {
        userName nullable: false
        email email: true
        password nullable: false
    }
}
