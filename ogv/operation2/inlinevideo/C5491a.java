package com.bilibili.ogv.operation2.inlinevideo;

import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineHistoryReportSource;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.ogv.kmm.operation.inlinevideo.InlineType;
import com.bilibili.ogv.operation2.inlinevideo.f;
import com.bilibili.ogv.operation3.module.operablecard.BizType;
import com.bilibili.ogv.pub.play.OGVPlayableParams;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.player.history.MediaHistoryEntry;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/a.class */
@StabilityInferred(parameters = 0)
public final class C5491a extends AbstractC5494d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f70905n = 8;

    @NotNull
    private final Fragment h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f70906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f70907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f70908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final b f70909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final f f70910m;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/a$a.class */
    public static final /* synthetic */ class C0435a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f70911a;

        static {
            int[] iArr = new int[InlineType.values().length];
            try {
                iArr[InlineType.TYPE_HE_CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f70911a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.a$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/a$b.class */
    public static final class b implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C5491a f70912a;

        public b(C5491a c5491a) {
            this.f70912a = c5491a;
        }

        @Override // com.bilibili.ogv.operation2.inlinevideo.f.b
        public void a(ICardPlayerContext iCardPlayerContext, int i7) {
            this.f70912a.Z();
        }

        @Override // com.bilibili.ogv.operation2.inlinevideo.f.b
        public void b(boolean z6, Object obj) {
            ICardPlayerContext cardPlayerContext;
            int i7;
            int i8;
            ICardPlayerContext cardPlayerContext2;
            com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
            this.f70912a.a0(z6);
            if (!z6 || this.f70912a.z() == null) {
                return;
            }
            com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = this.f70912a.z();
            com.bilibili.ogv.kmm.operation.inlinevideo.p pVar = (gVarZ == null || (dVar = gVarZ.f68496a) == null) ? null : dVar.f68489g;
            if (pVar != null && (i7 = pVar.f68515a) > 0 && (i8 = pVar.f68516b) > 0) {
                float f7 = i7 / i8;
                C5491a c5491a = this.f70912a;
                if (f7 > c5491a.W(c5491a.getInlineContainer())) {
                    A aH = this.f70912a.h();
                    if (aH == null || (cardPlayerContext2 = aH.getCardPlayerContext()) == null) {
                        return;
                    }
                    cardPlayerContext2.setAspectRatio(AspectRatio.RATIO_CENTER_CROP);
                    return;
                }
            }
            A aH2 = this.f70912a.h();
            if (aH2 == null || (cardPlayerContext = aH2.getCardPlayerContext()) == null) {
                return;
            }
            cardPlayerContext.setAspectRatio(AspectRatio.RATIO_ADJUST_CONTENT);
        }
    }

    public C5491a(@NotNull Fragment fragment, @NotNull View view, @Nullable String str, @Nullable f.a aVar, @NotNull String str2, @NotNull Function0<Unit> function0) {
        super(view);
        this.h = fragment;
        this.f70906i = str;
        this.f70907j = str2;
        this.f70908k = function0;
        b bVar = new b(this);
        this.f70909l = bVar;
        this.f70910m = new f(this, bVar, aVar);
    }

    public /* synthetic */ C5491a(Fragment fragment, View view, String str, f.a aVar, String str2, Function0 function0, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, view, str, (i7 & 8) != 0 ? null : aVar, str2, function0);
    }

    private final long U() {
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
        com.bilibili.ogv.kmm.operation.inlinevideo.q qVar;
        Duration duration;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        return (gVarZ == null || (dVar = gVarZ.f68496a) == null || (qVar = dVar.h) == null || (duration = qVar.f68521b) == null) ? 0L : Duration.getInWholeMilliseconds-impl(duration.unbox-impl());
    }

    private final int V() {
        Integer intOrNull;
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
        JsonObject jsonObject;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        JsonPrimitive jsonPrimitive = null;
        JsonElement jsonElement = (gVarZ == null || (dVar = gVarZ.f68496a) == null || (jsonObject = dVar.f68488f) == null) ? null : (JsonElement) jsonObject.get("quality");
        if (jsonElement instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        }
        return (jsonPrimitive == null || (intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive)) == null) ? 0 : intOrNull.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float W(View view) {
        if (view.isShown()) {
            return view.getWidth() / view.getHeight();
        }
        return 1.7777778f;
    }

    private final void c0(BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        PegasusInlineSwitchState currentState = null;
        IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null);
        if (iPegasusInlineConfig != null) {
            currentState = iPegasusInlineConfig.getCurrentState();
        }
        if (currentState != PegasusInlineSwitchState.WIFI_ONLY || z6) {
            cardPlayTask.setNetworkAlertEnable(false);
        } else {
            cardPlayTask.setNetworkAlertEnable(true);
        }
    }

    public static /* synthetic */ void d0(C5491a c5491a, BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        c5491a.c0(cardPlayTask, z6);
    }

    private final void e0(BiliCardPlayerScene.CardPlayTask cardPlayTask, long j7) {
        cardPlayTask.setCurrentPositionInterceptor(new Ql0.c(j7));
        cardPlayTask.addSeekInterceptor(new Ql0.d(j7));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01f1  */
    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(@org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.inlinevideo.g r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.C5491a.B(com.bilibili.ogv.kmm.operation.inlinevideo.g, boolean):void");
    }

    public final void S(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask) {
        OGVPlayableParams oGVPlayableParamsD;
        com.bilibili.ogv.kmm.operation.inlinevideo.a aVar;
        com.bilibili.ogv.kmm.operation.inlinevideo.a aVar2;
        com.bilibili.ogv.kmm.operation.inlinevideo.a aVar3;
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
        com.bilibili.ogv.kmm.operation.inlinevideo.q qVar;
        Duration duration;
        MediaHistoryEntry history;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        BizType bizType = gVarZ != null ? gVarZ.f68497b : null;
        BizType bizType2 = BizType.UGC;
        i iVar = bizType != bizType2 ? new i(null, 1, null) : new InlineUGCHistoryServiceV2((String) null, (InlineHistoryReportSource) null, 3, (DefaultConstructorMarker) null);
        Video.PlayableParams inlinePlayableParams = getCardData().getInlinePlayerItem().getInlinePlayableParams();
        if (inlinePlayableParams != null) {
            IMediaHistoryKeyParams mediaHistoryKayParams = inlinePlayableParams.getMediaHistoryKayParams();
            int progress = (mediaHistoryKayParams == null || (history = iVar.readHistory(mediaHistoryKayParams)) == null) ? 0 : history.getProgress();
            long jU = U();
            long j7 = (gVarZ == null || (dVar = gVarZ.f68496a) == null || (qVar = dVar.h) == null || (duration = qVar.f68520a) == null) ? 0L : Duration.getInWholeMilliseconds-impl(duration.unbox-impl());
            if ((gVarZ != null ? gVarZ.f68497b : null) != bizType2) {
                i iVar2 = iVar;
                InlineType inlineType = null;
                if (gVarZ != null) {
                    com.bilibili.ogv.kmm.operation.inlinevideo.d dVar2 = gVarZ.f68496a;
                    inlineType = null;
                    if (dVar2 != null) {
                        com.bilibili.ogv.kmm.operation.inlinevideo.q qVar2 = dVar2.h;
                        inlineType = null;
                        if (qVar2 != null) {
                            inlineType = qVar2.f68523d;
                        }
                    }
                }
                if ((inlineType == null ? -1 : C0435a.f70911a[inlineType.ordinal()]) == 1) {
                    com.bilibili.ogv.kmm.operation.inlinevideo.q qVar3 = gVarZ.f68496a.h;
                    e0(cardPlayTask, (qVar3 == null || (aVar3 = qVar3.f68524e) == null) ? Duration.Companion.getZERO-UwyO8pc() : aVar3.f68470b);
                    com.bilibili.ogv.kmm.operation.inlinevideo.d dVar3 = gVarZ.f68496a;
                    com.bilibili.ogv.kmm.operation.inlinevideo.q qVar4 = dVar3.h;
                    long j8 = (qVar4 == null || (aVar2 = qVar4.f68524e) == null) ? Duration.Companion.getZERO-UwyO8pc() : aVar2.f68470b;
                    com.bilibili.ogv.kmm.operation.inlinevideo.q qVar5 = dVar3.h;
                    long j9 = (qVar5 == null || (aVar = qVar5.f68524e) == null) ? Duration.Companion.getZERO-UwyO8pc() : aVar.f68471c;
                    Duration.Companion companion = Duration.Companion;
                    long duration2 = DurationKt.toDuration(progress, DurationUnit.MILLISECONDS);
                    if (!(Duration.box-impl(duration2).compareTo(Duration.box-impl(j8)) >= 0 && Duration.box-impl(duration2).compareTo(Duration.box-impl(j9)) <= 0)) {
                        iVar2.a(y.d(gVarZ, this.f70906i), 0L, j7, false);
                    }
                } else if ((progress <= 0 || progress >= j7) && gVarZ != null && (oGVPlayableParamsD = y.d(gVarZ, this.f70906i)) != null) {
                    iVar2.a(oGVPlayableParamsD, jU, j7, false);
                }
            } else {
                InlineUGCHistoryServiceV2 inlineUGCHistoryServiceV2 = (InlineUGCHistoryServiceV2) iVar;
                if (progress <= 0 || progress >= j7) {
                    inlineUGCHistoryServiceV2.saveHistory(y.e(gVarZ, this.f70906i), jU, j7, jU, j7);
                }
            }
        }
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ogv.operation2.inlinevideo.x T() {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.C5491a.T():com.bilibili.ogv.operation2.inlinevideo.x");
    }

    public final void X(@Nullable String str, @NotNull Pair<String, String>... pairArr) {
        if (str == null || str.length() == 0) {
            return;
        }
        RouteRequest.Builder builder = new RouteRequest.Builder(Uri.parse(str));
        for (Pair<String, String> pair : pairArr) {
            Qj0.g.b(builder, (String) pair.getFirst(), (String) pair.getSecond());
        }
        Qj0.g.c(f().getContext(), builder.build());
    }

    public final boolean Y() {
        ICardPlayerContext cardPlayerContext;
        A aH = h();
        int playerState = (aH == null || (cardPlayerContext = aH.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
        boolean z6 = false;
        if (playerState > 2) {
            z6 = false;
            if (playerState < 7) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void Z() {
    }

    public final void a0(boolean z6) {
    }

    public final void b0(int i7) {
        this.f70910m.f(i7);
        this.f70910m.reset(this);
        i().reset();
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        if ((gVarZ != null ? gVarZ.f68496a : null) == null) {
            i().setVisibility(4);
            u().setVisibility(4);
        } else {
            i().setVisibility(0);
            u().setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider] */
    @NotNull
    public BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
        com.bilibili.ogv.kmm.operation.inlinevideo.q qVar;
        Duration duration;
        S(cardPlayTask);
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        cardPlayTask.setCustomFakeDuration((gVarZ == null || (dVar = gVarZ.f68496a) == null || (qVar = dVar.h) == null || (duration = qVar.f68520a) == null) ? 0L : Duration.getInWholeMilliseconds-impl(duration.unbox-impl()));
        this.f70910m.g(U());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, this.f70910m);
        c0(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        cardPlayTask.setDesiredQuality(V());
        cardPlayTask.setCommonResolveTaskProvider((CommonResolveTaskProvider) new Object());
        cardPlayTask.setTaskRepository(new B());
        return cardPlayTask;
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d
    @Nullable
    public String w() {
        return this.f70906i;
    }
}
