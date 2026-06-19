package com.bilibili.ship.theseus.ogv.activity.countdown;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.activity.VipWatchingCountdownTaskVo;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService.class */
@StabilityInferred(parameters = 0)
public final class OgvWatchingCountdownTaskService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f91513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f91514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f91515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f91517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PlayerControlContainerService f91518g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f91519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f91520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f91521k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Job f91523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public b f91524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f91525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f91526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f91527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f91528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f91529s;

    @NotNull
    public final MutableStateFlow<VipWatchingCountdownTaskVo> h = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public TaskState f91522l = TaskState.COUNTDOWN;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$OgvWatchingCountdownComponent.class */
    public final class OgvWatchingCountdownComponent implements UIComponent<UIComponent.b<FrameLayout>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final VipWatchingCountdownTaskVo f91530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f91531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OgvWatchingCountdownTaskService f91532c;

        public OgvWatchingCountdownComponent(@NotNull OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService, VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo, boolean z6) {
            this.f91532c = ogvWatchingCountdownTaskService;
            this.f91530a = vipWatchingCountdownTaskVo;
            this.f91531b = z6;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent.b<android.widget.FrameLayout> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService.OgvWatchingCountdownComponent.bindToView(com.bilibili.app.gemini.ui.UIComponent$b, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new UIComponent.b(frameLayout);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$TaskState.class */
    public static final class TaskState {
        private static final EnumEntries $ENTRIES;
        private static final TaskState[] $VALUES;
        private final int value;
        public static final TaskState STARTED = new TaskState("STARTED", 0, 0);
        public static final TaskState COUNTDOWN = new TaskState("COUNTDOWN", 1, 1);
        public static final TaskState PAUSED = new TaskState("PAUSED", 2, 2);
        public static final TaskState COMPLETED = new TaskState("COMPLETED", 3, 3);
        public static final TaskState CANCELED = new TaskState("CANCELED", 4, 4);

        private static final /* synthetic */ TaskState[] $values() {
            return new TaskState[]{STARTED, COUNTDOWN, PAUSED, COMPLETED, CANCELED};
        }

        static {
            TaskState[] taskStateArr$values = $values();
            $VALUES = taskStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(taskStateArr$values);
        }

        private TaskState(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<TaskState> getEntries() {
            return $ENTRIES;
        }

        public static TaskState valueOf(String str) {
            return (TaskState) Enum.valueOf(TaskState.class, str);
        }

        public static TaskState[] values() {
            return (TaskState[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Inject
    public OgvWatchingCountdownTaskService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull h hVar, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PlayerControlContainerService playerControlContainerService) {
        this.f91512a = coroutineScope;
        this.f91513b = context;
        this.f91514c = hVar;
        this.f91515d = pageReportService;
        this.f91516e = cVar;
        this.f91517f = theseusFloatLayerService;
        this.f91518g = playerControlContainerService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvWatchingCountdownTaskService$collectCountdownTask$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvWatchingCountdownTaskService$collectCountdownTask$2(this, null), 3, (Object) null);
    }

    public final boolean a() {
        if (this.f91520j < this.f91521k || this.f91522l.getValue() < TaskState.COMPLETED.getValue()) {
            return true;
        }
        this.h.setValue((Object) null);
        return false;
    }

    public final void b(@Nullable VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo) {
        this.f91528r = this.f91529s && vipWatchingCountdownTaskVo == null;
        MutableStateFlow<VipWatchingCountdownTaskVo> mutableStateFlow = this.h;
        VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo2 = (VipWatchingCountdownTaskVo) mutableStateFlow.getValue();
        if (vipWatchingCountdownTaskVo == null) {
            Job job = this.f91523m;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            b bVar = this.f91524n;
            if (bVar != null) {
                bVar.dismiss();
            }
            mutableStateFlow.setValue((Object) null);
            this.f91524n = null;
            this.f91519i = null;
            if (this.f91522l.getValue() > TaskState.STARTED.getValue()) {
                this.f91522l = TaskState.CANCELED;
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(vipWatchingCountdownTaskVo, vipWatchingCountdownTaskVo2)) {
            c();
            return;
        }
        String str = this.f91519i;
        String str2 = vipWatchingCountdownTaskVo.f91500g;
        if (Intrinsics.areEqual(str2, str)) {
            return;
        }
        mutableStateFlow.setValue(vipWatchingCountdownTaskVo);
        this.f91519i = str2;
        this.f91521k = vipWatchingCountdownTaskVo.e();
        this.f91520j = 0L;
        this.f91522l = TaskState.STARTED;
        this.f91527q = false;
        this.f91525o = false;
        this.f91526p = false;
        c();
    }

    public final void c() {
        Job job = this.f91523m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (a()) {
            this.f91523m = BuildersKt.launch$default(this.f91512a, (CoroutineContext) null, (CoroutineStart) null, new OgvWatchingCountdownTaskService$startCountdown$1(this, null), 3, (Object) null);
        }
    }
}
