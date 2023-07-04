package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("dragon") //@QuestType(type = QuestType.Type.Dragon)
public class SlayingDragonQuest implements Quest{

    public String goQuest(){
        return "Knight slew the dragon.";
    }
}
