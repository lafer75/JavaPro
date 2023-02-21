package nineteenhomework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Book",100));
        list.add(new Product("Book",32));
        list.add(new Product("Book",346));
        list.add(new Product("Book",87));
        list.add(new Product("Book",84));

        System.out.println("1.1");
        printList(list);
        System.out.println("1.2");
        printList(getList(list,"Book"));
        System.out.println("2.2");
        printList(sellList(list,"Book"));
        System.out.println("3.1/3.2");
        Product product1 = hasFound(list,"Book");
        printNoList(product1);
        Product product2 = hasFound(list,"Car");
        printNoList(product2);
        System.out.println("4.1/4.2");
        System.out.println(Product.setDate());
        printList(ThreeLastProduct(list));
        System.out.println("5.1/5.2");
        allPriceOfRoduct(list,"Book","2023");
        allPriceOfRoduct(list,"Money","2023");
        allPriceOfRoduct(list,"Book","2022");

    }
    public static void printList (List<Product> list){
        for(Product a:list){
            if(!a.getTypeProduct().isBlank()){
                System.out.println(a.getTypeProduct() + " " + a.getValue());
            }
        }
    }
    public static void printNoList(Product product){
            if(!product.getTypeProduct().isBlank()){
                System.out.println(product.getTypeProduct() + " : " + product.getValue());

        }
    }
    public static List<Product> getList(List<Product> list,String type){
        Stream <Product> stream = list.stream();
        List<Product> enter = stream
                .filter(s -> s.getTypeProduct().equals(type))
                .filter(s -> s.getValue() > 250)
                .collect(Collectors.toList());
        return enter;
    }
    public static List<Product> sellList(List<Product> list,String type){
        Stream<Product> stream = list.stream();
        List<Product> enter = stream
                .filter(s ->s.getTypeProduct().equals(type))
                .filter(s -> s.isFound())
                .map(s ->{Product a =new Product (s.getTypeProduct(), s.getValue());
                    a.setValue(s.getValue() - (s.getValue() * 0.1));
                return a;
                })
                .collect(Collectors.toList());
        return enter;
    }
    public static Product hasFound(List<Product> list,String type){
        Product Min;
        try{
            Min = list.stream()
                    .filter(s ->s.getTypeProduct().equals(type))
                    .min(Product::comparePrice).get();
            return Min;
        }catch (Exception e){
            System.out.println("Продукт "+ type +" не знайдено");
            return new Product("",0);
        }
    }
    public static List<Product> ThreeLastProduct(List<Product> list){
        List<Product> enter = list.stream()
                .skip(list.size() - 3)
                .collect(Collectors.toList());
        return enter;
    }
    public static void allPriceOfRoduct(List<Product> list, String type, String year){
        int enter = list.stream()
                .filter(s ->s.getTypeProduct().equals(type))
                .filter(s ->s.setDate().substring(0,4).equals(year))
                .filter(s ->s.getValue()>75)
                .mapToInt(s -> (int) s.getValue())
                .reduce(0,Integer::sum);
        System.out.println(enter);
    }
}
