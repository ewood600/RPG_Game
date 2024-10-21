
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var c = 0
    println("Выберите класс")
    println("1 - Рыцарь, 2 - Колдун, 3 - Робот")
    var classname : Human
    while (true){
        when(readLine()){
            "1" -> {
                classname = Knight()
                classname.defence = 10
            }
            "2" -> {
                classname = Wizard()
                classname.mana = 20
            }
            "3" -> {
                classname = Robot()
                classname.battery = 15
            }
            else ->{
                classname = aaa()
            }
        }
        if(classname.attack1() == 0.0) {
            println("Вы неправильно ввели номер класса, пожалуйста, введите ещё раз")
        }
        else
            break
    }
    var i = 0
    var EHP: Int
    var damage = 0.0
    var EDMG = 0
    println("Инструкция: ")
    println("1 - первичная атака")
    println("2 - вторичная атака")
    println("3 - особое умение")
    println("4 - ультимативная атака")
    println("5 - лечение")
    println("6 - характеристики персонажа")
    while (i < 10) {
        i += 1
        if (i == 10) {
            EHP = 200
            EDMG = 30
            println("На вас напал босс, у него $EHP здоровья и он готовит атаку на $EDMG урона")
        }
        else {
            EHP = (40..80).random()
            EDMG = (15..30).random()
            println("На вас напал враг, у него $EHP здоровья и он готовит атаку на $EDMG урона")
        }
        while ((EHP > 0) and (classname.hp > 0)){
            while (true) {
                damage = when (readLine()) {
                    "1" -> classname.attack1()
                    "2" -> classname.attack2()
                    "3" -> classname.attack3()
                    "4" -> classname.attack4()
                    "5" -> classname.heal()
                    "6" -> classname.statcall()
                    else -> classname.error()
                }
                when (damage){
                    -100.0 -> {
                        classname.stat()
                        println("Враг")
                        println("Здоровье $EHP")
                        println("Урон на этот ход $EDMG")
                    }
                    -404.0 -> EHP = EHP
                    else -> break
                }
            }
            when (damage){
                -1.0 -> {
                    EDMG /= 2
                    damage = 0.0
                }
                -2.0 -> {
                    damage = (classname.power + classname.battery+5)*0.3
                    if ((classname.power + classname.battery+5)*0.4 + 15 >= EHP)
                        damage += 15
                }
                -3.0 -> {
                    damage = 0.0
                    EDMG = 0
                }
            }
            if (EDMG - classname.defence > 0) {
                classname.hp -= EDMG - classname.defence
                println("За этот ход вы получили ${EDMG - classname.defence} урона")
            }
            else{
                println("За этот ход вы не получили урона")
            }
            EHP -= damage.toInt()
            EDMG = (15..30).random()
            println("Враг потерял ${damage.toInt()} здоровья и он готовит атаку на $EDMG урона")
        }
        if (classname.hp <= 0){
            println("Игра окончена")
            break
        }
        else {
            classname.power += 5
            c += 1
            println("Вы победили врага")
        }
    }
    if (c == 10){
        println("Поздравляем, вы прошли игру")
    }
}