class spaceCraft {
    class SpaceCraft {
        private var isConnectionAvailable: Boolean = false
        private var isEnginerInOrder: Boolean = false
        private var fuel: Int = 0
        var isInSpace: Boolean = false

        fun launch() {
            if (fuel < 5) {
                throw Exception("Out of full. Can't take off")
            }

            if (!isEnginerInOrder) {
                throw Exception("The Engine is broken, Can't take off")
            }
            if (!isConnectionAvailable) {
                throw Exception("No connection with earth. can't take off")
            }

            println("Tryinf to launch")
            fuel -= 5
            sendMessageToEarth(" I'm in space")
            sendMessageToEarth("I've found some extraterrestrials")
            isInSpace = true
        }

        fun refuel() {
            fuel += 5
            sendMessageToEarth("The fuel tank is filled")
        }

        fun repairEngine() {
            isEnginerInOrder = true
            sendMessageToEarth("The engine is in order")
        }

        fun fixConnection() {
            isConnectionAvailable = true
            sendMessageToEarth("Hello Earth!")
            sendMessageToEarth("Connection is established")
        }

        fun land() {
            sendMessageToEarth("Landing...")
            isInSpace = false
        }

        fun sendMessageToEarth(message: String) {
            println("Spacecraft to Earth: $message")
        }
    }
}