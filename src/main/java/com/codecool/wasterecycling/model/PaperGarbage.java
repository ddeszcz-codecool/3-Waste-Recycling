package com.codecool.wasterecycling.model;

import com.codecool.wasterecycling.enums.GarbageName;
import com.codecool.wasterecycling.enums.PaperState;

public class PaperGarbage extends Garbage {

        private PaperState paperState;
        public PaperGarbage(GarbageName garbageName, PaperState paperState) {
                super(garbageName);
                this.paperState = paperState;
        }


        public PaperState getPaperState() {
                return paperState;
        }

        public boolean isSqueezed(){
                return this.paperState == PaperState.SQUEEZED;
        }
}
