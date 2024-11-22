import java.lang.Exception

object SpacePort {
    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: Exception OutOfFuelException) {
            spaceCraft

        } finally {

        }
    }

}