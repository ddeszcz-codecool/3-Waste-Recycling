package com.codecool.wasterecycling;

import com.codecool.wasterecycling.container.Dustbin;
import com.codecool.wasterecycling.container.DustbinContentException;
import com.codecool.wasterecycling.enums.Color;
import com.codecool.wasterecycling.enums.GarbageName;
import com.codecool.wasterecycling.enums.PaperState;
import com.codecool.wasterecycling.enums.PlasticState;
import com.codecool.wasterecycling.model.Garbage;
import com.codecool.wasterecycling.model.OtherGarbage;
import com.codecool.wasterecycling.model.PaperGarbage;
import com.codecool.wasterecycling.model.PlasticGarbage;

public class Main {

    public static void main(String[] args) throws DustbinContentException {

            Dustbin dustbin = new Dustbin(Color.GREEN);
            Garbage garbage = new OtherGarbage(GarbageName.OTHER);
            Garbage garbage1 = new PlasticGarbage(GarbageName.PLASTIC_BOTTLE, PlasticState.DIRTY);
            Garbage garbage1b = new PlasticGarbage(GarbageName.PLASTIC_CONTAINER, PlasticState.CLEAN);
            Garbage garbage1c = new PlasticGarbage(GarbageName.PLASTIC_BOTTLE, PlasticState.CLEAN);
            Garbage garbage1d = new PlasticGarbage(GarbageName.PLASTIC_BOX, PlasticState.CLEAN);
            Garbage garbage1e = new PlasticGarbage(GarbageName.PLASTIC_BOX, PlasticState.CLEAN);
            Garbage garbage2 = new PaperGarbage(GarbageName.PAPER_CARDBOARD, PaperState.SQUEEZED);
            Garbage garbage2b = new PaperGarbage(GarbageName.PAPER_CARDBOARD, PaperState.notSQUEEZED);


            dustbin.throwOutGarbage(garbage);
            dustbin.throwOutGarbage(garbage1);
            dustbin.throwOutGarbage(garbage1b);
            dustbin.throwOutGarbage(garbage1c);
            dustbin.throwOutGarbage(garbage1d);
            dustbin.throwOutGarbage(garbage1e);
            dustbin.throwOutGarbage(garbage1b);
            dustbin.throwOutGarbage(garbage2);
            dustbin.throwOutGarbage(garbage2b);

            System.out.println(dustbin);
            dustbin.emptyContents();
            System.out.println(dustbin);





    }
}
