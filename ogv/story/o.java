package com.bilibili.ogv.story;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.bplus.followingpublish.fragments.m0;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/o.class */
@StabilityInferred(parameters = 0)
public final class o extends DataBindingComponent<Gl0.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f73098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f73099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f73102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f73103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f73104g;

    @NotNull
    public final StateFlow<Long> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DK.a f73105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final OgvStoryEpisodeListVm f73106j;

    public o(@NotNull Context context, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, long j7, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull StateFlow stateFlow, @NotNull Function5 function5, @NotNull DK.a aVar) {
        this.f73098a = context;
        this.f73099b = lifecycleCoroutineScope;
        this.f73100c = j7;
        this.f73101d = i7;
        this.f73102e = str;
        this.f73103f = str2;
        this.f73104g = str3;
        this.h = stateFlow;
        this.f73105i = aVar;
        OgvStoryEpisodeListVm ogvStoryEpisodeListVm = new OgvStoryEpisodeListVm(context, j7, ((Number) stateFlow.getValue()).longValue(), new n(this, function5), str2, str, str3, new Function0(this) { // from class: com.bilibili.ogv.story.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f73095a;

            {
                this.f73095a = this;
            }

            public final Object invoke() {
                o oVar = this.f73095a;
                Neurons.reportClick(false, "main.ugc-video-detail-vertical.content-select-panel.bangumi-follow.click", oVar.f());
                if (BiliAccounts.get(oVar.f73098a).isLogin()) {
                    com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                    com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(oVar.f73100c));
                    com.bilibili.community.follow.b bVar2 = bVar;
                    if (bVar == null) {
                        bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                    }
                    BuildersKt.launch$default(oVar.f73099b, (CoroutineContext) null, (CoroutineStart) null, new OgvStorySeasonListComponent$1$1(bVar2.a, oVar, null), 3, (Object) null);
                } else {
                    com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
                }
                return Unit.INSTANCE;
            }
        });
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
        ogvStoryEpisodeListVm.u((bVar == null ? new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN) : bVar).a);
        if (-1 != ogvStoryEpisodeListVm.f73026x) {
            ogvStoryEpisodeListVm.f73026x = -1;
            ogvStoryEpisodeListVm.notifyPropertyChanged(520);
        }
        this.f73106j = ogvStoryEpisodeListVm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.bilibili.ogv.story.o r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.story.o.e(com.bilibili.ogv.story.o, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        ((Gl0.k) viewDataBinding).q(this.f73106j);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvStorySeasonListComponent$bind$2(this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Gl0.k kVarInflate = Gl0.k.inflate(layoutInflater, viewGroup, false);
        kVarInflate.f7183I.setOnClickListener(new m0(this, 1));
        kVarInflate.f7187y.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ogv.story.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f73094a;

            {
                this.f73094a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o oVar = this.f73094a;
                BuildersKt.launch$default(oVar.f73099b, (CoroutineContext) null, (CoroutineStart) null, new OgvStorySeasonListComponent$createBinding$2$1(oVar, null), 3, (Object) null);
            }
        });
        return kVarInflate;
    }

    public final HashMap<String, String> f() {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("spmid", this.f73103f), TuplesKt.to("from_spmid", this.f73102e), TuplesKt.to("trackid", this.f73104g), TuplesKt.to("goto", "vertical_pgc"), TuplesKt.to("r_id", String.valueOf(((Number) this.h.getValue()).longValue()))});
    }
}
