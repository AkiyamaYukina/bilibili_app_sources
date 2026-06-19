package com.bilibili.studio.videoeditor.capturev3.activity;

import AA0.d;
import CC0.h;
import FB0.d;
import QB0.i;
import R50.r;
import Xz0.g;
import Xz0.j;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import com.bilibili.droid.CpuUtils;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.k;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.media.check.MediaCheckScene;
import com.bilibili.studio.videoeditor.G;
import com.bilibili.studio.videoeditor.capturev3.logic.CaptureVideoEditCustomize;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.help.mux.MuxInfo;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import com.bilibili.studio.videoeditor.nvsstreaming.EditProxyUtils;
import com.bilibili.studio.videoeditor.util.C6633f;
import com.bilibili.studio.videoeditor.util.C6645s;
import com.bilibili.studio.videoeditor.util.X;
import eA0.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kD0.e;
import kotlin.Lazy;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/activity/BiliCapturePreviewActivity.class */
public class BiliCapturePreviewActivity extends BaseAppCompatActivity implements View.OnClickListener, i.a, IPvTracker {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f109096J = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public UpperLiveWindowExt f109097B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f109098C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Button f109099D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public FrameLayout f109100E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public d f109101F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public i f109102G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f109103H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public a.a f109104I;

    public final void P6() {
        com.bilibili.studio.editor.timeline.i iVar;
        GB0.a aVarA = GB0.a.a();
        aVarA.f6980a = null;
        aVarA.f6981b = null;
        d dVar = this.f109101F;
        if (dVar != null) {
            EB0.a aVar = dVar.f6039d;
            if (aVar != null && (iVar = aVar.f3908a) != null) {
                c.a(iVar, "UpperStreamingVideo onVideoStop");
                r rVar = iVar.f108304f;
                if (rVar != null) {
                    EditProxyUtils.stop(rVar);
                }
            }
            EB0.a aVar2 = dVar.f6039d;
            if (aVar2 != null) {
                com.bilibili.studio.editor.timeline.i iVar2 = aVar2.f3908a;
                if (iVar2 != null) {
                    iVar2.c();
                }
                k.a.f108315a.b(UpperEngineScene.CAPTURE_PREVIEW);
            }
        }
    }

    public final void Q6(String str) {
        d dVar = this.f109101F;
        if (dVar == null || dVar.f6036a == null) {
            return;
        }
        e.b(dVar.f6036a.getApplicationContext(), str, androidx.compose.ui.input.pointer.k.a(System.currentTimeMillis(), "generated_video_", ".mp4"), new FB0.c(dVar, str));
    }

