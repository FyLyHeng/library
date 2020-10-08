package server2

class Supplier {
    String code
    String firstName
    String lastName
    String identifyNo
    String gender
    Date dob
    String email
    String address
    String phone
    String position

    static constraints = {
        code nullable: false
        firstName nullable: true
        lastName nullable: true
        identifyNo nullable: true
        gender nullable: true
        dob nullable: true
        email email: true
        address nullable: true
        phone nullable: false
        position nullable: false
    }
}
