package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.ContentScale;
import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import com.bilibili.ogv.operation2.banner.BannerHdrVideoConfigHelperImpl;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import j$.time.Clock;
import java.util.Map;
import kntr.common.dionysus.vod.url.VodUrlPlayer;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/T.class */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow<ExposureLayoutInfo> f68047a = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState<Boolean> f68048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f68049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f68050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q91.i f68051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f68052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableState f68053g;
    public final MutableFloatState h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f68054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableState f68055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MutableState f68056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableState f68057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S f68058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BannerHdrVideoConfigHelperImpl f68059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C5437a.e f68060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U f68061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f68062q;

    public T(CoroutineScope coroutineScope, BannerHdrVideoConfigHelperImpl bannerHdrVideoConfigHelperImpl, C5437a.e eVar, U u7, String str) {
        this.f68059n = bannerHdrVideoConfigHelperImpl;
        this.f68060o = eVar;
        this.f68061p = u7;
        this.f68062q = str;
        Boolean bool = Boolean.FALSE;
        this.f68048b = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f68049c = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f68050d = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        q91.i.Companion.getClass();
        this.f68051e = new q91.i(Clock.systemUTC().instant());
        this.f68052f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f68053g = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.h = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f68054i = "close";
        VodUrlPlayer vodUrlPlayer = new VodUrlPlayer(coroutineScope, (kntr.common.dionysus.basic.ijk.a) null, 0, (kntr.common.dionysus.basic.surface.j) null, 26);
        vodUrlPlayer.e.a(ContentScale.Companion.getCrop());
        this.f68055j = SnapshotStateKt.mutableStateOf$default(vodUrlPlayer, null, 2, null);
        this.f68056k = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f68057l = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$3(this, bannerHdrVideoConfigHelperImpl, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$4(bannerHdrVideoConfigHelperImpl, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$6(eVar, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CreateHdrVideoModel$invoke$1$9(this, bannerHdrVideoConfigHelperImpl, null), 3, (Object) null);
        this.f68058m = new S(this);
    }

    public static final Map a(T t7) {
        t7.getClass();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(t7.f68060o.f68095d);
        mapCreateMapBuilder.put("type", t7.f68054i);
        q91.i.Companion.getClass();
        mapCreateMapBuilder.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(Duration.getInWholeMilliseconds-impl(new q91.i(Clock.systemUTC().instant()).b(t7.f68051e))));
        return MapsKt.build(mapCreateMapBuilder);
    }

    public final VodUrlPlayer b() {
        return (VodUrlPlayer) this.f68055j.getValue();
    }
}
