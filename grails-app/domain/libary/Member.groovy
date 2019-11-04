package libary

class Member {
    String fullName
    String memberShipCode
    Integer age
    String gender
    String address
    String phone
    String memberType
    Date dateOfMemberShip
    String status

    static belongsTo = [account:MemberAccount]

    static constraints = {
    }

    def beforeInsert(){
        dateOfMemberShip = new Date()
    }
}
