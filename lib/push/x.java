package com.bilibili.lib.push;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.room.RoomDatabase;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.push.utils.RomUtils;
import com.bilibili.live.streaming.service.PlaybackCaptureService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import kotlin.ExceptionsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/x.class */
public final class x implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64265b;

    @Override // com.bilibili.lib.push.B
    public final int a(@NotNull Context context) {
        String message;
        try {
            Bundle bundleCall = context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "getAppBadgeCount", (String) null, new Bundle());
            if (bundleCall == null) {
                message = "bundle is null";
            } else {
                message = "";
                if (bundleCall.containsKey("app_badge_count")) {
                    int i7 = bundleCall.getInt("app_badge_count");
                    BPushLog.i("OppoRedDotManager", "badgeNum_" + i7);
                    return i7;
                }
            }
        } catch (Exception e7) {
            message = e7.getMessage();
            if (message == null) {
                message = "";
            }
        }
        BPushLog.i("OppoRedDotManager", "getBadgeNum failureInfo_".concat(message));
        return 0;
    }

    @Override // com.bilibili.lib.push.B
    public final void b(int i7, @NotNull Context context) {
        String str;
        int iCoerceAtMost = RangesKt.coerceAtMost(i7, RoomDatabase.MAX_BIND_PARAMETER_CNT);
        boolean z6 = true;
        boolean z7 = iCoerceAtMost == 0;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", iCoerceAtMost);
            Bundle bundleCall = context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            if (!z7) {
                if (bundleCall == null || !bundleCall.containsKey("app_badge_count")) {
                    return;
                }
                BPushLog.i("RedDotHelper", "setBadgeNum content://com.android.badge/badge success number = " + bundleCall.getInt("app_badge_count"));
                return;
            }
            if (bundleCall == null) {
                str = "bundle is null";
            } else if (bundleCall.containsKey("app_badge_count")) {
                final int i8 = bundleCall.getInt("app_badge_count");
                if (this.f64264a) {
                    this.f64264a = false;
                    if (C5334b.c().getPushParams().reportReddotNumber()) {
                        HandlerThreads.postDelayed(3, new Runnable(i8) { // from class: com.bilibili.lib.push.l

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f64253a;

                            {
                                this.f64253a = i8;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i9 = this.f64253a;
                                HashMap mapC = O4.b.c(EditCustomizeSticker.TAG_URI, "content://com.android.badge/badge");
                                mapC.put("badgenumber", String.valueOf(i9));
                                BPushNeurons.INSTANCE.trackT(false, "infra.push.reddot.number", mapC);
                                BPushLog.i("RedDotHelper", "reportOppoRedDotNum content://com.android.badge/badge number = " + i9);
                            }
                        }, 1000L);
                    }
                }
                if (i8 != 0) {
                    z6 = false;
                }
                BPushLog.i("RedDotHelper", "clearBadgeBy content://com.android.badge/badge success");
                if (z6) {
                    c("content://com.android.badge/badge", null, z6);
                    return;
                } else {
                    str = "badgeNum_" + i8;
                }
            } else {
                str = "not containsKey app_badge_count";
            }
            c("content://com.android.badge/badge", str, false);
        } catch (Exception e7) {
            BPushLog.d("RedDotHelper", ExceptionsKt.stackTraceToString(e7));
            BPushLog.i("RedDotHelper", "clearBadgeBy content://com.android.badge/badge failure");
            if (z7) {
                c("content://com.android.badge/badge", e7.getMessage(), false);
            }
        }
    }

    public final void c(@NotNull String str, @Nullable String str2, boolean z6) {
        if ((RomUtils.isOppoRom() || RomUtils.isOnePlusRom() || RomUtils.isRealmeRom()) && this.f64265b) {
            this.f64265b = false;
            boolean zReportReddotClearSuccess = C5334b.c().getPushParams().reportReddotClearSuccess();
            boolean zReportReddotClearFailure = C5334b.c().getPushParams().reportReddotClearFailure();
            if (z6) {
                if (zReportReddotClearSuccess) {
                    BPushNeurons.INSTANCE.trackT(false, "infra.push.reddot.clear", W.a(EditCustomizeSticker.TAG_URI, "content://com.android.badge/badge", PlaybackCaptureService.KEY_RESULT_CODE, "0"));
                }
                BPushLog.i("RedDotHelper", "reportOppoClear content://com.android.badge/badge success");
                return;
            }
            if (zReportReddotClearFailure) {
                HashMap mapC = O4.b.c(EditCustomizeSticker.TAG_URI, "content://com.android.badge/badge");
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                mapC.put("info", str3);
                mapC.put(PlaybackCaptureService.KEY_RESULT_CODE, "1");
                BPushNeurons.INSTANCE.trackT(false, "infra.push.reddot.clear", mapC);
            }
            BPushLog.i("RedDotHelper", "reportOppoClear content://com.android.badge/badge failure");
        }
    }
}
