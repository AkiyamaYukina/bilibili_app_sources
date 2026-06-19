package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/q.class */
@StabilityInferred(parameters = 0)
public final class q extends com.bilibili.app.gemini.ui.m<Dr0.l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82583c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f82584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f82585b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/q$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f82586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f82587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<l> f82588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ugc.offline.download.j f82589d;

        public a(long j7, @NotNull String str, @NotNull StateFlow stateFlow, @NotNull com.bilibili.ugc.offline.download.j jVar) {
            this.f82586a = j7;
            this.f82587b = str;
            this.f82588c = stateFlow;
            this.f82589d = jVar;
        }
    }

    public q(@NotNull a aVar, @NotNull StateFlow<Long> stateFlow) {
        this.f82584a = aVar;
        this.f82585b = stateFlow;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadSinglePageComponent$bind$2(this, (Dr0.l) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.l.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
