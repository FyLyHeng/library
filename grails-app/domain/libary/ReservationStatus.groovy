package libary

//waiting,pending,...
class ReservationStatus {
    String name
    String description = null

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
