package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Countries {
  
  TreeMap<String, ArrayList<String>> tmap = new TreeMap<String, ArrayList<String>>();
  
  public void add(String countryName, ArrayList<String> state) {
    tmap.put(countryName, state);
  }
  
  public String getCountry(String countryName) {
    
    Iterator i = tmap.entrySet().iterator();
    while(i.hasNext()){
      Map.Entry<String, ArrayList<String>> mapElement = (Map.Entry)i.next();
      String check = mapElement.getKey();
      if(check.equals(countryName)) {
        return mapElement.getValue().get(0);
      }
    }
    return null;
  }
  
  public void CountryAfter(String countryName) {
    
    List<String> cNames = new ArrayList<>();
    cNames.addAll(tmap.keySet());
    int ind = cNames.indexOf(countryName);
    for(int i = ind;i<cNames.size();i++) {
      System.out.println(cNames.get(i)+" "+tmap.get(cNames.get(i)));
    }
  }
  
  public void CountryBefore(String countryName) {
    
    List<String> cNames = new ArrayList<>();
    cNames.addAll(tmap.keySet());
    int ind = cNames.indexOf(countryName);
    for(int i = ind;i<=0;i--) {
      System.out.println(cNames.get(i)+" "+tmap.get(cNames.get(i)));
    }
  }
  
  public static void main(String args[]) {
    
    Countries c = new Countries();
    ArrayList<String> s1 = new ArrayList<String>();
    s1.add("Moscow");
    ArrayList<String> s2 = new ArrayList<String>();
    s2.add("Delhi");
    ArrayList<String> s3 = new ArrayList<String>();
    s3.add("Newyork");
    c.add("Russia", s1);
    c.add("India", s2);
    c.add("USA", s3);
    
    c.CountryAfter("India");
    c.CountryBefore("India");
    
  }

}