package com.bilibili.ship.theseus.united.player.oldway;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.player.widget.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ControlContainerConfig;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/ControlContainerLazyService.class */
@StabilityInferred(parameters = 0)
public final class ControlContainerLazyService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.biliplayerv2.service.d f104625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f104626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104628g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f104629i = LazyKt.lazy(new Tj.b(this, 5));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Map<ControlContainerType, ControlContainerConfig> f104630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f104631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f104632l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/ControlContainerLazyService$a.class */
    public static final class a extends a.a {
        public final IControlWidget a(Class<? extends IControlWidget> cls, ControlContainerType controlContainerType) {
            if (Intrinsics.areEqual(cls, Ck.a.class)) {
                return null;
            }
            return super.a(cls, controlContainerType);
        }
    }

    @Inject
    public ControlContainerLazyService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull IControlContainerService iControlContainerService, @NotNull tv.danmaku.biliplayerv2.service.d dVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f104622a = coroutineScope;
        this.f104623b = context;
        this.f104624c = iControlContainerService;
        this.f104625d = dVar;
        this.f104626e = theseusPageUIStyleRepository;
        this.f104627f = cVar;
        this.f104628g = aVar;
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.f104631k = MutableStateFlow;
        this.f104632l = MutableStateFlow;
    }

    public final void a() {
        if (this.h) {
            BLog.i("ControlContainerLazyService-initControlContainer", "[theseus-united-ControlContainerLazyService-initControlContainer] already init control container config");
            return;
        }
        BLog.i("ControlContainerLazyService-initControlContainer", "[theseus-united-ControlContainerLazyService-initControlContainer] by lazy, set default control container config");
        ((yk.b) this.f104629i.getValue()).c = new com.bilibili.app.gemini.player.widget.a(new a.a(this.f104623b));
        this.h = true;
        b();
        BuildersKt.launch$default(this.f104622a, (CoroutineContext) null, (CoroutineStart) null, new ControlContainerLazyService$initControlContainer$1(this, null), 3, (Object) null);
    }

    public final void b() {
        ControlContainerType controlContainerType;
        IControlContainerService iControlContainerService = this.f104624c;
        ControlContainerType state = iControlContainerService.getState();
        com.bilibili.ship.theseus.united.page.screensize.a aVar = this.f104628g;
        boolean zF = aVar.f();
        Lazy lazy = this.f104629i;
        Map<ControlContainerType, ControlContainerConfig> map = zF ? (Map) ((yk.b) lazy.getValue()).g.getValue() : (aVar.g() || aVar.h()) ? (Map) ((yk.b) lazy.getValue()).f.getValue() : (Map) ((yk.b) lazy.getValue()).e.getValue();
        if (Intrinsics.areEqual(this.f104630j, map)) {
            BLog.i("ControlContainerLazyService-updateControlContainer", "[theseus-united-ControlContainerLazyService-updateControlContainer] control container config not change, return");
            return;
        }
        defpackage.a.b("[theseus-united-ControlContainerLazyService-updateControlContainer] ", "update control container config " + map + ", current type: " + state, "ControlContainerLazyService-updateControlContainer");
        this.f104630j = map;
        Iterator<Map.Entry<ControlContainerType, ControlContainerConfig>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setEnable(true);
        }
        iControlContainerService.setControlContainerConfig(map);
        c.a aVarH = this.f104627f.h();
        if (state != ControlContainerType.INITIAL) {
            controlContainerType = state;
        } else {
            boolean z6 = aVarH.f102988b;
            if (z6) {
                boolean z7 = aVarH.f102987a;
                controlContainerType = (!z6 || z7) ? (z6 && z7) ? ControlContainerType.VERTICAL_FULLSCREEN : ControlContainerType.HALF_SCREEN : ControlContainerType.LANDSCAPE_FULLSCREEN;
            } else {
                controlContainerType = ControlContainerType.HALF_SCREEN;
            }
        }
        iControlContainerService.switchTo(controlContainerType);
        iControlContainerService.setEditHandler(this.f104625d);
        MutableStateFlow<Long> mutableStateFlow = this.f104631k;
        mutableStateFlow.setValue(Long.valueOf(((Number) mutableStateFlow.getValue()).longValue() + 1));
    }
}
