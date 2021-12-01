package com.company;

//public class StarCraft {
//    String name;
//    int hp;
//
//    public StarCraft(String name, int hp) {
//        this.name = name;
//        this.hp = hp;
//    }
//
//    void stimpack() {
//        System.out.printf("[%s]의 스팀팩! HP: %d -> ", this.name, this.hp);
//        hp -= 10;
//        System.out.printf("%d\n",this.hp);
//    }
//
//    void heal(StarCraft hero) {
//        System.out.printf("[%s]의 치유! -> [%s] HP(%d -> ", this.name, hero.name, hero.hp);
//        hero.hp += 10;
//        System.out.printf("%d)", hero.hp);
//    }
//
//
//    public static void main(String[] args) {
//        //객체 생성
//        StarCraft marine = new StarCraft("레이너", 80);
//        StarCraft medic = new StarCraft("모랄레스", 60);
//
//        //마린의 스팀팩!
//        marine.stimpack();
//        //메딕의 힐!
//        medic.heal(marine);
//
//    }
//}

/**
 * 정상적으로 잘 실행된다.
 * <p>
 * 하지만 StarCraft 라는 클래스 안에 서로 반대되는 일을 하는 메소드가 2개 들어가 있다.
 * <p>
 * 이 문제는 간단해서 크게 어려움은 없지만 만약 코드가 복잡해 진다면 이러한 방식의 코드 작성은
 * <p>
 * 누가 봐도 한눈에 이해할 수 있는 깔끔한 코드 즉 Clean Code라고 하기에는 거리가 있어 보인다.
 */

/*
이때 한 클래스에 들어있는 메소드들을 각각의 클래스로 분리시켜 준다면 어떨까?
 */

//마린 클래스(스탬팩 메소드 포함)
class marine {
    String name;
    int hp;

    public marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void stimpack() {
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", this.name, this.hp);
        hp -= 10;
        System.out.printf("%d\n",this.hp);
    }

}

//메딕 클래스( heal method 포함)
class medic{
    String name;
    int hp;
    public medic(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    void heal(marine hero) {
        System.out.printf("[%s]의 치유! -> [%s] HP(%d -> ", this.name, hero.name, hero.hp);
        hero.hp += 10;
        System.out.printf("%d)", hero.hp);
    }
}



public class StarCraft {
    public static void main(String[] args) {
        //객체 생성
        marine marine = new marine("레이너", 80);
        medic medic = new medic("모랄레스", 60);
        //마린의 스팀팩!
        marine.stimpack();
        //메딕의 힐!
        medic.heal(marine);
    }
}