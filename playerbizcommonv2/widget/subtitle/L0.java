package com.bilibili.playerbizcommonv2.widget.subtitle;

import com.bilibili.lib.media.resource.Languages;
import com.bilibili.playerbizcommonv2.delegate.DelegateStoreKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/L0.class */
public interface L0 {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/L0$a.class */
    public static final class a implements DelegateStoreKey<L0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f83540a = new Object();
    }

    default boolean a() {
        return false;
    }

    @NotNull
    default String c(@Nullable Languages languages) {
        return "";
    }
}
