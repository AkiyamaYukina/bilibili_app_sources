package com.bilibili.playerbizcommonv2.danmaku.input;

import Be1.p;
import M3.Q1;
import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuEditText;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuExpressionView;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerInputPlaceholderView;
import com.mall.videodetail.vd.united.page.danmaku.HalfScreenDanmakuInputService;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8347a;
import q4.M;
import rr0.ViewOnClickListenerC8544e;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/g.class */
@StabilityInferred(parameters = 0)
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f80990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final qr0.c f80991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC8347a f80992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final qr0.b f80993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final c f80994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f80995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f80996g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public qr0.d f80997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public DanmakuSendParams f80998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f80999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public List<CommandsDanmaku> f81000l;

    public g(@NotNull Context context, @NotNull qr0.c cVar, @NotNull InterfaceC8347a interfaceC8347a, @NotNull qr0.b bVar, @Nullable c cVar2, boolean z6) {
        this.f80990a = context;
        this.f80991b = cVar;
        this.f80992c = interfaceC8347a;
        this.f80993d = bVar;
        this.f80994e = cVar2;
        this.f80995f = LazyKt.lazy(new p(this, 5));
        this.f80996g = LazyKt.lazy(new f(this, z6));
        this.f80998j = new DanmakuSendParams((String) null, 0, 0, 0, (String) null, (String) null, false, 0, false, (Boolean) null, (Long) null, false, (String) null, (Integer) null, (Integer) null, bVar.p(), bVar.f(), bVar.a().f126290a, (String) null, 294911, (DefaultConstructorMarker) null);
        this.f80999k = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Q1(6));
        this.f81000l = CollectionsKt.emptyList();
    }

    public /* synthetic */ g(Context context, qr0.c cVar, InterfaceC8347a interfaceC8347a, qr0.b bVar, HalfScreenDanmakuInputService.d dVar, boolean z6, int i7) {
        this(context, cVar, interfaceC8347a, bVar, (i7 & 16) != 0 ? null : dVar, (i7 & 32) != 0 ? false : z6);
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void b(@NotNull List<CommandsDanmaku> list) {
        this.f81000l = list;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @NotNull
    public final List<CommandsDanmaku> c() {
        return this.f81000l;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void d(@NotNull PlayerDanmakuEditText playerDanmakuEditText) {
        boolean zHideSoftInputFromWindow;
        try {
            zHideSoftInputFromWindow = ((InputMethodManager) this.f80995f.getValue()).hideSoftInputFromWindow(playerDanmakuEditText.getWindowToken(), 0, null);
        } catch (Throwable th) {
            M.b("hide soft-keyboard failed, cause: ", th.getMessage(), "PlayerDanmakuInputController");
            zHideSoftInputFromWindow = false;
        }
        this.h = zHideSoftInputFromWindow;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @NotNull
    public final InterfaceC8347a e() {
        return this.f80992c;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @Nullable
    public final PlayerInputPlaceholderView f() {
        return u().f81208l;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void g(boolean z6) {
        this.h = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getCurrentRecommendWord() {
        /*
            r2 = this;
            r0 = r2
            qr0.d r0 = r0.f80997i
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r0 = r0.f126282b
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r3 = r0
        L17:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.g.getCurrentRecommendWord():java.lang.String");
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @Nullable
    public final InputPanelContainer getPanelContainer() {
        return u().f81206j;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @Nullable
    public final InputPanelContainer h() {
        return u().f81205i;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void i() {
        if (u().isShowing()) {
            u().cancel();
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void j(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        ViewOnClickListenerC8544e viewOnClickListenerC8544e;
        if (str != null) {
            this.f80998j.setDanmaku(str);
            e<ViewOnClickListenerC8544e> eVar = u().f81204g;
            if (eVar != null && (viewOnClickListenerC8544e = (ViewOnClickListenerC8544e) eVar.a()) != null) {
                viewOnClickListenerC8544e.L(str);
            }
            a.q(this, null, null, str, null, 251);
        }
        if (num != null) {
            this.f80998j.setDanmakuColor(num.intValue());
        }
        if (num2 != null) {
            this.f80998j.setDanmakuSize(num2.intValue());
        }
        if (num3 != null) {
            this.f80998j.setDanmakuType(num3.intValue());
        }
        if (num4 != null) {
            this.f80998j.setColorful(Integer.valueOf(num4.intValue()));
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final boolean k() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.g.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @Nullable
    public final com.bilibili.playerbizcommonv2.danmaku.input.panel.a m() {
        InputPanelContainer inputPanelContainer = u().f81206j;
        return inputPanelContainer != null ? inputPanelContainer.getStackTopPanel() : null;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @NotNull
    public final qr0.c n() {
        return this.f80991b;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @Nullable
    public final qr0.d o() {
        return this.f80997i;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void onBackPressed() {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f80990a);
        if (activityFindActivityOrNull != null) {
            activityFindActivityOrNull.onBackPressed();
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void p(@NotNull DanmakuSendParams danmakuSendParams) {
        this.f80998j = danmakuSendParams;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void r(@Nullable DmViewReply dmViewReply, @Nullable String str, @Nullable PlayerDanmakuExpressionView.a aVar, @Nullable String str2, @Nullable String str3, int i7, @Nullable Long l7) {
        ViewOnClickListenerC8544e viewOnClickListenerC8544e;
        qr0.d dVar = this.f80997i;
        this.f80997i = dVar != null ? new qr0.d(dmViewReply, str, aVar, str2, str3, i7, dVar.f126287g, dVar.h, dVar.f126288i, l7) : null;
        e<ViewOnClickListenerC8544e> eVar = u().f81204g;
        if (eVar == null || (viewOnClickListenerC8544e = (ViewOnClickListenerC8544e) eVar.a()) == null) {
            return;
        }
        viewOnClickListenerC8544e.S();
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    public final void s(@NotNull PlayerDanmakuEditText playerDanmakuEditText) {
        boolean zShowSoftInput = false;
        try {
            playerDanmakuEditText.requestFocus();
            zShowSoftInput = ((InputMethodManager) this.f80995f.getValue()).showSoftInput(playerDanmakuEditText, 0, null);
        } catch (Throwable th) {
            M.b("show soft-keyboard failed, cause: ", th.getMessage(), "PlayerDanmakuInputController");
        }
        this.h = zShowSoftInput;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.a
    @NotNull
    public final qr0.b t() {
        return this.f80993d;
    }

    public final com.bilibili.playerbizcommonv2.danmaku.input.widget.h u() {
        return (com.bilibili.playerbizcommonv2.danmaku.input.widget.h) this.f80996g.getValue();
    }

    public final void v() {
        BLog.i("PlayerDanmakuInputController", "show danmaku input window.");
        if (ContextUtilKt.findFragmentActivityOrNull(this.f80990a) != null) {
            u().show();
        }
    }
}
