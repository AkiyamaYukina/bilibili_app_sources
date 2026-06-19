package com.bilibili.search2.eastereggs;

import HG0.ViewOnClickListenerC2111u0;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.dblconfig.D;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.utils.B;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/VideoEggDialog.class */
@StabilityInferred(parameters = 0)
public final class VideoEggDialog extends EggDialogFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EasterEggVideoView f86504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ImageView f86505f;

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment
    public final int hf() {
        return 2131494759;
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment
    public final void initViews(@NotNull View view) {
        this.f86504e = (EasterEggVideoView) view.findViewById(2131315950);
        ImageView imageView = (ImageView) view.findViewById(2131298371);
        this.f86505f = imageView;
        ConstraintLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = B.C(12.0f) + StatusBarCompat.getStatusBarHeight(getContext());
        }
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment
    public final void jf(@NotNull final SearchResultAll.EasterEgg easterEgg) {
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        File fileA = SearchLocalDataManager.j(easterEgg.getResUrl(getContext()), easterEgg.getSourceMd5()).a();
        if (fileA == null || !fileA.exists()) {
            dismissAllowingStateLoss();
            k.a("egg res file not found", easterEgg.getResUrl(getContext()));
            return;
        }
        k.a("egg res file found", easterEgg.getResUrl(getContext()));
        EasterEggVideoView easterEggVideoView = this.f86504e;
        if (easterEggVideoView != null) {
            easterEggVideoView.setVideoPath(fileA.getPath());
        }
        EasterEggVideoView easterEggVideoView2 = this.f86504e;
        if (easterEggVideoView2 != null) {
            easterEggVideoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener(easterEgg, this) { // from class: com.bilibili.search2.eastereggs.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAll.EasterEgg f86538a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final VideoEggDialog f86539b;

                {
                    this.f86538a = easterEgg;
                    this.f86539b = this;
                }

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    k.a("video egg show success", this.f86538a.getResUrl(this.f86539b.getContext()));
                }
            });
        }
        EasterEggVideoView easterEggVideoView3 = this.f86504e;
        if (easterEggVideoView3 != null) {
            easterEggVideoView3.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this) { // from class: com.bilibili.search2.eastereggs.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoEggDialog f86540a;

                {
                    this.f86540a = this;
                }

                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    this.f86540a.dismissAllowingStateLoss();
                }
            });
        }
        EasterEggVideoView easterEggVideoView4 = this.f86504e;
        if (easterEggVideoView4 != null) {
            easterEggVideoView4.setOnErrorListener(new MediaPlayer.OnErrorListener(easterEgg, this) { // from class: com.bilibili.search2.eastereggs.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAll.EasterEgg f86541a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final VideoEggDialog f86542b;

                {
                    this.f86541a = easterEgg;
                    this.f86542b = this;
                }

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
                    SearchResultAll.EasterEgg easterEgg2 = this.f86541a;
                    VideoEggDialog videoEggDialog = this.f86542b;
                    k.a("video egg show failed", easterEgg2.getResUrl(videoEggDialog.getContext()));
                    videoEggDialog.dismissAllowingStateLoss();
                    return true;
                }
            });
        }
        EasterEggVideoView easterEggVideoView5 = this.f86504e;
        if (easterEggVideoView5 != null) {
            easterEggVideoView5.start();
        }
        EasterEggVideoView easterEggVideoView6 = this.f86504e;
        if (easterEggVideoView6 != null) {
            easterEggVideoView6.setOnClickListener(new D(1, easterEgg, this));
        }
        ImageView imageView = this.f86505f;
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC2111u0(this, 1));
        }
    }
}
