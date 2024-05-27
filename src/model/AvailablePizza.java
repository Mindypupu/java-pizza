package model;

import java.util.ArrayList;
import java.util.List;

public class AvailablePizza {
    ArrayList<Pizza>pizzas = new ArrayList<Pizza>();
    pizzas.add(new HawaiiPizza());
    pizzas.add(new FrenchCaffiPizza());
    pizzas.add(new TruffleSeaPizza());
    pizzas.add(new SmokedBaconPizza());
    pizzas.add(new SuixiCowPizza());
    pizzas.add(new JapOctopusPizza());
    pizzas.add(new SeaFoodPizza());
    pizzas.add(new TeppanyakiPizza());
    pizzas.add(new GoldenChickenPizza());
    pizzas.add(new SuperAssemblyPizza());
    pizzas.add(new KimchiPorkPizza());
    pizzas.add(new SmokedChickenPizza());
    pizzas.add(new SpicyMexicoPizza());
    pizzas.add(new SeaLandPizza());
    pizzas.add(new VegetablePizza());
    pizzas.add(new CurrySeaPizza());
    pizzas.add(new JapTeriyakiPizza());
    pizzas.add(new FourFuPizza());
    pizzas.add(new DoubleSausagePizza());
    pizzas.add(new VegeMushroomPizza());
}

