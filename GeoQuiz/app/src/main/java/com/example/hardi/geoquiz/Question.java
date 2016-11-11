package com.example.hardi.geoquiz;

/**
 * Created by hardi on 11/10/2016.
 */

public class Question
{
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId,boolean answerTrue )
    {
       mTextResId =  textResId;
       mAnswerTrue = answerTrue;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }
    public int getmTextResId() {
        return mTextResId;
    }
    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
    public boolean ismAnswerTrue() {return mAnswerTrue;}
}
