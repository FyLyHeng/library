package libary

class Staff {
    String code
    String firstName
    String lastName
    String identify
    String gender
    Date dob
    String email
    String address
    String phone
    String position
    String status

    static hasOne = [account:Account]

    static constraints = {
        code nullable: false
        firstName nullable: true
        lastName nullable: true
        identify nullable: true
        gender nullable: true
        dob nullable: true
        email email: true
        address nullable: true
        phone nullable: false
        position nullable: false
        status nullable: false

    }
}