// 夏威夷
class HawaiiPizza extends Pizza {
    public HawaiiPizza() {
        super("夏威夷", 555, 360, List.of("火腿", "鳳梨", "莫札瑞拉起司", "番茄紅醬"), "經典夏威夷披薩口味，當甜中帶點微酸的鳳梨，遇上風味濃郁的火腿，絕妙味道，越吃越順口。", "/Hawaii.jpeg");
    }
}
//法式卡菲海陸
class FrenchCaffiPizza extends Pizza {
    public FrenchCaffiPizza() {
        super("法式卡菲海陸", 870, 610, List.of("巴黎卡菲醬", "韓式烤肉", "豬肉", "大蝦", "洋蔥", "菠菜", "番茄", "洋香菜葉", "莫札瑞拉起司"), "以世界四大名醬之一的巴黎卡菲醬為基底, 微微的咖哩香氣加上番茄、香草、椰汁的香味, 讓經典的BBQ烤肉和新鮮大蝦的口感層次加倍升級，讓你吃的滿口都是大讚嘆!", "/FrenchCaffi.jpeg");

    }
}
//松露海鮮珍珠起司
class TruffleSeaPizza extends Pizza {
    public TruffleSeaPizza() {
        super("松露海鮮珍珠起司", 870, 610, List.of("松露牛肝菌菇醬", "鮮蝦", "魷魚圈", "帆立貝", "蛤蜊", "蘑菇", "菠菜", "珍珠型莫札瑞拉起司"), "肥美鮮蝦、Ｑ彈魷魚、多汁帆立貝與鮮美蛤蜊，淋上濃郁牛肝菌醬佐上撲鼻的松露香氣，豪華海鮮饗宴即刻上桌！", "/TruffleSea.jpeg");
    }
}
//煙燻培根手撕豬比薩
class SmokedBaconPizza extends Pizza {
    public SmokedBaconPizza() {
        super("煙燻培根手撕豬", 790, 530, List.of("美式煙燻辣醬", "楓糖厚切培根", "手撕豬", "火腿", "洋蔥", "鳳梨", "菠菜", "莫札瑞拉起司"), "選用重量級的肉餡料滿足肉食主義者的味蕾，採用美式風味十足的煙燻醬，鋪上由楓糖調製而成的厚切培根、 火腿及香烤手撕豬，吸附醬汁精華同時滲出豬肉原汁肉香的美味，最後再以鳳梨為味蕾注入清爽鮮甜的層次。肉香和鮮甜相互襯托，口感樂趣無窮！", "/SmokedBacon.jpeg");
    }
}
//壽喜雪花牛
class SuixiCowPizza extends Pizza {
    public SuixiCowPizza() {
        super("壽喜雪花牛", 750, 490, List.of("壽喜燒醬", "雪花牛肉", "蘑菇", "番茄", "洋蔥", "洋香菜葉", "莫札瑞拉起司"), "嚴選口感柔軟、油花分布均勻飽滿的美國雪花牛，佐以純正日式風味壽喜醬汁，再配上蘑菇及新鮮洋蔥、紅椒，豐盛餡料重磅登場！(部分門市會以加量蘑菇取代紅椒)", "/SuixiCow.jpeg");
    }
}
//和風章魚燒
class JapOctopusPizza extends Pizza {
    public JapOctopusPizza() {
        super("和風章魚燒", 740, 500, List.of("照燒醬", "章魚", "甜不辣", "青椒", "洋蔥", "芝麻", "柴魚", "海苔", "美乃滋", "莫札瑞拉起司"), "鮮甜章魚+魷魚，搭配豐富佐料，再淋上照燒醬及美乃滋，齒頰濃郁，回味無窮，喜愛日式風味的朋友絕不能錯過！", "/JapOctopus.jpeg");
    }
}
//海鮮
class SeaFoodPizza extends Pizza {
    public SeaFoodPizza() {
        super("海鮮總匯",740, 500, List.of("番茄醬", "蝦仁", "魷魚條", "蛤蜊", "蟹味絲", "番茄丁", "洋香菜葉", "莫札瑞拉起司"), "海鮮披薩使用上選美味蛤蜊、鮮蝦、蟹味絲及飽滿豐富的魷魚，一口咬下滿滿鮮美滋味，讚不絕口。", "/SeaFood.jpeg");
    }
}
//鐵板雙牛
class TeppanyakiPizza extends Pizza {
    public TeppanyakiPizza() {
        super("鐵板雙牛", 720, 480, List.of("BBQ醬", "黑胡椒牛柳", "牛肉丸（含豬肉）", "蘑菇", "菠菜", "莫札瑞拉起司"), "一份比薩享有兩種牛肉的滿足，以鮮嫩的牛肉丸為主角 ，搭配特調的黑胡椒牛柳，將牛肉輔以滿滿鮮甜的菠菜及洋菇餡料，最後再鋪上莫札瑞拉起司。層層入口後，齒頰留香，令人意猶未盡，回味無窮！", "/Teppanyaki.jpeg");
    }
}
//黃金和風雞
class GoldenChickenPizza extends Pizza {
    public GoldenChickenPizza() {
        super("黃金和風雞", 690, 460, List.of("BBQ醬", "香酥雞", "培根", "鳳梨", "洋香菜葉", "美乃滋", "莫札瑞拉起司"), "外皮金黃內層鮮嫩的雞肉，搭配爽口鮮脆的黃瓜與香甜的鳳梨，忍不住一口接一口的好滋味！", "/GoldenChicken.jpeg");
    }
}
//超級總匯
class SuperAssemblyPizza extends Pizza {
    public SuperAssemblyPizza() {
        super("超級總匯", 690, 460, List.of("番茄紅醬", "美式臘腸", "燻雞絲", "火腿", "蘑菇", "洋蔥", "青椒", "莫札瑞拉起司"), "經典義式美味，超級總匯披薩的豐富餡料讓人忍不住大快朵頤！", "/SuperAssembly.jpeg");
    }
}
//韓式泡菜燒肉
class KimchiPorkPizza extends Pizza {
    public KimchiPorkPizza() {
        super("韓式泡菜燒肉", 720, 480, List.of("韓式烤肉醬", "韓式烤豬肉", "培根", "韓式泡菜", "莫札瑞拉起司"), "道地韓式泡菜，配上軟嫩豬肉，微微酸辣口感讓你大呼過癮！", "/KimchiPork.jpeg");
    }
}
//燻雞絲蘑菇
class SmokedChickenPizza extends Pizza {
    public SmokedChickenPizza() {
        super("燻雞絲蘑菇", 640, 420, List.of("番茄紅醬", "燻雞絲", "玉米", "蘑菇", "莫札瑞拉起司"), "特選煙燻雞絲，再加入玉米、蘑菇，烘焙出正點異國風味美食。", "/SmokedChicken.jpeg" );
    }
}
//哈辣墨西哥
class SpicyMexicoPizza extends Pizza {
    public SpicyMexicoPizza() {
        super("哈辣墨西哥", 650, 430, List.of("番茄紅醬", "墨西哥辣椒", "美式臘腸", "燻雞絲", "洋蔥", "莫札瑞拉起司"), "新鮮洋蔥配上超辣的墨西哥辣椒，及美式臘腸，義大利肉腸，香辣夠味，哈辣族最愛。", "/SpicyMexico.jpeg");
    }
}
//雙拼海陸
class SeaLandPizza extends Pizza {
    public SeaLandPizza() {
        super("雙拼海陸", 620, 400, List.of("BBQ醬", "花枝", "咖哩", "燻雞絲", "洋蔥", "蛤蜊", "番茄丁", "洋香菜葉", "咖喱醬", "豬肉", "培根", "菠菜","莫札瑞拉起司"), "經典雙拼口味有著香氣十足的咖哩醬搭配鮮甜海鮮的黃金咖哩海鮮、鹹香BBQ醬料配上四大經典餡料的四小福，兩種黃金搭配的美味令人吮指回味！", "/SeaLand.jpeg" );
    }

}
//羅勒青蔬
class VegetablePizza extends Pizza {
    public VegetablePizza() {
        super("羅勒青蔬", 565, 320, List.of("青醬", "洋菇", "玉米", "番茄", "薯金幣", "洋蔥", "帕瑪森起司", "美乃滋", "莫札瑞拉起司"), "迷人青醬香氣配上美味青蔬，碰撞出絕妙美味～", "/Vegetable.jpeg" );
    }
}
//黃金咖哩海鮮
class CurrySeaPizza extends Pizza {
    public CurrySeaPizza() {
        super("黃金咖哩海鮮", 565, 320, List.of("咖哩醬", "花枝", "蛤蜊", "番茄丁", "洋香菜葉", "莫札瑞拉起司"), "香氣十足的咖哩醬搭配鮮甜海鮮，美味的黃金搭配就是這一味！", "/CurrySea.jpeg" );
    }
}
//四小福
class FourFuPizza extends Pizza {
    public FourFuPizza() {
        super("四小福", 565, 320, List.of("BBQ醬", "燻雞絲", "手撕豬", "培根", "番茄丁", "洋蔥", "莫札瑞拉起司"), "鹹香BBQ醬料配上四大經典餡料，令人吮指回味！", "/FourFu.jpeg" );
    }
}
//日式照燒雞
class JapTeriyakiPizza extends Pizza {
    public JapTeriyakiPizza() {
        super("日式照燒雞", 565, 320, List.of("日式照燒醬", "燻雞絲", "洋菇", "洋香菜葉", "番茄丁", "洋蔥", "美乃滋", "莫札瑞拉起司"), "日式照燒醬搭配煙燻雞肉絲及豐富佐料，甜鹹滋味讓你忍不住一口接一口！", "/JapTeriyaki.jpeg" );
    }
}
//雙層美式臘腸
class DoubleSausagePizza extends Pizza {
    public DoubleSausagePizza() {
        super("雙層美式燒臘", 565, 370, List.of("番茄紅醬", "加量美式臘腸", "加量莫札瑞拉起司"), "加量的雙層美式臘腸，豐盛臘腸口口吃得到，讓你盡享道地的美式風味。", "/DoubleSausage.jpeg" );
    }
}
class VegeMushroomPizza extends Pizza {
    public VegeMushroomPizza() {
        super("彩蔬鮮菇", 630, 410, List.of("BBQ素醬", "菠菜", "蘑菇", "番茄", "莫札瑞拉起司"), "撒上鮮美的蘑菇與菠菜和番茄，再加上BBQ素醬，素食口味披薩讓你吃到蔬菜的清爽美味。(奶素可食,部分門市會以玉米取代甜紅椒)", "/VegeMushroom.jpeg" );
    }
}