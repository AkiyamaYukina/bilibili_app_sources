package com.bilibili.pegasus.components.videomode;

import Lh.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusVideoMode;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.ext.router.UriType;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerWindowManager;
import java.util.concurrent.CopyOnWriteArraySet;
import kntr.base.localization.Localization;
import kntr.base.localization.q;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qp0.C8476b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BasePegasusComponent f77209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public VideoModeGuidanceV2 f77212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f77214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public UriType f77215g = UriType.UNKNOWN;

    @NotNull
    public final b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final c f77216i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/f$a.class */
    public static final class a implements com.bilibili.pegasus.common.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f77217a;

        public a(f fVar) {
            this.f77217a = fVar;
        }

        @Override // com.bilibili.pegasus.common.a
        public final void a(BasePegasusData basePegasusData, Uri uri) {
            if (basePegasusData == null || uri == null) {
                return;
            }
            this.f77217a.f77215g = C8476b.c(uri);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/f$b.class */
    public static final class b implements Ao0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f77218a;

        public b(f fVar) {
            this.f77218a = fVar;
        }

        @Override // Ao0.b
        public final void a(int i7) {
            f fVar = this.f77218a;
            com.bilibili.bplus.im.protobuf.a.b(fVar.f77213e, i7, "onHomeWayChange, oldWay = ", ", newWay = ", "[Pegasus]VideoModeGuidanceWrapper");
            fVar.f77213e = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/f$c.class */
    public static final class c implements com.bilibili.pegasus.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f77219a;

        public c(f fVar) {
            this.f77219a = fVar;
        }

        /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
        public final void m8072onVisibleStateChanged9haIX0A(int i7, int i8) {
            Context context;
            Context context2;
            boolean z6;
            boolean z7 = PegasusVisibleState.isVisible-impl(i8);
            final f fVar = this.f77219a;
            fVar.f77214f = z7;
            if (!PegasusVisibleState.isVisible-impl(i7) && PegasusVisibleState.isVisible-impl(i8)) {
                BLog.i("[Pegasus]VideoModeGuidanceWrapper", "onFragmentVisible");
                if (fVar.a()) {
                    BasePegasusComponent basePegasusComponent = fVar.f77209a;
                    final Fragment fragment = basePegasusComponent.getFragment();
                    boolean z8 = false;
                    if (fragment != null && (context2 = fragment.getContext()) != null) {
                        boolean z9 = true;
                        int i9 = 1 << fVar.f77213e;
                        UriType uriType = fVar.f77215g;
                        if (i9 == 0 || i9 == 1 || (fVar.f77211c & i9) != i9) {
                            z9 = false;
                        }
                        PegasusVideoMode pegasusVideoModeA = r.a();
                        if (uriType != UriType.UNKNOWN && z9 && pegasusVideoModeA == PegasusVideoMode.MODE_SERVER_AUTO) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
                            long j7 = 0;
                            if (bLKVSharedPreference != null) {
                                j7 = bLKVSharedPreference.getLong("sp_video_guide_mode_dialog_next_allow_date", 0L);
                            }
                            if (jCurrentTimeMillis >= j7 && !(z6 = Ao0.i.f376a) && !z6) {
                                MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("video_mode_guide_v2", new MainDialogManager.IDialogInterface(fVar, fragment) { // from class: com.bilibili.pegasus.components.videomode.e

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final f f77207a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final Fragment f77208b;

                                    {
                                        this.f77207a = fVar;
                                        this.f77208b = fragment;
                                    }

                                    public final void onShow() {
                                        f fVar2 = this.f77207a;
                                        if (!fVar2.a()) {
                                            BLog.i("[Pegasus]VideoModeGuidanceWrapper", "addToDialogQueue, can't show guidance, showNext");
                                            fVar2.b();
                                        } else {
                                            VideoModeGuidanceV2 videoModeGuidanceV2 = new VideoModeGuidanceV2(this.f77208b, fVar2.f77213e);
                                            fVar2.f77212d = videoModeGuidanceV2;
                                            videoModeGuidanceV2.g();
                                        }
                                    }
                                }, 2106), context2);
                            }
                        }
                    }
                    final Fragment fragment2 = basePegasusComponent.getFragment();
                    if (fragment2 != null && (context = fragment2.getContext()) != null) {
                        UriType uriType2 = fVar.f77215g;
                        if (fVar.f77210b && uriType2 == UriType.STORY && r.a() == PegasusVideoMode.MODE_SERVER_STORY) {
                            SharedPreferences bLKVSharedPreference2 = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
                            if (bLKVSharedPreference2 != null) {
                                z8 = bLKVSharedPreference2.getBoolean("has_show_v1_video_mode_guidance", false);
                            }
                            if (!z8) {
                                MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("video_mode_guide", new MainDialogManager.IDialogInterface(fVar, fragment2) { // from class: com.bilibili.pegasus.components.videomode.d

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final f f77205a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final Fragment f77206b;

                                    {
                                        this.f77205a = fVar;
                                        this.f77206b = fragment2;
                                    }

                                    public final void onShow() {
                                        SharedPreferences bLKVSharedPreference3;
                                        SharedPreferences.Editor editorEdit;
                                        SharedPreferences.Editor editorPutBoolean;
                                        f fVar2 = this.f77205a;
                                        if (!fVar2.a()) {
                                            BLog.i("[Pegasus]VideoModeGuidanceWrapper", "addToDialogQueue, can't show guidanceV1, showNext");
                                            fVar2.b();
                                            return;
                                        }
                                        VideoModeGuidanceV2 videoModeGuidanceV2 = new VideoModeGuidanceV2(this.f77206b, 0);
                                        fVar2.f77212d = videoModeGuidanceV2;
                                        if (!videoModeGuidanceV2.g() || (bLKVSharedPreference3 = BiliGlobalPreferenceHelper.getBLKVSharedPreference()) == null || (editorEdit = bLKVSharedPreference3.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("has_show_v1_video_mode_guidance", true)) == null) {
                                            return;
                                        }
                                        editorPutBoolean.apply();
                                    }
                                }, 2105), context);
                            }
                        }
                    }
                }
            }
            if (!PegasusVisibleState.isVisible-impl(i7) || PegasusVisibleState.isVisible-impl(i8)) {
                return;
            }
            BLog.i("[Pegasus]VideoModeGuidanceWrapper", "dismiss by fragment hide.");
            VideoModeGuidanceV2 videoModeGuidanceV2 = fVar.f77212d;
            if (videoModeGuidanceV2 != null) {
                videoModeGuidanceV2.a();
            }
        }
    }

    public f(@NotNull BasePegasusComponent basePegasusComponent, boolean z6, int i7) {
        this.f77209a = basePegasusComponent;
        this.f77210b = z6;
        this.f77211c = i7;
        b bVar = new b(this);
        this.h = bVar;
        c cVar = new c(this);
        this.f77216i = cVar;
        a aVar = new a(this);
        BLog.i("[Pegasus]VideoModeGuidanceWrapper", "init video mode guidance");
        Ao0.c cVar2 = null;
        Object obj = BLRouter.get$default(BLRouter.INSTANCE, u00.c.class, (String) null, 2, (Object) null);
        cVar2 = obj instanceof Ao0.c ? (Ao0.c) obj : cVar2;
        if (cVar2 != null) {
            cVar2.f372a.add(bVar);
        }
        basePegasusComponent.addVisibleStateChangeListener(cVar);
        if (basePegasusComponent.getView() != null) {
            Lazy lazy = com.bilibili.pegasus.common.c.f75518a;
            Lifecycle lifecycle = basePegasusComponent.getFragment().getViewLifecycleOwner().getLifecycle();
            ((CopyOnWriteArraySet) com.bilibili.pegasus.common.c.f75518a.getValue()).add(aVar);
            if (lifecycle != null) {
                lifecycle.addObserver(new com.bilibili.pegasus.common.b(aVar, lifecycle));
            }
        }
    }

    public final boolean a() {
        if (!q.c(Localization.INSTANCE.getCurrent())) {
            return false;
        }
        IMiniPlayerWindowManager iMiniPlayerWindowManager = (IMiniPlayerWindowManager) BLRouter.get$default(BLRouter.INSTANCE, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);
        boolean zIsMiniPlayerActive = iMiniPlayerWindowManager != null ? iMiniPlayerWindowManager.isMiniPlayerActive(true) : false;
        boolean z6 = false;
        if (ListExtentionsKt.isViewAlive(this.f77209a.getFragment())) {
            z6 = false;
            if (!zIsMiniPlayerActive) {
                z6 = false;
                if (this.f77214f) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void b() {
        b bVar;
        BLog.i("[Pegasus]VideoModeGuidanceWrapper", "show next dialog.");
        Ao0.c cVar = null;
        MainDialogManager.showNextDialog("video_mode_guide", false, (Context) null);
        this.f77212d = null;
        Object obj = BLRouter.get$default(BLRouter.INSTANCE, u00.c.class, (String) null, 2, (Object) null);
        if (obj instanceof Ao0.c) {
            cVar = (Ao0.c) obj;
        }
        if (cVar == null || (bVar = this.h) == null) {
            return;
        }
        cVar.f372a.remove(bVar);
    }
}
