package com.test.tang.myapplication;


import java.io.IOException;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by GUJIAJIA on 2016/4/5.
 * Email 965939858@qq.com
 */
public class Obervable {
   /* //获取商家详情
    @Override
    public Observable<SellerDetailModel> brand(final String sellerId, final String terminalNo) {
        return observable(new Observable.OnSubscribe<SellerDetailModel>() {

            @Override
            public void call(Subscriber<? super SellerDetailModel> subscriber) {
                try {
                    String result = NetClient.get().post(SELLER,
                            new FormBody.Builder()
                                    .add("sellerId", sellerId)
                                    .add("terminalNo", terminalNo)
                                    .build());
                    L.i(Http_Log, result);
                    SellerDetailModel sellerDetailModel = new Gson().fromJson(result, SellerDetailModel.class);
                    if (sellerDetailModel.getReturnNo().equals(NetUtils.Return_Success)) {
                        subscriber.onNext(sellerDetailModel);
                        subscriber.onCompleted();
                    } else {
                        subscriber.onError(getErrorMsg(sellerDetailModel.getReturnInfo()));
                    }
                      *//*  Base base = new+ Gson().fromJson(result, Base.class);
                        commonCall(base, subscriber);*//*
                } catch (IOException e) {
                    subscriber.onError(getErrorMsg("网络异常"));
                }
            }
        });
    }*/


}
