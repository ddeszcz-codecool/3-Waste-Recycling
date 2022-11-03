package com.codecool.wasterecycling.container;

import com.codecool.wasterecycling.enums.PaperState;
import com.codecool.wasterecycling.model.Garbage;
import com.codecool.wasterecycling.enums.Color;
import com.codecool.wasterecycling.enums.GarbageName;
import com.codecool.wasterecycling.model.OtherGarbage;
import com.codecool.wasterecycling.model.PaperGarbage;
import com.codecool.wasterecycling.model.PlasticGarbage;
import com.codecool.wasterecycling.utility.Display;

import java.util.ArrayList;
import java.util.List;

public class Dustbin {
        private List<Garbage> garbageList;
        private Color color;

        public Dustbin(Color color) {
                this.garbageList = new ArrayList<Garbage>();
                this.color = color;
        }


        @Override
        public String toString() {
                String str = color.toString();
                String color = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                return color + " Dustbin!\n" + "House waste content: " + getHouseWasteCount() + " items(s)\n" +
                        displayWasteContent() +
                        "Paper content: " + getPaperCount() + " items(s)\n" +
                        displayPaperGarbage() +
                        "Plastic content: " + getPlasticCount() + " items(s)\n" +
                        displayPlasticGarbage();
        }

        public String displayWasteContent() {
                if (getHouseWasteCount() == 0)
                        return Display.noRubbishOfThisType();
                StringBuilder output = new StringBuilder();
                for (Garbage garbage : this.garbageList) {
                        if (garbage instanceof OtherGarbage)
                                output.append("       ").append(garbage.getName()).append("\n");
                }
                return output.toString();
        }

        public String displayPaperGarbage() {
                if (getPaperCount() == 0)
                        return Display.noRubbishOfThisType();
                StringBuilder output = new StringBuilder();
                for (Garbage garbage : this.garbageList) {
                        if (garbage instanceof PaperGarbage)
                                output.append("       ").append(garbage.getName()).append("\n");
                }
                return output.toString();
        }

        public String displayPlasticGarbage() {
                if (getPlasticCount() == 0)
                        return Display.noRubbishOfThisType();
                StringBuilder output = new StringBuilder();
                for (Garbage garbage : this.garbageList) {
                        if (garbage instanceof PlasticGarbage)
                                output.append("       ").append(garbage.getName()).append("\n");
                }
                return output.toString();
        }

        public String throwOutGarbage(Garbage garbage) throws DustbinContentException {
                System.out.println("Adding " + garbage.getName() + " to the dustbin.");
                if (garbage instanceof PaperGarbage)
                        if (!((PaperGarbage) garbage).isSqueezed()){
                                try {
                                        throw new DustbinContentException();
                                } catch (DustbinContentException e) {
                                        System.out.println(Display.squeezePaperBeforeAdding()+ "\n");
                                }
                                return "";}
                if (garbage instanceof PlasticGarbage)
                        if (!((PlasticGarbage) garbage).isCleaned()){
                                try {
                                        throw new DustbinContentException();
                                } catch (DustbinContentException e) {
                                        System.out.println(Display.cleanPlasticBeforeAdding()+ "\n");
                                }
                                return "";}
                this.garbageList.add(garbage);
                String str = garbage.getName();
                String garbageName = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                System.out.println(garbageName + " was added to the dustbin\n");
                return "";
        }

        public void emptyContents() {
                this.garbageList.clear();
        }

        public void displayContents() {
                for (Garbage item : this.garbageList) {
                        int count = 0;
                        System.out.println("Item number :" + ++count + " is :" + item);
                }
        }

        public int getHouseWasteCount() {
                int count = 0;
                for (Garbage garbage : this.garbageList) {
                        if (garbage instanceof OtherGarbage) {
                                count++;
                        }
                }
                return count;
        }

        public int getPaperCount() {
                int count = 0;
                for (Garbage garbage : this.garbageList) {
                        if (garbage instanceof PaperGarbage) {
                                count++;
                        }
                }
                return count;
        }

        public int getPlasticCount() {
                int count = 0;
                for (Garbage garbage : this.garbageList) {
                        if (garbage instanceof PlasticGarbage) {
                                count++;
                        }
                }
                return count;
        }

        //TODO Question 1 - ask if this is possible to do 1 method instead of repeating code 3 times

//        public void getHouseWasteCount() {
//                Garbage garbage=new Garbage(GarbageName.OTHER);
//                countGarbageItem(garbage);
//        }
//        private int countGarbageItem(Garbage garbageType) {
//                int count = 0;
//                for(Garbage item :this.garbageList){
//                        if (item instanceof garbageType.getClass()){
//                                count++;
//                        }
//                }
//                return count;
//}
        //Todo end Question 1;

}
