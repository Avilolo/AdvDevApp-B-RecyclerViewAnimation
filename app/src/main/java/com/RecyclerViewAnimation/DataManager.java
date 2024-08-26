package com.RecyclerViewAnimation;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> generate() {
        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new Property()
                .addImage("img_1")
                .setPrice(2_000_000)
                .setContent("דירה נחמדה בשדרה")
                .setAddress("ויצמן 35, תל אביב")
                .setArea(100)
                .setBalcony(true)
                .setParking(0)
                .setRooms(4)
        );

        properties.add(new Property()
                .addImage("img_2")
                .setPrice(2_500_000)
                .setContent("דירה פחות נחמדה ברחוב")
                .setAddress("הטייסים 100, תל אביב")
                .setArea(78)
                .setBalcony(false)
                .setParking(0)
                .setRooms(3)
        );

        properties.add(new Property()
                .setType(1)
                .addImage("img_3")
                .addImage("img_1")
                .addImage("img_2")
                .addImage("img_1")
                .setSellerIcon("ic_1")
                .setContent("קבוצת קטה בלה בלהבהבההגדה גכ דגכגד כשד כשדכ דגכ שדכ שדכשגד כשגד כ")
                .setAddress("הטייסים 120, תל אביב")

        );

        properties.add(new Property()
                .addImage("img_1")
                .setPrice(2_000_000)
                .setContent("")
                .setAddress("אפקה 45, תל אביב")
                .setArea(100)
                .setBalcony(true)
                .setParking(2)
                .setRooms(4)
        );

        properties.add(new Property()
                .addImage("img_2")
                .setPrice(2_000_000)
                .setContent("")
                .setAddress("יהושע 45, ירושלים")
                .setArea(76)
                .setBalcony(true)
                .setParking(1)
                .setRooms(3)
        );
        for (int i = 0; i < 500; i++) {
            properties.add(new Property()
                    .addImage("img_2")
                    .setPrice(i)
                    .setContent("")
                    .setAddress("יהושע 45, ירושלים")
                    .setArea(i)
                    .setBalcony(true)
                    .setParking(i)
                    .setRooms(i));
        }


        return properties;
    }
}
