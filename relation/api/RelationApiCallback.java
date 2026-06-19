package com.bilibili.relation.api;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/RelationApiCallback.class */
public interface RelationApiCallback<T> {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onDataSuccess$default(RelationApiCallback relationApiCallback, Object obj, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDataSuccess");
        }
        if ((i7 & 1) != 0) {
            obj = null;
        }
        relationApiCallback.onDataSuccess(obj);
    }

    static /* synthetic */ void onError$default(RelationApiCallback relationApiCallback, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i7 & 1) != 0) {
            th = null;
        }
        relationApiCallback.onError(th);
    }

    boolean isCancel();

    void onDataSuccess(@Nullable T t7);

    void onError(@Nullable Throwable th);
}
