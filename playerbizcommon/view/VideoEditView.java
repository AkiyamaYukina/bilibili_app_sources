package com.bilibili.playerbizcommon.view;

import IT0.e;
import Zq0.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bilibili.playerbizcommon.view.VideoEditView;
import com.bilibili.playerbizcommon.view.a;
import com.bilibili.playerbizcommon.view.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/VideoEditView.class */
public final class VideoEditView extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f80375l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.view.b f80376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.view.a f80377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Float f80378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f80381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f80382g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<a> f80384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final GestureDetector f80385k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/VideoEditView$a.class */
    public interface a {
        default void a(float f7, float f8) {
        }

        void b(float f7, float f8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/VideoEditView$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f80386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Bitmap f80387b;

        public b(@Nullable Bitmap bitmap, float f7) {
            this.f80386a = f7;
            this.f80387b = bitmap;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f80386a, bVar.f80386a) == 0 && Intrinsics.areEqual(this.f80387b, bVar.f80387b);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.f80386a);
            Bitmap bitmap = this.f80387b;
            return (iHashCode * 31) + (bitmap == null ? 0 : bitmap.hashCode());
        }

        @NotNull
        public final String toString() {
            return "VideoThumbnailItem(position=" + this.f80386a + ", thumbnail=" + this.f80387b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/VideoEditView$c.class */
    public static final class c implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoEditView f80388a;

        public c(VideoEditView videoEditView) {
            this.f80388a = videoEditView;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            this.f80388a.f80376a.f80429e.forceFinished(true);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            VideoEditView videoEditView = this.f80388a;
            videoEditView.f80383i = true;
            com.bilibili.playerbizcommon.view.b bVar = videoEditView.f80376a;
            bVar.f80429e.fling((int) bVar.getTranslationX(), 0, (int) f7, 0, bVar.h, bVar.f80431g, 0, 0);
            bVar.invalidate();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            VideoEditView videoEditView = this.f80388a;
            if (!videoEditView.h) {
                videoEditView.h = true;
                videoEditView.f80377b.setIndicatorVisible(false);
            }
            this.f80388a.f80376a.a(-((int) f7));
            this.f80388a.f80377b.f80411v = true;
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    @JvmOverloads
    public VideoEditView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public VideoEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoEditView(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        com.bilibili.playerbizcommon.view.b bVar = new com.bilibili.playerbizcommon.view.b(context, attributeSet, 0);
        this.f80376a = bVar;
        com.bilibili.playerbizcommon.view.a aVar = new com.bilibili.playerbizcommon.view.a(context, attributeSet, 0);
        this.f80377b = aVar;
        a.InterfaceC0522a interfaceC0522a = new a.InterfaceC0522a(this) { // from class: Zq0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoEditView f29733a;

            {
                this.f29733a = this;
            }

            @Override // com.bilibili.playerbizcommon.view.a.InterfaceC0522a
            public final void a(int i8, boolean z6) {
                int i9 = VideoEditView.f80375l;
                VideoEditView videoEditView = this.f29733a;
                videoEditView.getClass();
                int i10 = i8;
                if (z6) {
                    i10 = -i8;
                }
                videoEditView.f80376a.a(i10);
            }
        };
        a.b bVar2 = new a.b(this) { // from class: Zq0.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoEditView f29734a;

            {
                this.f29734a = this;
            }

            @Override // com.bilibili.playerbizcommon.view.a.b
            public final void a(int i8) {
                VideoEditView videoEditView = this.f29734a;
                videoEditView.f80376a.c(i8);
                videoEditView.d();
            }
        };
        b.c cVar = new b.c(this) { // from class: Zq0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoEditView f29735a;

            {
                this.f29735a = this;
            }

            @Override // com.bilibili.playerbizcommon.view.b.c
            public final void onTranslationChanged() {
                int i8 = VideoEditView.f80375l;
                this.f29735a.d();
            }
        };
        this.f80384j = new ArrayList();
        this.f80385k = new GestureDetector(context, new c(this));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = aVar.getFrameHeight();
        layoutParams.bottomMargin = aVar.getFrameHeight();
        addView(bVar, layoutParams);
        ((ArrayList) bVar.f80432i).add(cVar);
        bVar.setOnSizeChangedListener(new e(this));
        bVar.setOnFlingChangedListener(new l(this));
        addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        ((ArrayList) aVar.f80390B).add(interfaceC0522a);
        ((ArrayList) aVar.f80389A).add(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setInitState$lambda$0(VideoEditView videoEditView) {
        videoEditView.d();
        Iterator it = ((ArrayList) videoEditView.f80384j).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(videoEditView.f80381f, videoEditView.f80382g);
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.h = false;
            this.f80383i = false;
        } else {
            if ((motionEvent == null || motionEvent.getAction() != 3) && (motionEvent == null || motionEvent.getAction() != 1 || this.f80383i)) {
                return;
            }
            c();
            com.bilibili.playerbizcommon.view.a aVar = this.f80377b;
            aVar.f80411v = false;
            aVar.invalidate();
        }
    }

    public final void c() {
        if (this.h) {
            Iterator it = ((ArrayList) this.f80384j).iterator();
            while (it.hasNext()) {
                ((a) it.next()).b(this.f80381f, this.f80382g);
            }
            setProgress(this.f80381f);
            this.f80377b.setIndicatorVisible(true);
            this.h = false;
        }
    }

    public final void d() {
        List<b> itemList = getItemList();
        if (itemList == null || itemList.isEmpty()) {
            return;
        }
        int size = 0;
        float f7 = getItemList().get(0).f80386a;
        if (getWidth() == 0 || this.f80376a.getItemUseWidth() <= 0 || this.f80377b.getWidth() != getWidth()) {
            return;
        }
        int width = this.f80376a.getWidth();
        int itemUseWidth = this.f80376a.getItemUseWidth();
        List<b> itemList2 = getItemList();
        if (itemList2 != null) {
            size = itemList2.size();
        }
        if (width != itemUseWidth * size) {
            return;
        }
        int offsetX = this.f80376a.getOffsetX();
        int currentRange = this.f80377b.getCurrentRange();
        int width2 = getWidth() / 2;
        int i7 = currentRange / 2;
        Float f8 = this.f80378c;
        float fFloatValue = f8 != null ? f8.floatValue() : 5.0f;
        float itemUseWidth2 = ((((width2 - offsetX) - i7) / this.f80376a.getItemUseWidth()) * fFloatValue) + f7;
        float itemUseWidth3 = ((currentRange / this.f80376a.getItemUseWidth()) * fFloatValue) + itemUseWidth2;
        if (this.f80381f == itemUseWidth2 && this.f80382g == itemUseWidth3) {
            return;
        }
        Iterator it = ((ArrayList) this.f80384j).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(itemUseWidth2, itemUseWidth3);
        }
        this.f80381f = itemUseWidth2;
        this.f80382g = itemUseWidth3;
        this.h = true;
    }

    public final void e() {
        if (this.f80379d == 0) {
            return;
        }
        int i7 = this.f80380e;
        Float f7 = this.f80378c;
        if (f7 != null) {
            float fFloatValue = f7.floatValue();
            int itemUseWidth = this.f80376a.getItemUseWidth();
            List<b> itemList = getItemList();
            int size = itemUseWidth * (itemList != null ? itemList.size() : 0);
            if (size == 0) {
                return;
            }
            int iMin = Math.min((int) ((this.f80376a.getItemUseWidth() * r0) / fFloatValue), size);
            int itemUseWidth2 = (int) ((this.f80376a.getItemUseWidth() * i7) / fFloatValue);
            com.bilibili.playerbizcommon.view.a aVar = this.f80377b;
            if (aVar.f80393c != itemUseWidth2 || aVar.f80392b != iMin) {
                aVar.f80393c = itemUseWidth2;
                aVar.f80392b = iMin;
                aVar.d();
            }
            this.f80376a.c(iMin);
            List<b> itemList2 = getItemList();
            List<b> list = itemList2;
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f80376a.b(iMin == size ? (getWidth() - iMin) / 2 : -(((int) (((this.f80381f - itemList2.get(0).f80386a) * this.f80376a.getItemUseWidth()) / fFloatValue)) - ((getWidth() - iMin) / 2)));
        }
    }

    public final float getEndDuration() {
        return this.f80382g;
    }

    @Nullable
    public final List<b> getItemList() {
        return this.f80376a.getItemList();
    }

    public final int getMaxDuration() {
        return this.f80379d;
    }

    public final int getMinDuration() {
        return this.f80380e;
    }

    public final float getStartDuration() {
        return this.f80381f;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f80385k.onTouchEvent(motionEvent);
        b(motionEvent);
        return zOnTouchEvent || super.onTouchEvent(motionEvent);
    }

    public final void setItemList(@Nullable List<b> list) {
        this.f80376a.setItemList(list);
        e();
        Iterator<T> it = this.f80384j.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this.f80381f, this.f80382g);
        }
    }

    public final void setProgress(float f7) {
        float f8 = this.f80382g;
        float f9 = this.f80381f;
        float f10 = f8 - f9;
        if (f10 > 0.0f) {
            this.f80377b.setIndicatorProgress(Math.min(Math.max(0.0f, f7 - f9), f10) / f10);
        }
    }
}
