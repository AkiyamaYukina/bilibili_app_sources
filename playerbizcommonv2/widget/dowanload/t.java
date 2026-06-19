package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/t.class */
@StabilityInferred(parameters = 0)
public final class t extends com.bilibili.app.gemini.ui.m<Dr0.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f82595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f82596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f82597c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/t$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f82598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f82599b;

        public a(long j7, @NotNull String str) {
            this.f82598a = j7;
            this.f82599b = str;
        }
    }

    public t(@NotNull a aVar, @NotNull MutableStateFlow mutableStateFlow, @NotNull e eVar) {
        this.f82595a = aVar;
        this.f82596b = mutableStateFlow;
        this.f82597c = eVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Dr0.m mVar = (Dr0.m) viewBinding;
        TextView textView = mVar.f3110a;
        Context context = textView.getContext();
        TextView textView2 = mVar.f3111b;
        textView2.setText(this.f82595a.f82599b);
        textView.setOnClickListener(new com.bilibili.bplus.followinglist.module.item.comment.l(this, 1));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadTabComponent$bind$3(this, textView2, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.m.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
