package com.bilibili.mediastreaming.audio.track;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.video.story.guide.StoryBottomScrollGuide;
import com.mall.common.extension.MallKtExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/P.class */
public final /* synthetic */ class P implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65856b;

    public /* synthetic */ P(Object obj, int i7) {
        this.f65855a = i7;
        this.f65856b = obj;
    }

    public final Object invoke() {
        switch (this.f65855a) {
            case 0:
                return BiliAudioTrack.q((BiliAudioTrack) this.f65856b);
            case 1:
                StoryBottomScrollGuide storyBottomScrollGuide = (StoryBottomScrollGuide) this.f65856b;
                TextView textView = new TextView(storyBottomScrollGuide.a);
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.Text_white));
                textView.setTextSize(15.0f);
                textView.setCompoundDrawablePadding(4);
                textView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(textView.getContext(), 2131243544), (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setId(View.generateViewId());
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setMaxWidth(NewPlayerUtilsKt.toPx(700));
                textView.setBackground(new ColorDrawable(1929379840));
                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, 0, 81));
                textView.post(new com.bilibili.video.story.guide.d(storyBottomScrollGuide, textView));
                return textView;
            default:
                LinearLayout linearLayout = ((fS0.A) this.f65856b).g;
                if (linearLayout != null) {
                    MallKtExtensionKt.gone(linearLayout);
                }
                return Unit.INSTANCE;
        }
    }
}
