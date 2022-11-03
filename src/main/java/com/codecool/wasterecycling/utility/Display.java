package com.codecool.wasterecycling.utility;



public class Display {
        public static String squeezePaperBeforeAdding(){
                return "!!!! Item not added. Please squeeze your paper garbage before adding it to the dustbin";
        }

        public static String cleanPlasticBeforeAdding(){
                return "!!!! Item not added. Please clean your plastic garbage before adding it to the dustbin";
        }

        public static String noRubbishOfThisType(){
                return String.format("%7s No rubbish of this type are currently in the Dustbin\n", " ");
        }
}
