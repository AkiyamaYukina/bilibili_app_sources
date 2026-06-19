package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.relation.utils.FollowFlowHelper;
import fu0.C7176C;
import fu0.C7177D;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import nu0.C8143b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/c.class */
@StabilityInferred(parameters = 0)
public final class C6107c extends com.bilibili.app.gemini.ui.m<C7177D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0625c f89850a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/c$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C7176C f89851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final u f89852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public FollowFlowHelper f89853c;

        public a(@NotNull C7176C c7176c, @NotNull u uVar) {
            super(c7176c.f119414a);
            this.f89851a = c7176c;
            this.f89852b = uVar;
        }

        public static void p0(C7176C c7176c, boolean z6) {
            if (z6) {
                c7176c.f119416c.setVisibility(8);
            } else {
                c7176c.f119416c.setVisibility(0);
                c7176c.f119416c.setImageResource(2131240815);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.c$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/c$b.class */
    public final class b extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final u f89854a;

        public b(@NotNull C6107c c6107c, u uVar) {
            this.f89854a = uVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f89854a.f89903a.f89839c.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x01d5  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, final int r12) {
            /*
                Method dump skipped, instruction units count: 585
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.publisher.C6107c.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(C7176C.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f89854a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/c$c.class */
    @StabilityInferred(parameters = 0)
    public static final class C0625c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CheesePublisherService$createPublisherCooperator$$inlined$map$1 f89855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89856b;

        public C0625c(@NotNull CheesePublisherService$createPublisherCooperator$$inlined$map$1 cheesePublisherService$createPublisherCooperator$$inlined$map$1, @NotNull StateFlow stateFlow) {
            this.f89855a = cheesePublisherService$createPublisherCooperator$$inlined$map$1;
            this.f89856b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0625c)) {
                return false;
            }
            C0625c c0625c = (C0625c) obj;
            return Intrinsics.areEqual(this.f89855a, c0625c.f89855a) && Intrinsics.areEqual(this.f89856b, c0625c.f89856b);
        }

        public final int hashCode() {
            return this.f89856b.hashCode() + (hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89855a + ", horizontalPaddingFlow=" + this.f89856b + ")";
        }
    }

    public C6107c(@NotNull C0625c c0625c) {
        this.f89850a = c0625c;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseCooperatorComponent$bind$2(this, (C7177D) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7177D c7177dInflate = C7177D.inflate(layoutInflater, viewGroup, false);
        c7177dInflate.f119424f.addItemDecoration(new C6111g(context));
        c7177dInflate.f119423e.addItemDecoration(new C8143b(0, (int) DpUtils.dp2px(context, 8.0f), (int) DpUtils.dp2px(context, 10.0f)));
        return c7177dInflate;
    }
}
