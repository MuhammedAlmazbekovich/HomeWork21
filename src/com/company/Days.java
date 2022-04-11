package com.company;

public enum Days {
    MONDAY("Дуйшонбу"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

      final String translate;

    Days(String translate) {
        this.translate = translate;
    }
    @Override
    public String toString() {
        return   translate ;
    }
}
