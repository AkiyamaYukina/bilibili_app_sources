package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.Context;
import com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProto;
import com.bapis.bilibili.pgc.gateway.player.v2.DashItem;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProto;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.utils.MediaItemBuilderExtKt;
import tv.danmaku.ijk.media.player.IjkMediaPlayerItem;
import tv.danmaku.videoplayer.coreV2.adapter.ijk.IjkMediaItem;
import tv.danmaku.videoplayer.coreV2.transformer.MediaItemParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/k.class */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f91868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f91869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f91871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AudioMaterialProto f91872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f91873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RoleAudioProto f91874g;
    public final PlayDubbingInfo h;

    public /* synthetic */ k(l lVar, q qVar, int i7, j jVar, AudioMaterialProto audioMaterialProto, Context context, RoleAudioProto roleAudioProto, PlayDubbingInfo playDubbingInfo) {
        this.f91868a = lVar;
        this.f91869b = qVar;
        this.f91870c = i7;
        this.f91871d = jVar;
        this.f91872e = audioMaterialProto;
        this.f91873f = context;
        this.f91874g = roleAudioProto;
        this.h = playDubbingInfo;
    }

    public final Object invoke() {
        g gVar;
        IjkMediaPlayerItem ijkMediaPlayerItemRealMediaItem;
        String baseUrl;
        String baseUrl2;
        Context context = this.f91873f;
        String str = this.f91871d.f91865f;
        List audioList = this.f91872e.getAudioList();
        int i7 = this.f91870c;
        e eVar = new e(i7, str, audioList);
        l lVar = this.f91868a;
        String str2 = lVar.f91876c ? "pgc.player.voicechange.choose.click" : "pgc.pgc-video-detail.more.voice-choose.click";
        q qVar = this.f91869b;
        qVar.getClass();
        Neurons.reportClick(false, str2, MapsKt.mapOf(TuplesKt.to("voice_version", str)));
        RoleAudioProto roleAudioProto = this.f91874g;
        e eVar2 = (e) ((LinkedHashMap) qVar.f91903s).get(Long.valueOf(roleAudioProto.getRoleId()));
        if ((eVar2 != null ? eVar2.f91846a : 0) != i7) {
            Iterator<Nj0.c> it = lVar.f91880g.iterator();
            int i8 = 0;
            while (true) {
                boolean z6 = true;
                if (!it.hasNext()) {
                    break;
                }
                Nj0.c next = it.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                j jVar = (j) next;
                if (i7 != i8) {
                    z6 = false;
                }
                if (z6 != jVar.f91866g) {
                    jVar.f91866g = z6;
                    jVar.notifyPropertyChanged(550);
                }
                i8++;
            }
            String str3 = eVar.f91847b;
            String string = str3;
            if (str3.length() == 0) {
                string = context.getString(2131855523);
            }
            if (!Intrinsics.areEqual(string, lVar.f91879f)) {
                lVar.f91879f = string;
                lVar.notifyPropertyChanged(142);
            }
            qVar.f91903s.put(Long.valueOf(roleAudioProto.getRoleId()), eVar);
            AudioMaterialProto backgroundAudio = this.h.getBackgroundAudio();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((LinkedHashMap) qVar.f91903s).values().iterator();
            while (it2.hasNext()) {
                DashItem dashItem = (DashItem) CollectionsKt.firstOrNull(((e) it2.next()).f91848c);
                if (dashItem != null && (baseUrl2 = dashItem.getBaseUrl()) != null) {
                    arrayList.add(baseUrl2);
                }
            }
            DashItem dashItem2 = (DashItem) CollectionsKt.firstOrNull(backgroundAudio.getAudioList());
            if (dashItem2 != null && (baseUrl = dashItem2.getBaseUrl()) != null) {
                arrayList.add(baseUrl);
            }
            IPlayerCoreService iPlayerCoreService = qVar.f91888c;
            MediaResource mediaResource = iPlayerCoreService.getMediaResource();
            if (mediaResource != null) {
                BuildersKt.launch$default(qVar.f91886a, (CoroutineContext) null, (CoroutineStart) null, new SwitchDubbingService$switchDubbingAudioTrack$3(qVar, null), 3, (Object) null);
                MediaItemParams.Builder mediaItemParamsBuilder = MediaItemBuilderExtKt.getMediaItemParamsBuilder(iPlayerCoreService, mediaResource);
                com.bilibili.ship.theseus.keel.player.j jVar2 = qVar.f91895k;
                mediaItemParamsBuilder.setTrackerId(jVar2.f().getCid());
                mediaItemParamsBuilder.setStartPosition(iPlayerCoreService.getRealCurrentPosition());
                mediaItemParamsBuilder.setP2pParams(jVar2.f().getP2PParams());
                MediaItemParams mediaItemParamsBuild = mediaItemParamsBuilder.build();
                IjkMediaItem ijkMediaItemCreateMediaItem = iPlayerCoreService.createMediaItem(mediaItemParamsBuild, mediaResource);
                if ((ijkMediaItemCreateMediaItem instanceof IjkMediaItem) && (ijkMediaPlayerItemRealMediaItem = ijkMediaItemCreateMediaItem.realMediaItem()) != null) {
                    ijkMediaPlayerItemRealMediaItem.setMultiAudioStream((String[]) arrayList.toArray(new String[0]));
                    iPlayerCoreService.setMediaResource(ijkMediaItemCreateMediaItem, mediaResource, true, mediaItemParamsBuild);
                    qVar.f91896l.p();
                }
            }
            if (qVar.f91905u) {
                h hVar = qVar.f91902r;
                if (hVar != null) {
                    qVar.f91890e.hideWidget(hVar);
                }
            } else if (qVar.f91904t && (gVar = qVar.f91901q) != null) {
                gVar.dismiss();
            }
        }
        return Unit.INSTANCE;
    }
}
