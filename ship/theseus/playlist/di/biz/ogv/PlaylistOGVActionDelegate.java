package com.bilibili.ship.theseus.playlist.di.biz.ogv;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.app.gemini.player.feature.snapshot.PosterStyle;
import com.bilibili.app.gemini.player.widget.like.z;
import com.bilibili.app.gemini.player.widget.selector.f;
import com.bilibili.app.gemini.player.widget.selector.g;
import com.bilibili.app.gemini.share.SharePosition;
import com.bilibili.app.gemini.share.i;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import javax.inject.Inject;
import kntr.common.share.domain.model.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.Material;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import yk.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ogv/PlaylistOGVActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class PlaylistOGVActionDelegate implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvActionDelegate f95372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95373b;

    @Inject
    public PlaylistOGVActionDelegate(@NotNull OgvActionDelegate ogvActionDelegate, @NotNull PlaylistSchedulingService playlistSchedulingService) {
        this.f95372a = ogvActionDelegate;
        this.f95373b = playlistSchedulingService;
    }

    public final boolean A() {
        this.f95372a.A();
        return false;
    }

    @Nullable
    public final i B(@NotNull SharePosition sharePosition) {
        return this.f95372a.B(sharePosition);
    }

    @NotNull
    public final e C(@NotNull String str) {
        return this.f95372a.C(str);
    }

    public final boolean D() {
        return this.f95372a.D();
    }

    @Nullable
    public final StateFlow<Long> E() {
        return this.f95372a.f94265i.E();
    }

    @Nullable
    public final Function3<Modifier, Composer, Integer, Unit> F() {
        return this.f95372a.F();
    }

    @Nullable
    public final StateFlow<Boolean> H() {
        return this.f95372a.H();
    }

    @Nullable
    public final StateFlow<Long> I() {
        return this.f95372a.f94265i.I();
    }

    @Nullable
    public final Deferred<Boolean> J() {
        return this.f95372a.J();
    }

    public final boolean K() {
        return this.f95372a.K();
    }

    public final void L() {
        this.f95372a.L();
    }

    @NotNull
    public final e M(@NotNull String str, @Nullable Function0<Bitmap> function0, @Nullable Function0<String> function02) {
        return this.f95372a.M(str, function0, function02);
    }

    @NotNull
    public final String N() {
        return this.f95372a.N();
    }

    @Nullable
    public final StateFlow<Long> O() {
        return this.f95372a.f94265i.O();
    }

    @NotNull
    public final String P() {
        return this.f95372a.P();
    }

    public final boolean Q() {
        return this.f95372a.f94265i.Q();
    }

    public final boolean R() {
        return this.f95372a.R();
    }

    @Nullable
    public final StateFlow<f> S() {
        return null;
    }

    public final void T() {
        this.f95372a.T();
    }

    @NotNull
    public final PosterStyle U() {
        this.f95372a.getClass();
        return PosterStyle.STYLE_WITH_SUBTITLE;
    }

    public final void V(@NotNull g gVar, int i7) {
        this.f95372a.V(gVar, i7);
    }

    @NotNull
    public final String W() {
        return this.f95372a.W();
    }

    @Nullable
    public final StateFlow<Boolean> X() {
        return this.f95372a.X();
    }

    @Nullable
    public final String Y() {
        return this.f95372a.f94265i.Y();
    }

    public final void Z() {
        this.f95372a.Z();
    }

    @Nullable
    public final z a() {
        return this.f95372a.f94265i.a();
    }

    public final boolean a0() {
        return this.f95372a.f94265i.a0();
    }

    @Nullable
    public final Drawable b() {
        return this.f95372a.f94265i.b();
    }

    @Nullable
    public final String b0() {
        return this.f95372a.b0();
    }

    public final boolean c() {
        return this.f95372a.c();
    }

    @NotNull
    public final String c0() {
        return this.f95372a.c0();
    }

    @Nullable
    public final String d(@NotNull SharePosition sharePosition) {
        return this.f95372a.d(sharePosition);
    }

    public final void d0() {
        this.f95372a.d0();
    }

    @Nullable
    public final StateFlow<PlayNetworkEnv> e() {
        return this.f95372a.f94265i.e();
    }

    public final boolean e0() {
        this.f95372a.getClass();
        return true;
    }

    @Nullable
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        return this.f95372a.f94265i.f();
    }

    @Nullable
    public final StateFlow<Boolean> f0() {
        return this.f95372a.f0();
    }

    public final void g() {
        BuildersKt.launch$default(j0(), (CoroutineContext) null, (CoroutineStart) null, new PlaylistOGVActionDelegate$onPlayerPreviousWidgetClick$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final StateFlow<Long> g0() {
        return this.f95372a.f94265i.g0();
    }

    @Nullable
    public final String getArcTitle() {
        return this.f95372a.f94259b.f94453e;
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        return this.f95372a.f94265i.getCoinStyle();
    }

    @Nullable
    public final Drawable getLikeIcon() {
        return this.f95372a.f94265i.getLikeIcon();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f95372a.getLikedIcon();
    }

    public final int getTemplateId() {
        return this.f95372a.getTemplateId();
    }

    public final long getTypeId() {
        return this.f95372a.getTypeId();
    }

    public final void h() {
        BuildersKt.launch$default(j0(), (CoroutineContext) null, (CoroutineStart) null, new PlaylistOGVActionDelegate$onPlayerNextWidgetClick$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final ShareContentProvider h0(@NotNull String str) {
        return this.f95372a.h0(str);
    }

    @Nullable
    public final StateFlow<Boolean> i() {
        return this.f95372a.f94265i.i();
    }

    public final boolean i0() {
        return true;
    }

    @Nullable
    public final Pair<Class<? extends AbsFunctionWidget>, AbsFunctionWidget.Configuration> j(@NotNull String str) {
        this.f95372a.j(str);
        return null;
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f95372a.f94265i.f104705a;
    }

    @Nullable
    public final ShareContentProvider k(@NotNull String str, @NotNull Function0<String> function0) {
        return this.f95372a.k(str, function0);
    }

    public final void k0(@NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        this.f95372a.k0(material, function1);
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.f95372a.l(str, str2, str3);
    }

    public final boolean l0() {
        return this.f95372a.l0();
    }

    @Nullable
    public final String m() {
        return this.f95372a.m();
    }

    @NotNull
    public final String m0() {
        return this.f95372a.m0();
    }

    @Nullable
    public final MutableSharedFlow<yk.e> n() {
        return this.f95372a.f94265i.f104721r;
    }

    @Nullable
    public final Integer n0(@Nullable String str) {
        return this.f95372a.n0(str);
    }

    public final boolean o() {
        return this.f95372a.o();
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        return this.f95372a.f94265i.o0();
    }

    @NotNull
    public final String p() {
        return this.f95372a.f94260c.b();
    }

    public final boolean p0() {
        return this.f95372a.p0();
    }

    public final int q() {
        return this.f95372a.f94265i.q();
    }

    @Nullable
    public final String q0(@NotNull SharePosition sharePosition) {
        return this.f95372a.q0(sharePosition);
    }

    public final boolean r() {
        return this.f95372a.r();
    }

    @Nullable
    public final Integer s() {
        return this.f95372a.f94265i.s();
    }

    public final boolean t() {
        return this.f95372a.t();
    }

    @NotNull
    public final String u() {
        return this.f95372a.u();
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        this.f95372a.v(str, pageType);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        return this.f95372a.f94265i.w(view);
    }

    @Nullable
    public final StateFlow<wk.a> x() {
        return this.f95372a.f94265i.f104722s;
    }

    @Nullable
    public final String y() {
        return this.f95372a.y();
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        this.f95372a.z(str, pageType);
        return true;
    }
}
