package rog.Entitys.Ai;

import rog.Entitys.Entity;

public class UserControlable implements Ai {

    private Entity entity;

    @Override
    public void init(Entity entity) {
       this.entity = entity;
    }

    @Override
    public void act() {

    }
}
