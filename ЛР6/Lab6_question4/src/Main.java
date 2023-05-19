import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Количество точек
        List<Point> points = generatePoints(n); // Генерация точек

        Map<Line, Integer> lines = new HashMap<>(); // Хранение прямых и их количества проходящих точек

        // Поиск прямых, проходящих через более чем одну точку
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point p1 = points.get(i);
                Point p2 = points.get(j);
                Line line = new Line(p1, p2);

                if (lines.containsKey(line)) {
                    lines.put(line, lines.get(line) + 1);
                } else {
                    lines.put(line, 2);
                }
            }
        }

        // Запись результатов в файл
        String outputFile = "output.txt"; // Имя выходного файла
        writeLinesToFile(outputFile, lines);
    }

    /**
     * Генерирует случайные точки на плоскости.
     *
     * @param n количество точек
     * @return список точек
     */
    private static List<Point> generatePoints(int n) {
        List<Point> points = new ArrayList<>();

        // Генерация случайных точек
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 21) - 10; // Генерация целых чисел от -10 до 10
            int y = (int) (Math.random() * 21) - 10; // Генерация целых чисел от -10 до 10
            points.add(new Point(x, y));
        }

        return points;
    }

    /**
     * Записывает описания прямых в файл.
     *
     * @param outputFile имя выходного файла
     * @param lines      прямые и их количество проходящих точек
     */
    private static void writeLinesToFile(String outputFile, Map<Line, Integer> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Запись описания прямых в файл
            for (Map.Entry<Line, Integer> entry : lines.entrySet()) {
                Line line = entry.getKey();
                int pointCount = entry.getValue();
                String lineDescription = "Прямая: " + line + ", Количество точек: " + pointCount;
                writer.write(lineDescription);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    private static class Line {
        private Point p1;
        private Point p2;

        public Line(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Line otherLine = (Line) obj;
            return (p1.equals(otherLine.p1) && p2.equals(otherLine.p2)) ||
                    (p1.equals(otherLine.p2) && p2.equals(otherLine.p1));
        }

        @Override
        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = prime * result + p1.hashCode() + p2.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "[" + p1 + ", " + p2 + "]";
        }
    }
}
