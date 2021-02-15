import java.util.Scanner;

public class Applications {

    private Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Привет");
        this.run();
        System.out.println("Пока");
    }

    private void run(){
        while (true) {
            Drawable value = select();
            if(value == null) {
                break;
            }
            value.draw();
        }
    }

    private Drawable select(){
        this.showMenu();
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Введите стороны квадрата");
                int x = scanner.nextInt();
                return new Square(x);
            case 2: return new Triangle();
            case 3: return new Circle();
            case 0: return null;
        }

        System.out.println("Нет такой фигуры. Повторите ввод");
        return select();
    }

    private void showMenu(){
        System.out.println("++++ Выберите фигуру ++++");
        System.out.println("1 - квадрат");
        System.out.println("2 - треугольник");
        System.out.println("3 - круг");
        System.out.println("0 - выход");
    }
}