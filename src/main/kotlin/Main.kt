import kotlin.math.max

fun main(){
val car=Car("Subaru","legacy","Black",4)
    car.carry(3)
    car.carry(6)
    car.identity()
    val bus=Car.Bus("Honda","Typec","Blue",44)
bus.maxTripFare(34.0)
    bus.calculateParkingFees(3)

}

open class Car(var make: String,var model: String,var color: String,var capacity: Int) {
    fun carry(people: Int) {
        if (people <= capacity) {
            println("Carry $people passenger")
        } else if (people > capacity) {
            println("Over capacity by $people")
        }


    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var calculate = hours * 20
        return calculate
    }



    class Bus(make: String, model: String, color: String, capacity: Int) : Car(make, model, color, capacity) {
        fun maxTripFare(fare: Double): Double {
            return capacity * fare


        }

        override fun calculateParkingFees(hours: Int): Int {
            return super.calculateParkingFees(hours)
        }
        }


    }





