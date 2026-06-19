package com.bilibili.ogvcommon.deprecated;

import Nl0.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function2;
import o0.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.moss.MossConfigFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/EmptyStateView.class */
@Deprecated(message = "Time for Compose UI.")
@StabilityInferred(parameters = 0)
public final class EmptyStateView extends RelativeLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73157k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f73158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ImageView f73159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f73160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ImageView f73161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f73162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public a f73164g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final int[] f73165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final int[] f73166j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/EmptyStateView$a.class */
    public interface a {
        void i();
    }

    public EmptyStateView(@NotNull Context context) {
        this(context, null, 0);
    }

    public EmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View$OnClickListener, java.lang.Object] */
    public EmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f73165i = new int[]{2131231196, 2131235614, 2131235614, 2131235613};
        this.f73166j = new int[]{2131832105, 2131832108, 2131832109, 2131832101};
        final int i8 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this, i8) { // from class: Nl0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f17290b;

            {
                this.f17289a = i8;
                this.f17290b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f17289a) {
                    case 0:
                        EmptyStateView.a aVar = ((EmptyStateView) this.f17290b).f73164g;
                        break;
                    case 1:
                        ((ia.g) this.f17290b).z0();
                        break;
                    default:
                        MossConfigFragment mossConfigFragment = (MossConfigFragment) this.f17290b;
                        mossConfigFragment.kf("logUploadUnwatch");
                        mossConfigFragment.jf("na", new E(1), (Function2) new Object());
                        break;
                }
            }
        };
        c cVar = new c(this, 0);
        View viewInflate = LayoutInflater.from(context).inflate(2131499584, (ViewGroup) this, true);
        this.f73158a = viewInflate.findViewById(2131301013);
        this.f73159b = (ImageView) viewInflate.findViewById(2131299134);
        this.f73160c = (TextView) viewInflate.findViewById(2131299137);
        ImageView imageView = (ImageView) viewInflate.findViewById(2131299133);
        this.f73161d = imageView;
        TextView textView = (TextView) viewInflate.findViewById(2131299135);
        this.f73162e = textView;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        if (textView != null) {
            textView.setOnClickListener(cVar);
        }
        setOnClickListener(new Object());
    }

    public final void a() {
        setVisibility(8);
    }

    public final void b(int i7, boolean z6) {
        this.f73163f = i7;
        this.h = z6;
        ImageView imageView = this.f73159b;
        if (imageView != null) {
            imageView.setImageResource(this.f73165i[i7]);
        }
        TextView textView = this.f73160c;
        if (textView != null) {
            textView.setText(this.f73166j[this.f73163f]);
        }
        int i8 = this.f73163f;
        int i9 = 8;
        if (i8 == 0) {
            TextView textView2 = this.f73162e;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (i8 != 3) {
            TextView textView3 = this.f73162e;
            if (textView3 != null) {
                if (this.h) {
                    i9 = 0;
                }
                textView3.setVisibility(i9);
                textView3.setText(textView3.getContext().getText(2131832112));
            }
        } else {
            TextView textView4 = this.f73162e;
            if (textView4 != null) {
                if (this.h) {
                    i9 = 0;
                }
                textView4.setVisibility(i9);
                textView4.setText(textView4.getContext().getText(2131832080));
            }
        }
        setVisibility(0);
    }

    public final void setBackBtnVisible(int i7) {
        ImageView imageView = this.f73161d;
        if (imageView != null) {
            imageView.setVisibility(i7);
        }
    }

    public final void setEmptyViewBackColor(int i7) {
        findViewById(2131301013).setBackgroundColor(i7);
    }

    public final void setListener(@NotNull a aVar) {
        this.f73164g = aVar;
    }
}
