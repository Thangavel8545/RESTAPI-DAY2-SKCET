package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1pro {
   @Value("${Name}")
   private String studentName;
   @Value("${Color}")
   private String yourFavColor;
   @GetMapping("welcome")
   public String Welcome() {
	   return "Welcome String Boot!"; 
   }
   @GetMapping("Name")
   public String getName() {
	   return "Welcome "+studentName+"!";
   }
   @GetMapping("Color")
   public String getMyFav() {
	   return "My favourite color is "+yourFavColor+"!";
   }
}