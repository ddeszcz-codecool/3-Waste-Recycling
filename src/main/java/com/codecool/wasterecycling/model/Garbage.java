package com.codecool.wasterecycling.model;

import com.codecool.wasterecycling.enums.GarbageName;

public class Garbage {
        private GarbageName garbageName;

        public Garbage(GarbageName garbageName) {
                this.garbageName = garbageName;
        }

        public String getName(){
                return this.garbageName.toString();
        }


}
