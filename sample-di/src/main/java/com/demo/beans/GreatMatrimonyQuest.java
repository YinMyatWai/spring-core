package com.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("matrimony") //@QuestType(type = QuestType.Type.Matrimony)
public class GreatMatrimonyQuest implements Quest{


    @Override
    public String goQuest() {
        return "Knight and Princess performs the great matrimony!";
    }
}
