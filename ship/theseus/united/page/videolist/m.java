package com.bilibili.ship.theseus.united.page.videolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import dv0.J0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/m.class */
@StabilityInferred(parameters = 0)
public final class m extends com.bilibili.app.gemini.ui.m<J0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f103628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f103629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f103630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final n f103631d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/m$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f103632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f103633b;

        public a(long j7, @NotNull String str) {
            this.f103632a = j7;
            this.f103633b = str;
        }
    }

    public m(@NotNull a aVar, @NotNull b bVar, @NotNull StateFlow stateFlow, @NotNull n nVar) {
        this.f103628a = aVar;
        this.f103629b = bVar;
        this.f103630c = stateFlow;
        this.f103631d = nVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        J0 j02 = (J0) viewBinding;
        TextView textView = j02.f116802a;
        TextView textView2 = j02.f116803b;
        textView2.setText(this.f103628a.f103633b);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.videolist.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f103627a;

            {
                this.f103627a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103627a.f103631d.invoke();
            }
        });
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoSelectListTabComponent$bind$3(this, textView2, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return J0.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
