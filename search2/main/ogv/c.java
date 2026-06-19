package com.bilibili.search2.main.ogv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.main.ogv.a;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/c.class */
@StabilityInferred(parameters = 0)
public final class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f86864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public com.bilibili.search2.main.ogv.a f86865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86866c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/c$a.class */
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f86867a;

        public a(c cVar) {
            this.f86867a = cVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            this.f86867a.invalidate();
            this.f86867a.postInvalidateOnAnimation();
        }
    }

    @JvmOverloads
    public c(@NotNull Context context) {
        this(context, 0);
    }

    public c(Context context, int i7) {
        super(context, null, 0);
        this.f86864a = new Paint(1);
        this.f86865b = a.C0582a.f86856a;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f86866c < 3) {
            getLocationOnScreen(new int[2]);
            this.f86866c++;
        }
        b.a(canvas, this, this.f86865b, this.f86864a);
    }

    public final void setOverlay(@NotNull com.bilibili.search2.main.ogv.a aVar) {
        this.f86865b = aVar;
        int i7 = 0;
        this.f86866c = 0;
        boolean z6 = aVar instanceof a.b;
        if (!z6) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        postInvalidateOnAnimation();
        if (z6) {
            if (getWidth() == 0 || getHeight() == 0) {
                if (!isLaidOut() || isLayoutRequested()) {
                    addOnLayoutChangeListener(new a(this));
                } else {
                    invalidate();
                    postInvalidateOnAnimation();
                }
            }
        }
    }
}
