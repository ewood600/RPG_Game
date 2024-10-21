abstract class Human{
    var battery = 0
    var defence = 0
    var mana = 0
    var hp = 100
    var power = 20
    abstract fun attack1(): Double
    abstract fun attack2(): Double
    abstract fun attack3(): Double
    abstract fun attack4(): Double
    abstract fun error(): Double
    abstract fun statcall(): Double
    abstract fun stat()
    abstract fun heal(): Double
}