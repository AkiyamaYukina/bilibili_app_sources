package com.bilibili.ship.theseus.united.page.intro.module.relate.footer;

import ES0.K0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.live.streaming.source.TextSource;
import dv0.H;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent.class */
@StabilityInferred(parameters = 0)
public final class DetailFooterComponent extends m<H> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f101191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final K0 f101192b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$FooterType.class */
    public static final class FooterType {
        private static final EnumEntries $ENTRIES;
        private static final FooterType[] $VALUES;
        public static final FooterType None = new FooterType(TextSource.STR_SCROLL_NONE, 0);
        public static final FooterType Loading = new FooterType("Loading", 1);
        public static final FooterType ReachEnd = new FooterType("ReachEnd", 2);
        public static final FooterType Error = new FooterType("Error", 3);

        private static final /* synthetic */ FooterType[] $values() {
            return new FooterType[]{None, Loading, ReachEnd, Error};
        }

        static {
            FooterType[] footerTypeArr$values = $values();
            $VALUES = footerTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(footerTypeArr$values);
        }

        private FooterType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<FooterType> getEntries() {
            return $ENTRIES;
        }

        public static FooterType valueOf(String str) {
            return (FooterType) Enum.valueOf(FooterType.class, str);
        }

        public static FooterType[] values() {
            return (FooterType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final StateFlow<FooterType> f101193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Float> f101194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101195c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull StateFlow<? extends FooterType> stateFlow, @NotNull StateFlow<Float> stateFlow2, boolean z6) {
            this.f101193a = stateFlow;
            this.f101194b = stateFlow2;
            this.f101195c = z6;
        }
    }

    public DetailFooterComponent(@NotNull a aVar, @NotNull K0 k02) {
        this.f101191a = aVar;
        this.f101192b = k02;
    }

    public static final void c(DetailFooterComponent detailFooterComponent, View view, boolean z6, int i7, int i8) {
        detailFooterComponent.getClass();
        int paddingLeft = view.getPaddingLeft();
        if (!z6) {
            i7 = 0;
        }
        int paddingRight = view.getPaddingRight();
        if (!z6) {
            i8 = 0;
        }
        view.setPadding(paddingLeft, i7, paddingRight, i8);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        H h = (H) viewBinding;
        ConstraintLayout constraintLayout = h.f116772a;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DetailFooterComponent$bind$2(this, constraintLayout, h.f116773b, h.f116775d, constraintLayout.getContext(), h.f116774c, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return H.inflate(layoutInflater, viewGroup, false);
    }
}
