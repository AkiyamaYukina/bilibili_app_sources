package com.bilibili.upper.module.cover_v2.widgets.seekbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lJ0.C7824c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/b.class */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f113070i = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MultiCoverSeekBar.d f113071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f113072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f113073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaMetadataRetriever f113074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f113076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f113077g;
    public volatile boolean h = false;

    public b(Context context) {
        if (!EntryPointKt.getMemleakOptEnable() || context == null || context.getApplicationContext() == null) {
            this.f113073c = context;
        } else {
            this.f113073c = context.getApplicationContext();
        }
        if (this.f113072b == null) {
            int i7 = f113070i;
            this.f113072b = new ThreadPoolExecutor(i7, i7 * 2, 1L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque());
        }
    }

    public static File b(Context context, String str, float f7) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(context.getExternalCacheDir(), new File(str).getName());
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, android.support.v4.media.session.a.a(new StringBuilder(), (long) (f7 * 1000000.0f), ".png"));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public static int c(long j7) {
        int iD = d(j7);
        int i7 = (((int) j7) / 1000) / iD;
        return j7 - ((long) ((iD * i7) * 1000)) == 0 ? i7 : i7 + 1;
    }

    public static int d(long j7) {
        long j8 = j7 / 1000;
        if (j8 < 30) {
            return 1;
        }
        if (j8 >= 30 && j8 <= 60) {
            return 2;
        }
        if (j8 > 60 && j8 <= 300) {
            return 3;
        }
        if (j8 <= 300 || j8 > 600) {
            return j8 % 150 == 0 ? ((int) j8) / 150 : (((int) j8) / 150) + 1;
        }
        return 4;
    }

    public void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iC = c(this.f113076f);
        for (int i7 = 0; i7 < iC && !this.h; i7++) {
            if (!TextUtils.isEmpty(str) && i7 >= 0) {
                if (b(this.f113073c, str, this.f113075e * i7) == null) {
                    ExecutorService executorService = this.f113072b;
                    if (executorService != null && !((ThreadPoolExecutor) executorService).isShutdown()) {
                        final int i8 = i7;
                        ((ThreadPoolExecutor) this.f113072b).execute(new Runnable(this, str, i8) { // from class: UH0.d

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final com.bilibili.upper.module.cover_v2.widgets.seekbar.b f24681a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f24682b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f24683c;

                            {
                                this.f24681a = this;
                                this.f24682b = str;
                                this.f24683c = i8;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Bitmap bitmapCreateScaledBitmap;
                                com.bilibili.upper.module.cover_v2.widgets.seekbar.b bVar = this.f24681a;
                                String str2 = this.f24682b;
                                int i9 = this.f24683c;
                                MediaMetadataRetriever mediaMetadataRetriever = bVar.f113074d;
                                float f7 = bVar.f113075e * i9;
                                if (mediaMetadataRetriever != null && !TextUtils.isEmpty(str2)) {
                                    if (Build.VERSION.SDK_INT >= 27) {
                                        int i10 = (int) (bVar.f113077g * 300.0f);
                                        if (i10 == 0) {
                                            i10 = 300;
                                        }
                                        bitmapCreateScaledBitmap = mediaMetadataRetriever.getScaledFrameAtTime((long) (f7 * 1000000.0f), 3, 300, i10);
                                    } else {
                                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((long) (f7 * 1000000.0f), 3);
                                        bitmapCreateScaledBitmap = frameAtTime;
                                        if (frameAtTime != null) {
                                            bitmapCreateScaledBitmap = frameAtTime;
                                            if (frameAtTime.getWidth() > 300) {
                                                int i11 = (int) (bVar.f113077g * 300.0f);
                                                int i12 = i11;
                                                if (i11 == 0) {
                                                    i12 = 300;
                                                }
                                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, 300, i12, true);
                                                frameAtTime.recycle();
                                            }
                                        }
                                    }
                                    if (bitmapCreateScaledBitmap != null) {
                                        if (com.bilibili.upper.module.cover_v2.widgets.seekbar.b.b(bVar.f113073c, str2, f7) == null) {
                                            File file = new File(bVar.f113073c.getExternalCacheDir(), new File(str2).getName());
                                            if (!file.exists()) {
                                                file.mkdir();
                                            }
                                            C7824c.b(bitmapCreateScaledBitmap, new File(file, android.support.v4.media.session.a.a(new StringBuilder(), (long) (f7 * 1000000.0f), ".png")).getAbsolutePath());
                                        }
                                        bitmapCreateScaledBitmap.recycle();
                                    }
                                }
                                Message message = new Message();
                                message.what = MultiCoverSeekBar.getHANDLER_UI_REFRESH();
                                message.arg1 = i9;
                                File fileB = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.b(bVar.f113073c, str2, bVar.f113075e * i9);
                                if (fileB != null) {
                                    message.obj = fileB.getAbsolutePath();
                                    bVar.f113071a.sendMessage(message);
                                }
                            }
                        });
                    }
                } else {
                    Message message = new Message();
                    message.what = MultiCoverSeekBar.getHANDLER_UI_REFRESH();
                    message.arg1 = i7;
                    File fileB = b(this.f113073c, str, this.f113075e * i7);
                    if (fileB != null) {
                        message.obj = fileB.getAbsolutePath();
                        this.f113071a.sendMessage(message);
                    }
                }
            }
        }
    }
}
