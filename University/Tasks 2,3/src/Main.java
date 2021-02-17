

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.*;

public class Main {
    /**
     @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        List<ForHourWorker> workers = new ArrayList<>();

        try {
            String filePath = "C:\\Users\\Dell\\OneDrive\\Рабочий стол\\file.txt";
            String[] point = filePath.split("\\.");

            if (!point[point.length - 1].equals("txt"))
                throw new FileNotFoundException("Неккоректный формат файла");

            File file = new File(filePath);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                String[] parts = line.split(" ");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String salary = parts[2];

                if (salary.contains(".")) {
                    double salary_final = Double.parseDouble(parts[2]);
                    workers.add(new ForHourWorker(id, name, salary_final));
                }else{
                    int salary_final = Integer.parseInt(parts[2]);
                    workers.add(new ForHourWorker(id, name, salary_final));
                }
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        workers.add(new ForHourWorker(1, "Алексей", 100));
//        workers.add(new ForHourWorker(2,"Михаил", 120));
//        workers.add(new ForHourWorker(3, "Юрий", 100));
//        workers.add(new ForHourWorker(4, "Григорий", 150));
//        workers.add(new ForHourWorker(5, "Александр", 90));
//        workers.add(new ForHourWorker(6, "Валерий", 10000.0));
//        workers.add(new ForHourWorker(7, "Павел", 22000.0));
//        workers.add(new ForHourWorker(8, "Никита", 18000.0));
//        workers.add(new ForHourWorker(9, "Владимир", 16500.0));


        Collections.sort(workers);

        System.out.println("Сортирвка по зарплате\n");

        for (ForHourWorker worker : workers) {
            System.out.println(worker);
        }

        System.out.println("\nПервые 5 имён\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(workers.get(i).name);
        }

        System.out.println("\nПоследние 3 идентификатора\n");

        for (int i = workers.size() - 3; i < workers.size(); i++) {
            System.out.println(workers.get(i).id);
        }
    }
}

