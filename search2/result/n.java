package com.bilibili.search2.result;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/n.class */
public interface n {
    long getAvId();

    default void setCoined(boolean z6) {
    }

    void setIsFav(boolean z6);

    void setIsLike(boolean z6);

    void setLikeCount(long j7);
}
