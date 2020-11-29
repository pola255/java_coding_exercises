package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        
        return firstName.substring(0, 1).toUpperCase() + '.' + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        return Math.round(((originalPrice * (vatRate / 100)) + originalPrice) * 100) /  100.0;
    }

    public String reverse(String sentence) {
        
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User u : users) {
            if (u.getType().equals("Linux")){
                count ++;
            }
        }
     
        return count;
    }
}
