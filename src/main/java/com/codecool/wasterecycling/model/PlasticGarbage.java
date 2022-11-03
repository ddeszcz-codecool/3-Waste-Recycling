package com.codecool.wasterecycling.model;

import com.codecool.wasterecycling.enums.GarbageName;
import com.codecool.wasterecycling.enums.PlasticState;

public class PlasticGarbage extends Garbage {

        private PlasticState plasticState;
        public PlasticGarbage(GarbageName garbageName, PlasticState plasticState) {
                super(garbageName);
                this.plasticState = plasticState;
        }

        public boolean isCleaned(){
                return this.plasticState == PlasticState.CLEAN;
        }
}
