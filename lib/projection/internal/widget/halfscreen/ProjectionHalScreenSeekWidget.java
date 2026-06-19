package com.bilibili.lib.projection.internal.widget.halfscreen;

import Ef.c;
import Ne0.U;
import Qe0.G;
import Qe0.h;
import Qe0.n;
import Qe0.x;
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
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.halfscreen.ProjectionHalScreenSeekWidget;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import ke0.InterfaceC7756d;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Unit;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionHalScreenSeekWidget.class */
public final class ProjectionHalScreenSeekWidget extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener, InterfaceC7756d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f64063o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public G f64064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64069g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f64071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.device.a f64073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Disposable f64074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public x f64075n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionHalScreenSeekWidget$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionHalScreenSeekWidget f64076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64077b;

        public a(ProjectionHalScreenSeekWidget projectionHalScreenSeekWidget, int i7) {
            this.f64076a = projectionHalScreenSeekWidget;
            this.f64077b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            ProjectionHalScreenSeekWidget projectionHalScreenSeekWidget = this.f64076a;
            com.bilibili.lib.projection.internal.device.a aVar = projectionHalScreenSeekWidget.f64073l;
            boolean z7 = true;
            int i7 = this.f64077b;
            if (aVar != null) {
                aVar.seekTo(i7, 1);
            }
            if (i7 <= projectionHalScreenSeekWidget.f64069g) {
                z7 = false;
            }
            projectionHalScreenSeekWidget.f64070i = z7;
            projectionHalScreenSeekWidget.h = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionHalScreenSeekWidget$b.class */
    public static final class b implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionHalScreenSeekWidget f64078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64079b;

        public b(ProjectionHalScreenSeekWidget projectionHalScreenSeekWidget, int i7) {
            this.f64078a = projectionHalScreenSeekWidget;
            this.f64079b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            com.bilibili.lib.projection.internal.device.a aVar = this.f64078a.f64073l;
            if (aVar != null) {
                aVar.seekTo(this.f64079b, 1);
            }
        }
    }

    public ProjectionHalScreenSeekWidget(@NotNull Context context) {
        super(context);
        this.f64066d = true;
        this.f64068f = true;
        this.f64070i = true;
        this.f64071j = 1;
        q();
        setOnSeekBarChangeListener(this);
    }

    public ProjectionHalScreenSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64066d = true;
        this.f64068f = true;
        this.f64070i = true;
        this.f64071j = 1;
        q();
        setOnSeekBarChangeListener(this);
    }

    public static Unit g(ProjectionHalScreenSeekWidget projectionHalScreenSeekWidget, Task task) {
        if (task == null || !task.isCompleted()) {
            projectionHalScreenSeekWidget.f64065c = true;
            LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new h(projectionHalScreenSeekWidget));
        } else {
            Pair pair = (Pair) task.getResult();
            if ((pair != null ? (LottieComposition) pair.first : null) != null && pair.second != null) {
                G g7 = new G((LottieComposition) pair.first, (LottieComposition) pair.second);
                projectionHalScreenSeekWidget.f64064b = g7;
                projectionHalScreenSeekWidget.setThumbInternal(g7);
            }
        }
        return Unit.INSTANCE;
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

    public static void k(LottieComposition lottieComposition, ProjectionHalScreenSeekWidget projectionHalScreenSeekWidget, LottieComposition lottieComposition2) {
        if (lottieComposition != null) {
            G g7 = new G(lottieComposition, lottieComposition2);
            projectionHalScreenSeekWidget.f64064b = g7;
            projectionHalScreenSeekWidget.setThumbInternal(g7);
        }
    }

    private final void setThumbInternal(Drawable drawable) {
        setThumb(drawable);
        requestLayout();
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m.a aVar) {
        Disposable disposable = this.f64074m;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f64074m = null;
        this.f64073l = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        this.f64072k = aVar2.getContainer().getClient();
        setProgressDrawable(aVar2.getContainer().getClient().getConfig().getTheme$biliscreencast_release() == ProjectionTheme.GREEN ? ContextCompat.getDrawable(getContext(), 2131233552) : ContextCompat.getDrawable(getContext(), 2131233526));
        this.f64066d = false;
        setMax(0);
        setProgress(0);
        this.f64074m = aVar2.getContainer().getClient().f().switchMap(new n(this)).subscribe();
    }

    @Override // android.widget.ProgressBar
    public final boolean isAnimating() {
        G g7 = this.f64064b;
        return g7 != null && g7.isAnimating();
    }

    public final void o(int i7, int i8, boolean z6) {
        if (i7 == -1 && i8 == -1) {
            this.f64071j = 1;
            BLog.i("ProjectionSeekWidget_HALF", "projection seekbar locked, next unlock");
            return;
        }
        boolean z7 = this.f64067e;
        if (z7 || this.f64071j == 0) {
            BLog.i("ProjectionSeekWidget_HALF", "projection seekbar locked, dragging = " + z7 + ", switch status = " + this.f64071j);
            return;
        }
        if (z6) {
            this.f64068f = true;
            this.f64071j = 0;
        }
        if (!this.f64068f) {
            boolean z8 = this.f64070i;
            this.f64068f = (!z8 || i7 < this.h) ? !z8 && i7 >= this.h : true;
            return;
        }
        c.a(i7, "onPositionUpdate position = [", "]", "ProjectionSeekWidget_HALF");
        this.f64066d = true;
        setMax(i8);
        setProgress(i7);
        this.f64069g = i7;
        U.f17139a = i7;
        U.f17140b = i8;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        G g7;
        if (isAnimating() && (g7 = this.f64064b) != null) {
            g7.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i7, boolean z6) {
        x xVar = this.f64075n;
        if (xVar != null) {
            xVar.invoke(Integer.valueOf(i7), Integer.valueOf(getMax()));
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
        this.f64067e = true;
        this.f64068f = false;
        G g7 = this.f64064b;
        if (g7 != null) {
            g7.f19883C = false;
            LottieComposition lottieComposition = g7.f19884v;
            if (lottieComposition != null) {
                g7.setComposition(lottieComposition);
                g7.setProgress(0.5f);
                g7.setBounds(g7.f19886x, 0, 0, 0);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        if (RomUtils.isMeizuRom()) {
            return;
        }
        int progress = getProgressDrawable() != null ? (int) ((getProgress() / getMax()) * r0.getBounds().right) : -1;
        G g7 = this.f64064b;
        if (g7 != null) {
            g7.f19883C = true;
            LottieComposition lottieComposition = g7.f19885w;
            if (lottieComposition != null) {
                g7.setComposition(lottieComposition);
                int i7 = progress;
                if (progress == -1) {
                    i7 = g7.f19886x;
                }
                g7.setBounds(i7, 0, 0, 0);
                g7.playAnimation();
            }
        }
        this.f64067e = false;
        int iCoerceAtMost = RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 3000, 0));
        BLog.i("Projection", "------> recovery, seek");
        C7564c.f121625a.j(new a(this, iCoerceAtMost));
        InterfaceC7845m interfaceC7845m = this.f64072k;
        if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Half;
        ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.MoveSeekbar;
        InterfaceC7845m interfaceC7845m2 = this.f64072k;
        IProjectionItem iProjectionItemN = null;
        ProjectionDeviceInternal device = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m3 = this.f64072k;
        if (interfaceC7845m3 != null) {
            iProjectionItemN = interfaceC7845m3.n(true);
        }
        reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f64066d) {
            return false;
        }
        if (RomUtils.isMeizuRom()) {
            Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.f64067e = true;
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                return true;
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                int iCoerceAtMost = RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 5000, 0));
                BLog.i("Projection", "[blink] ------>, seek");
                C7564c.f121625a.j(new b(this, iCoerceAtMost));
                this.f64067e = false;
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                this.f64067e = true;
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
                Task.callInBackground(new Callable(file, file2) { // from class: Qe0.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final File f19894a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final File f19895b;

                    {
                        this.f19894a = file;
                        this.f19895b = file2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File file3 = this.f19894a;
                        File file4 = this.f19895b;
                        int i7 = ProjectionHalScreenSeekWidget.f64063o;
                        return new Pair(LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file3)), LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file4)));
                    }
                }).continueWith(new Continuation(this) { // from class: Qe0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ProjectionHalScreenSeekWidget f19896a;

                    {
                        this.f19896a = this;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task) {
                        return ProjectionHalScreenSeekWidget.g(this.f19896a, task);
                    }
                }, Task.UI_THREAD_EXECUTOR);
                this.f64065c = false;
                return;
            }
        }
        if (this.f64065c) {
            return;
        }
        this.f64065c = true;
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new h(this));
    }
}
