package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
public class Knight {

    private MyClass myClass;

    //@QuestType(type = QuestType.Type.Damsel)
    private Quest damsel;

    public Knight(Optional<MyClass> myClass, Quest damsel) {
        //this.myClass = myClass;
        this.damsel = damsel;
    }

    public void setQuest(Quest quest) {
        this.damsel = quest;
    }

    public String goQuest(){
        return damsel.goQuest();
    }

    @Autowired
    public void setSpringBean(Collection<MyInterface> list){

    }
}
