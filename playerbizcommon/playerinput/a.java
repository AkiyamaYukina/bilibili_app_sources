package com.bilibili.playerbizcommon.playerinput;

import Cq0.b;
import Cq0.h;
import ES0.t;
import M3.C2567b1;
import Rq0.d;
import Tq0.i;
import Tq0.u;
import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.playerbizcommon.input.InputPanelContainer;
import com.bilibili.playerbizcommon.playerinput.widget.PlayerInputPlaceholderView;
import com.bilibili.playerbizcommon.playerinput.widget.PlayerInputSelectableView;
import com.bilibili.playerbizcommon.view.DanmakuEditText;
import com.bilibili.playerbizcommon.view.DanmakuExpressionView;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/playerinput/a.class */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f80238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rq0.a f80239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Qq0.a f80240c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Rq0.b f80244g;

    @NotNull
    public DanmakuSendParams h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f80241d = LazyKt.lazy(new Ba.b(this, 3));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f80242e = LazyKt.lazy(new t(this, 4));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f80245i = LazyKt.lazy(LazyThreadSafetyMode.NONE, new C2567b1(6));

    public a(Context context, Rq0.a aVar, Qq0.a aVar2) {
        this.f80238a = context;
        this.f80239b = aVar;
        this.f80240c = aVar2;
        this.h = new DanmakuSendParams((String) null, 0, 0, 0, (String) null, (String) null, false, 0, false, (Boolean) null, (Long) null, false, (String) null, (Integer) null, (Integer) null, aVar2.p(), aVar2.f(), aVar2.a().f20948a, (String) null, 294911, (DefaultConstructorMarker) null);
    }

    public final void A() {
        if (ContextUtilKt.findFragmentActivityOrNull(this.f80238a) != null) {
            b().show();
        }
    }

    @Override // Cq0.b
    @NotNull
    public final d a() {
        return this.f80240c.a();
    }

    public final u b() {
        return (u) this.f80242e.getValue();
    }

    @Override // Cq0.b
    public final boolean c() {
        return true;
    }

    @Override // Cq0.b
    @Nullable
    public final PostPanelV2 d() {
        return this.f80240c.d();
    }

    @Override // Cq0.b
    @Nullable
    public final Qq0.a e() {
        return this.f80240c;
    }

    @Override // Cq0.b
    @Nullable
    public final PlayerInputPlaceholderView f() {
        return b().f24291i;
    }

    @Override // Cq0.b
    public final void g(boolean z6) {
        this.f80243f = z6;
    }

    @Override // Cq0.b
    public final long getAvid() {
        return this.f80240c.p();
    }

    @Override // Cq0.b
    @Nullable
    public final InputPanelContainer getPanelContainer() {
        return b().f24290g;
    }

    @Override // Cq0.b
    @NotNull
    public final ScreenModeType getScreenMode() {
        return this.f80239b.f20933b;
    }

    @Override // Cq0.b
    @Nullable
    public final InputPanelContainer h() {
        return b().f24289f;
    }

    @Override // Cq0.b
    public final void i() {
        if (b().isShowing()) {
            b().cancel();
        }
    }

    @Override // Cq0.b
    public final void j(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        i iVar;
        i iVar2;
        if (str != null) {
            this.h.setDanmaku(str);
            u uVarB = b();
            h<i> hVar = uVarB.f24288e;
            if (hVar != null && (iVar2 = (i) hVar.a()) != null) {
                DanmakuEditText danmakuEditText = iVar2.f24247k;
                DanmakuEditText danmakuEditText2 = danmakuEditText;
                if (danmakuEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputEdit");
                    danmakuEditText2 = null;
                }
                if (danmakuEditText2 != null) {
                    danmakuEditText2.setText(str);
                }
            }
            h<i> hVar2 = uVarB.f24288e;
            if (hVar2 != null && (iVar = (i) hVar2.a()) != null) {
                DanmakuEditText danmakuEditText3 = iVar.f24247k;
                if (danmakuEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputEdit");
                    danmakuEditText3 = null;
                }
                if (danmakuEditText3 != null) {
                    danmakuEditText3.setSelection(str.length());
                }
            }
            b.t(this, null, null, str, null, 503);
        }
        if (num != null) {
            this.h.setDanmakuColor(num.intValue());
        }
        if (num2 != null) {
            this.h.setDanmakuSize(num2.intValue());
        }
        if (num3 != null) {
            this.h.setDanmakuType(num3.intValue());
        }
        if (num4 != null) {
            this.h.setColorful(Integer.valueOf(num4.intValue()));
        }
    }

    @Override // Cq0.b
    public final boolean k() {
        return this.f80243f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // Cq0.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.playerinput.a.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Cq0.b
    @Nullable
    public final Cq0.a m() {
        InputPanelContainer inputPanelContainer = b().f24290g;
        return inputPanelContainer != null ? inputPanelContainer.getStackTopPanel() : null;
    }

    @Override // Cq0.b
    @Nullable
    public final Rq0.a n() {
        return this.f80239b;
    }

    @Override // Cq0.b
    @Nullable
    public final Rq0.b o() {
        return this.f80244g;
    }

    @Override // Cq0.b
    public final void onBackPressed() {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f80238a);
        if (activityFindActivityOrNull != null) {
            activityFindActivityOrNull.onBackPressed();
        }
    }

    @Override // Cq0.b
    public final void p(@NotNull DanmakuSendParams danmakuSendParams) {
        this.h = danmakuSendParams;
    }

    @Override // Cq0.b
    public final void q() {
        b().f24284a.getClass();
    }

    @Override // Cq0.b
    public final void r(@Nullable List<CommandsDanmaku> list, @Nullable CommandsPanel commandsPanel, @Nullable DmViewReply dmViewReply, @Nullable String str, @Nullable DanmakuExpressionView.a aVar, @Nullable String str2, @Nullable String str3, int i7, @Nullable Long l7) {
        i iVar;
        Rq0.b bVar;
        Rq0.b bVar2;
        Rq0.b bVar3;
        Rq0.b bVar4;
        Rq0.b bVar5;
        Rq0.b bVar6;
        Rq0.b bVar7;
        if (this.f80244g == null) {
            this.f80244g = new Rq0.b(null, null, null, null, null, null, null, 0, 4095);
            Unit unit = Unit.INSTANCE;
        }
        if (list != null && (bVar7 = this.f80244g) != null) {
            bVar7.f20936a = list;
        }
        if (commandsPanel != null && (bVar6 = this.f80244g) != null) {
            bVar6.f20937b = commandsPanel;
        }
        if (dmViewReply != null && (bVar5 = this.f80244g) != null) {
            bVar5.f20938c = dmViewReply;
        }
        if (str != null && (bVar4 = this.f80244g) != null) {
            bVar4.f20939d = str;
        }
        if (aVar != null && (bVar3 = this.f80244g) != null) {
            bVar3.f20940e = aVar;
        }
        if (str2 != null && (bVar2 = this.f80244g) != null) {
            bVar2.f20941f = str2;
        }
        if (str3 != null && (bVar = this.f80244g) != null) {
            bVar.f20942g = str3;
        }
        if (l7 != null) {
            long jLongValue = l7.longValue();
            Rq0.b bVar8 = this.f80244g;
            if (bVar8 != null) {
                bVar8.f20946l = Long.valueOf(jLongValue);
            }
        }
        Rq0.b bVar9 = this.f80244g;
        if (bVar9 != null) {
            bVar9.h = i7;
        }
        h<i> hVar = b().f24288e;
        if (hVar == null || (iVar = (i) hVar.a()) == null) {
            return;
        }
        iVar.U();
    }

    @Override // Cq0.b
    public final void s(int i7) {
        b().f24284a.getClass();
    }

    @Override // Cq0.b
    public final int u() {
        return this.f80239b.f20932a;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // Cq0.b
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String v() {
        /*
            r2 = this;
            r0 = r2
            Rq0.b r0 = r0.f80244g
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            java.lang.String r0 = r0.f20939d
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L18
        L14:
            java.lang.String r0 = ""
            r3 = r0
        L18:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.playerinput.a.v():java.lang.String");
    }

    @Override // Cq0.b
    public final void x(@NotNull DanmakuEditText danmakuEditText) {
        boolean zShowSoftInput = false;
        try {
            danmakuEditText.requestFocus();
            zShowSoftInput = ((InputMethodManager) this.f80241d.getValue()).showSoftInput(danmakuEditText, 0, null);
        } catch (Throwable th) {
            M.b("show soft-keyboard failed, cause: ", th.getMessage(), "PlayerDanmakuInputController");
        }
        this.f80243f = zShowSoftInput;
    }

    @Override // Cq0.b
    public final void y(@NotNull DanmakuEditText danmakuEditText) {
        boolean zHideSoftInputFromWindow = false;
        try {
            zHideSoftInputFromWindow = ((InputMethodManager) this.f80241d.getValue()).hideSoftInputFromWindow(danmakuEditText.getWindowToken(), 0, null);
        } catch (Throwable th) {
            M.b("hide soft-keyboard failed, cause: ", th.getMessage(), "PlayerDanmakuInputController");
        }
        this.f80243f = zHideSoftInputFromWindow;
    }

    @Override // Cq0.b
    public final void z() {
        PlayerInputSelectableView playerInputSelectableView;
        u uVarB = b();
        PlayerInputSelectableView playerInputSelectableView2 = uVarB.f24292j;
        if (playerInputSelectableView2 == null || playerInputSelectableView2.getVisibility() != 0 || (playerInputSelectableView = uVarB.f24292j) == null) {
            return;
        }
        playerInputSelectableView.setVisibility(8);
    }
}
