package com.bilibili.lib.sharewrapper.basic;

import android.os.Bundle;
import com.bilibili.lib.sharewrapper.ShareHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/basic/IShareInterceptorV2.class */
public interface IShareInterceptorV2 {
    void shareTo(String str, Bundle bundle, ShareHelper.Callback callback);

    boolean willIntercept(String str);
}
