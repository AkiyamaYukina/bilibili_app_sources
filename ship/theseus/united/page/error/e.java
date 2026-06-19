package com.bilibili.ship.theseus.united.page.error;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.lib.theme.R$color;
import dv0.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/e.class */
@StabilityInferred(parameters = 0)
public final class e extends DataBindingComponent<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f99600a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/e$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final i f99601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f99602b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f99604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f99605e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f99607g;

        @Nullable
        public ua0.c h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f99608i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f99609j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f99610k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f99612m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f99603c = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f99606f = 1.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public String f99611l = "";

        public a(@NotNull Context context, @NotNull i iVar) {
            this.f99601a = iVar;
            this.f99604d = context.getString(2131851615);
            this.f99608i = context.getString(2131851609);
            this.f99609j = ContextCompat.getColor(context, R$color.Graph_white);
            this.f99610k = ContextCompat.getColor(context, R$color.Brand_pink);
        }
    }

    public e(@NotNull a aVar) {
        this.f99600a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        r rVar = (r) viewDataBinding;
        rVar.q(this.f99600a);
        rVar.executePendingBindings();
        rVar.f117113y.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.error.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f99597a;

            {
                this.f99597a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(final View view) {
                final e eVar = this.f99597a;
                view.postDelayed(new Runnable(eVar, view) { // from class: com.bilibili.ship.theseus.united.page.error.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final e f99598a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final View f99599b;

                    {
                        this.f99598a = eVar;
                        this.f99599b = view;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = this.f99598a;
                        eVar2.f99600a.f99601a.invoke(this.f99599b);
                    }
                }, 150L);
            }
        });
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r.inflate(layoutInflater, viewGroup, false);
    }
}
