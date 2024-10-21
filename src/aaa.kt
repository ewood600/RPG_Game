class aaa(): Human() {
    override fun attack1(): Double {
        return 0.0
    }
    override fun attack2(): Double {
        return this.power*0.4 + 10
    }
    override fun attack3(): Double {
        return -1.0
    }
    override fun attack4(): Double {
        return this.power*0.3
    }
    override fun error(): Double {
        return -404.0
    }
    override fun statcall(): Double {
        return -100.0
    }
    override fun heal(): Double {
        var healing = (20..50).random()
        hp += healing
        println("Вы вылечились на $healing")
        return 0.0
    }

    override fun stat() {
        println("Класс: Рыцарь")
        println("Здоровье : $hp")
        println("Сила : $power")
        println("Способности :")
        println("1 - Удар мечём - наносит ${power*0.5} урона")
        println("2 - Святой удар - наносит ${power*0.4} + 10 доп. урона")
        println("3 - Блокирование - уменьшает получаемый урон в два раза на один ход")
        println("4 - Фокусировка - наносит ${power*0.3}")

    }
}