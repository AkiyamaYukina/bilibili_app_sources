package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.r;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import zu0.a1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/h.class */
@StabilityInferred(parameters = 0)
public final class h extends DataBindingComponent<a1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f93664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f93665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f93666e = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/h$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final o.b f93667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function1<Integer, Unit> f93668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f93669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f93670d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public String f93671e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f93672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f93673g;

        @NotNull
        public final MutableStateFlow<List<UIComponent<?>>> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f93674i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final List<r> f93675j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Context context, @NotNull o.b bVar, @NotNull Function1<? super Integer, Unit> function1) {
            this.f93667a = bVar;
            this.f93668b = function1;
            MutableStateFlow<List<UIComponent<?>>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
            this.h = MutableStateFlow;
            this.f93674i = MutableStateFlow;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            String str = this.f93670d;
            r.a aVar = new r.a(context, 0, new IR0.c(this, 3));
            if (!Intrinsics.areEqual(str, aVar.f93714e)) {
                aVar.f93714e = str;
                aVar.notifyPropertyChanged(640);
            }
            listCreateListBuilder.add(new r(aVar));
            String str2 = this.f93671e;
            r.a aVar2 = new r.a(context, 1, new IR0.c(this, 3));
            if (!Intrinsics.areEqual(str2, aVar2.f93714e)) {
                aVar2.f93714e = str2;
                aVar2.notifyPropertyChanged(640);
            }
            listCreateListBuilder.add(new r(aVar2));
            this.f93675j = CollectionsKt.build(listCreateListBuilder);
        }

        public final void m() {
            boolean zIsBlank = StringsKt.isBlank(this.f93671e);
            boolean z6 = !zIsBlank;
            r.a aVar = this.f93675j.get(0).f93709a;
            String str = this.f93670d;
            if (!Intrinsics.areEqual(str, aVar.f93714e)) {
                aVar.f93714e = str;
                aVar.notifyPropertyChanged(640);
            }
            aVar.f93713d = z6;
            aVar.m(this.f93669c == 0);
            if (!StringsKt.isBlank(this.f93671e)) {
                r.a aVar2 = this.f93675j.get(1).f93709a;
                String str2 = this.f93671e;
                if (!Intrinsics.areEqual(str2, aVar2.f93714e)) {
                    aVar2.f93714e = str2;
                    aVar2.notifyPropertyChanged(640);
                }
                aVar2.f93713d = z6;
                aVar2.m(this.f93669c == 1);
            }
            n(this.f93669c == 1 ? false : this.f93667a.f93695d);
            this.h.setValue((zIsBlank || this.f93675j.size() <= 1) ? CollectionsKt.listOf(this.f93675j.get(0)) : this.f93675j);
        }

        public final void n(boolean z6) {
            if (z6 == this.f93672f) {
                return;
            }
            this.f93672f = z6;
            notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_MIN_THRESHOLD);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/h$b.class */
    public static final class b extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f93676a;

        public b(h hVar) {
            this.f93676a = hVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i7) {
            super.onPageSelected(i7);
            h hVar = this.f93676a;
            a aVar = hVar.f93662a;
            if (i7 != aVar.f93669c) {
                aVar.f93669c = i7;
                aVar.notifyPropertyChanged(141);
            }
            hVar.f93662a.m();
        }
    }

    public h(@NotNull a aVar, int i7, @NotNull List<? extends UIComponent<?>> list, @NotNull Function0<Unit> function0) {
        this.f93662a = aVar;
        this.f93663b = i7;
        this.f93664c = list;
        this.f93665d = function0;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a1 a1VarInflate = a1.inflate(layoutInflater, viewGroup, false);
        a1VarInflate.f130631C.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView = a1VarInflate.f130629A;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(com.bilibili.ship.theseus.united.page.intro.i.a());
        recyclerView.addItemDecoration(new i(context));
        return a1VarInflate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull zu0.a1 r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h.b(zu0.a1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
