package com.bilibili.lib.projection.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.analytics.U;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.facebook.internal.FileLruCache;
import ie0.C7564c;
import kotlin.Deprecated;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/v.class */
@Deprecated(message = "该类应该被移除，公共方法应该抽取出来。该类理论上需要废弃，属于旧代码逻辑.....")
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public PageState f64125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f64126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ViewGroup f64127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ViewGroup f64128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewGroup f64129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewGroup f64130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ImageView f64131g;

    @Nullable
    public Bu.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ViewGroup f64132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f64133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f64134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f64135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public ImageView f64136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TextView f64137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f64138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ImageView f64139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Animation f64140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Animation f64141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public e f64142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ProjectionOperationConfig.ProjButtonBubbleConfig f64143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public t f64144u;

    public static /* synthetic */ void f(v vVar, PageState pageState, int i7) {
        if ((i7 & 1) != 0) {
            pageState = PageState.IDLE;
        }
        vVar.e(pageState, false);
    }

    public final void a(@NotNull PageState pageState, boolean z6) {
        Context context;
        Resources resources;
        String string;
        TextView textView;
        ViewGroup viewGroup;
        Animation animation;
        ViewGroup viewGroup2;
        if ((b(pageState, PageState.NORMAL) && this.f64125a != PageState.HOW_TO_PRJ) || z6) {
            ViewGroup viewGroup3 = this.f64127c;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            ViewGroup viewGroup4 = this.f64128d;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            ViewGroup viewGroup5 = this.f64129e;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(8);
            }
            ViewGroup viewGroup6 = this.f64130f;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            ViewGroup viewGroup7 = this.f64132i;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(8);
            }
            if (this.f64125a == PageState.HOW_TO_PRJ && (animation = this.f64141r) != null && (viewGroup2 = this.f64132i) != null) {
                viewGroup2.startAnimation(animation);
            }
            e(pageState, true);
            c(PageState.IDLE);
            this.f64125a = pageState;
            return;
        }
        if (b(pageState, PageState.NO_WIFI) && this.f64125a != PageState.HOW_TO_PRJ) {
            ViewGroup viewGroup8 = this.f64127c;
            if (viewGroup8 != null) {
                viewGroup8.setVisibility(8);
            }
            ViewGroup viewGroup9 = this.f64128d;
            if (viewGroup9 != null) {
                viewGroup9.setVisibility(0);
            }
            ViewGroup viewGroup10 = this.f64129e;
            if (viewGroup10 != null) {
                viewGroup10.setVisibility(8);
            }
            ViewGroup viewGroup11 = this.f64130f;
            if (viewGroup11 != null) {
                viewGroup11.setVisibility(8);
            }
            ViewGroup viewGroup12 = this.f64132i;
            if (viewGroup12 != null) {
                viewGroup12.setVisibility(8);
            }
            f(this, null, 3);
            this.f64125a = pageState;
            return;
        }
        if (b(pageState, PageState.NO_DEVICE) && this.f64125a != PageState.HOW_TO_PRJ) {
            ViewGroup viewGroup13 = this.f64127c;
            if (viewGroup13 != null) {
                viewGroup13.setVisibility(8);
            }
            ViewGroup viewGroup14 = this.f64128d;
            if (viewGroup14 != null) {
                viewGroup14.setVisibility(8);
            }
            ViewGroup viewGroup15 = this.f64129e;
            if (viewGroup15 != null) {
                viewGroup15.setVisibility(0);
            }
            ViewGroup viewGroup16 = this.f64130f;
            if (viewGroup16 != null) {
                viewGroup16.setVisibility(8);
            }
            ViewGroup viewGroup17 = this.f64132i;
            if (viewGroup17 != null) {
                viewGroup17.setVisibility(8);
            }
            f(this, null, 3);
            this.f64125a = pageState;
            return;
        }
        if (b(pageState, PageState.OTHER_SEARCH) && this.f64125a != PageState.HOW_TO_PRJ) {
            ViewGroup viewGroup18 = this.f64127c;
            if (viewGroup18 != null) {
                viewGroup18.setVisibility(8);
            }
            ViewGroup viewGroup19 = this.f64128d;
            if (viewGroup19 != null) {
                viewGroup19.setVisibility(8);
            }
            ViewGroup viewGroup20 = this.f64129e;
            if (viewGroup20 != null) {
                viewGroup20.setVisibility(8);
            }
            ViewGroup viewGroup21 = this.f64130f;
            if (viewGroup21 != null) {
                viewGroup21.setVisibility(0);
            }
            ViewGroup viewGroup22 = this.f64132i;
            if (viewGroup22 != null) {
                viewGroup22.setVisibility(8);
            }
            f(this, null, 3);
            this.f64125a = pageState;
            return;
        }
        if (b(pageState, PageState.HOW_TO_PRJ)) {
            ViewGroup viewGroup23 = this.f64127c;
            if (viewGroup23 != null) {
                final int i7 = 0;
                viewGroup23.postDelayed(new Runnable(this, i7) { // from class: com.bilibili.lib.projection.internal.widget.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f64121a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f64122b;

                    {
                        this.f64121a = i7;
                        this.f64122b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f64121a) {
                            case 0:
                                ViewGroup viewGroup24 = ((v) this.f64122b).f64127c;
                                if (viewGroup24 != null) {
                                    viewGroup24.setVisibility(8);
                                }
                                break;
                            default:
                                FileLruCache.b((FileLruCache) this.f64122b);
                                break;
                        }
                    }
                }, 500L);
            }
            ViewGroup viewGroup24 = this.f64128d;
            if (viewGroup24 != null) {
                viewGroup24.setVisibility(8);
            }
            ViewGroup viewGroup25 = this.f64129e;
            if (viewGroup25 != null) {
                viewGroup25.setVisibility(8);
            }
            ViewGroup viewGroup26 = this.f64130f;
            if (viewGroup26 != null) {
                viewGroup26.setVisibility(8);
            }
            ViewGroup viewGroup27 = this.f64132i;
            if (viewGroup27 != null) {
                viewGroup27.setVisibility(0);
            }
            Animation animation2 = this.f64140q;
            if (animation2 != null && (viewGroup = this.f64132i) != null) {
                viewGroup.startAnimation(animation2);
            }
            String strC = Ie0.j.c();
            if (strC == null || strC.length() == 0) {
                TextView textView2 = this.f64133j;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                View view = this.f64126b;
                if (view != null && (context = view.getContext()) != null && (resources = context.getResources()) != null && (string = resources.getString(2131833701)) != null && (textView = this.f64133j) != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    U.a(new Object[]{strC}, 1, string, textView);
                }
                TextView textView3 = this.f64133j;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
            f(this, pageState, 2);
            c(pageState);
            this.f64125a = pageState;
            he0.j.c("main.public-community.screencast-floats.tutorial-toast.click", null, null, C7564c.f121634k.f63524a, null, 20);
        }
    }

    public final boolean b(PageState pageState, PageState pageState2) {
        return pageState == pageState2 && this.f64125a != pageState2;
    }

    public final void c(PageState pageState) {
        if (pageState == PageState.HOW_TO_PRJ) {
            ImageView imageView = this.f64131g;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.widget.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final v f64120a;

                    {
                        this.f64120a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f64120a.a(PageState.NORMAL, true);
                    }
                });
            }
            ImageView imageView2 = this.f64131g;
            if (imageView2 != null) {
                imageView2.setImageResource(2131238619);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f64131g;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this.h);
        }
        ImageView imageView4 = this.f64131g;
        if (imageView4 != null) {
            imageView4.setImageResource(2131238618);
        }
    }

    public final void d() {
        TextView textView = this.f64135l;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ImageView imageView = this.f64136m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView2 = this.f64138o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        ImageView imageView2 = this.f64139p;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    public final void e(PageState pageState, boolean z6) {
        Context context;
        View view = this.f64126b;
        Resources resources = (view == null || (context = view.getContext()) == null) ? null : context.getResources();
        if (resources != null) {
            if (pageState == PageState.HOW_TO_PRJ) {
                String string = resources.getString(2131846458);
                TextView textView = this.f64134k;
                if (textView != null) {
                    textView.setText(string);
                }
                TextView textView2 = this.f64137n;
                if (textView2 != null) {
                    textView2.setText(string);
                }
            } else {
                String string2 = resources.getString(2131845520);
                TextView textView3 = this.f64134k;
                if (textView3 != null) {
                    textView3.setText(string2);
                }
                TextView textView4 = this.f64137n;
                if (textView4 != null) {
                    textView4.setText(string2);
                }
            }
        }
        if (z6) {
            d();
            return;
        }
        TextView textView5 = this.f64135l;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        ImageView imageView = this.f64136m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView6 = this.f64138o;
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        ImageView imageView2 = this.f64139p;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }
}
