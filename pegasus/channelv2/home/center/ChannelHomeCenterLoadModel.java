package com.bilibili.pegasus.channelv2.home.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pegasus.channelv2.api.ChannelV2ApiService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterLoadModel.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelHomeCenterLoadModel {
    public static final int $stable = 8;
    private boolean loading;
    private int pn;
    private boolean rcmdLoading;

    @NotNull
    private final String spmid;
    private boolean hasMore = true;

    @NotNull
    private String homeOffset = "";

    @NotNull
    private String rcmdOffset = "";

    /* JADX INFO: renamed from: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterLoadModel$suspendLoadHome$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterLoadModel$suspendLoadHome$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final ChannelHomeCenterLoadModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChannelHomeCenterLoadModel channelHomeCenterLoadModel, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = channelHomeCenterLoadModel;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.suspendLoadHome(false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterLoadModel$suspendRefreshRcmd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterLoadModel$suspendRefreshRcmd$1.class */
    public static final class C55811 extends ContinuationImpl {
        int label;
        Object result;
        final ChannelHomeCenterLoadModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55811(ChannelHomeCenterLoadModel channelHomeCenterLoadModel, Continuation<? super C55811> continuation) {
            super(continuation);
            this.this$0 = channelHomeCenterLoadModel;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.suspendRefreshRcmd(this);
        }
    }

    public ChannelHomeCenterLoadModel(@NotNull String str) {
        this.spmid = str;
    }

    private final ChannelV2ApiService getApi() {
        return (ChannelV2ApiService) ServiceGenerator.createService(ChannelV2ApiService.class);
    }

    private final void setRcmdOffset(Xn0.d dVar) {
        if (dVar != null) {
            String str = dVar.f28261g;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            this.rcmdOffset = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateOffset(java.util.List<Xn0.b> r4) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterLoadModel.updateOffset(java.util.List):void");
    }

    public final boolean checkLoadHome(boolean z6) {
        return !this.loading && (this.hasMore || z6);
    }

    public final boolean hasMore() {
        return this.hasMore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object suspendLoadHome(boolean r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super Xn0.c> r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterLoadModel.suspendLoadHome(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x0047, B:29:0x00b5, B:31:0x00c3, B:34:0x00ce, B:24:0x0078), top: B:42:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object suspendRefreshRcmd(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends Xn0.b>> r6) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterLoadModel.suspendRefreshRcmd(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
