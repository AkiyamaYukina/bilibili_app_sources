package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.PostPanelBizType;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.playerbizcommonv2.api.DanmakuColorfulPanelInfo;
import com.bilibili.playerbizcommonv2.danmaku.input.InputPanelContainer;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerAutoLineLayout;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerOptionColorView;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerOptionDrawableView;
import j4.t;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rr0.ViewOnClickListenerC8544e;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import xr0.C9001a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/l.class */
@StabilityInferred(parameters = 0)
public final class l extends com.bilibili.playerbizcommonv2.danmaku.input.panel.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bilibili.playerbizcommonv2.danmaku.input.a f81139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewOnClickListenerC8544e f81140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SharedPreferences f81141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ViewGroup f81142g;

    @Nullable
    public PlayerAutoLineLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public PlayerAutoLineLayout f81143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public PlayerAutoLineLayout f81144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ViewGroup f81145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewGroup f81146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TintCheckBox f81147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public s f81148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f81149o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Cr0.c f81151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public Function1<? super Boolean, Unit> f81152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public DanmakuColorfulPanelInfo f81153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f81154t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f81150p = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final a f81155u = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/l$a.class */
    public static final class a implements com.bilibili.playerbizcommonv2.service.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f81156a;

        public a(l lVar) {
            this.f81156a = lVar;
        }

        @Override // com.bilibili.playerbizcommonv2.service.b
        public final void a(long j7, boolean z6) {
            DanmakuColorfulPanelInfo.ColorfulPrivilegeDetails colorfulPrivilegeDetails;
            l lVar = this.f81156a;
            if (z6) {
                DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = lVar.f81153s;
                if (danmakuColorfulPanelInfo != null && (colorfulPrivilegeDetails = danmakuColorfulPanelInfo.getColorfulPrivilegeDetails()) != null) {
                    colorfulPrivilegeDetails.setVipOrderPromotion(Boolean.FALSE);
                }
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar = lVar.f81139d;
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar2 = null;
                }
                aVar2.t().P(new com.bilibili.playerbizcommonv2.service.a(false, j7, lVar.f81153s));
                s sVar = lVar.f81148n;
                if (sVar != null) {
                    sVar.h(lVar.f81151q);
                }
                lVar.H();
            }
            lVar.f81152r.invoke(Boolean.valueOf(z6));
        }
    }

    public l() {
        final int i7 = 0;
        this.f81152r = new Function1(i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.panel.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81135a;

            {
                this.f81135a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f81135a) {
                    case 0:
                        ((Boolean) obj).booleanValue();
                        return Unit.INSTANCE;
                    default:
                        String str = ((BiligameTag) obj).tagName;
                        if (str == null) {
                            str = "";
                        }
                        return str;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L12
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r3 = r0
        L12:
            r0 = r3
            qr0.d r0 = r0.o()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.String r0 = r0.f126288i
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L2b
        L28:
            java.lang.String r0 = "rl"
            r3 = r0
        L2b:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.l.A():java.lang.String");
    }

    public final long B() {
        Long l7;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        qr0.d dVarO = aVar2.o();
        return (dVarO == null || (l7 = dVarO.f126289j) == null) ? 0L : l7.longValue();
    }

    public final boolean C() {
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        PostPanelV2 postPanelV2D = aVar2.t().d();
        PostPanelBizType bizType = null;
        if (postPanelV2D != null) {
            bizType = postPanelV2D.getBizType();
        }
        return bizType != PostPanelBizType.PostPanelBizTypeNFTDM && this.f81149o;
    }

    public final void D(boolean z6) {
        SharedPreferences.Editor editorEdit;
        if (w() == z6) {
            return;
        }
        SharedPreferences sharedPreferences = this.f81141f;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
            editorEdit.putBoolean("key_up_danmaku_checked", z6);
            editorEdit.apply();
        }
        G(z6 && C());
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        aVar2.e().D("player.dm-send.up-checkbox.0.player", "upcheckbox", z6 ? "1" : "0", "danmaku_type", z6 ? "1" : "0");
    }

    public final void E(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i7);
            if (!Intrinsics.areEqual(childAt, this.f81146l)) {
                if (childAt instanceof Cr0.a) {
                    ((Cr0.a) childAt).setAvailableState(z6);
                } else if (childAt instanceof ViewGroup) {
                    E((ViewGroup) childAt, z6);
                }
            }
        }
    }

    public final void F() {
        boolean z6;
        ViewOnClickListenerC8544e viewOnClickListenerC8544eX;
        ViewOnClickListenerC8544e viewOnClickListenerC8544eX2;
        ViewOnClickListenerC8544e viewOnClickListenerC8544eX3;
        ViewGroup viewGroup = this.f81142g;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        int userLevel = BiliAccountInfo.Companion.get().getUserLevel();
        if (userLevel < 2) {
            PlayerAutoLineLayout playerAutoLineLayout = this.f81143i;
            int childCount = playerAutoLineLayout != null ? playerAutoLineLayout.getChildCount() : 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                PlayerAutoLineLayout playerAutoLineLayout2 = this.f81143i;
                View childAt = playerAutoLineLayout2 != null ? playerAutoLineLayout2.getChildAt(i7) : null;
                if (childAt instanceof PlayerOptionDrawableView) {
                    PlayerOptionDrawableView playerOptionDrawableView = (PlayerOptionDrawableView) childAt;
                    if (Intrinsics.areEqual(playerOptionDrawableView.getItemTag(), z())) {
                        playerOptionDrawableView.setLockState(false);
                        playerOptionDrawableView.setSelectState(true);
                    } else {
                        playerOptionDrawableView.setLockState(true);
                        playerOptionDrawableView.setSelectState(false);
                    }
                }
            }
            PlayerAutoLineLayout playerAutoLineLayout3 = this.h;
            int childCount2 = playerAutoLineLayout3 != null ? playerAutoLineLayout3.getChildCount() : 0;
            for (int i8 = 0; i8 < childCount2; i8++) {
                PlayerAutoLineLayout playerAutoLineLayout4 = this.h;
                View childAt2 = playerAutoLineLayout4 != null ? playerAutoLineLayout4.getChildAt(i8) : null;
                if (childAt2 instanceof PlayerOptionColorView) {
                    PlayerOptionColorView playerOptionColorView = (PlayerOptionColorView) childAt2;
                    if (Intrinsics.areEqual(playerOptionColorView.getItemTag(), y())) {
                        playerOptionColorView.setLockState(false);
                        playerOptionColorView.setSelectState(true);
                    } else {
                        playerOptionColorView.setLockState(true);
                        playerOptionColorView.setSelectState(false);
                    }
                }
            }
            return;
        }
        if (userLevel < 3) {
            PlayerAutoLineLayout playerAutoLineLayout5 = this.f81144j;
            int childCount3 = playerAutoLineLayout5 != null ? playerAutoLineLayout5.getChildCount() : 0;
            for (int i9 = 0; i9 < childCount3; i9++) {
                PlayerAutoLineLayout playerAutoLineLayout6 = this.f81144j;
                View childAt3 = playerAutoLineLayout6 != null ? playerAutoLineLayout6.getChildAt(i9) : null;
                if (childAt3 instanceof PlayerOptionDrawableView) {
                    PlayerOptionDrawableView playerOptionDrawableView2 = (PlayerOptionDrawableView) childAt3;
                    if (Intrinsics.areEqual(playerOptionDrawableView2.getItemTag(), A())) {
                        playerOptionDrawableView2.setLockState(false);
                        playerOptionDrawableView2.setSelectState(true);
                    } else {
                        playerOptionDrawableView2.setLockState(true);
                        playerOptionDrawableView2.setSelectState(false);
                    }
                }
            }
            return;
        }
        PlayerAutoLineLayout playerAutoLineLayout7 = this.h;
        if (playerAutoLineLayout7 != null) {
            int childCount4 = playerAutoLineLayout7.getChildCount();
            int i10 = 0;
            boolean z7 = false;
            while (true) {
                boolean z8 = z7;
                z6 = z8;
                if (i10 >= childCount4) {
                    break;
                }
                View childAt4 = playerAutoLineLayout7.getChildAt(i10);
                boolean z9 = z8;
                if (childAt4 instanceof Cr0.c) {
                    Cr0.c cVar = (Cr0.c) childAt4;
                    boolean zAreEqual = Intrinsics.areEqual(cVar.getItemTag(), String.valueOf(B()));
                    cVar.setSelectState(zAreEqual);
                    z9 = z8;
                    if (zAreEqual) {
                        ViewOnClickListenerC8544e viewOnClickListenerC8544eX4 = x();
                        if (viewOnClickListenerC8544eX4 != null) {
                            ViewOnClickListenerC8544e.P(viewOnClickListenerC8544eX4, null, null, null, Long.valueOf(B()), 7);
                        }
                        z9 = true;
                    }
                }
                i10++;
                z7 = z9;
            }
        } else {
            z6 = false;
        }
        PlayerAutoLineLayout playerAutoLineLayout8 = this.h;
        if (playerAutoLineLayout8 != null) {
            int childCount5 = playerAutoLineLayout8.getChildCount();
            for (int i11 = 0; i11 < childCount5; i11++) {
                View childAt5 = playerAutoLineLayout8.getChildAt(i11);
                if (z6) {
                    PlayerOptionColorView playerOptionColorView2 = childAt5 instanceof PlayerOptionColorView ? (PlayerOptionColorView) childAt5 : null;
                    if (playerOptionColorView2 != null) {
                        playerOptionColorView2.setSelectState(false);
                    }
                } else {
                    PlayerOptionColorView playerOptionColorView3 = childAt5 instanceof PlayerOptionColorView ? (PlayerOptionColorView) childAt5 : null;
                    if (playerOptionColorView3 != null) {
                        playerOptionColorView3.setSelectState(Intrinsics.areEqual(playerOptionColorView3.getItemTag(), y()));
                        if (Intrinsics.areEqual(playerOptionColorView3.getItemTag(), y()) && (viewOnClickListenerC8544eX3 = x()) != null) {
                            ViewOnClickListenerC8544e.P(viewOnClickListenerC8544eX3, playerOptionColorView3.getItemTag(), null, null, null, 14);
                        }
                    }
                }
            }
        }
        PlayerAutoLineLayout playerAutoLineLayout9 = this.f81143i;
        if (playerAutoLineLayout9 != null) {
            int childCount6 = playerAutoLineLayout9.getChildCount();
            for (int i12 = 0; i12 < childCount6; i12++) {
                View childAt6 = playerAutoLineLayout9.getChildAt(i12);
                PlayerOptionDrawableView playerOptionDrawableView3 = childAt6 instanceof PlayerOptionDrawableView ? (PlayerOptionDrawableView) childAt6 : null;
                if (playerOptionDrawableView3 != null) {
                    playerOptionDrawableView3.setSelectState(Intrinsics.areEqual(playerOptionDrawableView3.getItemTag(), z()));
                    if (Intrinsics.areEqual(playerOptionDrawableView3.getItemTag(), z()) && (viewOnClickListenerC8544eX2 = x()) != null) {
                        ViewOnClickListenerC8544e.P(viewOnClickListenerC8544eX2, null, playerOptionDrawableView3.getItemTag(), null, null, 13);
                    }
                }
            }
        }
        PlayerAutoLineLayout playerAutoLineLayout10 = this.f81144j;
        if (playerAutoLineLayout10 != null) {
            int childCount7 = playerAutoLineLayout10.getChildCount();
            for (int i13 = 0; i13 < childCount7; i13++) {
                View childAt7 = playerAutoLineLayout10.getChildAt(i13);
                PlayerOptionDrawableView playerOptionDrawableView4 = childAt7 instanceof PlayerOptionDrawableView ? (PlayerOptionDrawableView) childAt7 : null;
                if (playerOptionDrawableView4 != null) {
                    playerOptionDrawableView4.setSelectState(Intrinsics.areEqual(playerOptionDrawableView4.getItemTag(), A()));
                    if (Intrinsics.areEqual(playerOptionDrawableView4.getItemTag(), A()) && (viewOnClickListenerC8544eX = x()) != null) {
                        ViewOnClickListenerC8544e.P(viewOnClickListenerC8544eX, null, null, playerOptionDrawableView4.getItemTag(), null, 11);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(boolean r7) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.l.G(boolean):void");
    }

    public final void H() {
        boolean z6;
        ViewOnClickListenerC8544e viewOnClickListenerC8544eX;
        PlayerAutoLineLayout playerAutoLineLayout = this.h;
        if (playerAutoLineLayout != null) {
            int childCount = playerAutoLineLayout.getChildCount();
            int i7 = 0;
            boolean z7 = false;
            while (true) {
                boolean z8 = z7;
                z6 = z8;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = playerAutoLineLayout.getChildAt(i7);
                boolean z9 = z8;
                if (childAt instanceof Cr0.c) {
                    Cr0.c cVar = (Cr0.c) childAt;
                    boolean zAreEqual = Intrinsics.areEqual(cVar.getItemTag(), String.valueOf(B()));
                    cVar.setSelectState(zAreEqual);
                    z9 = z8;
                    if (zAreEqual) {
                        ViewOnClickListenerC8544e viewOnClickListenerC8544eX2 = x();
                        if (viewOnClickListenerC8544eX2 != null) {
                            ViewOnClickListenerC8544e.P(viewOnClickListenerC8544eX2, null, null, null, Long.valueOf(B()), 7);
                        }
                        z9 = true;
                    }
                }
                i7++;
                z7 = z9;
            }
        } else {
            z6 = false;
        }
        PlayerAutoLineLayout playerAutoLineLayout2 = this.h;
        if (playerAutoLineLayout2 != null) {
            int childCount2 = playerAutoLineLayout2.getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = playerAutoLineLayout2.getChildAt(i8);
                if (z6) {
                    PlayerOptionColorView playerOptionColorView = childAt2 instanceof PlayerOptionColorView ? (PlayerOptionColorView) childAt2 : null;
                    if (playerOptionColorView != null) {
                        playerOptionColorView.setSelectState(false);
                    }
                } else {
                    PlayerOptionColorView playerOptionColorView2 = childAt2 instanceof PlayerOptionColorView ? (PlayerOptionColorView) childAt2 : null;
                    if (playerOptionColorView2 != null) {
                        playerOptionColorView2.setSelectState(Intrinsics.areEqual(playerOptionColorView2.getItemTag(), y()));
                        if (Intrinsics.areEqual(playerOptionColorView2.getItemTag(), y()) && (viewOnClickListenerC8544eX = x()) != null) {
                            ViewOnClickListenerC8544e.P(viewOnClickListenerC8544eX, playerOptionColorView2.getItemTag(), null, null, null, 14);
                        }
                    }
                }
            }
        }
    }

    public final void I(boolean z6) {
        DmViewReply dmViewReply;
        this.f81149o = z6;
        if (C()) {
            this.f81147m.setChecked(w());
            CharSequence text = this.f81147m.getText();
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            qr0.d dVarO = aVar2.o();
            if (!Intrinsics.areEqual(text, (dVarO == null || (dmViewReply = dVarO.f126281a) == null) ? null : dmViewReply.getCheckBoxShowMsg())) {
                TintCheckBox tintCheckBox = this.f81147m;
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81139d;
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar4 = aVar3;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar4 = null;
                }
                qr0.d dVarO2 = aVar4.o();
                String checkBoxShowMsg = null;
                if (dVarO2 != null) {
                    DmViewReply dmViewReply2 = dVarO2.f126281a;
                    checkBoxShowMsg = null;
                    if (dmViewReply2 != null) {
                        checkBoxShowMsg = dmViewReply2.getCheckBoxShowMsg();
                    }
                }
                tintCheckBox.setText(checkBoxShowMsg);
            }
            this.f81147m.setVisibility(0);
        } else {
            this.f81147m.setVisibility(8);
        }
        boolean z7 = false;
        if (w()) {
            z7 = false;
            if (C()) {
                z7 = true;
            }
        }
        G(z7);
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void l(@NotNull com.bilibili.playerbizcommonv2.danmaku.input.a aVar) {
        this.f81139d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup m(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull android.view.ViewGroup r7) {
        /*
            r5 = this;
            r0 = r5
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r12 = r0
            r0 = 0
            r11 = r0
            r0 = r12
            r10 = r0
            r0 = r12
            if (r0 != 0) goto L1a
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r10 = r0
        L1a:
            r0 = r10
            boolean r0 = xr0.C9001a.d(r0)
            r9 = r0
            r0 = 2131496610(0x7f0c0ea2, float:1.861679E38)
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L4c
            r0 = r5
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r12 = r0
            r0 = r12
            r10 = r0
            r0 = r12
            if (r0 != 0) goto L41
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r10 = r0
        L41:
            r0 = r10
            boolean r0 = xr0.C9001a.c(r0)
            if (r0 != 0) goto L4c
            goto L91
        L4c:
            r0 = r5
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r12 = r0
            r0 = r12
            r10 = r0
            r0 = r12
            if (r0 != 0) goto L63
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r10 = r0
        L63:
            r0 = r10
            boolean r0 = xr0.C9001a.b(r0)
            if (r0 != 0) goto L8d
            r0 = r5
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L82
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r11
            r10 = r0
            goto L82
        L82:
            r0 = r10
            boolean r0 = xr0.C9001a.c(r0)
            if (r0 == 0) goto L8d
            goto L91
        L8d:
            r0 = 2131496611(0x7f0c0ea3, float:1.8616792E38)
            r8 = r0
        L91:
            r0 = r6
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = r8
            r2 = r7
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.l.m(android.content.Context, android.view.ViewGroup):android.view.ViewGroup");
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void n() {
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void p() {
        super.p();
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        aVar2.e().C(this.f81155u);
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void q() {
        LifecycleCoroutineScope lifecycleScope;
        super.q();
        this.f81154t = false;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar2 = null;
        }
        aVar2.e().z(this.f81155u);
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar4 = null;
        }
        com.bilibili.playerbizcommonv2.service.a danmakuColorful = aVar4.t().getDanmakuColorful();
        long j7 = danmakuColorful.f81821b;
        if (!danmakuColorful.f81820a && j7 != 0) {
            s sVar = this.f81148n;
            if (sVar != null) {
                sVar.b(j7);
            }
            H();
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar5 = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar6 = null;
        }
        boolean colorfulEnable = aVar6.t().getColorfulEnable();
        t.a("onPanelShow colorfulEnable = ", "InputOptionsPanelV2", colorfulEnable);
        if (colorfulEnable) {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar7 = this.f81139d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar8 = aVar7;
            if (aVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar8 = null;
            }
            if (aVar8.t().getDanmakuColorful().f81822c != null) {
                if (this.f81154t) {
                    return;
                }
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar9 = this.f81139d;
                if (aVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar9 = null;
                }
                v(aVar9.t().getDanmakuColorful().f81822c, false);
                this.f81154t = true;
                return;
            }
            if (this.f81154t) {
                return;
            }
            this.f81154t = true;
            ViewGroup viewGroup = this.f81142g;
            FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(viewGroup != null ? viewGroup.getContext() : null);
            if (fragmentActivityFindFragmentActivityOrNull == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull)) == null) {
                return;
            }
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new InputOptionsPanel$getColorfulPanelInfo$1(this, null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void r() {
        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
        WindowSizeClass windowSizeClassWindowSize;
        ViewGroup viewGroup = this.f81142g;
        boolean z6 = true;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            boolean z7 = C9001a.b(aVar2) && (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(context)) != null && (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(fragmentActivityFindFragmentActivityOrNull)) != null && KScreenAdjustUtilsKt.isLargeLandscape(windowSizeClassWindowSize);
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81139d;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar3 = null;
            }
            int px = NewPlayerUtilsKt.toPx((!C9001a.b(aVar3) || z7) ? 12.0f : 60.0f);
            viewGroup.setPadding(px, viewGroup.getPaddingTop(), px, viewGroup.getPaddingBottom());
        }
        if (!w() || !C()) {
            z6 = false;
        }
        G(z6);
        F();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0352  */
    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(@org.jetbrains.annotations.NotNull android.view.ViewGroup r7) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.l.u(android.view.ViewGroup):void");
    }

    public final void v(DanmakuColorfulPanelInfo danmakuColorfulPanelInfo, boolean z6) {
        List<DanmakuColorfulPanelInfo.ColorfulPanel> colorfulPanelList;
        PlayerAutoLineLayout playerAutoLineLayout;
        Context context;
        PlayerAutoLineLayout playerAutoLineLayout2;
        Iterator<View> it;
        boolean zAreEqual;
        DmViewReply dmViewReply;
        s sVar;
        if (danmakuColorfulPanelInfo == null || (colorfulPanelList = danmakuColorfulPanelInfo.getColorfulPanelList()) == null || (playerAutoLineLayout = this.h) == null || (context = playerAutoLineLayout.getContext()) == null || (playerAutoLineLayout2 = this.h) == null || (it = ViewGroupKt.iterator(playerAutoLineLayout2)) == null) {
            return;
        }
        Pair pair = null;
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof Cr0.c) {
                Cr0.c cVar = (Cr0.c) next;
                pair = new Pair(cVar.getItemTag(), Boolean.valueOf(cVar.getSelectState()));
                it.remove();
            }
        }
        Iterator it2 = CollectionsKt.reversed(colorfulPanelList).iterator();
        while (true) {
            zAreEqual = false;
            if (!it2.hasNext()) {
                break;
            }
            DanmakuColorfulPanelInfo.ColorfulPanel colorfulPanel = (DanmakuColorfulPanelInfo.ColorfulPanel) it2.next();
            Cr0.c cVar2 = new Cr0.c(context);
            cVar2.setColorfulPanel(colorfulPanel);
            PlayerAutoLineLayout playerAutoLineLayout3 = this.h;
            if ((playerAutoLineLayout3 != null ? playerAutoLineLayout3.getChildCount() : 0) > 0) {
                PlayerAutoLineLayout playerAutoLineLayout4 = this.h;
                if (playerAutoLineLayout4 != null) {
                    playerAutoLineLayout4.addView(cVar2, 1);
                }
                boolean z7 = false;
                if (pair != null) {
                    z7 = false;
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        z7 = true;
                    }
                }
                if (z7 && Intrinsics.areEqual(pair.getFirst(), cVar2.getItemTag())) {
                    cVar2.setSelectState(true);
                }
            }
        }
        if (colorfulPanelList.isEmpty()) {
            return;
        }
        if (z6) {
            DanmakuColorfulPanelInfo.ColorfulPrivilegeDetails colorfulPrivilegeDetails = danmakuColorfulPanelInfo.getColorfulPrivilegeDetails();
            if (colorfulPrivilegeDetails != null) {
                zAreEqual = Intrinsics.areEqual(colorfulPrivilegeDetails.getVipOrderPromotion(), Boolean.TRUE);
            }
        } else {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            zAreEqual = aVar2.t().getDanmakuColorful().f81820a;
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar4 = null;
        }
        long j7 = aVar4.t().getDanmakuColorful().f81821b;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar5 = this.f81139d;
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar6 = null;
        }
        aVar6.t().P(new com.bilibili.playerbizcommonv2.service.a(zAreEqual, j7, danmakuColorfulPanelInfo));
        if (!zAreEqual && j7 != 0) {
            if (!z6 && (sVar = this.f81148n) != null) {
                sVar.b(j7);
            }
            H();
        }
        com.bilibili.playerbizcommonv2.danmaku.input.a aVar7 = this.f81139d;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            aVar7 = null;
        }
        qr0.d dVarO = aVar7.o();
        if (dVarO == null || (dmViewReply = dVarO.f126281a) == null) {
            return;
        }
        I(dmViewReply.getCheckBox());
    }

    public final boolean w() {
        SharedPreferences sharedPreferences = this.f81141f;
        boolean z6 = this.f81150p;
        boolean z7 = z6;
        if (sharedPreferences != null) {
            z7 = sharedPreferences.getBoolean("key_up_danmaku_checked", z6);
        }
        return z7;
    }

    public final ViewOnClickListenerC8544e x() {
        if (this.f81140e == null) {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81139d;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = aVar2.h();
            ViewOnClickListenerC8544e viewOnClickListenerC8544e = null;
            if (inputPanelContainerH != null) {
                viewOnClickListenerC8544e = (ViewOnClickListenerC8544e) InputPanelContainer.b(inputPanelContainerH, ViewOnClickListenerC8544e.class);
            }
            this.f81140e = viewOnClickListenerC8544e;
        }
        return this.f81140e;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L12
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r3 = r0
        L12:
            r0 = r3
            qr0.d r0 = r0.o()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.String r0 = r0.f126287g
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L2c
        L28:
            java.lang.String r0 = "#ffffff"
            r3 = r0
        L2c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.l.y():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String z() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.playerbizcommonv2.danmaku.input.a r0 = r0.f81139d
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L12
            java.lang.String r0 = "mInputController"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r3 = r0
        L12:
            r0 = r3
            qr0.d r0 = r0.o()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.String r0 = r0.h
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L2c
        L28:
            java.lang.String r0 = "medium"
            r3 = r0
        L2c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.l.z():java.lang.String");
    }
}
