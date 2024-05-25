import java.util.List;


// 父类 Pizza
public class Pizza {
    private String name;
    private double largePrice;
    private double smallPrice;
    private List<String> toppings;
    private String description;

    // Constructor
    public Pizza(String name, double largePrice, double smallPrice, List<String> toppings, String description) {
        this.name = name;
        this.largePrice = largePrice;
        this.smallPrice = smallPrice;
        this.toppings = toppings;
        this.description = description;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for largePrice
    public double getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(double largePrice) {
        this.largePrice = largePrice;
    }

    // Getter and Setter for smallPrice
    public double getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(double smallPrice) {
        this.smallPrice = smallPrice;
    }

    // Getter and Setter for toppings
    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Override toString method
    @Override
    public String toString() {
        return  name + "Pizza" +
                ", largePrice: NT$" + largePrice +
                ", smallPrice: NT$" + smallPrice +
                ", toppings: " + toppings +
                ", description: '" + description + '\'' +
                '}';
    }
}

// 夏威夷
class HawaiiPizza extends Pizza {
    public HawaiiPizza(double largePrice, double smallPrice) {
        super("夏威夷", largePrice, smallPrice, List.of("火腿", "鳳梨", "莫札瑞拉起司", "番茄紅醬"), "經典夏威夷披薩口味，當甜中帶點微酸的鳳梨，遇上風味濃郁的火腿，絕妙味道，越吃越順口。");
    }
}
//法式卡菲海陸
class FrenchCaffiPizza extends Pizza {
    public FrenchCaffiPizza(double largePrice, double smallPrice) {
        super("法式卡菲海陸", largePrice, smallPrice, List.of("巴黎卡菲醬", "韓式烤肉", "豬肉", "大蝦", "洋蔥", "菠菜", "番茄", "洋香菜葉", "莫札瑞拉起司"), "以世界四大名醬之一的巴黎卡菲醬為基底, 微微的咖哩香氣加上番茄、香草、椰汁的香味, 讓經典的BBQ烤肉和新鮮大蝦的口感層次加倍升級，讓你吃的滿口都是大讚嘆!");

    }
}
//松露海鮮珍珠起司
class TruffleSeaPizza extends Pizza {
    public TruffleSeaPizza(double largePrice, double smallPrice) {
        super("松露海鮮珍珠起司", largePrice, smallPrice, List.of("松露牛肝菌菇醬", "鮮蝦", "魷魚圈", "帆立貝", "蛤蜊", "蘑菇", "菠菜", "珍珠型莫札瑞拉起司"), "肥美鮮蝦、Ｑ彈魷魚、多汁帆立貝與鮮美蛤蜊，淋上濃郁牛肝菌醬佐上撲鼻的松露香氣，豪華海鮮饗宴即刻上桌！");
    }
}
//煙燻培根手撕豬比薩
class SmokedBaconPizza extends Pizza {
    public SmokedBaconPizza(double largePrice, double smallPrice) {
        super("煙燻培根手撕豬", largePrice, smallPrice, List.of("美式煙燻辣醬", "楓糖厚切培根", "手撕豬", "火腿", "洋蔥", "鳳梨", "菠菜", "莫札瑞拉起司"), "選用重量級的肉餡料滿足肉食主義者的味蕾，採用美式風味十足的煙燻醬，鋪上由楓糖調製而成的厚切培根、 火腿及香烤手撕豬，吸附醬汁精華同時滲出豬肉原汁肉香的美味，最後再以鳳梨為味蕾注入清爽鮮甜的層次。肉香和鮮甜相互襯托，口感樂趣無窮！");
    }
}
//壽喜雪花牛
class SuixiCowPizza extends Pizza {
    public SuixiCowPizza(double largePrice, double smallPrice) {
        super("壽喜雪花牛", largePrice, smallPrice, List.of("壽喜燒醬", "雪花牛肉", "蘑菇", "番茄", "洋蔥", "洋香菜葉", "莫札瑞拉起司"), "嚴選口感柔軟、油花分布均勻飽滿的美國雪花牛，佐以純正日式風味壽喜醬汁，再配上蘑菇及新鮮洋蔥、紅椒，豐盛餡料重磅登場！(部分門市會以加量蘑菇取代紅椒)");
    }
}
//和風章魚燒
class JapOctopusPizza extends Pizza {
    public JapOctopusPizza(double largePrice, double smallPrice) {
        super("和風章魚燒", largePrice, smallPrice, List.of("照燒醬", "章魚", "甜不辣", "青椒", "洋蔥", "芝麻", "柴魚", "海苔", "美乃滋", "莫札瑞拉起司"), "鮮甜章魚+魷魚，搭配豐富佐料，再淋上照燒醬及美乃滋，齒頰濃郁，回味無窮，喜愛日式風味的朋友絕不能錯過！");
    }
}
//海鮮
class SeaFoodPizza extends Pizza {
    public SeaFoodPizza(double largePrice, double smallPrice) {
        super("海鮮總匯", largePrice, smallPrice, List.of("番茄醬", "蝦仁", "魷魚條", "蛤蜊", "蟹味絲", "番茄丁", "洋香菜葉", "莫札瑞拉起司"), "海鮮披薩使用上選美味蛤蜊、鮮蝦、蟹味絲及飽滿豐富的魷魚，一口咬下滿滿鮮美滋味，讚不絕口。");
    }
}
//鐵板雙牛
class TeppanyakiPizza extends Pizza {
    public TeppanyakiPizza(double largePrice, double smallPrice) {
        super("鐵板雙牛", largePrice, smallPrice, List.of("BBQ醬", "黑胡椒牛柳", "牛肉丸（含豬肉）", "蘑菇", "菠菜", "莫札瑞拉起司"), "一份比薩享有兩種牛肉的滿足，以鮮嫩的牛肉丸為主角 ，搭配特調的黑胡椒牛柳，將牛肉輔以滿滿鮮甜的菠菜及洋菇餡料，最後再鋪上莫札瑞拉起司。層層入口後，齒頰留香，令人意猶未盡，回味無窮！");
    }
}
//黃金和風雞
class GoldenChickenPizza extends Pizza {
    public GoldenChickenPizza(double largePrice, double smallPrice) {
        super("黃金和風雞", largePrice, smallPrice, List.of("BBQ醬", "香酥雞", "培根", "鳳梨", "洋香菜葉", "美乃滋", "莫札瑞拉起司"), "外皮金黃內層鮮嫩的雞肉，搭配爽口鮮脆的黃瓜與香甜的鳳梨，忍不住一口接一口的好滋味！");
    }
}


