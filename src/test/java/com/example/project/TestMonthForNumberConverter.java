package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

public class TestMonthForNumberConverter {

   private MonthForNumberConverter converter = new MonthForNumberConverter();

   @Test
   public void test_0() {
      assertEquals("Invalid", converter.getMonthForNumber(0));
   }

   @Test
   public void test_1() {
      assertEquals("January", converter.getMonthForNumber(1));
   }

   @Test
   public void test_2() {
      assertEquals("February", converter.getMonthForNumber(2));
   }

   @Test
   public void test_3() {
      assertEquals("March", converter.getMonthForNumber(3));
   }

   @Test
   public void test_4() {
      assertEquals("April", converter.getMonthForNumber(4));
   }

   @Test
   public void test_5() {
      assertEquals("May", converter.getMonthForNumber(5));
   }

   @Test
   public void test_6() {
      assertEquals("June", converter.getMonthForNumber(6));
   }

   @Test
   public void test_7() {
      assertEquals("July", converter.getMonthForNumber(7));
   }

   @Test
   public void test_8() {
      assertEquals("August", converter.getMonthForNumber(8));
   }

   @Test
   public void test_9() {
      assertEquals("September", converter.getMonthForNumber(9));
   }

   @Test
   public void test_10() {
      assertEquals("October", converter.getMonthForNumber(10));
   }

   @Test
   public void test_11() {
      assertEquals("November", converter.getMonthForNumber(11));
   }

   @Test
   public void test_12() {
      assertEquals("December", converter.getMonthForNumber(12));
   }

   @Test
   public void test_13() {
      assertEquals("Invalid", converter.getMonthForNumber(13));
   }
}
