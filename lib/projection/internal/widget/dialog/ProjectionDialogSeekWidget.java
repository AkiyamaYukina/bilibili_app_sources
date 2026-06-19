package com.bilibili.lib.projection.internal.widget.dialog;

import Ef.c;
import Ke0.m;
import Ke0.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import bolts.Continuation;
import bolts.Task;
import com.airbnb.lottie.LottieComposition;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSeekWidget;
import com.bilibili.lib.projection.internal.widget.g;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import ke0.InterfaceC7754b;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSeekWidget.class */
public final class ProjectionDialogSeekWidget extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener, InterfaceC7754b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f63884n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public t f63885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f63889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63890g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f63891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.device.a f63893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Disposable f63894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public g f63895m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSeekWidget$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionDialogSeekWidget f63896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63897b;

        public a(ProjectionDialogSeekWidget projectionDialogSeekWidget, int i7) {
            this.f63896a = projectionDialogSeekWidget;
            this.f63897b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            ProjectionDialogSeekWidget projectionDialogSeekWidget = this.f63896a;
            com.bilibili.lib.projection.internal.device.a aVar = projectionDialogSeekWidget.f63893k;
            boolean z7 = true;
            int i7 = this.f63897b;
            if (aVar != null) {
                aVar.seekTo(i7, 1);
            }
            if (i7 <= projectionDialogSeekWidget.f63890g) {
                z7 = false;
            }
            projectionDialogSeekWidget.f63891i = z7;
            projectionDialogSeekWidget.h = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSeekWidget$b.class */
    public static final class b implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionDialogSeekWidget f63898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63899b;

        public b(ProjectionDialogSeekWidget projectionDialogSeekWidget, int i7) {
            this.f63898a = projectionDialogSeekWidget;
            this.f63899b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            com.bilibili.lib.projection.internal.device.a aVar = this.f63898a.f63893k;
            if (aVar != null) {
                aVar.seekTo(this.f63899b, 1);
            }
        }
    }

    @JvmOverloads
    public ProjectionDialogSeekWidget(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public ProjectionDialogSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public ProjectionDialogSeekWidget(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f63887d = true;
        this.f63889f = true;
        this.f63891i = true;
        this.f63892j = 1;
        q();
        setOnSeekBarChangeListener(this);
    }

    public static void g(LottieComposition lottieComposition, ProjectionDialogSeekWidget projectionDialogSeekWidget, LottieComposition lottieComposition2) {
        if (lottieComposition != null) {
            t tVar = new t(lottieComposition, lottieComposition2);
            projectionDialogSeekWidget.f63885b = tVar;
            projectionDialogSeekWidget.setThumbInternal(tVar);
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

    public static Unit k(ProjectionDialogSeekWidget projectionDialogSeekWidget, Task task) {
        if (task == null || !task.isCompleted()) {
            projectionDialogSeekWidget.f63886c = true;
            LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new Ke0.g(projectionDialogSeekWidget));
        } else {
            Pair pair = (Pair) task.getResult();
            if ((pair != null ? (LottieComposition) pair.first : null) != null && pair.second != null) {
                t tVar = new t((LottieComposition) pair.first, (LottieComposition) pair.second);
                projectionDialogSeekWidget.f63885b = tVar;
                projectionDialogSeekWidget.setThumbInternal(tVar);
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
        Disposable disposable = this.f63894l;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63894l = null;
        this.f63893k = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        this.f63894l = interfaceC7845m.f().switchMap(new m(this)).subscribe();
    }

    @Override // android.widget.ProgressBar
    public final boolean isAnimating() {
        t tVar = this.f63885b;
        return tVar != null && tVar.isAnimating();
    }

    public final void o(int i7, int i8, boolean z6) {
        if (i7 == -1 && i8 == -1) {
            this.f63892j = 1;
            BLog.i("ProjectionSeekWidget_HALF", "projection seekbar locked, next unlock");
            return;
        }
        boolean z7 = this.f63888e;
        if (z7 || this.f63892j == 0) {
            BLog.i("ProjectionSeekWidget_HALF", "projection seekbar locked, dragging = " + z7 + ", switch status = " + this.f63892j);
            return;
        }
        if (z6) {
            this.f63889f = true;
            this.f63892j = 0;
        }
        if (!this.f63889f) {
            boolean z8 = this.f63891i;
            this.f63889f = (!z8 || i7 < this.h) ? !z8 && i7 >= this.h : true;
            return;
        }
        c.a(i7, "onPositionUpdate position = [", "]", "ProjectionSeekWidget_HALF");
        this.f63887d = true;
        setMax(i8);
        setProgress(i7);
        this.f63890g = i7;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        t tVar;
        if (isAnimating() && (tVar = this.f63885b) != null) {
            tVar.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i7, boolean z6) {
        g gVar = this.f63895m;
        if (gVar != null) {
            gVar.invoke(Integer.valueOf(i7), Integer.valueOf(getMax()));
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
        this.f63888e = true;
        this.f63889f = false;
        t tVar = this.f63885b;
        if (tVar != null) {
            tVar.f12814C = false;
            LottieComposition lottieComposition = tVar.f12815v;
            if (lottieComposition != null) {
                tVar.setComposition(lottieComposition);
                tVar.setProgress(0.5f);
                tVar.setBounds(tVar.f12817x, 0, 0, 0);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        int progress;
        if (RomUtils.isMeizuRom()) {
            return;
        }
        if (getProgressDrawable() != null) {
            progress = (int) ((getProgress() / getMax()) * r0.getBounds().right);
        } else {
            progress = -1;
        }
        t tVar = this.f63885b;
        if (tVar != null) {
            tVar.f12814C = true;
            LottieComposition lottieComposition = tVar.f12816w;
            if (lottieComposition != null) {
                tVar.setComposition(lottieComposition);
                int i7 = progress;
                if (progress == -1) {
                    i7 = tVar.f12817x;
                }
                tVar.setBounds(i7, 0, 0, 0);
                tVar.playAnimation();
            }
        }
        this.f63888e = false;
        int iCoerceAtMost = RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 3000, 0));
        BLog.i("Projection", "------> recovery, seek");
        C7564c.f121625a.j(new a(this, iCoerceAtMost));
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f63887d) {
            return false;
        }
        if (RomUtils.isMeizuRom()) {
            Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.f63888e = true;
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                return true;
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                int iCoerceAtMost = RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 5000, 0));
                BLog.i("Projection", "[blink] ------>, seek");
                C7564c.f121625a.j(new b(this, iCoerceAtMost));
                this.f63888e = false;
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                this.f63888e = true;
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
                Task.callInBackground(new Callable(file, file2) { // from class: Ke0.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final File f12788a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final File f12789b;

                    {
                        this.f12788a = file;
                        this.f12789b = file2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File file3 = this.f12788a;
                        File file4 = this.f12789b;
                        int i7 = ProjectionDialogSeekWidget.f63884n;
                        return new Pair(LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file3)), LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file4)));
                    }
                }).continueWith(new Continuation(this) { // from class: Ke0.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ProjectionDialogSeekWidget f12790a;

                    {
                        this.f12790a = this;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task) {
                        return ProjectionDialogSeekWidget.k(this.f12790a, task);
                    }
                }, Task.UI_THREAD_EXECUTOR);
                this.f63886c = false;
                return;
            }
        }
        if (this.f63886c) {
            return;
        }
        this.f63886c = true;
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new Ke0.g(this));
    }
}
