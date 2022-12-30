import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Lesson> lesson = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {



            System.out.println("Dados da " + i + "° aula: ");
            System.out.print("Conteúdo ou tarefa (c/f)? ");
            sc.nextLine();
            char ch = sc.nextLine().charAt(0);

            System.out.print("Título: ");
            String title = sc.nextLine();

            if(ch == 'c'){
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();

                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();

                lesson.add(new Video(title, url, seconds));

            } else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();

                System.out.print("Quantidade de questões: ");
                int quantityQuestion = sc.nextInt();

                lesson.add(new Task(title,description, quantityQuestion));
            }

            System.out.println();
        }

        int sum = 0;

        for (Lesson x :
                lesson) {
            sum += x.duration();
        }

        System.out.print("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");



    }
}