package Main;

import java.util.Scanner;

class ListElement {
    ListElement next;
    int data;
}

class DynamicQueue {
    private ListElement head;
    private ListElement tail;
    private int size = 0;
    void add(int data) {
        ListElement a = new ListElement();
        a.data = data;
        if(head == null) {
            head = a;
        }
        else{
            tail.next = a;
        }
        tail = a;
    }

    void printList()
    {
        ListElement t = head;
        while(t!=null) {
            System.out.println(t.data + " ");
            t = t.next;

        }
    }

    void delete()
    {
        if(head == null) {
            System.out.println("Очередь пустая");
        }
        if(head == tail) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
    }

    int size() {
        if(isEmpty()){
            System.out.println("Очередь пустая");
        }
        else{
            ListElement t = head;
            while(t!=null){
                t = t.next;
                size++;
            }
        }
        return size;
    }

    private boolean isEmpty() {
        return head == null;
    }
}

public class Main {

    public static void main(String[] args) {
	Main prog = new Main();
	prog.run();
    }

    private void run() {
        DynamicQueue queue = new DynamicQueue();
        Scanner scanner = new Scanner(System.in);
        int sel;
        while ((sel=menu())!=0){
            switch (sel){
                case 1:
                    queue.printList();
                    break;
                case 2:
                    System.out.println("Введите элемент = " );
                    int k = scanner.nextInt();
                    queue.add(k);
                    break;
                case 3:
                    queue.delete();
                    break;
                case 4:
                    int s = queue.size();
                    System.out.println("Размер = " + s);
                    break;
        }
        }
    }

    private int menu() {
        System.out.println("1. Для отображения очереди введите 1");
        System.out.println("2. Для добавления в очередь введите 2");
        System.out.println("3. Для удаления из очереди введите 3");
        System.out.println("4. Узнать размер очереди введите 4");
        System.out.println("0. Для выхода из приложения введите 0");
        return new Scanner(System.in).nextInt();
    }

}