    public final void R6(String str) {
        if (!X.a(str, "BiliCapturePreviewActivity")) {
            d dVar = this.f109101F;
            String string = getString(2131841951);
            new AlertDialog.Builder(this).setMessage(string).setPositiveButton(2131841776, (DialogInterface.OnClickListener) new eC0.c(dVar, string)).setCancelable(false).show();
        } else {
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            if (PermissionsChecker.checkSelfPermissions(this, strArr)) {
                Q6(str);
            } else {
                PermissionRequestUtils.requestPermissionWithTip(this, getLifecycle(), strArr, 1, getString(((Boolean) b.f130951b.getValue()).booleanValue() ? 2131842197 : 2131841864));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S6(final java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.activity.BiliCapturePreviewActivity.S6(java.lang.String):void");
    }

    public final void T6(int i7, int i8, String str, String str2) {
        i iVar;
        d dVar = this.f109101F;
        if (dVar == null) {
            return;
        }
        if (i7 == 2) {
            this.f109103H = str2;
            R6(str2);
            return;
        }
        if (i7 == 3) {
            i iVar2 = this.f109102G;
            if (iVar2 != null) {
                PopupWindow popupWindow = iVar2.f125317a;
                if (popupWindow != null) {
                    i.b(popupWindow);
                }
                TextView textView = iVar2.f19774c;
                if (textView != null) {
                    textView.setText("");
                }
            }
            ToastHelper.showToastShort(this, str);
            d dVar2 = this.f109101F;
            if (dVar2 != null) {
                dVar2.e();
                return;
            }
            return;
        }
        if (i7 == 1) {
            i iVar3 = this.f109102G;
            if (iVar3 != null) {
                iVar3.d(getString(2131842021, new Object[]{Integer.valueOf(i8)}));
                return;
            }
            return;
        }
        if (i7 == 4) {
            if (dVar != null) {
                dVar.e();
                return;
            }
            return;
        }
        if (i7 == 6) {
            i iVar4 = this.f109102G;
            if (iVar4 != null) {
                iVar4.d(getString(2131842021, new Object[]{Integer.valueOf(i8)}));
            }
            S6(str2);
            return;
        }
        if (i7 != 7) {
            if (i7 != 5 || (iVar = this.f109102G) == null) {
                return;
            }
            iVar.d(getString(2131842021, new Object[]{Integer.valueOf(i8)}));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ToastHelper.showToastShort(this, str);
        }
        i iVar5 = this.f109102G;
        if (iVar5 != null) {
            iVar5.d(getString(2131842021, new Object[]{Integer.valueOf(i8)}));
        }
        S6(str2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "creation.shot-finish.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        g.b(bundle);
        return bundle;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        P6();
        super.onBackPressed();
    }

    /* JADX WARN: Type inference failed for: r0v194, types: [QB0.i, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar;
        com.bilibili.studio.editor.timeline.i iVar;
        UpperTimeline upperTimeline;
        boolean z6;
        EB0.a aVar;
        com.bilibili.studio.editor.timeline.i iVar2;
        boolean zA;
        UpperTimeline upperTimeline2;
        BiliCapturePreviewActivity biliCapturePreviewActivity;
        boolean zD;
        MuxInfo muxInfo;
        int id = view.getId();
        if (id == 2131305483) {
            P6();
            finish();
            return;
        }
        String[] strArr = Xz0.k.f28474a;
        if (id == 2131298049) {
            if (this.f109101F.f6037b == null) {
                return;
            }
            j.c("biz_from", "拍摄-普发");
            G gB = G.b();
            d dVar2 = this.f109101F;
            gB.d(this, dVar2.f6037b, dVar2.f6038c, 0);
            Xz0.d.f28458a.getClass();
            j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
            j.c("router_topic_id", g.f28463b);
            Map mapB = j.b(strArr);
            g.c(mapB);
            Neurons.reportClick(false, "creation.shot.0.edit-video.click", mapB);
            return;
        }
        if (id == 2131298047) {
            if (this.f109101F == null) {
                return;
            }
            Xz0.d.f28458a.getClass();
            HashMap map = new HashMap();
            map.put("biz_from", "113");
            g.c(map);
            Neurons.reportClick(false, "creation.shot.0.send-dynamic.click", map);
            EditVideoInfo editVideoInfo = this.f109101F.f6037b;
            if (editVideoInfo == null || !editVideoInfo.needMakeVideo()) {
                EditVideoInfo editVideoInfo2 = this.f109101F.f6037b;
                if (editVideoInfo2 == null || editVideoInfo2.getVideoList() == null || editVideoInfo2.getVideoList().isEmpty()) {
                    return;
                }
                String filePath = editVideoInfo2.getVideoList().get(0).getFilePath();
                this.f109103H = filePath;
                R6(filePath);
                return;
            }
            d dVar3 = this.f109101F;
            if (dVar3.f6037b != null && (biliCapturePreviewActivity = dVar3.f6036a) != null) {
                Context applicationContext = biliCapturePreviewActivity.getApplicationContext();
                if (dVar3.f6037b.needMakeVideo()) {
                    h hVarB = h.b(applicationContext);
                    synchronized (hVarB) {
                        com.bilibili.studio.videoeditor.help.compiler.sdk.i iVar3 = hVarB.f1534a;
                        zD = iVar3 != null ? iVar3.d() : false;
                    }
                    if (!zD) {
                        EditVideoInfo editVideoInfo3 = dVar3.f6037b;
                        if (editVideoInfo3 != null && (muxInfo = editVideoInfo3.getMuxInfo(applicationContext)) != null) {
                            h hVarB2 = h.b(applicationContext);
                            com.bilibili.studio.videoeditor.help.compiler.sdk.i iVar4 = hVarB2.f1534a;
                            if (iVar4 != null) {
                                iVar4.c(muxInfo);
                            }
                            hVarB2.c();
                        }
                        com.bilibili.studio.videoeditor.help.compiler.sdk.i iVar5 = h.b(applicationContext).f1534a;
                        if (iVar5 != null) {
                            iVar5.f(dVar3);
                        }
                    }
                } else {
                    dVar3.g(dVar3.f6037b.getVideoList().get(0).getFilePath());
                }
            }
            if (this.f109102G == null) {
                ?? obj = new Object();
                obj.f19775d = 0;
                obj.f19773b = this;
                obj.c(2131495386);
                this.f109102G = obj;
            }
            i iVar6 = this.f109102G;
            iVar6.f19776e = this;
            View view2 = this.f109098C;
            iVar6.f19775d = 1;
            iVar6.a(view2);
            this.f109102G.d(getString(2131842021, new Object[]{0}));
            return;
        }
        if (id != 2131298104 || (dVar = this.f109101F) == null) {
            return;
        }
        EB0.a aVar2 = dVar.f6039d;
        if (aVar2 != null) {
            com.bilibili.studio.editor.timeline.i iVar7 = aVar2.f3908a;
            if (((iVar7 == null || (upperTimeline2 = iVar7.f108300b) == null) ? 0L : upperTimeline2.getVideoDuration()) < 3000000) {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(getResources().getString(2131842159)).setCancelable(false).setPositiveButton(getResources().getString(2131842260), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                fA0.a.a(alertDialogCreate);
                return;
            }
        }
        EditVideoInfo editVideoInfo4 = this.f109101F.f6037b;
        if (editVideoInfo4 == null) {
            return;
        }
        long jCalAndUpdateProjectBitrate = EditVideoInfoUtils.calAndUpdateProjectBitrate(editVideoInfo4);
        if (b.o()) {
            MediaCheckScene mediaCheckScene = MediaCheckScene.CAPTURE_PREVIEW_PUBLISH;
            Lazy lazy = AA0.g.f188a;
            if (b.o()) {
                d.a aVar3 = new d.a(this);
                aVar3.f175c = editVideoInfo4;
                aVar3.f177e = mediaCheckScene;
                aVar3.f178f = AA0.b.a(mediaCheckScene);
                List<AA0.c> listB = AA0.b.b(mediaCheckScene);
                aVar3.f179g = listB;
                zA = new d.b(aVar3.f175c, aVar3.f173a, aVar3.f177e, aVar3.f178f, aVar3.h, listB).a();
            } else {
                zA = true;
            }
            if (!zA) {
                return;
            }
        } else {
            EB0.a aVar4 = this.f109101F.f6039d;
            long videoDuration = (aVar4 == null || (iVar = aVar4.f3908a) == null || (upperTimeline = iVar.f108300b) == null) ? 0L : upperTimeline.getVideoDuration();
            float f7 = (videoDuration / 1000.0f) / 1000.0f;
            StringBuilder sb = new StringBuilder("estimated size: ");
            long j7 = jCalAndUpdateProjectBitrate + 320000;
            float f8 = j7 * f7;
            sb.append((f8 / 1024.0f) / 8.0f);
            sb.append("kB, bitrate: ");
            sb.append(j7);
            sb.append("bps, durationInSeconds:");
            sb.append(f7);
            BLog.e("OnEditFinishHelp", sb.toString());
            if (f8 > 65283502080L) {
                long j8 = 65283502080L / j7;
                if (j8 >= 60) {
                    new AlertDialog.Builder(this).setMessage(getResources().getString(2131841814, Long.valueOf(j8 / 60))).setCancelable(false).setPositiveButton(getResources().getString(2131842260), (DialogInterface.OnClickListener) null).create().show();
                } else if (j8 >= 0) {
                    new AlertDialog.Builder(this).setMessage(getResources().getString(2131842072, Long.valueOf(j8))).setCancelable(false).setPositiveButton(getResources().getString(2131842260), (DialogInterface.OnClickListener) null).create().show();
                }
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                return;
            }
        }
        FB0.d dVar4 = this.f109101F;
        if (dVar4 != null && (aVar = dVar4.f6039d) != null && (iVar2 = aVar.f3908a) != null) {
            iVar2.n();
        }
        j.c("biz_from", "拍摄-快发");
        EditVideoInfoUtils.rmRubbishForTransform2DFxInfo(editVideoInfo4.getEditVideoTracks());
        editVideoInfo4.setBizFrom(C6633f.a(editVideoInfo4));
        editVideoInfo4.setForbidEditReport(true);
        editVideoInfo4.setPublishNavId(BuvidHelper.getBuvid() + "_" + System.currentTimeMillis());
        Uz0.g.e(editVideoInfo4, "BiliCapturePreviewActivity");
        CaptureVideoEditCustomize captureVideoEditCustomize = this.f109101F.f6038c;
        if (captureVideoEditCustomize != null && captureVideoEditCustomize.onEditVideoFinish(editVideoInfo4, editVideoInfo4.needMakeVideo())) {
            BLog.e("BiliCapturePreviewActivity", " on publish click use customise action");
        }
        BLog.e("BiliCapturePreviewActivity", " on publish click finish");
        Xz0.d.f28458a.getClass();
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB2 = j.b(strArr);
        g.c(mapB2);
        Neurons.reportClick(false, "creation.shot.0.deploy.click", mapB2);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [FB0.d, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            EditorEngineSDKLoadManager.init(getApplicationContext(), "BiliCapturePreviewActivity");
            Window window = getWindow();
            if (window != null) {
                window.getDecorView().setSystemUiVisibility(4098);
                window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
            }
            setContentView(2131493784);
            a aVarA = a.a();
            oB0.a aVar = new oB0.a(this);
            aVarA.getClass();
            this.f109104I = a.b(EventFinishEdit.class, aVar);
            ?? obj = new Object();
            obj.f6036a = this;
            this.f109101F = obj;
            obj.f6037b = GB0.a.a().f6980a;
            obj.f6038c = GB0.a.a().f6981b;
            findViewById(2131305483).setOnClickListener(this);
            Button button = (Button) findViewById(2131298049);
            this.f109099D = button;
            button.setOnClickListener(this);
            this.f109099D.setTranslationZ(5.0f);
            Button button2 = (Button) findViewById(2131298047);
            button2.setOnClickListener(this);
            ((Button) findViewById(2131298104)).setOnClickListener(this);
            this.f109098C = findViewById(2131300919);
            FrameLayout frameLayout = (FrameLayout) findViewById(2131300878);
            this.f109100E = frameLayout;
            frameLayout.post(new com.bilibili.lib.fasthybrid.uimodule.widget.coverview.internal.g(this, 2));
            UpperLiveWindowExt upperLiveWindowExt = (UpperLiveWindowExt) findViewById(2131305421);
            this.f109097B = upperLiveWindowExt;
            upperLiveWindowExt.setFillModeX(1);
            button2.post(new oB0.b(this, button2));
        } catch (FileNotExistedError e7) {
            BLog.e("BiliCapturePreviewActivity", "onCreate start ms init sdk FileNotExistedError");
            C6645s.b(this, 2131841921, null);
        } catch (NullPointerException e8) {
            BLog.e("BiliCapturePreviewActivity", "onCreate start ms init sdk StreamingContext null");
            C6645s.b(this, 2131842198, null);
        } catch (UnsatisfiedLinkError e9) {
            BLog.e("BiliCapturePreviewActivity", "onCreate start ms init sdk error: " + e9.getLocalizedMessage());
            C6645s.b(this, CpuUtils.isX86(getApplicationContext()) ? 2131842181 : 2131856215, null);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.a aVar = this.f109104I;
        if (aVar != null) {
            aVar.a();
        }
        FB0.d dVar = this.f109101F;
        if (dVar != null) {
            dVar.f6036a = null;
            this.f109101F = null;
        }
        Uz0.g.c("BiliCapturePreviewActivity");
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        EB0.a aVar;
        com.bilibili.studio.editor.timeline.i iVar;
        super.onPause();
        FB0.d dVar = this.f109101F;
        if (dVar == null || (aVar = dVar.f6039d) == null || (iVar = aVar.f3908a) == null) {
            return;
        }
        iVar.n();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onRequestPermissionsResult(int i7, @NonNull @NotNull String[] strArr, @NonNull @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 == 1) {
            if (PermissionsChecker.checkSelfPermissions(this, strArr)) {
                Q6(this.f109103H);
            } else {
                S6(this.f109103H);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        com.bilibili.studio.editor.timeline.i iVar;
        r rVar;
        super.onResume();
        FB0.d dVar = this.f109101F;
        if (dVar != null) {
            EB0.a aVar = dVar.f6039d;
            if (aVar != null && (iVar = aVar.f3908a) != null && (rVar = iVar.f108304f) != null) {
                rVar.i(dVar);
            }
            FB0.d dVar2 = this.f109101F;
            if (dVar2 != null) {
                dVar2.e();
            }
        }
    }

    @Override // QB0.i.a
    public final void w4(int i7) {
        boolean zD;
        FB0.d dVar = this.f109101F;
        if (dVar != null) {
            BiliCapturePreviewActivity biliCapturePreviewActivity = dVar.f6036a;
            if ((biliCapturePreviewActivity != null ? biliCapturePreviewActivity.getApplication() : null) != null) {
                BiliCapturePreviewActivity biliCapturePreviewActivity2 = dVar.f6036a;
                Application application = null;
                if (biliCapturePreviewActivity2 != null) {
                    application = biliCapturePreviewActivity2.getApplication();
                }
                com.bilibili.studio.videoeditor.help.compiler.sdk.i iVar = h.b(application).f1534a;
                if (iVar != null) {
                    iVar.f109706m.remove(dVar);
                }
                h hVarB = h.b(application);
                synchronized (hVarB) {
                    com.bilibili.studio.videoeditor.help.compiler.sdk.i iVar2 = hVarB.f1534a;
                    zD = iVar2 != null ? iVar2.d() : false;
                }
                if (zD) {
                    h.b(application).a();
                }
            }
            this.f109101F.e();
        }
    }
}
