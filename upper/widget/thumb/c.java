package com.bilibili.upper.widget.thumb;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bilibili.droid.ToastHelper;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/c.class */
public final class c extends b {
    @Override // com.bilibili.upper.widget.thumb.b
    public final void a(final String str) {
        BLog.i("ThumbGeneratorOPPO", "OPPO ThumbGenerator!!!! genAllThumbs");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iD = b.d(this.f114653f);
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.f114650c, Uri.parse(str));
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            for (int i7 = 0; i7 < iD && !this.h; i7++) {
                if (!TextUtils.isEmpty(str) && i7 >= 0) {
                    if (b.b(this.f114650c, str, this.f114652e * i7) != null) {
                        Message message = new Message();
                        message.what = 1;
                        message.arg1 = i7;
                        message.obj = b.b(this.f114650c, str, this.f114652e * i7).getAbsolutePath();
                        this.f114648a.sendMessage(message);
                    } else if (executorServiceNewSingleThreadExecutor != null && !executorServiceNewSingleThreadExecutor.isShutdown()) {
                        final int i8 = i7;
                        executorServiceNewSingleThreadExecutor.execute(new Runnable(this, mediaMetadataRetriever, str, i8) { // from class: lJ0.j

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final com.bilibili.upper.widget.thumb.c f123085a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final MediaMetadataRetriever f123086b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final String f123087c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final int f123088d;

                            {
                                this.f123085a = this;
                                this.f123086b = mediaMetadataRetriever;
                                this.f123087c = str;
                                this.f123088d = i8;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Bitmap bitmapCreateScaledBitmap;
                                com.bilibili.upper.widget.thumb.c cVar = this.f123085a;
                                MediaMetadataRetriever mediaMetadataRetriever2 = this.f123086b;
                                String str2 = this.f123087c;
                                int i9 = this.f123088d;
                                float f7 = cVar.f114652e * i9;
                                if (mediaMetadataRetriever2 != null && !TextUtils.isEmpty(str2)) {
                                    if (Build.VERSION.SDK_INT >= 27) {
                                        int i10 = (int) (cVar.f114654g * 300.0f);
                                        if (i10 == 0) {
                                            i10 = 300;
                                        }
                                        bitmapCreateScaledBitmap = mediaMetadataRetriever2.getScaledFrameAtTime((long) (f7 * 1000000.0f), 3, 300, i10);
                                    } else {
                                        Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime((long) (f7 * 1000000.0f));
                                        bitmapCreateScaledBitmap = frameAtTime;
                                        if (frameAtTime != null) {
                                            bitmapCreateScaledBitmap = frameAtTime;
                                            if (frameAtTime.getWidth() > 300) {
                                                int i11 = (int) (cVar.f114654g * 300.0f);
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
                                        if (com.bilibili.upper.widget.thumb.b.b(cVar.f114650c, str2, f7) == null) {
                                            File file = new File(cVar.f114650c.getExternalCacheDir(), new File(str2).getName());
                                            if (!file.exists()) {
                                                file.mkdir();
                                            }
                                            C7824c.b(bitmapCreateScaledBitmap, new File(file, android.support.v4.media.session.a.a(new StringBuilder(), (long) (f7 * 1000000.0f), ".png")).getAbsolutePath());
                                        }
                                        bitmapCreateScaledBitmap.recycle();
                                    }
                                }
                                Message message2 = new Message();
                                message2.what = 1;
                                message2.arg1 = i9;
                                File fileB = com.bilibili.upper.widget.thumb.b.b(cVar.f114650c, str2, cVar.f114652e * i9);
                                if (fileB != null) {
                                    message2.obj = fileB.getAbsolutePath();
                                    cVar.f114648a.sendMessage(message2);
                                }
                            }
                        });
                    }
                }
            }
        } catch (Exception e7) {
            ToastHelper.showToastShort(this.f114650c, "该视频格式异常");
        }
    }
}
