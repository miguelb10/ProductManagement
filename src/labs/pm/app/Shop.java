/*
 * Copyright (C) 2021 MIGUE
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;
import static labs.pm.data.Rating.*;

/**
 *
 * @author MIGUE
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager pm = new ProductManager(Locale.UK);
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1, FOUR_START, "Nice hot cup of tea");
        p1 = pm.reviewProduct(p1, TWO_START, "Rather weak tea");
        p1 = pm.reviewProduct(p1, FOUR_START, "Fine tea");
        p1 = pm.reviewProduct(p1, FOUR_START, "Good tea");
        p1 = pm.reviewProduct(p1, FIVE_START, "Perfect tea");
        p1 = pm.reviewProduct(p1, THREE_START, "Just add some lemon");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED);
        p2 = pm.reviewProduct(p2, THREE_START, "Coffee was ok");
        p2 = pm.reviewProduct(p2, ONE_START, "where is the milk?!");
        p2 = pm.reviewProduct(p2, FIVE_START, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED, LocalDate.now().plusDays(2));
        p3 = pm.reviewProduct(p3, THREE_START, "Coffee was ok");
        p3 = pm.reviewProduct(p3, ONE_START, "where is the milk?!");
        p3 = pm.reviewProduct(p3, FIVE_START, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p3);

        Product p4 = pm.createProduct(104, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED, LocalDate.now());
        p4 = pm.reviewProduct(p4, THREE_START, "Coffee was ok");
        p4 = pm.reviewProduct(p4, ONE_START, "where is the milk?!");
        p4 = pm.reviewProduct(p4, FIVE_START, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p4);

        Product p5 = pm.createProduct(105, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED);
        p5 = pm.reviewProduct(p5, THREE_START, "Coffee was ok");
        p5 = pm.reviewProduct(p5, ONE_START, "where is the milk?!");
        p5 = pm.reviewProduct(p5, FIVE_START, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p5);

        Product p6 = pm.createProduct(106, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED);
        p6 = pm.reviewProduct(p6, THREE_START, "Coffee was ok");
        p6 = pm.reviewProduct(p6, ONE_START, "where is the milk?!");
        p6 = pm.reviewProduct(p6, FIVE_START, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p6);
//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), FOUR_START);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FIVE_START, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), TWO_START, LocalDate.now());
//        Product p5 = p3.applyRating(THREE_START);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_START);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_START, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(FIVE_START);
//        Product p9 = p1.applyRating(TWO_START);
//        System.out.println(p6.equals(p7));
//        System.out.println(p1.getBestBefore());
//        System.out.println(p3.getBestBefore());
//        if (p3 instanceof Food) {
//            LocalDate bestBefore = ((Food) p3).getBestBefore();
//        }
//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
//        p3 = p3.applyRating(THREE_START);
//        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStars());
//        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStars());
//        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRating().getStars());
//        System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRating().getStars());
//        System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " " + p5.getRating().getStars());
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
    }

}
