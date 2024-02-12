import java.util.*;

public class Country {
    private HashMap<String, String> countryMap;

    public Country() {
        this.countryMap = new HashMap<>();
    }

    public HashMap<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(HashMap<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    public void add(String countryName, String capitalName) {
        countryMap.put(countryName.toLowerCase(), capitalName);
    }

    public String search(String countryName) {
        String capital = countryMap.get(countryName.toLowerCase());
        if (capital == null) {
            return "Data not found";
        }
        return capital;
    }
}
