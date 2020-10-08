package server2

class MemberShip {
    String memberShipCode
    Date dateOfMemberShip
    Date issueDate
    Date expiredDate
    String description

    static constraints = {
        memberShipCode nullable: false
        dateOfMemberShip nullable: false
        description nullable: true
        issueDate nullable: true
        expiredDate nullable: true
    }
}
