package com.bilibili.lib.projection.internal.widget.fullscreen;

import Ef.c;
import Me0.C2658n;
import Me0.InterfaceC2645a;
import Me0.O;
import Me0.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.content.ContextCompat;
import bolts.Continuation;
import bolts.Task;
import com.airbnb.lottie.LottieComposition;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionFullScreenSeekWidget;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import ke0.InterfaceC7755c;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Unit;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionFullScreenSeekWidget.class */
public final class ProjectionFullScreenSeekWidget extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener, InterfaceC7755c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f63932n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public O f63933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f63937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63938g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f63939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.device.a f63941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Disposable f63942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList<InterfaceC2645a> f63943m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionFullScreenSeekWidget$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenSeekWidget f63944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63945b;

        public a(ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget, int i7) {
            this.f63944a = projectionFullScreenSeekWidget;
            this.f63945b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget = this.f63944a;
            com.bilibili.lib.projection.internal.device.a aVar = projectionFullScreenSeekWidget.f63941k;
            int i7 = this.f63945b;
            if (aVar != null) {
                aVar.seekTo(i7, 2);
            }
            projectionFullScreenSeekWidget.f63939i = i7 > projectionFullScreenSeekWidget.f63938g;
            projectionFullScreenSeekWidget.h = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionFullScreenSeekWidget$b.class */
    public static final class b implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenSeekWidget f63946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63947b;

        public b(ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget, int i7) {
            this.f63946a = projectionFullScreenSeekWidget;
            this.f63947b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            com.bilibili.lib.projection.internal.device.a aVar = this.f63946a.f63941k;
            if (aVar != null) {
                aVar.seekTo(this.f63947b, 2);
            }
        }
    }

    public ProjectionFullScreenSeekWidget(@NotNull Context context) {
        super(context);
        this.f63935d = true;
        this.f63937f = true;
        this.f63939i = true;
        this.f63940j = 1;
        this.f63943m = new ArrayList<>();
        q();
        setOnSeekBarChangeListener(this);
    }

    public ProjectionFullScreenSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63935d = true;
        this.f63937f = true;
        this.f63939i = true;
        this.f63940j = 1;
        this.f63943m = new ArrayList<>();
        q();
        setOnSeekBarChangeListener(this);
    }

    public static void g(LottieComposition lottieComposition, ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget, LottieComposition lottieComposition2) {
        if (lottieComposition != null) {
            O o7 = new O(lottieComposition, lottieComposition2);
            projectionFullScreenSeekWidget.f63933b = o7;
            projectionFullScreenSeekWidget.setThumbInternal(o7);
        }
    }

    private final String[] getJsonPath() {
        String absolutePath;
        String[] strArr = null;
        try {
            File externalFilesDir = BiliContext.application().getExternalFilesDir("player");
            if (externalFilesDir == null) {
                absolutePath = null;
            } else {
                if (!externalFilesDir.exists()) {
                    externalFilesDir.mkdirs();
                }
                absolutePath = externalFilesDir.getAbsolutePath();
            }
        } catch (Exception e7) {
        }
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(absolutePath);
        StringBuilder sb2 = new StringBuilder(absolutePath);
        if (StringsKt.w(absolutePath, "/")) {
            sb.append("player_seek_bar_new_1.json");
            sb2.append("player_seek_bar_new_2.json");
        } else {
            String str = File.separator;
            sb.append(str);
            sb.append("player_seek_bar_new_1.json");
            sb2.append(str);
            sb2.append("player_seek_bar_new_2.json");
        }
        strArr = new String[]{sb.toString(), sb2.toString()};
        return strArr;
    }

    public static Unit k(ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget, Task task) {
        if (task == null || !task.isCompleted()) {
            projectionFullScreenSeekWidget.f63934c = true;
            LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new C2658n(projectionFullScreenSeekWidget));
        } else {
            Pair pair = (Pair) task.getResult();
            if ((pair != null ? (LottieComposition) pair.first : null) != null && pair.second != null) {
                O o7 = new O((LottieComposition) pair.first, (LottieComposition) pair.second);
                projectionFullScreenSeekWidget.f63933b = o7;
                projectionFullScreenSeekWidget.setThumbInternal(o7);
            }
        }
        return Unit.INSTANCE;
    }

    private final void setThumbInternal(Drawable drawable) {
        setThumb(drawable);
        requestLayout();
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63942l;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63942l = null;
        this.f63941k = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        if (interfaceC7845m2.getConfig().getTheme$biliscreencast_release() == ProjectionTheme.GREEN) {
            setProgressDrawable(ContextCompat.getDrawable(getContext(), 2131233552));
        } else {
            setProgressDrawable(ContextCompat.getDrawable(getContext(), 2131233526));
        }
        this.f63935d = false;
        setMax(0);
        setProgress(0);
        this.f63942l = interfaceC7845m2.f().switchMap(new t(this)).subscribe();
    }

    @Override // android.widget.ProgressBar
    public final boolean isAnimating() {
        O o7 = this.f63933b;
        return o7 != null && o7.isAnimating();
    }

    public final void o(int i7, int i8) {
        boolean z6 = true;
        if (i7 == -1 && i8 == -1) {
            this.f63940j = 1;
            return;
        }
        if (this.f63936e || this.f63940j == 0) {
            return;
        }
        if (this.f63937f) {
            c.a(i7, "onPositionUpdate position = [", "]", "ProjectionSeekWidget_FULL");
            this.f63935d = true;
            setMax(i8);
            setProgress(i7);
            this.f63938g = i7;
            return;
        }
        boolean z7 = this.f63939i;
        if ((!z7 || i7 < this.h) && (z7 || i7 < this.h)) {
            z6 = false;
        }
        this.f63937f = z6;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        O o7;
        if (isAnimating() && (o7 = this.f63933b) != null) {
            o7.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i7, boolean z6) {
        Iterator<InterfaceC2645a> it = this.f63943m.iterator();
        while (it.hasNext()) {
            it.next().a(i7, getMax());
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        try {
            super.onSizeChanged(i7, i8, i9, i10);
        } catch (Exception e7) {
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        if (RomUtils.isMeizuRom()) {
            return;
        }
        this.f63936e = true;
        this.f63937f = false;
        O o7 = this.f63933b;
        if (o7 != null) {
            o7.f16123C = false;
            LottieComposition lottieComposition = o7.f16124v;
            if (lottieComposition != null) {
                o7.setComposition(lottieComposition);
                o7.setProgress(0.5f);
                o7.setBounds(o7.f16126x, 0, 0, 0);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        int progress;
        if (RomUtils.isMeizuRom()) {
            return;
        }
        this.f63936e = false;
        if (getProgressDrawable() != null) {
            progress = (int) ((getProgress() / getMax()) * r0.getBounds().right);
        } else {
            progress = -1;
        }
        O o7 = this.f63933b;
        if (o7 != null) {
            o7.f16123C = true;
            LottieComposition lottieComposition = o7.f16125w;
            if (lottieComposition != null) {
                o7.setComposition(lottieComposition);
                int i7 = progress;
                if (progress == -1) {
                    i7 = o7.f16126x;
                }
                o7.setBounds(i7, 0, 0, 0);
                o7.playAnimation();
            }
        }
        int iCoerceAtMost = RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 3000, 0));
        BLog.i("Projection", "------> recovery, seek");
        C7564c.f121625a.j(new a(this, iCoerceAtMost));
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f63935d) {
            return false;
        }
        if (RomUtils.isMeizuRom()) {
            Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.f63936e = true;
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                return true;
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                C7564c.f121625a.j(new b(this, RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 5000, 0))));
                this.f63936e = false;
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                this.f63936e = true;
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void q() {
        String[] jsonPath = getJsonPath();
        if (jsonPath != null) {
            final File file = new File(jsonPath[0]);
            final File file2 = new File(jsonPath[1]);
            if (file.exists() && file2.exists()) {
                Task.callInBackground(new Callable(file, file2) { // from class: Me0.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final File f16142a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final File f16143b;

                    {
                        this.f16142a = file;
                        this.f16143b = file2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File file3 = this.f16142a;
                        File file4 = this.f16143b;
                        int i7 = ProjectionFullScreenSeekWidget.f63932n;
                        return new Pair(LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file3)), LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file4)));
                    }
                }).continueWith(new Continuation(this) { // from class: Me0.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ProjectionFullScreenSeekWidget f16144a;

                    {
                        this.f16144a = this;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task) {
                        return ProjectionFullScreenSeekWidget.k(this.f16144a, task);
                    }
                }, Task.UI_THREAD_EXECUTOR);
                this.f63934c = false;
                return;
            }
        }
        if (this.f63934c) {
            return;
        }
        this.f63934c = true;
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new C2658n(this));
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
