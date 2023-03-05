public class Program {
    public static void main(String[] args) {
        baseProduct milk = new milk("Молоко 'Вологодское'", 50.0, 1,
                "шт", 0.9, 2.5, "неделя");
        baseProduct bread = new bread("Хлеб 'Тихвинский'", 50.5, 1,
                "шт", "3 дня", "ржаная");
        baseProduct eggs = new eggs("Яйца 'Синявинские'", 120.0, 1,
                "шт", "21 день", 10);
        baseProduct lemonade = new lemonade("Лимонад 'Coca-Cola'", 200.0, 1,
                "шт", 0.33);
        baseProduct pacifier = new pacifier("Соска 'Паровоз'", 50.3,
                1, "шт", 0, false);
        baseProduct diapers = new diapers("Подгузники 'Бэйби'", 800.20, 1,
                "шт", 60, 20.0, 0.0,120.5, "На все случаи");
        baseProduct masks = new masks("Маски", 150.0, 5, "шт", 100);
        baseProduct paper = new toiletPaper("Туалетная бумага 'Дешёвая'", 30.0,
                1, "шт", 50, 1);

        baseProduct[] products = {milk, bread, eggs, lemonade, pacifier, diapers, masks, paper};
        System.out.println("--------");
        showProducts(products);
    }
    static void showProducts(baseProduct [] products){
        for (baseProduct product: products) {
            System.out.println(product);
            System.out.println("--------");
        }
    }
}
