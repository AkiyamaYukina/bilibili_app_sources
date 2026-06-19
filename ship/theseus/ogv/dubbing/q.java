package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProto;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProto;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.OGVDubbingResult;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/q.class */
@StabilityInferred(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f91888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<PlayDubbingInfo> f91889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f91890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f91891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IToastService f91892g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final c f91893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Provider f91894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f91895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f91897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final i f91898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final d f91899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public PlayDubbingInfo f91900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public g f91901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public h f91902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Map<Long, e> f91903s = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f91904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f91905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public b f91906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final p f91907w;

    @Inject
    public q(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull Flow flow, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IInteractLayerService iInteractLayerService, @NotNull IToastService iToastService, @NotNull Context context, @NotNull c cVar2, @NotNull Provider provider, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IControlContainerService iControlContainerService, @NotNull i iVar, @NotNull d dVar) {
        this.f91886a = coroutineScope;
        this.f91887b = cVar;
        this.f91888c = iPlayerCoreService;
        this.f91889d = flow;
        this.f91890e = absFunctionWidgetService;
        this.f91891f = iInteractLayerService;
        this.f91892g = iToastService;
        this.h = context;
        this.f91893i = cVar2;
        this.f91894j = provider;
        this.f91895k = jVar;
        this.f91896l = hVar;
        this.f91897m = iControlContainerService;
        this.f91898n = iVar;
        this.f91899o = dVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SwitchDubbingService$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SwitchDubbingService$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SwitchDubbingService$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SwitchDubbingService$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SwitchDubbingService$5(this, null), 3, (Object) null);
        iVar.setOnClickListener(new CR.g(this, 3));
        this.f91907w = new p(this);
    }

    public static final void a(q qVar, String str) {
        qVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        qVar.f91892g.showToast(qb.g.a(32, 17, "extra_title", str).duration(5000L).build());
    }

    public static PlayDubbingInfo b(PlayDubbingInfo playDubbingInfo, long j7) {
        List roleAudioListList = playDubbingInfo.getRoleAudioListList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : roleAudioListList) {
            if (((RoleAudioProto) obj).getRoleId() == j7) {
                arrayList.add(obj);
            }
        }
        PlayDubbingInfo playDubbingInfo2 = playDubbingInfo;
        if (!arrayList.isEmpty()) {
            playDubbingInfo2 = (PlayDubbingInfo) playDubbingInfo.toBuilder().clearRoleAudioList().addAllRoleAudioList(arrayList).build();
        }
        return playDubbingInfo2;
    }

    public final void c(boolean z6) {
        IRemoteHandler remoteHandler = this.f91891f.getRemoteHandler();
        if (remoteHandler != null) {
            OGVDubbingResult.Request request = new OGVDubbingResult.Request();
            request.setStatus(Boolean.valueOf(z6));
            remoteHandler.onDubbingPanelChanged(request);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [android.app.Dialog, com.bilibili.ship.theseus.ogv.dubbing.g, tv.danmaku.bili.widget.BaseDialog] */
    public final void d(@NotNull Context context, long j7) {
        List roleAudioListList;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f91887b;
        if (cVar.h().f102988b) {
            p pVar = this.f91907w;
            AbsFunctionWidgetService absFunctionWidgetService = this.f91890e;
            absFunctionWidgetService.addOnWidgetStateChangeListener(pVar);
            h hVar = (h) this.f91894j.get();
            PlayDubbingInfo playDubbingInfo = this.f91900p;
            hVar.f91860f = playDubbingInfo != null ? b(playDubbingInfo, j7) : null;
            absFunctionWidgetService.showWidget(hVar, new IFunctionContainer.LayoutParams(Uj0.c.b(252, this.h), -1, 4));
            this.f91902r = hVar;
        } else {
            PlayDubbingInfo playDubbingInfo2 = this.f91900p;
            if (playDubbingInfo2 != null) {
                ?? gVar = new g(context, this, cVar, b(playDubbingInfo2, j7));
                this.f91901q = gVar;
                gVar.show();
                gVar.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.ship.theseus.ogv.dubbing.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final q f91884a;

                    {
                        this.f91884a = this;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q qVar = this.f91884a;
                        qVar.c(false);
                        qVar.f91901q = null;
                        qVar.f91904t = false;
                    }
                });
                this.f91904t = true;
            }
        }
        PlayDubbingInfo playDubbingInfo3 = this.f91900p;
        if (playDubbingInfo3 != null && (roleAudioListList = playDubbingInfo3.getRoleAudioListList()) != null) {
            List list = roleAudioListList;
            ArrayList<RoleAudioProto> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((RoleAudioProto) obj).getRoleId() != j7) {
                    arrayList.add(obj);
                }
            }
            for (RoleAudioProto roleAudioProto : arrayList) {
                e eVar = (e) ((LinkedHashMap) this.f91903s).get(Long.valueOf(roleAudioProto.getRoleId()));
                if (eVar == null) {
                    AudioMaterialProto audioMaterialProto = (AudioMaterialProto) roleAudioProto.getAudioMaterialListList().get(0);
                    eVar = new e(0, audioMaterialProto.getEdition(), audioMaterialProto.getAudioList());
                }
                this.f91903s.put(Long.valueOf(roleAudioProto.getRoleId()), eVar);
            }
        }
        c(true);
    }
}
