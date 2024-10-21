class Wizard : Human(){
    override fun attack1(): Double {
        return this.power*0.5
    }
    override fun attack2(): Double {
        if(mana >= 5) {
            mana -= 5
            return power * 0.7
        }
        return 0.0
    }
    override fun attack3(): Double {
        mana = 20
        return 0.0
    }
    override fun attack4(): Double {
        if(mana >= 10) {
            mana -= 10
            return -3.0
        }
        return 0.0
    }
    override fun error(): Double {
        return -404.0
    }
    override fun statcall(): Double {
        return -100.0
    }
    override fun stat() {
        println("Класс: Колдун")
        println("Здоровье : $hp")
        println("Сила : $power")
        println("Мана :  $mana")
        println("Способности :")
        println("1 - Удар посохом - наносит ${(power*0.5).toInt()} урона")
        println("2 - Огненный шар - наносит ${(power*0.7).toInt()} потребляет 5 маны")
        println("3 - Зелье маны - полностью восполняет ману")
        println("4 - Телепорт - полное уклонение от атаки врага, потребляет 10 маны")

    }
    override fun heal(): Double {
        var healing = (20..50).random()
        hp += healing
        println("Вы вылечились на $healing")
        return 0.0
    }
}