package com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.s;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.service.e;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.service.f;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.service.g;
import com.bilibili.ship.theseus.united.page.intro.i;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.H;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/c.class */
@StabilityInferred(parameters = 0)
public final class c extends DataBindingComponent<H> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f93018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f93020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f93021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<a> f93022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final d f93023f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/c$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UIComponent<?> f93024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f93025b;

        public a(@NotNull UIComponent<?> uIComponent, @Nullable Function0<Unit> function0) {
            this.f93024a = uIComponent;
            this.f93025b = function0;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/c$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f93026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f93028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.pub.season.a f93029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.ogv.intro.floatlayer.service.d f93030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final e f93031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Cr.b f93032g;

        @NotNull
        public final R60.b h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final g f93033i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f93034j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f93035k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f93036l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f93037m;

        public b(long j7, boolean z6, long j8, @NotNull com.bilibili.ogv.pub.season.a aVar, @NotNull com.bilibili.ship.theseus.ogv.intro.floatlayer.service.d dVar, @NotNull e eVar, @NotNull Cr.b bVar, @NotNull R60.b bVar2, @NotNull g gVar) {
            this.f93026a = j7;
            this.f93027b = z6;
            this.f93028c = j8;
            this.f93029d = aVar;
            this.f93030e = dVar;
            this.f93031f = eVar;
            this.f93032g = bVar;
            this.h = bVar2;
            this.f93033i = gVar;
        }
    }

    public c(@NotNull b bVar, @NotNull FragmentManager fragmentManager, int i7, @NotNull f fVar, boolean z6, @NotNull StateFlow stateFlow) {
        this.f93018a = bVar;
        this.f93019b = i7;
        this.f93020c = fVar;
        this.f93021d = stateFlow;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        s sVar = new s(bVar.f93026a, bVar.f93027b, stateFlow, new LY0.a(this, 4), bVar.f93031f, bVar.f93032g);
        listCreateListBuilder.add(new a(sVar, new OgvInfoReviewFloatLayerUIComponent$items$1$1(sVar)));
        if (bVar.f93027b) {
            Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("season_id", Long.valueOf(bVar.f93028c)), TuplesKt.to("season_type", bVar.f93029d)});
            Qj0.d dVarA = Qj0.c.a("bilibili://bangumi/review/review-list");
            Class<? extends Fragment> cls = dVarA != null ? dVarA.f19963a : null;
            if (cls != null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Bundle bundle = new Bundle();
                bundle.putString("media_id", String.valueOf(bVar.f93026a));
                bundle.putString("page_name", "pgc.pgc-video-detail-text");
                bundle.putString("report_extras", JsonUtilKt.toJson(mapMapOf));
                bundle.putString("show_float_button", String.valueOf(z6));
                Unit unit = Unit.INSTANCE;
                listCreateListBuilder.add(new a(new com.bilibili.ship.theseus.united.page.floatlayer.e(fragmentManager, cls, bundle, new OgvInfoReviewFloatLayerUIComponent$items$1$component$2(objectRef, this, null)), new LY0.b(objectRef, 5)));
            }
        }
        this.f93022e = CollectionsKt.build(listCreateListBuilder);
        this.f93023f = new d(this);
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        H hInflate = H.inflate(layoutInflater, viewGroup, false);
        hInflate.f130465x.setAdapter(i.a());
        return hInflate;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v11, types: [zu0.H] */
    /* JADX WARN: Type inference failed for: r0v13, types: [zu0.H] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull zu0.H r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.c.b(zu0.H, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
