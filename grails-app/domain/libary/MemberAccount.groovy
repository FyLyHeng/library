package libary

class MemberAccount {
    String userName
    String email
    String password
    String status=true
    String role
    static hasOne = [member:Member]
    static constraints = {
    }
}
