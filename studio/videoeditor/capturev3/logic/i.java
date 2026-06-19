package com.bilibili.studio.videoeditor.capturev3.logic;

import JB0.p;
import Vn.A;
import android.app.Application;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.studio.videoeditor.capturev3.bean.CaptureSticker;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.mediav3.data.ContentMode;
import com.bilibili.studio.videoeditor.util.C6645s;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import yw0.C9104b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public LC0.a f109252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f109254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public IndependentCaptureViewModel f109257f;

    public static boolean b(i iVar, String str) {
        boolean z6;
        iVar.getClass();
        Application application = BiliContext.application();
        if (application == null) {
            z6 = false;
        } else {
            z6 = false;
            if (str != null) {
                z6 = false;
                if (!TextUtils.isEmpty(str)) {
                    if (m.b(str)) {
                        int i7 = !C9104b.e(str) ? 1 : 2;
                        LC0.a aVar = iVar.f109252a;
                        if (aVar != null) {
                            if ((2 & aVar.q()) == 0) {
                                aVar.O(i7, str, application);
                            } else {
                                aVar.E(i7, str);
                            }
                            aVar.U(ContentMode.ASPECT_AUTO, 0.5625f);
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
        }
        return z6;
    }

    public final boolean a(@NotNull String str, int i7, @Nullable int[] iArr) {
        boolean zQ0;
        LC0.a aVar;
        int[] iArr2 = iArr;
        if (iArr == null) {
            iArr2 = new int[]{-1};
        }
        if (p.a(12, iArr2)) {
            Application application = BiliContext.application();
            String resourceDirPath = application != null ? ModResourceClient.getInstance().get(application, "uper", "android_jojo_model").getResourceDirPath() : null;
            if ((resourceDirPath == null || resourceDirPath.length() == 0 || (aVar = this.f109252a) == null) ? false : aVar.r(resourceDirPath)) {
                LC0.a aVar2 = this.f109252a;
                zQ0 = false;
                if (aVar2 != null) {
                    zQ0 = aVar2.q0(i7, str);
                }
            } else {
                BLog.e("MediaEngineManager", "JoJo Model set path fail");
                zQ0 = false;
            }
        } else {
            LC0.a aVar3 = this.f109252a;
            zQ0 = false;
            if (aVar3 != null) {
                zQ0 = aVar3.q0(i7, str);
            }
        }
        return zQ0;
    }

    public final boolean c(boolean z6, Map map, FragmentActivity fragmentActivity) {
        int i7;
        StringBuilder sbB = A.b(this.f109253b, this.f109254c, "captureGrade=", ",captureDeviceIndex=", ",isOnyOneCapture=");
        sbB.append(z6);
        BLog.e("MediaEngineManager", sbB.toString());
        long jCurrentTimeMillis = System.currentTimeMillis();
        LC0.a aVar = this.f109252a;
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.W(BiliContext.application(), this.f109253b, this.f109254c, true, map)) : null;
        BLog.e("timee", "MediaEngineManager configEngine time=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "，initResultCode=" + numValueOf);
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i7 = 2131842198;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            i7 = 2131842154;
        } else {
            if (numValueOf != null) {
                numValueOf.intValue();
            }
            i7 = 2131841921;
        }
        C6645s.b(fragmentActivity, i7, new O80.e(fragmentActivity));
        return false;
    }

    public final boolean d() {
        LC0.a aVar = this.f109252a;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.T(zB0.d.a().a.getNowDeviceIndex())) : null;
        BLog.e("MediaEngineManager", "isEngineBackCamera isBackCamera=" + boolValueOf + " ");
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final void e() {
        IndependentCaptureViewModel independentCaptureViewModel = this.f109257f;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.f109301n.l.setValue(new CaptureSticker(1027));
        }
        LC0.a aVar = this.f109252a;
        if (aVar != null) {
            aVar.M(this);
        }
        LC0.a aVar2 = this.f109252a;
        if (aVar2 != null) {
            aVar2.P(this);
        }
        LC0.a aVar3 = this.f109252a;
        if (aVar3 != null) {
            aVar3.G(this);
        }
    }
}
