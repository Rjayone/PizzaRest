package by.AndrewMedvedev.Pizza.Utils;

import by.AndrewMedvedev.Pizza.domain.DataBaseQuery;
import by.AndrewMedvedev.Pizza.model.DataBase.Component;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Utils {
    static public ArrayList<Integer>parse(String args) {
        ArrayList<Integer> ids = new ArrayList<>();

        if(args == null || args.equals(""))
            return ids;

        Pattern comma = Pattern.compile(",");
        String[ ] words = comma.split(args);
        for (int i = 0; i < words.length; i++) {
            ids.add(Integer.parseInt(words[i]));
        }
        return ids;
    }
    
    static public ArrayList<Component>componentStringToComponentsArray(String compsStr) {
        DataBaseQuery db = DataBaseQuery.getInstance();
        ArrayList<Component> comps = new ArrayList<>();
        Pattern comma = Pattern.compile(",");
        String[ ] words = comma.split(compsStr);
        for (String word : words) {
            comps.add(db.selectComponentById(Integer.parseInt(word)));
        }
        return comps;
    }
}
