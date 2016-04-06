package com.test.tang.myapplication;

import android.util.Log;

import rx.Observer;

/**
 * Created by GUJIAJIA on 2016/4/5.
 * Email 965939858@qq.com
 */
public class RxJavaSample {
    private static final String TAG = RxJavaSample.class.getSimpleName();

    public void testObserve() {
        Observer<String> mOberver = new Observer<String>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted");
            }

            @Override
            public void onError(Throwable e) { Log.d(TAG, "onError" + e); }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext" + s);
            }
        };

    }


}
