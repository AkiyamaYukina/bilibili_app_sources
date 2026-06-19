package com.bilibili.ship.theseus.playlist.di.biz.cheese;

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
import com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/cheese/PlaylistCheeseActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class PlaylistCheeseActionDelegate implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CheesePlayerActionDelegateImpl f95359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95360b;

    @Inject
    public PlaylistCheeseActionDelegate(@NotNull CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl, @NotNull PlaylistSchedulingService playlistSchedulingService) {
        this.f95359a = cheesePlayerActionDelegateImpl;
        this.f95360b = playlistSchedulingService;
    }

    public final boolean A() {
        this.f95359a.getClass();
        return true;
    }

    @Nullable
    public final i B(@NotNull SharePosition sharePosition) {
        return this.f95359a.B(sharePosition);
    }

    @NotNull
    public final e C(@NotNull String str) {
        return this.f95359a.C(str);
    }

    public final boolean D() {
        return false;
    }

    @Nullable
    public final StateFlow<Long> E() {
        return this.f95359a.f90361c.E();
    }

    @Nullable
    public final Function3<Modifier, Composer, Integer, Unit> F() {
        return this.f95359a.F();
    }

    @Nullable
    public final StateFlow<Boolean> H() {
        return this.f95359a.H();
    }

    @Nullable
    public final StateFlow<Long> I() {
        return this.f95359a.f90361c.I();
    }

    @Nullable
    public final Deferred<Boolean> J() {
        return this.f95359a.J();
    }

    public final boolean K() {
        return this.f95359a.K();
    }

    public final void L() {
        this.f95359a.L();
    }

    @NotNull
    public final e M(@NotNull String str, @Nullable Function0<Bitmap> function0, @Nullable Function0<String> function02) {
        return this.f95359a.M(str, function0, function02);
    }

    @NotNull
    public final String N() {
        return this.f95359a.N();
    }

    @Nullable
    public final StateFlow<Long> O() {
        return this.f95359a.f90361c.O();
    }

    @NotNull
    public final String P() {
        return this.f95359a.P();
    }

    public final boolean Q() {
        return this.f95359a.f90361c.Q();
    }

    public final boolean R() {
        return false;
    }

    @Nullable
    public final StateFlow<f> S() {
        return null;
    }

    public final void T() {
        this.f95359a.T();
    }

    @NotNull
    public final PosterStyle U() {
        return this.f95359a.U();
    }

    public final void V(@NotNull g gVar, int i7) {
        this.f95359a.V(gVar, i7);
    }

    @NotNull
    public final String W() {
        return this.f95359a.W();
    }

    @Nullable
    public final StateFlow<Boolean> X() {
        return this.f95359a.X();
    }

    @Nullable
    public final String Y() {
        return this.f95359a.f90361c.Y();
    }

    public final void Z() {
        this.f95359a.Z();
    }

    @Nullable
    public final z a() {
        return this.f95359a.f90361c.a();
    }

    public final boolean a0() {
        return this.f95359a.f90361c.a0();
    }

    @Nullable
    public final Drawable b() {
        return this.f95359a.f90361c.b();
    }

    @Nullable
    public final String b0() {
        return this.f95359a.b0();
    }

    public final boolean c() {
        this.f95359a.getClass();
        return false;
    }

    @NotNull
    public final String c0() {
        return this.f95359a.c0();
    }

    @Nullable
    public final String d(@NotNull SharePosition sharePosition) {
        return this.f95359a.d(sharePosition);
    }

    public final void d0() {
        this.f95359a.d0();
    }

    @Nullable
    public final StateFlow<PlayNetworkEnv> e() {
        return this.f95359a.f90361c.e();
    }

    public final boolean e0() {
        return this.f95359a.e0();
    }

    @Nullable
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        this.f95359a.getClass();
        return null;
    }

    @Nullable
    public final StateFlow<Boolean> f0() {
        return this.f95359a.f0();
    }

    public final void g() {
        BuildersKt.launch$default(j0(), (CoroutineContext) null, (CoroutineStart) null, new PlaylistCheeseActionDelegate$onPlayerPreviousWidgetClick$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final StateFlow<Long> g0() {
        return this.f95359a.f90361c.g0();
    }

    @Nullable
    public final String getArcTitle() {
        return this.f95359a.getArcTitle();
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        return this.f95359a.f90361c.getCoinStyle();
    }

    @Nullable
    public final Drawable getLikeIcon() {
        return this.f95359a.f90361c.getLikeIcon();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f95359a.getLikedIcon();
    }

    public final int getTemplateId() {
        this.f95359a.getClass();
        return 21;
    }

    public final long getTypeId() {
        return this.f95359a.getTypeId();
    }

    public final void h() {
        BuildersKt.launch$default(j0(), (CoroutineContext) null, (CoroutineStart) null, new PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final ShareContentProvider h0(@NotNull String str) {
        CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl = this.f95359a;
        cheesePlayerActionDelegateImpl.getClass();
        return new CheesePlayerActionDelegateImpl.c(cheesePlayerActionDelegateImpl);
    }

    @Nullable
    public final StateFlow<Boolean> i() {
        return this.f95359a.f90361c.i();
    }

    public final boolean i0() {
        return true;
    }

    @Nullable
    public final Pair<Class<? extends AbsFunctionWidget>, AbsFunctionWidget.Configuration> j(@NotNull String str) {
        this.f95359a.j(str);
        return null;
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f95359a.f90361c.f104705a;
    }

    @Nullable
    public final ShareContentProvider k(@NotNull String str, @NotNull Function0<String> function0) {
        CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl = this.f95359a;
        cheesePlayerActionDelegateImpl.getClass();
        return new CheesePlayerActionDelegateImpl.d(cheesePlayerActionDelegateImpl, function0);
    }

    public final void k0(@NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        this.f95359a.k0(material, function1);
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.f95359a.l(str, str2, str3);
    }

    public final boolean l0() {
        return this.f95359a.l0();
    }

    @Nullable
    public final String m() {
        return this.f95359a.m();
    }

    @NotNull
    public final String m0() {
        return this.f95359a.m0();
    }

    @Nullable
    public final MutableSharedFlow<yk.e> n() {
        return this.f95359a.f90361c.f104721r;
    }

    @Nullable
    public final Integer n0(@Nullable String str) {
        this.f95359a.getClass();
        return 4;
    }

    public final boolean o() {
        return this.f95359a.o();
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        return this.f95359a.f90361c.o0();
    }

    @NotNull
    public final String p() {
        return this.f95359a.p();
    }

    public final boolean p0() {
        return this.f95359a.p0();
    }

    public final int q() {
        return this.f95359a.f90361c.q();
    }

    @Nullable
    public final String q0(@NotNull SharePosition sharePosition) {
        return this.f95359a.q0(sharePosition);
    }

    public final boolean r() {
        return this.f95359a.r();
    }

    @Nullable
    public final Integer s() {
        return this.f95359a.f90361c.s();
    }

    public final boolean t() {
        return this.f95359a.t();
    }

    @NotNull
    public final String u() {
        return this.f95359a.u();
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        this.f95359a.v(str, pageType);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        return this.f95359a.f90361c.w(view);
    }

    @Nullable
    public final StateFlow<wk.a> x() {
        return this.f95359a.x();
    }

    @Nullable
    public final String y() {
        this.f95359a.getClass();
        return "";
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        this.f95359a.z(str, pageType);
        return true;
    }
}
