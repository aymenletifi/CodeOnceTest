package com.example.codeoncetest.service;


import org.springframework.stereotype.Service;

@Service
public class TestTechniqueService {
    public int ponctuation(String s){
        int sum =0;
        String test = ",.:;!?";
        String c;
        for (int i=0; i<s.length(); i++){
            c = Character.toString(s.charAt(i));
            if(test.contains(c))
                sum++;
        }
        return sum;
    }
}
