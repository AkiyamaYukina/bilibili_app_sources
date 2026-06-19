package com.bilibili.moduleservice.main;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/ShareWrapperService.class */
public interface ShareWrapperService {
    void share(@Nullable Context context, @Nullable Bundle bundle, @Nullable ShareCallback shareCallback);
}
