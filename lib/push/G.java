package com.bilibili.lib.push;

import android.content.Context;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.live.streaming.service.PlaybackCaptureService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/G.class */
public final class G implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64215b;

    @Override // com.bilibili.lib.push.B
    public final int a(@NotNull Context context) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce A[Catch: Exception -> 0x01ca, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ca, blocks: (B:71:0x0190, B:73:0x01b8, B:87:0x01f7, B:89:0x0210, B:91:0x0219, B:79:0x01ce, B:82:0x01dc, B:85:0x01ec), top: B:98:0x0190 }] */
    @Override // com.bilibili.lib.push.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r6, @org.jetbrains.annotations.NotNull android.content.Context r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.G.b(int, android.content.Context):void");
    }

    @NotNull
    public final String c() {
        return this.f64215b ? "content://com.vivo.abe.provider.launcher.notification.num" : "";
    }

    public final void d(@NotNull String str, @Nullable String str2, boolean z6) {
        boolean zReportReddotClearSuccess = C5334b.c().getPushParams().reportReddotClearSuccess();
        boolean zReportReddotClearFailure = C5334b.c().getPushParams().reportReddotClearFailure();
        if (z6) {
            if (zReportReddotClearSuccess) {
                BPushNeurons.INSTANCE.trackT(false, "infra.push.reddot.clear", W.a(EditCustomizeSticker.TAG_URI, str, PlaybackCaptureService.KEY_RESULT_CODE, "0"));
            }
            BPushLog.i("VivoRedDotCleaner", "reportVivoClear " + str + " success");
            return;
        }
        if (zReportReddotClearFailure) {
            HashMap mapC = O4.b.c(EditCustomizeSticker.TAG_URI, str);
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            mapC.put("info", str3);
            mapC.put(PlaybackCaptureService.KEY_RESULT_CODE, "1");
            BPushNeurons.INSTANCE.trackT(false, "infra.push.reddot.clear", mapC);
        }
        BPushLog.i("VivoRedDotCleaner", "reportVivoClear " + str + " failure");
    }

    public final void e(@NotNull Context context, @NotNull final String str) {
        if (this.f64214a) {
            this.f64214a = false;
            if (C5334b.c().getPushParams().reportReddotNumber()) {
                HandlerThreads.postDelayed(3, new Runnable(str) { // from class: com.bilibili.lib.push.F

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f64213a;

                    {
                        this.f64213a = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = this.f64213a;
                        HashMap mapC = O4.b.c(EditCustomizeSticker.TAG_URI, str2);
                        mapC.put("badgenumber", String.valueOf(0));
                        BPushNeurons.INSTANCE.trackT(false, "infra.push.reddot.number", mapC);
                        BPushLog.i("VivoRedDotCleaner", "reportVivoRedDotNum " + str2 + " number = 0");
                    }
                }, 1000L);
            }
        }
    }
}
