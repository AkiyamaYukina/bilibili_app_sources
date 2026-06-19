package com.bilibili.ship.theseus.playlist.di.biz.ugc;

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
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUGCActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class PlaylistUGCActionDelegate implements yk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UGCActionDelegate f95386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95387b;

    @Inject
    public PlaylistUGCActionDelegate(@NotNull UGCActionDelegate uGCActionDelegate, @NotNull PlaylistSchedulingService playlistSchedulingService) {
        this.f95386a = uGCActionDelegate;
        this.f95387b = playlistSchedulingService;
    }

    public final boolean A() {
        this.f95386a.A();
        return false;
    }

    @Nullable
    public final i B(@NotNull SharePosition sharePosition) {
        return this.f95386a.B(sharePosition);
    }

    @NotNull
    public final e C(@NotNull String str) {
        return this.f95386a.C(str);
    }

    public final boolean D() {
        return false;
    }

    @Nullable
    public final StateFlow<Long> E() {
        return this.f95386a.f98251s.E();
    }

    @Nullable
    public final Function3<Modifier, Composer, Integer, Unit> F() {
        this.f95386a.F();
        return null;
    }

    @Nullable
    public final StateFlow<Boolean> H() {
        return this.f95386a.H();
    }

    @Nullable
    public final StateFlow<Long> I() {
        return this.f95386a.f98251s.I();
    }

    @Nullable
    public final Deferred<Boolean> J() {
        return this.f95386a.J();
    }

    public final boolean K() {
        return this.f95386a.K();
    }

    public final void L() {
        this.f95386a.L();
    }

    @NotNull
    public final e M(@NotNull String str, @Nullable Function0<Bitmap> function0, @Nullable Function0<String> function02) {
        return this.f95386a.M(str, function0, function02);
    }

    @NotNull
    public final String N() {
        return this.f95386a.N();
    }

    @Nullable
    public final StateFlow<Long> O() {
        return this.f95386a.f98251s.O();
    }

    @NotNull
    public final String P() {
        return this.f95386a.P();
    }

    public final boolean Q() {
        return this.f95386a.f98251s.Q();
    }

    public final boolean R() {
        return false;
    }

    @Nullable
    public final StateFlow<f> S() {
        return null;
    }

    public final void T() {
        this.f95386a.T();
    }

    @NotNull
    public final PosterStyle U() {
        return this.f95386a.U();
    }

    public final void V(@NotNull g gVar, int i7) {
        this.f95386a.V(gVar, i7);
    }

    @NotNull
    public final String W() {
        this.f95386a.W();
        return "";
    }

    @Nullable
    public final StateFlow<Boolean> X() {
        return this.f95386a.X();
    }

    @Nullable
    public final String Y() {
        return this.f95386a.f98251s.Y();
    }

    public final void Z() {
        this.f95386a.Z();
    }

    @Nullable
    public final z a() {
        return this.f95386a.f98251s.a();
    }

    public final boolean a0() {
        return this.f95386a.f98251s.a0();
    }

    @Nullable
    public final Drawable b() {
        return this.f95386a.f98251s.b();
    }

    @Nullable
    public final String b0() {
        return this.f95386a.b0();
    }

    public final boolean c() {
        this.f95386a.c();
        return true;
    }

    @NotNull
    public final String c0() {
        return this.f95386a.c0();
    }

    @Nullable
    public final String d(@NotNull SharePosition sharePosition) {
        return this.f95386a.d(sharePosition);
    }

    public final void d0() {
        this.f95386a.d0();
    }

    @Nullable
    public final StateFlow<PlayNetworkEnv> e() {
        return this.f95386a.f98251s.e();
    }

    public final boolean e0() {
        return this.f95386a.f98248p.hasArc();
    }

    @Nullable
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        return this.f95386a.f98251s.f();
    }

    @Nullable
    public final StateFlow<Boolean> f0() {
        return this.f95386a.f0();
    }

    public final void g() {
        BuildersKt.launch$default(j0(), (CoroutineContext) null, (CoroutineStart) null, new PlaylistUGCActionDelegate$onPlayerPreviousWidgetClick$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final StateFlow<Long> g0() {
        return this.f95386a.f98251s.g0();
    }

    @Nullable
    public final String getArcTitle() {
        return this.f95386a.f98242j.a();
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        return this.f95386a.f98251s.getCoinStyle();
    }

    @Nullable
    public final Drawable getLikeIcon() {
        return this.f95386a.f98251s.getLikeIcon();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f95386a.getLikedIcon();
    }

    public final int getTemplateId() {
        this.f95386a.getTemplateId();
        return 0;
    }

    public final long getTypeId() {
        return this.f95386a.f98235b.f104047m;
    }

    public final void h() {
        BuildersKt.launch$default(j0(), (CoroutineContext) null, (CoroutineStart) null, new PlaylistUGCActionDelegate$onPlayerNextWidgetClick$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final ShareContentProvider h0(@NotNull String str) {
        return this.f95386a.h0(str);
    }

    @Nullable
    public final StateFlow<Boolean> i() {
        return this.f95386a.f98251s.i();
    }

    public final boolean i0() {
        return true;
    }

    @Nullable
    public final Pair<Class<? extends AbsFunctionWidget>, AbsFunctionWidget.Configuration> j(@NotNull String str) {
        return this.f95386a.j(str);
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f95386a.f98251s.f104705a;
    }

    @Nullable
    public final ShareContentProvider k(@NotNull String str, @NotNull Function0<String> function0) {
        return this.f95386a.k(str, function0);
    }

    public final void k0(@NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        this.f95386a.k0(material, function1);
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.f95386a.l(str, str2, str3);
    }

    public final boolean l0() {
        return this.f95386a.l0();
    }

    @Nullable
    public final String m() {
        return this.f95386a.m();
    }

    @NotNull
    public final String m0() {
        return this.f95386a.m0();
    }

    @Nullable
    public final MutableSharedFlow<yk.e> n() {
        return this.f95386a.f98251s.f104721r;
    }

    @Nullable
    public final Integer n0(@Nullable String str) {
        this.f95386a.n0(str);
        return null;
    }

    public final boolean o() {
        this.f95386a.o();
        return false;
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        return this.f95386a.f98251s.o0();
    }

    @NotNull
    public final String p() {
        return this.f95386a.p();
    }

    public final boolean p0() {
        this.f95386a.p0();
        return true;
    }

    public final int q() {
        return this.f95386a.f98251s.q();
    }

    @Nullable
    public final String q0(@NotNull SharePosition sharePosition) {
        return this.f95386a.q0(sharePosition);
    }

    public final boolean r() {
        return this.f95386a.r();
    }

    @Nullable
    public final Integer s() {
        return this.f95386a.f98251s.s();
    }

    public final boolean t() {
        this.f95386a.t();
        return false;
    }

    @NotNull
    public final String u() {
        return this.f95386a.u();
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        this.f95386a.v(str, pageType);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        return this.f95386a.f98251s.w(view);
    }

    @Nullable
    public final StateFlow<wk.a> x() {
        return this.f95386a.f98251s.f104722s;
    }

    @Nullable
    public final String y() {
        return this.f95386a.y();
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        this.f95386a.z(str, pageType);
        return true;
    }
}
