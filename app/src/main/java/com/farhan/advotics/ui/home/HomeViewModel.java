package com.farhan.advotics.ui.home;

import com.farhan.advotics.mCat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<mCat> mText;

    public void setCat(int number) {
        mText.setValue(new mCat(number));
    }

    public HomeViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<mCat> getText() {
        return mText;
    }
}