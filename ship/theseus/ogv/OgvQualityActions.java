package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationService;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.videoquality.BuyVipScene;
import com.bilibili.ship.theseus.united.page.videoquality.C6426a;
import com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j;
import dagger.internal.Provider;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvQualityActions.class */
@StabilityInferred(parameters = 0)
public final class OgvQualityActions implements InterfaceC6436j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f91305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.G f91308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f91309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Provider f91310g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ViewingDurationService f91312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f91313k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvQualityActions$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f91314a;

        static {
            int[] iArr = new int[BuyVipScene.values().length];
            try {
                iArr[BuyVipScene.QUALITY_SWITCH_PANEL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BuyVipScene.TRIAL_END_TOAST_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BuyVipScene.AI_ENHANCED_QUALITY_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f91314a = iArr;
        }
    }

    @Inject
    public OgvQualityActions(@NotNull OgvSeason ogvSeason, @NotNull OgvEpisode ogvEpisode, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.G g7, @NotNull BackActionRepository backActionRepository, @NotNull Provider provider, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull ViewingDurationService viewingDurationService, @NotNull com.bilibili.ship.theseus.keel.player.j jVar) {
        this.f91304a = ogvSeason;
        this.f91305b = ogvEpisode;
        this.f91306c = hVar;
        this.f91307d = coroutineScope;
        this.f91308e = g7;
        this.f91309f = backActionRepository;
        this.f91310g = provider;
        this.h = iVar;
        this.f91311i = cVar;
        this.f91312j = viewingDurationService;
        this.f91313k = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.bilibili.ship.theseus.ogv.OgvQualityActions r5, com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvQualityActions.h(com.bilibili.ship.theseus.ogv.OgvQualityActions, com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final void a(int i7, @Nullable String str) {
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    @NotNull
    public final C6426a c(@NotNull BuyVipScene buyVipScene, @Nullable com.bilibili.player.tangram.basic.a aVar) {
        String strA;
        String str;
        boolean zB = aVar == null ? false : com.bilibili.player.tangram.basic.a.b(aVar.f79320a, 100);
        com.bilibili.ship.theseus.keel.player.j jVar = this.f91313k;
        OgvEpisode ogvEpisode = this.f91305b;
        OgvSeason ogvSeason = this.f91304a;
        if (zB && buyVipScene == BuyVipScene.TRIAL_END_TOAST_ACTION) {
            com.bilibili.ogv.pub.season.a aVar2 = ogvSeason.f94450b;
            long j7 = ogvEpisode.f93555a;
            StringBuilder sb = new StringBuilder();
            sb.append(aVar2);
            sb.append("-");
            sb.append(ogvSeason.f94449a);
            strA = androidx.exifinterface.media.a.a(j7, "-", "-aiqnfreetoast", sb);
        } else if (buyVipScene == BuyVipScene.AI_ENHANCED_QUALITY_INFO) {
            com.bilibili.ogv.pub.season.a aVar3 = ogvSeason.f94450b;
            long j8 = ogvEpisode.f93555a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar3);
            sb2.append("-");
            sb2.append(ogvSeason.f94449a);
            strA = androidx.exifinterface.media.a.a(j8, "-", "-aiqninfo", sb2);
        } else {
            strA = jVar.f().getAvid() + "-" + (aVar != null ? aVar : "qn") + "-ogv";
        }
        int i7 = a.f91314a[buyVipScene.ordinal()];
        if (i7 == 1) {
            str = "pgc.player.quality-list.pay-btn.click";
        } else if (i7 != 2) {
            str = i7 != 3 ? "" : "player.player.aiqn-info.click.player";
        } else {
            str = aVar == null ? false : com.bilibili.player.tangram.basic.a.b(aVar.f79320a, 100) ? "player.player.aiqn-free-toast-pay-btn.click.player" : "pgc.player.qn-free-toast.pay-btn.click";
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String fromSpmid = jVar.f().getFromSpmid();
        String str2 = fromSpmid;
        if (fromSpmid == null) {
            str2 = "0.0.0.0";
        }
        mapCreateMapBuilder.put("from_out_spmid", str2);
        return new C6426a("1", strA, str, MapsKt.build(mapCreateMapBuilder));
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final boolean d(int i7) {
        Map map;
        RestrictionLayerVo restrictionLayerVo;
        ExtraInfo extraInfo = (ExtraInfo) this.f91310g.get();
        if (extraInfo == null || (map = (Map) Ju0.a.f11703k.a(extraInfo)) == null || (restrictionLayerVo = (RestrictionLayerVo) map.get(Integer.valueOf(i7))) == null) {
            return false;
        }
        BuildersKt.launch$default(this.f91307d, (CoroutineContext) null, (CoroutineStart) null, new OgvQualityActions$checkQualityLimit$1(this, restrictionLayerVo, null), 3, (Object) null);
        return true;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    @Nullable
    public final Object f(@NotNull vk.e eVar, @NotNull Continuation<? super Unit> continuation) {
        Duration.Companion companion = Duration.Companion;
        Object objA = this.f91312j.a(DurationKt.toDuration(eVar.c, DurationUnit.SECONDS), (ContinuationImpl) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r3 = this;
            r0 = r3
            dagger.internal.Provider r0 = r0.f91310g
            java.lang.Object r0 = r0.get()
            com.bilibili.lib.media.resource.ExtraInfo r0 = (com.bilibili.lib.media.resource.ExtraInfo) r0
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L3b
            tb0.h r0 = Ju0.a.f11697d
            r1 = r6
            java.lang.Object r0 = r0.a(r1)
            com.bilibili.ship.theseus.ogv.playviewextra.EpUserStatus r0 = (com.bilibili.ship.theseus.ogv.playviewextra.EpUserStatus) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L29
            r0 = r5
            r4 = r0
            goto L3b
        L29:
            r0 = r6
            boolean r0 = r0.a()
            if (r0 != 0) goto L39
            r0 = r5
            r4 = r0
            r0 = r6
            boolean r0 = r0.f94343a
            if (r0 == 0) goto L3b
        L39:
            r0 = 1
            r4 = r0
        L3b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvQualityActions.g():boolean");
    }
}
