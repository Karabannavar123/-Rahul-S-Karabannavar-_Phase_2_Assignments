package com.hibernate.programs;

import java.util.Set;

public class Items {
 
            
            private int item_id;
            
            
            private String item_name;
            private Set categories;
            
            public int getItem_id() {
                        return item_id;
            }
            public void setItem_id(int item_id) {
                        this.item_id = item_id;
            }
            public String getItem_name() {
                        return item_name;
            }
            public void setItem_name(String item_name) {
                        this.item_name = item_name;
            }
            public Set getCategories() {
                        return categories;
            }
            public void setCategories(Set categories) {
                        this.categories = categories;
            }
  } 
