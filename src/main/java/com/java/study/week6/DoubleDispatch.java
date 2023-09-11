package com.java.study.week6;

public class DoubleDispatch {
}

interface Post{
    void postOn(SNS sns);
}

class Text implements Post{

    @Override
    public void postOn(SNS sns){
        sns.post(this);
    }
}

class Picture implements Post{

    @Override
    public void postOn(SNS sns){
        sns.post(this);
    }
}

interface SNS{
    void post(Text text);
    void post(Picture picture);
}

class Facebook implements SNS{

    @Override
    public void post(Text text){
        System.out.println("Text: facebook");
    }

    @Override
    public void post(Picture picture){
        System.out.println("Picture: facebook");
    }
}

class Twitter implements SNS{

    @Override
    public void post(Text text){
        System.out.println("Text: twitter");
    }

    @Override
    public void post(Picture picture){
        System.out.println("Picture: twitter");
    }
}