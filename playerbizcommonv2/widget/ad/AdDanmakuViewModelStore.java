package com.bilibili.playerbizcommonv2.widget.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.biliad.BiliAdDanmakuViewModelv2;
import com.bilibili.playerbizcommonv2.delegate.DelegateStoreKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/ad/AdDanmakuViewModelStore.class */
@StabilityInferred(parameters = 0)
public final class AdDanmakuViewModelStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliAdDanmakuViewModelv2 f82286a;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/ad/AdDanmakuViewModelStore$Companion.class */
    public static final class Companion implements DelegateStoreKey<AdDanmakuViewModelStore> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdDanmakuViewModelStore(@NotNull BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2) {
        this.f82286a = biliAdDanmakuViewModelv2;
    }

    @NotNull
    public final BiliAdDanmakuViewModelv2 getAdDanmakuViewModel() {
        return this.f82286a;
    }
}
