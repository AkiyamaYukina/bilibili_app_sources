package com.bilibili.upper.module.cover_v2.widgets.seekbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bilibili.droid.ToastHelper;
import com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lJ0.C7824c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/c.class */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f113078j = 0;

    public c(Context context) {
        super(context);
    }

    @Override // com.bilibili.upper.module.cover_v2.widgets.seekbar.b
    public final void a(final String str) {
        BLog.i("ThumbGeneratorOPPO", "OPPO ThumbGenerator!!!! genAllThumbs");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iC = b.c(this.f113076f);
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            File file = new File(str);
            if (file.exists()) {
                mediaMetadataRetriever.setDataSource(this.f113073c, Uri.fromFile(file));
            } else {
                mediaMetadataRetriever.setDataSource(this.f113073c, Uri.parse(str));
            }
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            for (int i7 = 0; i7 < iC && !this.h; i7++) {
                if (!TextUtils.isEmpty(str) && i7 >= 0) {
                    if (b.b(this.f113073c, str, this.f113075e * i7) != null) {
                        Message message = new Message();
                        message.what = MultiCoverSeekBar.getHANDLER_UI_REFRESH();
                        message.arg1 = i7;
                        message.obj = b.b(this.f113073c, str, this.f113075e * i7).getAbsolutePath();
                        this.f113071a.sendMessage(message);
                    } else if (executorServiceNewSingleThreadExecutor != null && !executorServiceNewSingleThreadExecutor.isShutdown()) {
                        final int i8 = i7;
                        executorServiceNewSingleThreadExecutor.execute(new Runnable(this, mediaMetadataRetriever, str, i8) { // from class: UH0.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final com.bilibili.upper.module.cover_v2.widgets.seekbar.c f24685a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final MediaMetadataRetriever f24686b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final String f24687c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final int f24688d;

                            {
                                this.f24685a = this;
                                this.f24686b = mediaMetadataRetriever;
                                this.f24687c = str;
                                this.f24688d = i8;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Bitmap bitmapCreateScaledBitmap;
                                com.bilibili.upper.module.cover_v2.widgets.seekbar.c cVar = this.f24685a;
                                MediaMetadataRetriever mediaMetadataRetriever2 = this.f24686b;
                                String str2 = this.f24687c;
                                int i9 = this.f24688d;
                                int i10 = com.bilibili.upper.module.cover_v2.widgets.seekbar.c.f113078j;
                                float f7 = cVar.f113075e * i9;
                                if (!TextUtils.isEmpty(str2)) {
                                    if (Build.VERSION.SDK_INT >= 27) {
                                        int i11 = (int) (cVar.f113077g * 300.0f);
                                        if (i11 == 0) {
                                            i11 = 300;
                                        }
                                        bitmapCreateScaledBitmap = mediaMetadataRetriever2.getScaledFrameAtTime((long) (f7 * 1000000.0f), 3, 300, i11);
                                    } else {
                                        Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime((long) (f7 * 1000000.0f));
                                        bitmapCreateScaledBitmap = frameAtTime;
                                        if (frameAtTime != null) {
                                            bitmapCreateScaledBitmap = frameAtTime;
                                            if (frameAtTime.getWidth() > 300) {
                                                int i12 = (int) (cVar.f113077g * 300.0f);
                                                int i13 = i12;
                                                if (i12 == 0) {
                                                    i13 = 300;
                                                }
                                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, 300, i13, true);
                                                frameAtTime.recycle();
                                            }
                                        }
                                    }
                                    if (bitmapCreateScaledBitmap != null) {
                                        if (com.bilibili.upper.module.cover_v2.widgets.seekbar.b.b(cVar.f113073c, str2, f7) == null) {
                                            File file2 = new File(cVar.f113073c.getExternalCacheDir(), new File(str2).getName());
                                            if (!file2.exists()) {
                                                file2.mkdir();
                                            }
                                            C7824c.b(bitmapCreateScaledBitmap, new File(file2, android.support.v4.media.session.a.a(new StringBuilder(), (long) (f7 * 1000000.0f), ".png")).getAbsolutePath());
                                        }
                                        bitmapCreateScaledBitmap.recycle();
                                    }
                                }
                                Message message2 = new Message();
                                message2.what = MultiCoverSeekBar.getHANDLER_UI_REFRESH();
                                message2.arg1 = i9;
                                File fileB = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.b(cVar.f113073c, str2, cVar.f113075e * i9);
                                if (fileB != null) {
                                    message2.obj = fileB.getAbsolutePath();
                                    cVar.f113071a.sendMessage(message2);
                                }
                            }
                        });
                    }
                }
            }
        } catch (Exception e7) {
            ToastHelper.showToastShort(this.f113073c, "该视频格式异常");
        }
    }
}
