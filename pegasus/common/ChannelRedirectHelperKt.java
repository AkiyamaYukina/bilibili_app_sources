package com.bilibili.pegasus.common;

import I3.O2;
import android.net.Uri;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/ChannelRedirectHelperKt.class */
public final class ChannelRedirectHelperKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f75514a = LazyKt.lazy(new O2(9));

    public static final void a(@NotNull Uri uri) {
        String strL;
        String strD0;
        Long lValueOf;
        String path = uri.getPath();
        if (path == null || (strL = StringsKt.L(path, "/feed", "")) == null || (strD0 = StringsKt.d0(strL, "/")) == null) {
            return;
        }
        try {
            lValueOf = Long.valueOf(Long.parseLong(strD0));
        } catch (Exception e7) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ChannelRedirectHelperKt$doChannelRedirect$1(lValueOf.longValue(), uri, null), 3, (Object) null);
        }
    }
}
