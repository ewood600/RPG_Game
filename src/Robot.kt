class Robot : Human() {
    override fun attack1(): Double {
        batterydrain()
        return (power + battery+5)*0.5
    }
    override fun attack2(): Double {
        batterydrain()
        return -2.0
    }
    override fun attack3(): Double {
        battery = 15
        return 0.0
    }
    override fun attack4(): Double {
        battery = 0
        return (power + battery+5).toDouble()
    }
    override fun error(): Double {
        return -404.0
    }
    override fun statcall(): Double {
        return -100.0
    }
    override fun stat() {
        println("Класс: Робот")
        println("Здоровье : $hp")
        println("Сила : $power + $battery")
        println("Батарея : $battery" )
        println("Способности :")
        println("1 - Удар рукой - наносит ${((power+battery)*0.5).toInt()} урона")
        println("2 - Точный выстрел - наносит ${((power + battery)*0.4).toInt()}, убвает любого врага, здоровье которого после выстрела становится меньше 15")
        println("3 - Подзарядка - уменьшает получаемый урон в два раза на один ход")
        println("4 - Энерговыстрел - наносит ${(power+battery).toInt()} урона, опустошает батарею")

    }
    override fun heal(): Double {
        var healing = (20..50).random()
        hp += healing
        println("Вы вылечились на $healing")
        return 0.0
    }
    fun batterydrain(){
        if (battery > -5){
            battery -= 5
        }
    }
}