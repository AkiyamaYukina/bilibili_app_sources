package com.bilibili.ship.theseus.ogv.misc;

import android.content.Context;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bililive.biz.interact.mod.BlinkModResourceLoader;
import com.bilibili.lib.blrouter.RouteRequest;
import iH.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.webview.InstantEventWebActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvExpandableTextLayout.class */
@StabilityInferred(parameters = 0)
public final class OgvExpandableTextLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f94042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CharSequence f94046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f94047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f94048g;

    @NotNull
    public final Runnable h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvExpandableTextLayout$a.class */
    public interface a {
    }

    public OgvExpandableTextLayout(@NotNull Context context) {
        super(context);
        this.f94044c = 3;
        final int i7 = 0;
        this.h = new Runnable(this, i7) { // from class: com.bilibili.ship.theseus.ogv.misc.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f94051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f94052b;

            {
                this.f94051a = i7;
                this.f94052b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f94051a) {
                    case 0:
                        OgvExpandableTextLayout ogvExpandableTextLayout = (OgvExpandableTextLayout) this.f94052b;
                        if (!ogvExpandableTextLayout.f94047f) {
                            ogvExpandableTextLayout.b(ogvExpandableTextLayout.f94046e, ogvExpandableTextLayout.f94045d == 1);
                        }
                        break;
                    case 1:
                        i iVar = (i) this.f94052b;
                        if (iVar.j && !iVar.i && !iVar.b() && iVar.a.isAdded()) {
                            String str = iVar.c;
                            String str2 = str;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                str2 = null;
                            }
                            String str3 = iVar.d;
                            String str4 = str3;
                            if (str3 == null) {
                                String str5 = iVar.c;
                                str4 = str5;
                                if (str5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                    str4 = null;
                                }
                            }
                            RouteRequest routeRequest = iVar.e;
                            RouteRequest routeRequest2 = routeRequest;
                            if (routeRequest == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("forward");
                                routeRequest2 = null;
                            }
                            Uri pureUri = routeRequest2.getPureUri();
                            StringBuilder sbA = G0.b.a("mod resource load timeout, continue to target page. bundle=", str2, ", module=", str4, ", forward=");
                            sbA.append(pureUri);
                            BLog.w("LiveStreamingTribeMid", sbA.toString());
                            BlinkModResourceLoader blinkModResourceLoader = iVar.r;
                            if (blinkModResourceLoader != null) {
                                blinkModResourceLoader.destroy();
                            }
                            iVar.r = null;
                            boolean zE = iVar.e();
                            iVar.i = zE;
                            iVar.j = false;
                            if (!zE) {
                                String str6 = iVar.c;
                                String str7 = str6;
                                if (str6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                    str7 = null;
                                }
                                String str8 = iVar.d;
                                String str9 = str8;
                                if (str8 == null) {
                                    String str10 = iVar.c;
                                    str9 = str10;
                                    if (str10 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                        str9 = null;
                                    }
                                }
                                RouteRequest routeRequest3 = iVar.e;
                                if (routeRequest3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("forward");
                                    routeRequest3 = null;
                                }
                                Uri pureUri2 = routeRequest3.getPureUri();
                                StringBuilder sbA2 = G0.b.a("mod resource timeout fallback failed, bundle=", str7, ", module=", str9, ", uri=");
                                sbA2.append(pureUri2);
                                BLog.wfmt("LiveStreamingTribeMid", sbA2.toString(), new Object[0]);
                            }
                            break;
                        }
                        break;
                    case 2:
                        View view = (View) this.f94052b;
                        view.setAlpha(0.0f);
                        view.setVisibility(0);
                        view.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                        break;
                    default:
                        InstantEventWebActivity instantEventWebActivity = (InstantEventWebActivity) this.f94052b;
                        int i8 = InstantEventWebActivity.c0;
                        if (!((com.bilibili.lib.biliweb.b) instantEventWebActivity).Q && !instantEventWebActivity.isDestroyCalled()) {
                            String title = instantEventWebActivity.g7().getTitle();
                            ActionBar supportActionBar = instantEventWebActivity.getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.setTitle(title);
                            }
                            break;
                        }
                        break;
                }
            }
        };
        a();
    }

    public OgvExpandableTextLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94044c = 3;
        final int i7 = 0;
        this.h = new Runnable(this, i7) { // from class: com.bilibili.ship.theseus.ogv.misc.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f94051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f94052b;

            {
                this.f94051a = i7;
                this.f94052b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f94051a) {
                    case 0:
                        OgvExpandableTextLayout ogvExpandableTextLayout = (OgvExpandableTextLayout) this.f94052b;
                        if (!ogvExpandableTextLayout.f94047f) {
                            ogvExpandableTextLayout.b(ogvExpandableTextLayout.f94046e, ogvExpandableTextLayout.f94045d == 1);
                        }
                        break;
                    case 1:
                        i iVar = (i) this.f94052b;
                        if (iVar.j && !iVar.i && !iVar.b() && iVar.a.isAdded()) {
                            String str = iVar.c;
                            String str2 = str;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                str2 = null;
                            }
                            String str3 = iVar.d;
                            String str4 = str3;
                            if (str3 == null) {
                                String str5 = iVar.c;
                                str4 = str5;
                                if (str5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                    str4 = null;
                                }
                            }
                            RouteRequest routeRequest = iVar.e;
                            RouteRequest routeRequest2 = routeRequest;
                            if (routeRequest == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("forward");
                                routeRequest2 = null;
                            }
                            Uri pureUri = routeRequest2.getPureUri();
                            StringBuilder sbA = G0.b.a("mod resource load timeout, continue to target page. bundle=", str2, ", module=", str4, ", forward=");
                            sbA.append(pureUri);
                            BLog.w("LiveStreamingTribeMid", sbA.toString());
                            BlinkModResourceLoader blinkModResourceLoader = iVar.r;
                            if (blinkModResourceLoader != null) {
                                blinkModResourceLoader.destroy();
                            }
                            iVar.r = null;
                            boolean zE = iVar.e();
                            iVar.i = zE;
                            iVar.j = false;
                            if (!zE) {
                                String str6 = iVar.c;
                                String str7 = str6;
                                if (str6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                    str7 = null;
                                }
                                String str8 = iVar.d;
                                String str9 = str8;
                                if (str8 == null) {
                                    String str10 = iVar.c;
                                    str9 = str10;
                                    if (str10 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("bundleName");
                                        str9 = null;
                                    }
                                }
                                RouteRequest routeRequest3 = iVar.e;
                                if (routeRequest3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("forward");
                                    routeRequest3 = null;
                                }
                                Uri pureUri2 = routeRequest3.getPureUri();
                                StringBuilder sbA2 = G0.b.a("mod resource timeout fallback failed, bundle=", str7, ", module=", str9, ", uri=");
                                sbA2.append(pureUri2);
                                BLog.wfmt("LiveStreamingTribeMid", sbA2.toString(), new Object[0]);
                            }
                            break;
                        }
                        break;
                    case 2:
                        View view = (View) this.f94052b;
                        view.setAlpha(0.0f);
                        view.setVisibility(0);
                        view.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                        break;
                    default:
                        InstantEventWebActivity instantEventWebActivity = (InstantEventWebActivity) this.f94052b;
                        int i8 = InstantEventWebActivity.c0;
                        if (!((com.bilibili.lib.biliweb.b) instantEventWebActivity).Q && !instantEventWebActivity.isDestroyCalled()) {
                            String title = instantEventWebActivity.g7().getTitle();
                            ActionBar supportActionBar = instantEventWebActivity.getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.setTitle(title);
                            }
                            break;
                        }
                        break;
                }
            }
        };
        a();
    }

    public final void a() {
        FrameLayout.inflate(getContext(), 2131500288, this);
        TextView textView = (TextView) findViewById(2131309771);
        this.f94042a = textView;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
            textView2 = null;
        }
        textView2.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void b(@Nullable CharSequence charSequence, boolean z6) {
        int lineCount;
        this.f94046e = charSequence;
        if (charSequence == null || ((String) charSequence).length() == 0 || this.f94043b <= 0) {
            lineCount = 1;
        } else {
            this.f94047f = true;
            TextView textView = this.f94042a;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView2 = null;
            }
            lineCount = new StaticLayout(charSequence, textView2.getPaint(), this.f94043b, Layout.Alignment.ALIGN_NORMAL, 0.0f, 1.0f, true).getLineCount();
        }
        if (lineCount <= this.f94044c) {
            TextView textView3 = this.f94042a;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView4 = null;
            }
            TextView textView5 = this.f94042a;
            TextView textView6 = textView5;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView6 = null;
            }
            int paddingLeft = textView6.getPaddingLeft();
            TextView textView7 = this.f94042a;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView8 = null;
            }
            int paddingTop = textView8.getPaddingTop();
            TextView textView9 = this.f94042a;
            TextView textView10 = textView9;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView10 = null;
            }
            textView4.setPadding(paddingLeft, paddingTop, textView10.getPaddingRight(), 0);
            TextView textView11 = this.f94042a;
            TextView textView12 = textView11;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView12 = null;
            }
            textView12.setMaxLines(this.f94044c);
            TextView textView13 = this.f94042a;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView13 = null;
            }
            textView13.setText(charSequence);
            this.f94045d = 0;
            View view = this.f94048g;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (z6) {
            this.f94045d = 1;
            TextView textView14 = this.f94042a;
            TextView textView15 = textView14;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView15 = null;
            }
            TextView textView16 = this.f94042a;
            TextView textView17 = textView16;
            if (textView16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView17 = null;
            }
            int paddingLeft2 = textView17.getPaddingLeft();
            TextView textView18 = this.f94042a;
            TextView textView19 = textView18;
            if (textView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView19 = null;
            }
            int paddingTop2 = textView19.getPaddingTop();
            TextView textView20 = this.f94042a;
            TextView textView21 = textView20;
            if (textView20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView21 = null;
            }
            textView15.setPadding(paddingLeft2, paddingTop2, textView21.getPaddingRight(), 0);
            TextView textView22 = this.f94042a;
            TextView textView23 = textView22;
            if (textView22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView23 = null;
            }
            textView23.setMaxLines(Integer.MAX_VALUE);
            TextView textView24 = this.f94042a;
            if (textView24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView24 = null;
            }
            textView24.setText(charSequence);
        } else {
            this.f94045d = 2;
            TextView textView25 = this.f94042a;
            TextView textView26 = textView25;
            if (textView25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView26 = null;
            }
            textView26.setMaxLines(this.f94044c);
            TextView textView27 = this.f94042a;
            TextView textView28 = textView27;
            if (textView27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView28 = null;
            }
            TextView textView29 = this.f94042a;
            TextView textView30 = textView29;
            if (textView29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView30 = null;
            }
            int paddingLeft3 = textView30.getPaddingLeft();
            TextView textView31 = this.f94042a;
            TextView textView32 = textView31;
            if (textView31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView32 = null;
            }
            int paddingTop3 = textView32.getPaddingTop();
            TextView textView33 = this.f94042a;
            TextView textView34 = textView33;
            if (textView33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView34 = null;
            }
            textView28.setPadding(paddingLeft3, paddingTop3, textView34.getPaddingRight(), 0);
            TextView textView35 = this.f94042a;
            if (textView35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
                textView35 = null;
            }
            textView35.setText(charSequence);
        }
        View view2 = this.f94048g;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.h);
        postDelayed(this.h, 100L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.h);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f94043b = (i7 - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.f94042a;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
            textView2 = null;
        }
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f94043b = (this.f94043b - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        if (this.f94046e != null) {
            postDelayed(this.h, 100L);
        }
    }

    public final void setLines(int i7) {
        this.f94044c = i7;
    }

    public final void setOnExpandListener(@Nullable a aVar) {
    }

    public final void setTextSize(int i7) {
        TextView textView = this.f94042a;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentTv");
            textView2 = null;
        }
        textView2.setTextSize(i7);
    }
}
