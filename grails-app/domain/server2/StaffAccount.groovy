package server2

class StaffAccount {
    String userName
    String email
    String password
    //static hasOne = [staff:Staff]

    static constraints = {
        userName nullable: false
        email email: true
        password nullable: false
    }
}
