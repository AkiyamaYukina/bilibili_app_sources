package com.bilibili.ship.theseus.ugc;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.app.PayTask;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.google.protobuf.InvalidProtocolBufferException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.f f97939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IToastService f97940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IReporterService f97941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f97942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f97943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7893a f97944g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f97945i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/j$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f97947b;

        public a(boolean z6, @Nullable String str) {
            this.f97946a = z6;
            this.f97947b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f97946a == aVar.f97946a && Intrinsics.areEqual(this.f97947b, aVar.f97947b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f97946a);
            String str = this.f97947b;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(showDigestToast=");
            sb.append(this.f97946a);
            sb.append(", fulltextText=");
            return C8770a.a(sb, this.f97947b, ")");
        }
    }

    @Inject
    public j(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.f fVar, @NotNull IToastService iToastService, @NotNull IReporterService iReporterService, @NotNull Context context, @NotNull a aVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull C7893a c7893a) {
        this.f97938a = coroutineScope;
        this.f97939b = fVar;
        this.f97940c = iToastService;
        this.f97941d = iReporterService;
        this.f97942e = aVar;
        this.f97943f = hVar;
        this.f97944g = c7893a;
        Context applicationContext = context;
        if (EntryPointKt.getMemleakOptEnable()) {
            applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
        }
        this.h = applicationContext;
        this.f97945i = Duration.Companion.getZERO-UwyO8pc();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0374  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.ugc.j r8, com.bilibili.player.tangram.basic.WithVideoProgress r9, long r10, kotlinx.coroutines.Deferred r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.j.a(com.bilibili.ship.theseus.ugc.j, com.bilibili.player.tangram.basic.WithVideoProgress, long, kotlinx.coroutines.Deferred, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static PlayerToast b(String str) {
        return new PlayerToast.Builder().toastItemType(17).location(32).setExtraString("extra_title", str).duration(PayTask.f60018j).build();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public final Object c(@Nullable ev0.i iVar, @NotNull Deferred deferred, @NotNull WithVideoProgress withVideoProgress, @NotNull SuspendLambda suspendLambda) throws NoWhenBranchMatchedException {
        boolean isPreview;
        BLog.i("UGCEpStartPositionService-handleStartPosition", "[theseus-ugc-UGCEpStartPositionService-handleStartPosition] handleStartPosition");
        com.bilibili.ship.theseus.united.player.mediaplay.f fVar = this.f97939b;
        if (iVar != null) {
            if (fVar instanceof f.c) {
                f.c cVar = (f.c) fVar;
                try {
                    AnyKt.unpack(cVar.f104516a.getSupplement(), UGCAnyModel.class);
                } catch (InvalidProtocolBufferException e7) {
                    UGCAnyModel.getDefaultInstance();
                }
                isPreview = cVar.f104516a.getPlayArc().getIsPreview();
            } else {
                isPreview = false;
            }
            if (!isPreview) {
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UGCEpStartPositionService$seekToLandingPosition$2(this, iVar, withVideoProgress, deferred, null), suspendLambda);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
            }
        }
        if (fVar instanceof f.e) {
            return Unit.INSTANCE;
        }
        if (fVar instanceof f.b) {
            Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new UGCEpStartPositionService$handleFastPlayStart$2(((f.b) fVar).f104515a, this, withVideoProgress, deferred, null), suspendLambda);
            return objCoroutineScope2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope2 : Unit.INSTANCE;
        }
        if (fVar instanceof f.a) {
            Object objCoroutineScope3 = CoroutineScopeKt.coroutineScope(new UGCEpStartPositionService$handleCachedPlayStart$2(((f.a) fVar).f104514a, this, withVideoProgress, null), suspendLambda);
            return objCoroutineScope3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope3 : Unit.INSTANCE;
        }
        if (fVar instanceof f.c) {
            Object objCoroutineScope4 = CoroutineScopeKt.coroutineScope(new UGCEpStartPositionService$handlePlayViewPlayStart$2(deferred, this, withVideoProgress, null), suspendLambda);
            return objCoroutineScope4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope4 : Unit.INSTANCE;
        }
        if (!(fVar instanceof f.d)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCoroutineScope5 = CoroutineScopeKt.coroutineScope(new UGCEpStartPositionService$handlePlayableParamsPlayStart$2(((f.d) fVar).f104521a, deferred, withVideoProgress, this, null), suspendLambda);
        if (objCoroutineScope5 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope5 = Unit.INSTANCE;
        }
        return objCoroutineScope5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope5 : Unit.INSTANCE;
    }
}
