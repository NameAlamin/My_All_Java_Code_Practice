package streamRequirement2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayStream2 {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        init(menu);

        var lowCalorisFoodList = menu.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).thenComparing(Dish::getName))
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(lowCalorisFoodList);

    }

    private static void init(List<Dish> list) {
        Dish dish1 = new Dish();
        dish1.setName("rice1");
        dish1.setCalories(360);
        list.add(dish1);

        Dish dish2 = new Dish();
        dish2.setName("rice2");
        dish2.setCalories(350);
        list.add(dish2);

        Dish dish3 = new Dish();
        dish3.setName("mango");
        dish3.setCalories(380);
        list.add(dish3);

        Dish dish4 = new Dish();
        dish4.setName("rice4");
        dish4.setCalories(460);
        list.add(dish4);

        Dish dish5 = new Dish();
        dish5.setName("ango");
        dish5.setCalories(380);
        list.add(dish5);
    }
}
