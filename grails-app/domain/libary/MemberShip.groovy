package libary

class MemberShip {
    String memberShipCode
    Date dateOfMemberShip
    Date issueDate
    String description

    static constraints = {
        memberShipCode nullable: false
        dateOfMemberShip nullable: false
        description nullable: true
    }
    def beforSave(){
        issueDate=new Date()
    }
}
