package com.bilibili.socialize.share.core.handler.huawei;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/handler/huawei/HuaweiShareHelper.class */
public final class HuaweiShareHelper {

    @NotNull
    public static final HuaweiShareHelper INSTANCE = new HuaweiShareHelper();

    @NotNull
    public static final String KEY_CACHE_INIT_RESULT = "key_huawei_share_cache_init_result";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f104984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Function2<? super Context, ? super HuaweiInitCallback, Unit> f104985b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/handler/huawei/HuaweiShareHelper$HWShareDelegate.class */
    public interface HWShareDelegate {
        boolean getInitSuccess();

        void init(@Nullable Context context, @Nullable HuaweiInitCallback huaweiInitCallback);

        void setInitSuccess(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/handler/huawei/HuaweiShareHelper$HuaweiInitCallback.class */
    public interface HuaweiInitCallback {
        default void onInitFail() {
            HuaweiShareHelper.INSTANCE.setInitSuccess(false);
        }

        default void onInitSuccess() {
            HuaweiShareHelper.INSTANCE.setInitSuccess(true);
        }
    }

    @Nullable
    public final Function2<Context, HuaweiInitCallback, Unit> getHuaweiShareIml() {
        return f104985b;
    }

    public final boolean getInitSuccess() {
        return f104984a;
    }

    public final void init(@Nullable Context context, @Nullable HuaweiInitCallback huaweiInitCallback) {
        initHuawei(context, huaweiInitCallback);
    }

    public final void initHuawei(@Nullable Context context, @Nullable HuaweiInitCallback huaweiInitCallback) {
        Function2<? super Context, ? super HuaweiInitCallback, Unit> function2 = f104985b;
        if (function2 != null) {
            function2.invoke(context, huaweiInitCallback);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setHuaweiShareIml(@Nullable Function2<? super Context, ? super HuaweiInitCallback, Unit> function2) {
        f104985b = function2;
    }

    public final void setInitSuccess(boolean z6) {
        f104984a = z6;
    }
}
