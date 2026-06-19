package com.bilibili.ogv.operation.modular.modules.banner;

import Pk0.w;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.banner.Banner;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/s.class */
@StabilityInferred(parameters = 0)
public final class s extends androidx.databinding.a implements IExposureReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f70505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f70507c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f70509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70511g;
    public boolean h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public r f70514k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public d f70517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Banner f70518o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f70520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Job f70521r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<? extends a> f70508d = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f70512i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f70513j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f70515l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f70516m = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public List<CommonCard> f70519p = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f70522s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Ck0.a f70523t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final s f70524u = this;

    /* JADX WARN: Type inference failed for: r1v8, types: [Ck0.a, java.lang.Object] */
    public s(@NotNull w wVar) {
        this.f70505a = wVar;
    }

    public static final void m(final s sVar, final FragmentActivity fragmentActivity) {
        CommonCard commonCard;
        final a aVar = sVar.f70509e;
        if (aVar == null || (commonCard = aVar.f70438g) == null || !commonCard.f69719M0 || !aVar.f70437f) {
            Job job = sVar.f70521r;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            Job jobLaunch$default = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), (CoroutineContext) null, (CoroutineStart) null, new HomeFlowBannerViewModel$checkVideoPlay$1(sVar, fragmentActivity, null), 3, (Object) null);
            if (!Intrinsics.areEqual(jobLaunch$default, sVar.f70521r)) {
                sVar.f70521r = jobLaunch$default;
                sVar.notifyPropertyChanged(329);
            }
            for (a aVar2 : sVar.f70508d) {
                aVar2.n(aVar2 == sVar.f70509e);
            }
            return;
        }
        if (true != sVar.f70511g) {
            sVar.f70511g = true;
            sVar.notifyPropertyChanged(579);
        }
        a aVar3 = sVar.f70509e;
        if (aVar3 != null && true != aVar3.f70436e) {
            aVar3.f70436e = true;
            aVar3.notifyPropertyChanged(265);
        }
        Banner banner = sVar.f70518o;
        if (banner != null) {
            banner.post(new Runnable(sVar, fragmentActivity, aVar) { // from class: com.bilibili.ogv.operation.modular.modules.banner.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final s f70495a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final FragmentActivity f70496b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final a f70497c;

                {
                    this.f70495a = sVar;
                    this.f70496b = fragmentActivity;
                    this.f70497c = aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v6, types: [Nk0.e, java.lang.Object] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    s sVar2 = this.f70495a;
                    Rect rect = new Rect();
                    Banner banner2 = sVar2.f70518o;
                    if (banner2 != null) {
                        banner2.getGlobalVisibleRect(rect);
                    }
                    sVar2.f70505a.Q(rect, new Object());
                }
            });
        }
    }

    public static final void n(s sVar, a aVar) {
        d dVar;
        if (sVar.o() == aVar) {
            return;
        }
        if (aVar instanceof i) {
            d dVar2 = sVar.f70517n;
            if (dVar2 != null) {
                dVar2.a(R$color.Graph_white, 2131103599);
            }
        } else if ((aVar instanceof m) && (dVar = sVar.f70517n) != null) {
            dVar.a(R$color.Brand_pink, 2131100290);
        }
        if (Intrinsics.areEqual(aVar, sVar.f70509e)) {
            return;
        }
        sVar.f70509e = aVar;
        sVar.notifyPropertyChanged(168);
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final void Xa(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType, @Nullable View view) {
        CommonCard commonCard;
        SourceContent sourceContent;
        CommonCard commonCard2;
        IExposureReporter.ReporterCheckerType reporterCheckerType2 = IExposureReporter.ReporterCheckerType.DefaultChecker;
        if (reporterCheckerType != reporterCheckerType2) {
            if (reporterCheckerType != IExposureReporter.ReporterCheckerType.ExtraChecker || (commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70519p, i7)) == null || (sourceContent = commonCard.f69715K0) == null) {
                return;
            }
            IAdReporter.exposeAll$default(GAdCoreKt.getGAdReport(), sourceContent, (ExtraParams) null, (String) null, false, (List) null, (String) null, false, SearchBangumiItem.TYPE_FULLNET_MOVIE, (Object) null);
            return;
        }
        CommonCard commonCard3 = (CommonCard) CollectionsKt.getOrNull(this.f70519p, i7);
        if (commonCard3 != null) {
            String strA = android.support.v4.media.a.a("pgc.", this.f70515l, ".operation.0.show");
            Map<String, String> map = commonCard3.f69701D0;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Neurons.reportExposure$default(false, strA, mapEmptyMap, (List) null, 8, (Object) null);
        }
        if (reporterCheckerType != reporterCheckerType2 || (commonCard2 = (CommonCard) CollectionsKt.getOrNull(this.f70519p, i7)) == null) {
            return;
        }
        commonCard2.f69736V = true;
    }

    @Nullable
    public final i o() {
        a aVar = this.f70509e;
        return aVar instanceof i ? (i) aVar : null;
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final boolean ve(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
        boolean z6 = true;
        if (reporterCheckerType == IExposureReporter.ReporterCheckerType.DefaultChecker) {
            CommonCard commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70519p, i7);
            z6 = (commonCard == null || commonCard.f69736V) ? false : true;
        }
        return z6;
    }
}
