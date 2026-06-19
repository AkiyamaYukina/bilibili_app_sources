package com.bilibili.ogv.operation.modular.modules.banner;

import Pk0.w;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.banner.Banner;
import com.bilibili.banner.LineIndicator;
import com.bilibili.bplus.followinglist.quick.consume.C;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.infra.tempfile.e;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.RecommendModule;
import com.bilibili.ogv.pub.play.OGVPlayableParams;
import com.google.gson.JsonObject;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.ICardPlayerInfoListener;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/c.class */
@StabilityInferred(parameters = 0)
public final class c extends com.bilibili.ogv.operation.inlineplayer2.a<InlinePanel> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f70439n = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final w f70440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f70441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f70442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.emoticon.emoji2.s f70443g;

    @NotNull
    public final com.bilibili.bililive.room.ui.roomv3.voice.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Banner f70444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LineIndicator f70445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardView f70446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public RecommendModule f70447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f70448m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends InlinePanel {
        @NotNull
        public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
            return new View(layoutInflater.getContext());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/c$b.class */
    public static final class b implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f70449a;

        public b(c cVar) {
            this.f70449a = cVar;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            s sVar = ((Ek0.w) this.f70449a.h.b).f4600B;
            if (sVar != null) {
                if (sVar.f70507c) {
                    sVar.f70507c = false;
                    sVar.notifyPropertyChanged(449);
                }
                if (sVar.f70506b) {
                    sVar.f70506b = false;
                    sVar.notifyPropertyChanged(664);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.banner.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/c$c.class */
    public static final class C0429c implements ICardPlayerInfoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f70450a;

        public C0429c(c cVar) {
            this.f70450a = cVar;
        }

        public final void onInfo(int i7, Object obj) {
            com.bilibili.ogv.operation.modular.modules.banner.a aVar;
            CommonCard commonCard;
            ICardPlayerContext cardPlayerContext;
            c cVar = this.f70450a;
            if (i7 != 1) {
                if (i7 == 2) {
                    s sVar = ((Ek0.w) cVar.h.b).f4600B;
                    if (sVar != null) {
                        if (true != sVar.f70507c) {
                            sVar.f70507c = true;
                            sVar.notifyPropertyChanged(449);
                        }
                        if (true != sVar.f70506b) {
                            sVar.f70506b = true;
                            sVar.notifyPropertyChanged(664);
                        }
                        i iVarO = sVar.o();
                        if (iVarO != null && true != iVarO.f70472s) {
                            iVarO.f70472s = true;
                            iVarO.notifyPropertyChanged(270);
                        }
                    }
                    InlinePanel inlinePanelV0 = cVar.v0();
                    if (inlinePanelV0 != null && (cardPlayerContext = inlinePanelV0.getCardPlayerContext()) != null) {
                        cardPlayerContext.setAspectRatio(AspectRatio.RATIO_ADJUST_CONTENT);
                    }
                    s sVar2 = ((Ek0.w) cVar.h.b).f4600B;
                    Map<String, String> map = (sVar2 == null || (aVar = sVar2.f70509e) == null || (commonCard = aVar.f70438g) == null) ? null : commonCard.f69701D0;
                    Map<String, String> mapEmptyMap = map;
                    if (map == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    Neurons.reportExposure$default(false, C8770a.a(new StringBuilder("pgc."), cVar.f70442f, ".banner.dynamic.show"), mapEmptyMap, (List) null, 8, (Object) null);
                    return;
                }
                if (i7 != 3) {
                    return;
                }
            }
            s sVar3 = ((Ek0.w) cVar.h.b).f4600B;
            if (sVar3 != null) {
                if (sVar3.f70507c) {
                    sVar3.f70507c = false;
                    sVar3.notifyPropertyChanged(449);
                }
                if (sVar3.f70506b) {
                    sVar3.f70506b = false;
                    sVar3.notifyPropertyChanged(664);
                }
            }
        }
    }

    public c(@NotNull Ek0.w wVar, @NotNull w wVar2, @Nullable String str, @NotNull String str2, @NotNull com.bilibili.app.comm.emoticon.emoji2.s sVar, @NotNull com.bilibili.bililive.room.ui.roomv3.voice.b bVar) {
        super(wVar.getRoot());
        this.f70440d = wVar2;
        this.f70441e = str;
        this.f70442f = str2;
        this.f70443g = sVar;
        this.h = bVar;
        this.f70448m = LazyKt.lazy(new C(this, 1));
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    public final boolean A0() {
        s sVar = ((Ek0.w) this.h.b).f4600B;
        boolean z6 = false;
        if (sVar != null) {
            z6 = false;
            if (sVar.f70506b) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x042b  */
    /* JADX WARN: Type inference failed for: r0v246, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v2, types: [androidx.databinding.a, com.bilibili.ogv.operation.modular.modules.banner.a, com.bilibili.ogv.operation.modular.modules.banner.m] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5, types: [androidx.databinding.a, com.bilibili.ogv.operation.modular.modules.banner.a, com.bilibili.ogv.operation.modular.modules.banner.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E0(@org.jetbrains.annotations.NotNull com.bilibili.ogv.opbase.RecommendModule r9, @org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.NotNull Ak0.c r12) {
        /*
            Method dump skipped, instruction units count: 1878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.modular.modules.banner.c.E0(com.bilibili.ogv.opbase.RecommendModule, androidx.fragment.app.FragmentActivity, java.lang.String, Ak0.c):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider] */
    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        cardPlayTask.setCommonResolveTaskProvider((CommonResolveTaskProvider) new Object());
        cardPlayTask.setTaskRepository(new com.bilibili.ogv.operation.inlineplayer2.d());
        cardPlayTask.addPlayerStateChangedCallback(new b(this));
        cardPlayTask.addCardPlayInfoListener(new C0429c(this));
        cardPlayTask.setNetworkAlertEnable(false);
        cardPlayTask.setNetworkToastEnable(false);
        return cardPlayTask;
    }

    @NotNull
    public final IInlineCardData getCardData() {
        return (IInlineCardData) this.f70448m.getValue();
    }

    @NotNull
    public final Class<? extends InlinePanel> getPanelType() {
        return a.class;
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    public final void onBindPanel(@NotNull InlinePanel inlinePanel) {
        super.onBindPanel(inlinePanel);
        inlinePanel.setOnClickListener(new com.bilibili.bililive.room.ui.roomv3.viewv5.player.a(this, 1));
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    @Nullable
    public final Video.PlayableParams t0() {
        i iVarO;
        CommonCard commonCard;
        String str;
        Result<? extends File> result;
        File file;
        OGVPlayableParams oGVPlayableParams = new OGVPlayableParams();
        s sVar = ((Ek0.w) this.h.b).f4600B;
        if (sVar == null || (iVarO = sVar.o()) == null || (commonCard = iVarO.f70438g) == null || (str = commonCard.f69711I0) == null) {
            return null;
        }
        FrameLayout frameLayout = this.f70444i;
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banner");
            frameLayout2 = null;
        }
        frameLayout2.getContext().getApplicationContext();
        com.bilibili.ogv.infra.tempfile.e eVar = com.bilibili.ogv.infra.tempfile.a.f67935a;
        eVar.getClass();
        e.a aVar = eVar.f67945d.get("DownloadingTempFileFactory-".concat(str));
        if (aVar == null || (result = aVar.f67947b) == null) {
            file = null;
        } else {
            Object obj = result.unbox-impl();
            Object obj2 = obj;
            if (Result.isFailure-impl(obj)) {
                obj2 = null;
            }
            file = (File) obj2;
        }
        if (file == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("url", Uri.fromFile(file).toString());
        oGVPlayableParams.setFlashJsonStr(jsonObject.toString());
        oGVPlayableParams.setReportEnabled(false);
        return oGVPlayableParams;
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    @NotNull
    public final ViewGroup w0() {
        CardView cardView = this.f70446k;
        CardView cardView2 = cardView;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerVideoContainer");
            cardView2 = null;
        }
        return cardView2;
    }
}
