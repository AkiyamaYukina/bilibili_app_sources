package com.bilibili.upper.widget.thumb;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Message;
import android.text.TextUtils;
import com.bilibili.upper.widget.thumb.HScrollView;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import lJ0.C7824c;
import lJ0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/a.class */
public final class a implements HScrollView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThumbFragment f114646a;

    public a(ThumbFragment thumbFragment) {
        this.f114646a = thumbFragment;
    }

    @Override // com.bilibili.upper.widget.thumb.HScrollView.b
    public final void a() {
        ThumbFragment thumbFragment = this.f114646a;
        int scrollX = thumbFragment.h.getScrollX();
        thumbFragment.f114633s = scrollX;
        if (scrollX >= 0) {
            int height = 0;
            if (thumbFragment.f114622g.getHeight() == 0) {
                thumbFragment.f114636v = 0;
            } else {
                if (thumbFragment.f114633s / thumbFragment.f114622g.getHeight() > 0) {
                    height = thumbFragment.f114633s / thumbFragment.f114622g.getHeight();
                }
                thumbFragment.f114636v = height;
            }
        }
        ThumbFragment.jf(thumbFragment);
        File fileB = b.b(thumbFragment.getContext(), thumbFragment.f114617b, thumbFragment.f114636v * thumbFragment.f114634t);
        if (fileB != null) {
            Bitmap bitmapA = C7824c.a(thumbFragment.f114620e.getWidth(), thumbFragment.f114620e.getHeight(), fileB.getAbsolutePath());
            if (bitmapA != null) {
                thumbFragment.f114620e.setImageBitmap(bitmapA);
            }
        }
    }

    @Override // com.bilibili.upper.widget.thumb.HScrollView.b
    public final void onStop() {
        ThumbFragment thumbFragment = this.f114646a;
        if (thumbFragment.getContext() != null) {
            Context context = thumbFragment.getContext();
            String str = thumbFragment.f114617b;
            boolean z6 = false;
            if (context != null) {
                z6 = context.getSharedPreferences("Thumb", 0).getBoolean("error_" + str, false);
            }
            if (z6) {
                return;
            }
            d.b(thumbFragment.f114633s, thumbFragment.f114617b, thumbFragment.getContext());
            final b bVar = thumbFragment.f114624j;
            final String str2 = thumbFragment.f114617b;
            final int i7 = thumbFragment.f114636v;
            bVar.getClass();
            if (!TextUtils.isEmpty(str2) && i7 >= 0) {
                File fileC = b.c(bVar.f114650c, str2, bVar.f114652e * i7);
                if (fileC != null) {
                    Message message = new Message();
                    message.what = 2;
                    message.obj = fileC.getAbsolutePath();
                    bVar.f114648a.sendMessage(message);
                    return;
                }
                ExecutorService executorService = bVar.f114649b;
                if (executorService == null || ((ThreadPoolExecutor) executorService).isShutdown()) {
                    return;
                }
                ((ThreadPoolExecutor) bVar.f114649b).execute(new Runnable(bVar, str2, i7) { // from class: lJ0.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.upper.widget.thumb.b f123081a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f123082b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final int f123083c;

                    {
                        this.f123081a = bVar;
                        this.f123082b = str2;
                        this.f123083c = i7;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        long j7;
                        Bitmap frameAtTime;
                        com.bilibili.upper.widget.thumb.b bVar2 = this.f123081a;
                        String str3 = this.f123082b;
                        int i8 = this.f123083c;
                        MediaMetadataRetriever mediaMetadataRetriever = bVar2.f114651d;
                        float f7 = bVar2.f114652e * i8;
                        String absolutePath = null;
                        if (!TextUtils.isEmpty(str3) && (frameAtTime = mediaMetadataRetriever.getFrameAtTime((j7 = (long) (1000000.0f * f7)))) != null && com.bilibili.upper.widget.thumb.b.c(bVar2.f114650c, str3, f7) == null) {
                            File file = new File(bVar2.f114650c.getExternalCacheDir(), new File(str3).getName());
                            if (!file.exists()) {
                                file.mkdir();
                            }
                            File file2 = new File(file, androidx.compose.ui.input.pointer.k.a(j7, "thumb_", ".png"));
                            C7824c.b(frameAtTime, file2.getAbsolutePath());
                            frameAtTime.recycle();
                            absolutePath = file2.getAbsolutePath();
                        }
                        Message message2 = new Message();
                        message2.what = 2;
                        message2.obj = absolutePath;
                        bVar2.f114648a.sendMessage(message2);
                    }
                });
            }
        }
    }
}
