package com.tuaev.passwordGenerator.CalorieCalculator;

import java.util.ArrayList;
import java.util.List;

public class Activity {

        public static List<String> getRatio(){

            List<String> ratio = new ArrayList<String>();
            ratio.add("Базовый обмен");
            ratio.add("Нет физических нагрузок и сидячая работа");
            ratio.add("Легкие физические нагрузки 1–3 раза в неделю");
            ratio.add("Силовые нагрузки средней интенсивностью 3–5 раз в неделю");
            ratio.add("Силовые тренировки 6–7 раз в неделю");
            ratio.add("Физическая работа, силовые тренировки 2 раза в день");

            return ratio;

        }

}
