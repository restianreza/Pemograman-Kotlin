// Interface
// deklarasi abstrack dan public

interface Vehicle {
    fun accelerate()
    fun stop()
}

enum class Direction { //membuat isian sendiri
    LEFT,
    RIGHT
}

interface DirectionVehicle {
    fun accelerate() //abstract method
    fun stop()
    fun turn(direction: Direction)
    fun description(): String //abstract method (returns String)
}

interface OptionalDirectionVehicle {
    fun turn(direction: Direction = Direction.LEFT)
}

interface SpaceVehicle {
    fun accelerate()
    fun stop() {
        println("Whoa, slow down!")
    }
}

interface VehicleProperties {
    val weight: Int //abstract
    val name: String
        get() = "Vehicle"
}

interface WheeledVehicle: Vehicle { //Mewarisi interface Vehicle
    val numberOfWheels: Int
    var wheelSize: Double
}

fun main() {
    class Unicycle: Vehicle {
        var peddling = false

        override fun accelerate() {
            peddling = true
        }

        override fun stop() {
            peddling = false
        }
    }

    //method in inheritances
    class OptionalDirection: OptionalDirectionVehicle {
        override fun turn(direction: Direction) {
            println(direction)
        }
    }

    val car = OptionalDirection()
    car.turn()// >LEFT
    car.turn(Direction.RIGHT) // >RIGHT

    //Default method Implementation
    class LightFreighter: SpaceVehicle {
        override fun accelerate() {
            println("Procced to hyperspace")
        }
    }

    val falcon = LightFreighter()
    falcon.accelerate() // >Procced to hyperspace
    falcon.stop() // >Whoa, slow down


    class StarShip:SpaceVehicle {
        override fun accelerate() {
            println("Warp factor 9 please!")
        }

        override fun stop() {
            super.stop() //memanggil method stop
            println("That kind of hurt!")
        }
    }

    val enterprise = StarShip()
    enterprise.accelerate()// >Warp factor 9 please!"
    enterprise.stop()// > Whoa, slow down & That kind of hurt!

    //Properties in interface
    class Car: VehicleProperties {
        override val weight: Int = 1000
    }

    class Bike: WheeledVehicle {
        var paddling = false
        var brakeApplies = false

        override val numberOfWheels: Int = 2
        override var wheelSize: Double = 622.0

        override fun accelerate() {
            paddling = true
            brakeApplies = false
        }

        override fun stop() {
            paddling = false
            brakeApplies = true
        }
    }

    class Tank: VehicleProperties {
        override val weight: Int
            get() = 1000
        override val name: String
            get() = "Tank"
    }


}