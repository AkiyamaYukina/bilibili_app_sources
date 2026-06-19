package com.bilibili.playerbizcommon.input.panels;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.staggeredgrid.Q;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.PostPanelBizType;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.playerbizcommon.api.DanmakuColorfulPanelInfo;
import com.bilibili.playerbizcommon.features.danmaku.view.PlayerAutoLineLayout;
import com.bilibili.playerbizcommon.features.danmaku.view.PlayerOptionColorView;
import com.bilibili.playerbizcommon.features.danmaku.view.PlayerOptionDrawableView;
import com.bilibili.playerbizcommon.input.InputPanelContainer;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import j4.t;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
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
import qq0.InterfaceC8477a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/i.class */
public final class i extends Cq0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cq0.b f80192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Tq0.i f80193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SharedPreferences f80194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ViewGroup f80195g;

    @Nullable
    public PlayerAutoLineLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public PlayerAutoLineLayout f80196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public PlayerAutoLineLayout f80197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ViewGroup f80198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewGroup f80199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TintCheckBox f80200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public m f80201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f80202o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public qq0.e f80205r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public DanmakuColorfulPanelInfo f80207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f80208u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f80203p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f80204q = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public Function1<? super Boolean, Unit> f80206s = new Q(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final a f80209v = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/i$a.class */
    public static final class a implements com.bilibili.playerbizcommon.features.danmaku.input.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f80210a;

        public a(i iVar) {
            this.f80210a = iVar;
        }

        @Override // com.bilibili.playerbizcommon.features.danmaku.input.b
        public final void a(long j7, boolean z6) {
            DanmakuColorfulPanelInfo.ColorfulPrivilegeDetails colorfulPrivilegeDetails;
            i iVar = this.f80210a;
            if (z6) {
                DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = iVar.f80207t;
                if (danmakuColorfulPanelInfo != null && (colorfulPrivilegeDetails = danmakuColorfulPanelInfo.getColorfulPrivilegeDetails()) != null) {
                    colorfulPrivilegeDetails.setVipOrderPromotion(Boolean.FALSE);
                }
                Cq0.b bVar = iVar.f80192d;
                Cq0.b bVar2 = bVar;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    bVar2 = null;
                }
                Qq0.a aVarE = bVar2.e();
                if (aVarE != null) {
                    aVarE.setDanmakuColorful(new com.bilibili.playerbizcommon.features.danmaku.input.a(false, j7, iVar.f80207t));
                }
                m mVar = iVar.f80201n;
                if (mVar != null) {
                    mVar.h(iVar.f80205r);
                }
                iVar.I();
            }
            iVar.f80206s.invoke(Boolean.valueOf(z6));
        }
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
            Cq0.b r0 = r0.f80192d
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
            Rq0.b r0 = r0.o()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.String r0 = r0.f20944j
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L2b
        L28:
            java.lang.String r0 = "medium"
            r3 = r0
        L2b:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.i.A():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String B() {
        /*
            r2 = this;
            r0 = r2
            Cq0.b r0 = r0.f80192d
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
            Rq0.b r0 = r0.o()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.String r0 = r0.f20945k
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.i.B():java.lang.String");
    }

    public final long C() {
        Long l7;
        Cq0.b bVar = this.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        Rq0.b bVarO = bVar2.o();
        return (bVarO == null || (l7 = bVarO.f20946l) == null) ? 0L : l7.longValue();
    }

    public final boolean D() {
        Cq0.b bVar = this.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        PostPanelV2 postPanelV2D = bVar2.d();
        PostPanelBizType bizType = null;
        if (postPanelV2D != null) {
            bizType = postPanelV2D.getBizType();
        }
        return bizType != PostPanelBizType.PostPanelBizTypeNFTDM && this.f80202o;
    }

    public final void E(boolean z6) {
        SharedPreferences.Editor editorEdit;
        if (x() == z6) {
            return;
        }
        SharedPreferences sharedPreferences = this.f80194f;
        if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
            editorEdit.putBoolean("key_up_danmaku_checked", z6);
            editorEdit.apply();
        }
        Cq0.b bVar = this.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        Qq0.a aVarE = bVar2.e();
        if (aVarE != null) {
            aVarE.C(z6);
        }
        H(z6 && D());
    }

    public final void F(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i7);
            if (!Intrinsics.areEqual(childAt, this.f80199l)) {
                if (childAt instanceof InterfaceC8477a) {
                    ((InterfaceC8477a) childAt).setAvailableState(z6);
                } else if (childAt instanceof ViewGroup) {
                    F((ViewGroup) childAt, z6);
                }
            }
        }
    }

    public final void G() {
        boolean z6;
        Tq0.i iVarY;
        Tq0.i iVarY2;
        Tq0.i iVarY3;
        ViewGroup viewGroup = this.f80195g;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        int userLevel = BiliAccountInfo.Companion.get().getUserLevel();
        if (userLevel < 3) {
            PlayerAutoLineLayout playerAutoLineLayout = this.f80197j;
            int childCount = playerAutoLineLayout != null ? playerAutoLineLayout.getChildCount() : 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                PlayerAutoLineLayout playerAutoLineLayout2 = this.f80197j;
                View childAt = playerAutoLineLayout2 != null ? playerAutoLineLayout2.getChildAt(i7) : null;
                if (childAt instanceof PlayerOptionDrawableView) {
                    PlayerOptionDrawableView playerOptionDrawableView = (PlayerOptionDrawableView) childAt;
                    if (Intrinsics.areEqual(playerOptionDrawableView.getItemTag(), B())) {
                        playerOptionDrawableView.setLockState(false);
                        playerOptionDrawableView.setSelectState(true);
                    } else {
                        playerOptionDrawableView.setLockState(true);
                        playerOptionDrawableView.setSelectState(false);
                    }
                }
            }
        }
        if (userLevel < 2) {
            PlayerAutoLineLayout playerAutoLineLayout3 = this.f80196i;
            int childCount2 = playerAutoLineLayout3 != null ? playerAutoLineLayout3.getChildCount() : 0;
            for (int i8 = 0; i8 < childCount2; i8++) {
                PlayerAutoLineLayout playerAutoLineLayout4 = this.f80196i;
                View childAt2 = playerAutoLineLayout4 != null ? playerAutoLineLayout4.getChildAt(i8) : null;
                if (childAt2 instanceof PlayerOptionDrawableView) {
                    PlayerOptionDrawableView playerOptionDrawableView2 = (PlayerOptionDrawableView) childAt2;
                    if (Intrinsics.areEqual(playerOptionDrawableView2.getItemTag(), A())) {
                        playerOptionDrawableView2.setLockState(false);
                        playerOptionDrawableView2.setSelectState(true);
                    } else {
                        playerOptionDrawableView2.setLockState(true);
                        playerOptionDrawableView2.setSelectState(false);
                    }
                }
            }
            PlayerAutoLineLayout playerAutoLineLayout5 = this.h;
            int childCount3 = playerAutoLineLayout5 != null ? playerAutoLineLayout5.getChildCount() : 0;
            for (int i9 = 0; i9 < childCount3; i9++) {
                PlayerAutoLineLayout playerAutoLineLayout6 = this.h;
                View childAt3 = playerAutoLineLayout6 != null ? playerAutoLineLayout6.getChildAt(i9) : null;
                if (childAt3 instanceof PlayerOptionColorView) {
                    PlayerOptionColorView playerOptionColorView = (PlayerOptionColorView) childAt3;
                    if (Intrinsics.areEqual(playerOptionColorView.getItemTag(), z())) {
                        playerOptionColorView.setLockState(false);
                        playerOptionColorView.setSelectState(true);
                    } else {
                        playerOptionColorView.setLockState(true);
                        playerOptionColorView.setSelectState(false);
                    }
                }
            }
        }
        if (userLevel > 3) {
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
                    if (childAt4 instanceof qq0.e) {
                        qq0.e eVar = (qq0.e) childAt4;
                        boolean zAreEqual = Intrinsics.areEqual(eVar.getItemTag(), String.valueOf(C()));
                        eVar.setSelectState(zAreEqual);
                        z9 = z8;
                        if (zAreEqual) {
                            Tq0.i iVarY4 = y();
                            if (iVarY4 != null) {
                                Tq0.i.S(iVarY4, null, null, null, Long.valueOf(C()), 7);
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
                            playerOptionColorView3.setSelectState(Intrinsics.areEqual(playerOptionColorView3.getItemTag(), z()));
                            if (Intrinsics.areEqual(playerOptionColorView3.getItemTag(), z()) && (iVarY3 = y()) != null) {
                                Tq0.i.S(iVarY3, playerOptionColorView3.getItemTag(), null, null, null, 14);
                            }
                        }
                    }
                }
            }
            PlayerAutoLineLayout playerAutoLineLayout9 = this.f80196i;
            if (playerAutoLineLayout9 != null) {
                int childCount6 = playerAutoLineLayout9.getChildCount();
                for (int i12 = 0; i12 < childCount6; i12++) {
                    View childAt6 = playerAutoLineLayout9.getChildAt(i12);
                    PlayerOptionDrawableView playerOptionDrawableView3 = childAt6 instanceof PlayerOptionDrawableView ? (PlayerOptionDrawableView) childAt6 : null;
                    if (playerOptionDrawableView3 != null) {
                        playerOptionDrawableView3.setSelectState(Intrinsics.areEqual(playerOptionDrawableView3.getItemTag(), A()));
                        if (Intrinsics.areEqual(playerOptionDrawableView3.getItemTag(), A()) && (iVarY2 = y()) != null) {
                            Tq0.i.S(iVarY2, null, playerOptionDrawableView3.getItemTag(), null, null, 13);
                        }
                    }
                }
            }
            PlayerAutoLineLayout playerAutoLineLayout10 = this.f80197j;
            if (playerAutoLineLayout10 != null) {
                int childCount7 = playerAutoLineLayout10.getChildCount();
                for (int i13 = 0; i13 < childCount7; i13++) {
                    View childAt7 = playerAutoLineLayout10.getChildAt(i13);
                    PlayerOptionDrawableView playerOptionDrawableView4 = childAt7 instanceof PlayerOptionDrawableView ? (PlayerOptionDrawableView) childAt7 : null;
                    if (playerOptionDrawableView4 != null) {
                        playerOptionDrawableView4.setSelectState(Intrinsics.areEqual(playerOptionDrawableView4.getItemTag(), B()));
                        if (Intrinsics.areEqual(playerOptionDrawableView4.getItemTag(), B()) && (iVarY = y()) != null) {
                            Tq0.i.S(iVarY, null, null, playerOptionDrawableView4.getItemTag(), null, 11);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(boolean r6) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.i.H(boolean):void");
    }

    public final void I() {
        boolean z6;
        Tq0.i iVarY;
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
                if (childAt instanceof qq0.e) {
                    qq0.e eVar = (qq0.e) childAt;
                    boolean zAreEqual = Intrinsics.areEqual(eVar.getItemTag(), String.valueOf(C()));
                    eVar.setSelectState(zAreEqual);
                    z9 = z8;
                    if (zAreEqual) {
                        Tq0.i iVarY2 = y();
                        if (iVarY2 != null) {
                            Tq0.i.S(iVarY2, null, null, null, Long.valueOf(C()), 7);
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
                        playerOptionColorView2.setSelectState(Intrinsics.areEqual(playerOptionColorView2.getItemTag(), z()));
                        if (Intrinsics.areEqual(playerOptionColorView2.getItemTag(), z()) && (iVarY = y()) != null) {
                            Tq0.i.S(iVarY, playerOptionColorView2.getItemTag(), null, null, null, 14);
                        }
                    }
                }
            }
        }
    }

    public final void J(@NotNull String str, boolean z6) {
        this.f80202o = z6;
        this.f80203p = str;
        if (D()) {
            TintCheckBox tintCheckBox = this.f80200m;
            if (tintCheckBox != null) {
                tintCheckBox.setChecked(x());
            }
            TintCheckBox tintCheckBox2 = this.f80200m;
            if (tintCheckBox2 != null) {
                tintCheckBox2.setText(this.f80203p);
            }
            TintCheckBox tintCheckBox3 = this.f80200m;
            if (tintCheckBox3 != null) {
                tintCheckBox3.setVisibility(0);
            }
        } else {
            TintCheckBox tintCheckBox4 = this.f80200m;
            if (tintCheckBox4 != null) {
                tintCheckBox4.setVisibility(8);
            }
        }
        boolean z7 = false;
        if (x()) {
            z7 = false;
            if (D()) {
                z7 = true;
            }
        }
        H(z7);
    }

    @Override // Cq0.a
    public final void l(@NotNull Cq0.b bVar) {
        this.f80192d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    @Override // Cq0.a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup n(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull android.view.ViewGroup r7) {
        /*
            r5 = this;
            r0 = r5
            Cq0.b r0 = r0.f80192d
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
            boolean r0 = com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt.isThumb(r0)
            r9 = r0
            r0 = 2131496403(0x7f0c0dd3, float:1.861637E38)
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L4c
            r0 = r5
            Cq0.b r0 = r0.f80192d
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
            boolean r0 = com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt.isStory(r0)
            if (r0 != 0) goto L4c
            goto L91
        L4c:
            r0 = r5
            Cq0.b r0 = r0.f80192d
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
            boolean r0 = com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt.isLandscape(r0)
            if (r0 != 0) goto L8d
            r0 = r5
            Cq0.b r0 = r0.f80192d
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
            boolean r0 = com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt.isStory(r0)
            if (r0 == 0) goto L8d
            goto L91
        L8d:
            r0 = 2131496404(0x7f0c0dd4, float:1.8616372E38)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.i.n(android.content.Context, android.view.ViewGroup):android.view.ViewGroup");
    }

    @Override // Cq0.a
    public final void o() {
    }

    @Override // Cq0.a
    public final void q() {
        super.q();
        Cq0.b bVar = this.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        Qq0.a aVarE = bVar2.e();
        if (aVarE != null) {
            aVarE.removeDanmakuColorfulEnableObserver(this.f80209v);
        }
    }

    @Override // Cq0.a
    public final void r() {
        com.bilibili.playerbizcommon.features.danmaku.input.a danmakuColorful;
        LifecycleCoroutineScope lifecycleScope;
        com.bilibili.playerbizcommon.features.danmaku.input.a danmakuColorful2;
        super.r();
        this.f80208u = false;
        Cq0.b bVar = this.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        Qq0.a aVarE = bVar2.e();
        if (aVarE != null) {
            aVarE.addDanmakuColorfulEnableObserver(this.f80209v);
        }
        Cq0.b bVar3 = this.f80192d;
        Cq0.b bVar4 = bVar3;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar4 = null;
        }
        Qq0.a aVarE2 = bVar4.e();
        if (aVarE2 == null || (danmakuColorful = aVarE2.getDanmakuColorful()) == null) {
            return;
        }
        long j7 = danmakuColorful.f79675b;
        Cq0.b bVar5 = this.f80192d;
        Cq0.b bVar6 = bVar5;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar6 = null;
        }
        if (InputExtensionsKt.isStory(bVar6) && !danmakuColorful.f79674a && j7 != 0) {
            m mVar = this.f80201n;
            if (mVar != null) {
                mVar.b(j7);
            }
            I();
        }
        Cq0.b bVar7 = this.f80192d;
        Cq0.b bVar8 = bVar7;
        if (bVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar8 = null;
        }
        Qq0.a aVarE3 = bVar8.e();
        boolean z6 = aVarE3 != null && aVarE3.getColorfulEnable();
        t.a("onPanelShow colorfulEnable = ", "InputOptionsPanel", z6);
        if (z6) {
            Cq0.b bVar9 = this.f80192d;
            Cq0.b bVar10 = bVar9;
            if (bVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar10 = null;
            }
            Qq0.a aVarE4 = bVar10.e();
            if (((aVarE4 == null || (danmakuColorful2 = aVarE4.getDanmakuColorful()) == null) ? null : danmakuColorful2.f79676c) == null) {
                if (this.f80208u) {
                    return;
                }
                this.f80208u = true;
                ViewGroup viewGroup = this.f80195g;
                FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(viewGroup != null ? viewGroup.getContext() : null);
                if (fragmentActivityFindFragmentActivityOrNull == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull)) == null) {
                    return;
                }
                BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new InputOptionsPanel$getColorfulPanelInfo$1(this, null), 3, (Object) null);
                return;
            }
            if (this.f80208u) {
                return;
            }
            Cq0.b bVar11 = this.f80192d;
            Cq0.b bVar12 = bVar11;
            if (bVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar12 = null;
            }
            Qq0.a aVarE5 = bVar12.e();
            DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = null;
            if (aVarE5 != null) {
                com.bilibili.playerbizcommon.features.danmaku.input.a danmakuColorful3 = aVarE5.getDanmakuColorful();
                danmakuColorfulPanelInfo = null;
                if (danmakuColorful3 != null) {
                    danmakuColorfulPanelInfo = danmakuColorful3.f79676c;
                }
            }
            w(danmakuColorfulPanelInfo, false);
            this.f80208u = true;
        }
    }

    @Override // Cq0.a
    public final void s() {
        H(x() && D());
        Cq0.b bVar = this.f80192d;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        if (InputExtensionsKt.isStory(bVar2)) {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02ed  */
    @Override // Cq0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(@org.jetbrains.annotations.NotNull android.view.ViewGroup r7) {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.i.v(android.view.ViewGroup):void");
    }

    public final void w(DanmakuColorfulPanelInfo danmakuColorfulPanelInfo, boolean z6) {
        List<DanmakuColorfulPanelInfo.ColorfulPanel> colorfulPanelList;
        PlayerAutoLineLayout playerAutoLineLayout;
        Context context;
        PlayerAutoLineLayout playerAutoLineLayout2;
        Iterator<View> it;
        boolean zAreEqual;
        DmViewReply dmViewReply;
        m mVar;
        if (danmakuColorfulPanelInfo == null || (colorfulPanelList = danmakuColorfulPanelInfo.getColorfulPanelList()) == null || (playerAutoLineLayout = this.h) == null || (context = playerAutoLineLayout.getContext()) == null || (playerAutoLineLayout2 = this.h) == null || (it = ViewGroupKt.iterator(playerAutoLineLayout2)) == null) {
            return;
        }
        Pair pair = null;
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof qq0.e) {
                qq0.e eVar = (qq0.e) next;
                pair = new Pair(eVar.getItemTag(), Boolean.valueOf(eVar.getSelectState()));
                it.remove();
            }
        }
        for (DanmakuColorfulPanelInfo.ColorfulPanel colorfulPanel : CollectionsKt.reversed(colorfulPanelList)) {
            qq0.e eVar2 = new qq0.e(context);
            eVar2.setColorfulPanel(colorfulPanel);
            PlayerAutoLineLayout playerAutoLineLayout3 = this.h;
            if ((playerAutoLineLayout3 != null ? playerAutoLineLayout3.getChildCount() : 0) > 0) {
                PlayerAutoLineLayout playerAutoLineLayout4 = this.h;
                if (playerAutoLineLayout4 != null) {
                    playerAutoLineLayout4.addView(eVar2, 1);
                }
                boolean z7 = false;
                if (pair != null) {
                    z7 = false;
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        z7 = true;
                    }
                }
                if (z7 && Intrinsics.areEqual(pair.getFirst(), eVar2.getItemTag())) {
                    eVar2.setSelectState(true);
                }
            }
        }
        if (colorfulPanelList.isEmpty()) {
            return;
        }
        if (z6) {
            DanmakuColorfulPanelInfo.ColorfulPrivilegeDetails colorfulPrivilegeDetails = danmakuColorfulPanelInfo.getColorfulPrivilegeDetails();
            zAreEqual = false;
            if (colorfulPrivilegeDetails != null) {
                zAreEqual = Intrinsics.areEqual(colorfulPrivilegeDetails.getVipOrderPromotion(), Boolean.TRUE);
            }
        } else {
            Cq0.b bVar = this.f80192d;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            Qq0.a aVarE = bVar2.e();
            zAreEqual = false;
            if (aVarE != null) {
                com.bilibili.playerbizcommon.features.danmaku.input.a danmakuColorful = aVarE.getDanmakuColorful();
                zAreEqual = false;
                if (danmakuColorful != null) {
                    zAreEqual = danmakuColorful.f79674a;
                }
            }
        }
        Cq0.b bVar3 = this.f80192d;
        Cq0.b bVar4 = bVar3;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar4 = null;
        }
        Qq0.a aVarE2 = bVar4.e();
        com.bilibili.playerbizcommon.features.danmaku.input.a danmakuColorful2 = aVarE2 != null ? aVarE2.getDanmakuColorful() : null;
        long j7 = danmakuColorful2 != null ? danmakuColorful2.f79675b : 0L;
        Cq0.b bVar5 = this.f80192d;
        Cq0.b bVar6 = bVar5;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar6 = null;
        }
        Qq0.a aVarE3 = bVar6.e();
        if (aVarE3 != null) {
            aVarE3.setDanmakuColorful(new com.bilibili.playerbizcommon.features.danmaku.input.a(zAreEqual, j7, danmakuColorfulPanelInfo));
        }
        Cq0.b bVar7 = this.f80192d;
        Cq0.b bVar8 = bVar7;
        if (bVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar8 = null;
        }
        if (InputExtensionsKt.isStory(bVar8) && !zAreEqual && j7 != 0) {
            if (!z6 && (mVar = this.f80201n) != null) {
                mVar.b(j7);
            }
            I();
        }
        Cq0.b bVar9 = this.f80192d;
        if (bVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar9 = null;
        }
        Rq0.b bVarO = bVar9.o();
        if (bVarO == null || (dmViewReply = bVarO.f20938c) == null) {
            return;
        }
        J(dmViewReply.getCheckBoxShowMsg(), dmViewReply.getCheckBox());
    }

    public final boolean x() {
        SharedPreferences sharedPreferences = this.f80194f;
        boolean z6 = this.f80204q;
        boolean z7 = z6;
        if (sharedPreferences != null) {
            z7 = sharedPreferences.getBoolean("key_up_danmaku_checked", z6);
        }
        return z7;
    }

    public final Tq0.i y() {
        if (this.f80193e == null) {
            Cq0.b bVar = this.f80192d;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = bVar2.h();
            Tq0.i iVar = null;
            if (inputPanelContainerH != null) {
                iVar = (Tq0.i) InputPanelContainer.a(inputPanelContainerH, Tq0.i.class);
            }
            this.f80193e = iVar;
        }
        return this.f80193e;
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
            Cq0.b r0 = r0.f80192d
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
            Rq0.b r0 = r0.o()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.String r0 = r0.f20943i
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.input.panels.i.z():java.lang.String");
    }
}
