package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("damsel") //@QuestType(type = QuestType.Type.Damsel)
public class RescuingDamselQuest implements Quest{

    public String goQuest(){
        return "Knight is going to rescue the damsel!";
    }
}
