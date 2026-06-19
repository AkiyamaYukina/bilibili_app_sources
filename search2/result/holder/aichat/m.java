package com.bilibili.search2.result.holder.aichat;

import com.bapis.bilibili.broadcast.message.main.LikeState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/m.class */
public final /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f87807a;

    static {
        int[] iArr = new int[LikeState.values().length];
        try {
            iArr[LikeState.LIKE.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr[LikeState.DISLIKE.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
        }
        f87807a = iArr;
    }
}
