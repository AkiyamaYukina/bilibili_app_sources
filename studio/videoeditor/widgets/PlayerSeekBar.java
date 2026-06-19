package com.bilibili.studio.videoeditor.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatSeekBar;
import bolts.Continuation;
import bolts.Task;
import com.airbnb.lottie.LottieComposition;
import com.bilibili.base.BiliContext;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/PlayerSeekBar.class */
public class PlayerSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f110414d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f110415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f110416c;

    public PlayerSeekBar(Context context) {
        super(context);
        o();
    }

    public PlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    public static String[] getJsonPath() {
        String path;
        String[] strArr = null;
        try {
            File externalFilesDir = BiliContext.application().getExternalFilesDir("player");
            if (externalFilesDir == null) {
                path = null;
            } else {
                if (!externalFilesDir.exists()) {
                    externalFilesDir.mkdirs();
                }
                path = externalFilesDir.getPath();
            }
        } catch (Exception e7) {
        }
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(path);
        StringBuilder sb2 = new StringBuilder(path);
        if (path.endsWith("/")) {
            sb.append("player_seek_bar_1.json");
            sb2.append("player_seek_bar_2.json");
        } else {
            String str = File.separator;
            sb.append(str);
            sb.append("player_seek_bar_1.json");
            sb2.append(str);
            sb2.append("player_seek_bar_2.json");
        }
        strArr = new String[]{sb.toString(), sb2.toString()};
        return strArr;
    }

    public final void g() {
        m mVar = this.f110415b;
        if (mVar != null) {
            mVar.f110457C = false;
            LottieComposition lottieComposition = mVar.f110458v;
            if (lottieComposition != null) {
                mVar.setComposition(lottieComposition);
                mVar.setProgress(0.5f);
                mVar.setBounds(mVar.f110460x, 0, 0, 0);
            }
        }
    }

    @Override // android.widget.ProgressBar
    public final boolean isAnimating() {
        m mVar = this.f110415b;
        return mVar != null && mVar.isAnimating();
    }

    public final void k() {
        int progress;
        if (getProgressDrawable() != null) {
            progress = (int) ((getProgress() / getMax()) * r0.getBounds().right);
        } else {
            progress = -1;
        }
        m mVar = this.f110415b;
        if (mVar != null) {
            mVar.f110457C = true;
            LottieComposition lottieComposition = mVar.f110459w;
            if (lottieComposition != null) {
                mVar.setComposition(lottieComposition);
                int i7 = progress;
                if (progress == -1) {
                    i7 = mVar.f110460x;
                }
                mVar.setBounds(i7, 0, 0, 0);
                mVar.playAnimation();
            }
        }
    }

    public final void o() {
        String[] jsonPath = getJsonPath();
        if (jsonPath != null) {
            final File file = new File(jsonPath[0]);
            final File file2 = new File(jsonPath[1]);
            if (file.exists() && file2.exists()) {
                Task.callInBackground(new Callable(file, file2) { // from class: com.bilibili.studio.videoeditor.widgets.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final File f110449a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final File f110450b;

                    {
                        this.f110449a = file;
                        this.f110450b = file2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File file3 = this.f110449a;
                        File file4 = this.f110450b;
                        int i7 = PlayerSeekBar.f110414d;
                        return new Pair(LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file3)), LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file4)));
                    }
                }).continueWith(new Continuation(this) { // from class: com.bilibili.studio.videoeditor.widgets.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayerSeekBar f110451a;

                    {
                        this.f110451a = this;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task) {
                        int i7 = PlayerSeekBar.f110414d;
                        PlayerSeekBar playerSeekBar = this.f110451a;
                        playerSeekBar.getClass();
                        if (!task.isCompleted()) {
                            playerSeekBar.f110416c = true;
                            LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new l(playerSeekBar));
                            return null;
                        }
                        Pair pair = (Pair) task.getResult();
                        if (pair == null || pair.first == null || pair.second == null) {
                            return null;
                        }
                        m mVar = new m((LottieComposition) pair.first, (LottieComposition) pair.second);
                        playerSeekBar.f110415b = mVar;
                        playerSeekBar.setThumb(mVar);
                        return null;
                    }
                }, Task.UI_THREAD_EXECUTOR);
                this.f110416c = false;
                return;
            }
        }
        if (this.f110416c) {
            return;
        }
        this.f110416c = true;
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new l(this));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        m mVar;
        if (isAnimating() && (mVar = this.f110415b) != null) {
            mVar.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }
}
