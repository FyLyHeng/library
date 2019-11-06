package libary

class Member {
    String code
    String firstName
    String lastName
    String identifyNo
    String gender
    Date dob
    String address
    String phone
    //static belongsTo = [account:MemberAccount]

    static constraints = {
        code nullable: false
        firstName nullable: true
        lastName nullable: true
        identifyNo nullable: true
        gender nullable: true
        dob nullable: true
        address nullable: true
        phone nullable: false
    }
}
