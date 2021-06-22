package exercise2.messagingService;

import java.util.ArrayList;

/*
    Реализуйте MessagingService класс. Класс должен иметь конструктор без параметров
    и содержать список Message объектов. После этого добавьте в класс следующие два метода:

    public void add(Message message) - добавляет сообщение, переданное в качестве параметра
    службе обмена сообщениями, если его содержимое не превышает 280 символов.
    public ArrayList<Message> getMessages() - возвращает сообщения, добавленные в службу
    обмена сообщениями.
    Подсказка! Вы можете узнать длину строки, используя метод length(), связанный со строкой.
 */
public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280){
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
