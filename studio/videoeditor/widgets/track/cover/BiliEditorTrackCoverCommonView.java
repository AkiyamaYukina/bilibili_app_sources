package com.bilibili.studio.videoeditor.widgets.track.cover;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.widgets.track.cover.a;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pD0.AbstractC8290b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/cover/BiliEditorTrackCoverCommonView.class */
public class BiliEditorTrackCoverCommonView extends AbstractC8290b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f110500w = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f110501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final RectF f110502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final RectF f110503v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/cover/BiliEditorTrackCoverCommonView$a.class */
    public interface a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/cover/BiliEditorTrackCoverCommonView$b.class */
    public static final class b implements a.InterfaceC1212a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorTrackCoverCommonView f110504a;

        public b(BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView) {
            this.f110504a = biliEditorTrackCoverCommonView;
        }

        @Override // com.bilibili.studio.videoeditor.widgets.track.cover.a.InterfaceC1212a
        public final void onDraw() {
            int i7 = BiliEditorTrackCoverCommonView.f110500w;
            this.f110504a.getClass();
        }
    }

    @JvmOverloads
    public BiliEditorTrackCoverCommonView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliEditorTrackCoverCommonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BiliEditorTrackCoverCommonView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        float fDp2px = DensityUtil.dp2px(context, 2.0f);
        this.f110501t = fDp2px;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        DensityUtil.dp2px(context, 3.0f);
        this.f110502u = new RectF();
        this.f110503v = new RectF();
        b bVar = new b(this);
        paint.setStrokeWidth(fDp2px);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(0);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint3.setColor(0);
        paint3.setStyle(style);
        textPaint.setStrokeWidth(fDp2px);
        textPaint.setColor(-1);
        textPaint.setTextSize(DensityUtil.dp2px(context, 10.0f));
        getMCoverDrawView().setOnDrawListener(bVar);
    }

    @Override // pD0.AbstractC8290b
    public final void a() {
        ArrayList<qD0.a> mediaTrackClipList;
        if (getVideoMode() == 2 && (mediaTrackClipList = getMediaTrackClipList()) != null) {
            for (qD0.a aVar : mediaTrackClipList) {
                int i7 = aVar.j;
                int i8 = aVar.k;
                int windowMiddlePos = getWindowMiddlePos();
                if (i7 <= windowMiddlePos && windowMiddlePos <= i8) {
                    setClipSelect(aVar);
                }
            }
        }
        getMCoverDrawView().invalidate();
    }

    public final int getClipSelectIndex() {
        ArrayList<qD0.a> mediaTrackClipList = getMediaTrackClipList();
        return mediaTrackClipList != null ? CollectionsKt.indexOf(mediaTrackClipList, getClipSelect()) : -1;
    }

    @Nullable
    public final a getClipSelectListener() {
        return null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        float f7 = 2;
        this.f110502u.set(getLeft() - this.f110501t, (this.f110501t / f7) + getMMediaTrackView().getTop(), getRight(), getMMediaTrackView().getBottom() - (this.f110501t / f7));
        this.f110503v.set(this.f110502u);
        this.f110503v.left = getIvIndicator().getX();
        this.f110503v.right = getIvIndicator().getX() + getIvIndicator().getWidth();
    }

    public final void setClipSelectListener(@Nullable a aVar) {
    }

    @Override // pD0.AbstractC8290b
    public void setPlayingTime(long j7) {
        super.setPlayingTime(j7);
        if (getVideoMode() == 1) {
            setClipSelect(null);
            ArrayList<qD0.a> mediaTrackClipList = getMediaTrackClipList();
            if (mediaTrackClipList != null) {
                for (qD0.a aVar : mediaTrackClipList) {
                    long j8 = aVar.f;
                    if (j7 <= aVar.g && j8 <= j7) {
                        setClipSelect(aVar);
                    }
                }
            }
        }
    }
}
