package com.bilibili.studio.videoeditor.ms.record;

import AC0.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.P0;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/record/VideoObserverRecordView.class */
public class VideoObserverRecordView extends DC0.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<a> f109854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f109855t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/record/VideoObserverRecordView$a.class */
    public static final class a {
    }

    public VideoObserverRecordView(@NonNull Context context) {
        super(context);
        Color.parseColor("#443ca6ff");
        this.f109854s = new ArrayList();
        new Rect();
        this.f109855t = -1;
    }

    public VideoObserverRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Color.parseColor("#443ca6ff");
        this.f109854s = new ArrayList();
        new Rect();
        this.f109855t = -1;
    }

    @Override // DC0.b
    public final void b(Context context) {
        super.b(context);
        int iDp2px = DensityUtil.dp2px(context, 44.0f);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), 2131236065);
        int width = bitmapDecodeResource.getWidth();
        int height = bitmapDecodeResource.getHeight();
        Log.e("VideoObserverRecordView", "pre width: " + width + " height: " + height);
        float f7 = ((float) iDp2px) / ((float) height);
        StringBuilder sbA = Dp.b.a("scaleWidth: ", f7, " scaleHeight: ", f7, " displayHeight: ");
        sbA.append(iDp2px);
        Log.e("VideoObserverRecordView", sbA.toString());
        Matrix matrix = new Matrix();
        matrix.postScale(f7, f7);
        new BitmapDrawable(Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true)).setTileModeX(Shader.TileMode.REPEAT);
    }

    public int getBindCapIndex() {
        return this.f109855t;
    }

    public String getPathByPosition() {
        int i7;
        P0.a(this.f109855t, "VideoObserverRecordView", new StringBuilder("current bind index : "));
        if (V.e(this.f109854s) || (i7 = this.f109855t) < 0 || i7 >= ((ArrayList) this.f109854s).size()) {
            return null;
        }
        ((a) ((ArrayList) this.f109854s).get(this.f109855t)).getClass();
        return null;
    }

    @Override // DC0.b, android.view.View
    public final void onDraw(Canvas canvas) {
        if (((ArrayList) this.f109854s).size() == 0) {
            setShowHandle(false);
            return;
        }
        setShowHandle(true);
        canvas.clipRect(getLeft(), getTop(), getRight(), getBottom());
        if (((ArrayList) this.f109854s).size() <= 0) {
            return;
        }
        ((a) ((ArrayList) this.f109854s).get(0)).getClass();
        throw null;
    }

    @Override // DC0.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        Iterator it = ((ArrayList) this.f109854s).iterator();
        if (it.hasNext()) {
            ((a) it.next()).getClass();
            throw null;
        }
    }

    @Override // DC0.b
    public void setHandleLeftByPosition(int i7) {
        super.setHandleLeftByPosition(i7);
        if (this.f109855t == -1 || this.f109854s.size() == 0) {
            return;
        }
        int size = this.f109854s.size();
        int i8 = this.f109855t;
        if (size <= i8) {
            return;
        }
        this.f109854s.get(i8).getClass();
        throw null;
    }

    @Override // DC0.b
    public void setHandleRightByPosition(int i7) {
        super.setHandleRightByPosition(i7);
        if (this.f109855t == -1 || this.f109854s.size() == 0) {
            return;
        }
        int size = this.f109854s.size();
        int i8 = this.f109855t;
        if (size <= i8) {
            return;
        }
        this.f109854s.get(i8).getClass();
        throw null;
    }

    public void setNowPosition(int i7) {
    }

    public void setOnRVScrollAndHandListener(com.bilibili.studio.videoeditor.ms.record.a aVar) {
    }

    public void setOnSeekListener(f fVar) {
    }
}
