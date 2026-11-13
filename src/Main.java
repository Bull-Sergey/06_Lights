
void main() {
    Scanner scanner = new Scanner(System.in);

    // Читаем количество перекрёстков (N) и тоннелей (M)
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    // Массив для хранения количества светофоров на каждом перекрёстке
    // Индекс 0 соответствует перекрёстку 1, индекс N-1 — перекрёстку N
    int[] lights = new int[N];

    // Обрабатываем каждый тоннель
    for (int i = 0; i < M; i++) {
        int crossroad1 = scanner.nextInt() - 1; // Переводим в 0-based индекс
        int crossroad2 = scanner.nextInt() - 1;

        // Для каждого тоннеля увеличиваем счётчик светофоров для обоих перекрёстков
        lights[crossroad1]++;
        lights[crossroad2]++;
    }

    // Выводим результат: количество светофоров для перекрёстков от 1 до N
    for (int i = 0; i < N; i++) {
        System.out.print(lights[i]);
        if (i < N - 1) {
            System.out.print(" ");
        }
    }
    System.out.println();
}

