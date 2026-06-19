package com.bilibili.ship.theseus.united.bean;

import com.bapis.bilibili.playershared.Dimension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final VideoDimension f98764a = new VideoDimension(1280, 720);

    @NotNull
    public static final VideoDimension a(int i7, int i8, boolean z6) {
        if (i7 <= 0 || i8 <= 0) {
            return f98764a;
        }
        return z6 ? new VideoDimension(i8, i7) : new VideoDimension(i7, i8);
    }

    @NotNull
    public static final VideoDimension b(@NotNull Dimension dimension) {
        if (dimension.getWidth() <= 0 || dimension.getHeight() <= 0) {
            return f98764a;
        }
        return a((int) dimension.getWidth(), (int) dimension.getHeight(), dimension.getRotate() == 1);
    }
}
