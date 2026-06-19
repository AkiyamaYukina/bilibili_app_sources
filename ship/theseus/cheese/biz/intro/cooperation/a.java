package com.bilibili.ship.theseus.cheese.biz.intro.cooperation;

import I.E;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import fu0.X;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/a.class */
@StabilityInferred(parameters = 0)
public final class a implements UIComponent<n<X>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f89356a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0607a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f89358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f89359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f89360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final c f89362f;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/a$a$a.class */
        public interface InterfaceC0608a {

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/a$a$a$a.class */
            @StabilityInferred(parameters = 1)
            public static final class C0609a implements InterfaceC0608a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0609a f89363a = new Object();
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a$a$a$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/a$a$a$b.class */
            @StabilityInferred(parameters = 1)
            public static final class b implements InterfaceC0608a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final b f89364a = new Object();
            }
        }

        public C0607a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull StateFlow stateFlow, @NotNull c cVar) {
            this.f89357a = str;
            this.f89358b = str2;
            this.f89359c = str3;
            this.f89360d = str4;
            this.f89361e = stateFlow;
            this.f89362f = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0607a)) {
                return false;
            }
            C0607a c0607a = (C0607a) obj;
            return Intrinsics.areEqual(this.f89357a, c0607a.f89357a) && Intrinsics.areEqual(this.f89358b, c0607a.f89358b) && Intrinsics.areEqual(this.f89359c, c0607a.f89359c) && Intrinsics.areEqual(this.f89360d, c0607a.f89360d) && Intrinsics.areEqual(this.f89361e, c0607a.f89361e) && Intrinsics.areEqual(this.f89362f, c0607a.f89362f);
        }

        public final int hashCode() {
            return this.f89362f.hashCode() + androidx.core.content.b.a(this.f89361e, E.a(E.a(E.a(this.f89357a.hashCode() * 31, 31, this.f89358b), 31, this.f89359c), 31, this.f89360d), 31);
        }

        @NotNull
        public final String toString() {
            return "State(title=" + this.f89357a + ", subtitle=" + this.f89358b + ", buttonText=" + this.f89359c + ", icon=" + this.f89360d + ", horizontalPaddingFlow=" + this.f89361e + ", event=" + this.f89362f + ")";
        }
    }

    public a(@NotNull MutableStateFlow mutableStateFlow) {
        this.f89356a = mutableStateFlow;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseCooperationComponent$bindToView$2(this, (X) ((n) viewEntry).a, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(X.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
