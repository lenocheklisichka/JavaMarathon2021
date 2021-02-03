package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как у тебя дела?");

        user2.sendMessage(user1, "Привет, user1!");
        user2.sendMessage(user1, "Все отлично!");
        user2.sendMessage(user1, "А у тебя?");

        user3.sendMessage(user1, "Привет мой доуг user1!");
        user3.sendMessage(user1, "Как ты живешь?");
        user3.sendMessage(user1, "Кем ты работаешь?");

        user1.sendMessage(user3, "Привет мой друг user3!");
        user1.sendMessage(user3, "Жизнь кипит! Просто сказка!");
        user1.sendMessage(user3, "Я работаю програмистом)");

        user3.sendMessage(user1, "Ооо.. Замечательная работа у тебя)!Продолжай в том же духе! Гудбай!");
        MessageDatabase.showDialog(user1, user3);
    }
}
