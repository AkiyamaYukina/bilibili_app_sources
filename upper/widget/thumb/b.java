package com.bilibili.upper.widget.thumb;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bilibili.upper.widget.thumb.ThumbFragment;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/b.class */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f114647i = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThumbFragment.e f114648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f114649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f114650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaMetadataRetriever f114651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f114653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f114654g;
    public volatile boolean h = false;

    public b(Context context) {
        this.f114650c = context;
        if (this.f114649b == null) {
            int i7 = f114647i;
            this.f114649b = new ThreadPoolExecutor(i7, i7 * 2, 1L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque());
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

    public static File c(Context context, String str, float f7) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(context.getExternalCacheDir(), new File(str).getName());
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, android.support.v4.media.session.a.a(new StringBuilder("thumb_"), (long) (f7 * 1000000.0f), ".png"));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public static int d(long j7) {
        int iE = e(j7);
        int i7 = (((int) j7) / 1000) / iE;
        return j7 - ((long) ((iE * i7) * 1000)) == 0 ? i7 : i7 + 1;
    }

    public static int e(long j7) {
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
        int iD = d(this.f114653f);
        for (int i7 = 0; i7 < iD && !this.h; i7++) {
            if (!TextUtils.isEmpty(str) && i7 >= 0) {
                if (b(this.f114650c, str, this.f114652e * i7) == null) {
                    ExecutorService executorService = this.f114649b;
                    if (executorService != null && !((ThreadPoolExecutor) executorService).isShutdown()) {
                        final int i8 = i7;
                        ((ThreadPoolExecutor) this.f114649b).execute(new Runnable(this, str, i8) { // from class: lJ0.g

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final com.bilibili.upper.widget.thumb.b f123078a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f123079b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f123080c;

                            {
                                this.f123078a = this;
                                this.f123079b = str;
                                this.f123080c = i8;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Bitmap bitmapCreateScaledBitmap;
                                com.bilibili.upper.widget.thumb.b bVar = this.f123078a;
                                String str2 = this.f123079b;
                                int i9 = this.f123080c;
                                MediaMetadataRetriever mediaMetadataRetriever = bVar.f114651d;
                                float f7 = bVar.f114652e * i9;
                                if (mediaMetadataRetriever != null && !TextUtils.isEmpty(str2)) {
                                    if (Build.VERSION.SDK_INT >= 27) {
                                        int i10 = (int) (bVar.f114654g * 300.0f);
                                        if (i10 == 0) {
                                            i10 = 300;
                                        }
                                        bitmapCreateScaledBitmap = mediaMetadataRetriever.getScaledFrameAtTime((long) (f7 * 1000000.0f), 2, 300, i10);
                                    } else {
                                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((long) (f7 * 1000000.0f));
                                        bitmapCreateScaledBitmap = frameAtTime;
                                        if (frameAtTime != null) {
                                            bitmapCreateScaledBitmap = frameAtTime;
                                            if (frameAtTime.getWidth() > 300) {
                                                int i11 = (int) (bVar.f114654g * 300.0f);
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
                                        if (com.bilibili.upper.widget.thumb.b.b(bVar.f114650c, str2, f7) == null) {
                                            File file = new File(bVar.f114650c.getExternalCacheDir(), new File(str2).getName());
                                            if (!file.exists()) {
                                                file.mkdir();
                                            }
                                            C7824c.b(bitmapCreateScaledBitmap, new File(file, android.support.v4.media.session.a.a(new StringBuilder(), (long) (f7 * 1000000.0f), ".png")).getAbsolutePath());
                                        }
                                        bitmapCreateScaledBitmap.recycle();
                                    }
                                }
                                Message message = new Message();
                                message.what = 1;
                                message.arg1 = i9;
                                File fileB = com.bilibili.upper.widget.thumb.b.b(bVar.f114650c, str2, bVar.f114652e * i9);
                                if (fileB != null) {
                                    message.obj = fileB.getAbsolutePath();
                                    bVar.f114648a.sendMessage(message);
                                }
                            }
                        });
                    }
                } else {
                    Message message = new Message();
                    message.what = 1;
                    message.arg1 = i7;
                    File fileB = b(this.f114650c, str, this.f114652e * i7);
                    if (fileB != null) {
                        message.obj = fileB.getAbsolutePath();
                        this.f114648a.sendMessage(message);
                    }
                }
            }
        }
    }
}
