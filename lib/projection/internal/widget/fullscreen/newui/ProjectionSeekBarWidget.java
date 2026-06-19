package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import A90.e;
import Ne0.P;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.content.ContextCompat;
import bilibili.live.app.service.resolver.c;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import ke0.InterfaceC7755c;
import kntr.base.utils.foundation.RomUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionSeekBarWidget.class */
public final class ProjectionSeekBarWidget extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener, InterfaceC7755c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64035n = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public SeekStatus f64041g;

    @Nullable
    public com.bilibili.lib.projection.internal.device.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f64042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f64044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f64045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final e f64046m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionSeekBarWidget$SeekStatus.class */
    public static final class SeekStatus {
        private static final EnumEntries $ENTRIES;
        private static final SeekStatus[] $VALUES;
        public static final SeekStatus SeekLeft = new SeekStatus("SeekLeft", 0, 0);
        public static final SeekStatus SeekRight = new SeekStatus("SeekRight", 1, 1);
        public static final SeekStatus Unknown = new SeekStatus("Unknown", 2, -1);
        private final int value;

        private static final /* synthetic */ SeekStatus[] $values() {
            return new SeekStatus[]{SeekLeft, SeekRight, Unknown};
        }

        static {
            SeekStatus[] seekStatusArr$values = $values();
            $VALUES = seekStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(seekStatusArr$values);
        }

        private SeekStatus(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<SeekStatus> getEntries() {
            return $ENTRIES;
        }

        public static SeekStatus valueOf(String str) {
            return (SeekStatus) Enum.valueOf(SeekStatus.class, str);
        }

        public static SeekStatus[] values() {
            return (SeekStatus[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionSeekBarWidget$a.class */
    public interface a {
        void a(int i7, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionSeekBarWidget$b.class */
    public static final class b implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSeekBarWidget f64047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64048b;

        public b(ProjectionSeekBarWidget projectionSeekBarWidget, int i7) {
            this.f64047a = projectionSeekBarWidget;
            this.f64048b = i7;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            com.bilibili.lib.projection.internal.device.a aVar = this.f64047a.h;
            if (aVar != null) {
                aVar.seekTo(this.f64048b, 2);
            }
        }
    }

    public ProjectionSeekBarWidget(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionSeekBarWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64036b = true;
        this.f64041g = SeekStatus.SeekRight;
        this.f64045l = new ArrayList<>();
        this.f64046m = new e(this, 1);
        setOnSeekBarChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget r3, int r4, int r5) {
        /*
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r0 = r4
            if (r0 >= 0) goto L10
            r0 = r5
            if (r0 >= 0) goto L10
            goto L84
        L10:
            r0 = r3
            boolean r0 = r0.f64037c
            if (r0 == 0) goto L1a
            goto L84
        L1a:
            r0 = r3
            boolean r0 = r0.f64044k
            if (r0 == 0) goto L24
            goto L84
        L24:
            r0 = r3
            boolean r0 = r0.f64038d
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L4c
            r0 = r3
            r1 = r4
            r0.f64039e = r1
            r0 = r3
            r1 = 1
            r0.f64036b = r1
            r0 = r3
            r1 = 0
            r0.f64040f = r1
            r0 = r3
            r1 = r4
            r0.setProgress(r1)
            r0 = r3
            r1 = r5
            r0.setMax(r1)
            goto L84
        L4c:
            r0 = r3
            int r0 = r0.f64040f
            r5 = r0
            r0 = r3
            com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget$SeekStatus r0 = r0.f64041g
            r8 = r0
            r0 = r8
            com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget$SeekStatus r1 = com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget.SeekStatus.SeekRight
            if (r0 != r1) goto L69
            r0 = r4
            r1 = r5
            if (r0 < r1) goto L69
        L64:
            r0 = 1
            r6 = r0
            goto L7f
        L69:
            r0 = r7
            r6 = r0
            r0 = r8
            com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget$SeekStatus r1 = com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget.SeekStatus.SeekLeft
            if (r0 != r1) goto L7f
            r0 = r7
            r6 = r0
            r0 = r4
            r1 = r5
            if (r0 < r1) goto L7f
            goto L64
        L7f:
            r0 = r3
            r1 = r6
            r0.f64038d = r1
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget.g(com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget, int, int):void");
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        HandlerThreads.remove(0, this.f64046m);
        CompositeDisposable compositeDisposable = this.f64042i;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.f64042i = null;
        this.h = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        io.reactivex.rxjava3.subjects.a aVarF;
        IProjectionItem iProjectionItemN;
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        this.f64043j = interfaceC7845m2;
        setProgressDrawable((((interfaceC7845m2 == null || (iProjectionItemN = interfaceC7845m2.n(false)) == null) ? 1 : iProjectionItemN.getClientType()) == 3 ? ProjectionTheme.GREEN : ProjectionTheme.PINK) == ProjectionTheme.GREEN ? ContextCompat.getDrawable(getContext(), 2131232606) : ContextCompat.getDrawable(getContext(), 2131232607));
        setThumb(ContextCompat.getDrawable(getContext(), 2131232411));
        InterfaceC7845m interfaceC7845m3 = this.f64043j;
        if (interfaceC7845m3 == null || (aVarF = interfaceC7845m3.f()) == null) {
            return;
        }
        aVarF.subscribe(new P(this));
    }

    public final void k(final int i7, @NotNull SeekStatus seekStatus) {
        this.f64040f = i7;
        this.f64041g = seekStatus;
        this.f64044k = true;
        HandlerThreads.remove(0, this.f64046m);
        HandlerThreads.postDelayed(0, this.f64046m, 500L);
        post(new Runnable(this, i7) { // from class: Ne0.O

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionSeekBarWidget f17129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f17130b;

            {
                this.f17129a = this;
                this.f17130b = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProjectionSeekBarWidget projectionSeekBarWidget = this.f17129a;
                int i8 = this.f17130b;
                int i9 = ProjectionSeekBarWidget.f64035n;
                int i10 = U.f17140b;
                projectionSeekBarWidget.setProgress(i8);
                projectionSeekBarWidget.setMax(i10);
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@Nullable SeekBar seekBar, int i7, boolean z6) {
        int max = getMax();
        Iterator<a> it = this.f64045l.iterator();
        while (it.hasNext()) {
            it.next().a(i7, max);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        try {
            super.onSizeChanged(i7, i8, i9, i10);
        } catch (Exception e7) {
            BLog.d("ProjectionSeekBarWidget", "on size change catch exception");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        if (RomUtils.isMeizuRom()) {
            return;
        }
        this.f64037c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        if (RomUtils.isMeizuRom()) {
            return;
        }
        this.f64037c = false;
        int iCoerceAtMost = RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 3000, 0));
        c.a(iCoerceAtMost, "widget seek to : ", "ProjectionSeekBarWidget");
        C7564c.f121625a.j(new com.bilibili.lib.projection.internal.widget.fullscreen.newui.a(this, iCoerceAtMost));
        this.f64044k = true;
        HandlerThreads.remove(0, this.f64046m);
        HandlerThreads.postDelayed(0, this.f64046m, 1000L);
        InterfaceC7845m interfaceC7845m = this.f64043j;
        if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
        ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.MoveSeekbar;
        InterfaceC7845m interfaceC7845m2 = this.f64043j;
        IProjectionItem iProjectionItemN = null;
        ProjectionDeviceInternal device = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m3 = this.f64043j;
        if (interfaceC7845m3 != null) {
            iProjectionItemN = interfaceC7845m3.n(true);
        }
        reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f64036b) {
            return false;
        }
        if (RomUtils.isMeizuRom()) {
            Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.f64037c = true;
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                return true;
            }
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                C7564c.f121625a.j(new b(this, RangesKt.coerceAtMost(getProgress(), RangesKt.coerceAtLeast(getMax() - 5000, 0))));
                this.f64037c = false;
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                this.f64037c = true;
                setProgress((int) ((motionEvent.getX() * getMax()) / getWidth()));
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
