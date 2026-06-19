package com.bilibili.moduleservice.im;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/im/IMGetUnReadService.class */
public interface IMGetUnReadService {
    boolean getIMSwitch(@NotNull String str);

    int getUnReadNum();
}
