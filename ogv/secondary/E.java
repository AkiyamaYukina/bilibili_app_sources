package com.bilibili.ogv.secondary;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/E.class */
@EntryPoint
@InstallIn({SingletonComponent.class})
public interface E {
    @NotNull
    D q();
}
