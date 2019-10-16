package com.example.applayout.ui.main;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;


public class PageViewModel extends ViewModel {
    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {

            String a = "Parking Lot A - 3 Spots Available \n\n\n\n\n" +
                    "" +
                    "Parking Lot B - 2 Spots Available \n\n\n\n\n\n" +
                    "" +
                    "Parking Lot C - 5 Spots Available \n\n\n\n\n\n" +
                    "" +
                    "Parking Lot D - No spot Available";
            return a;

        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }

}