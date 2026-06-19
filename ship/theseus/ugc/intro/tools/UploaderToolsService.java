package com.bilibili.ship.theseus.ugc.intro.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent;
import com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog.VideoMentionedDialogService;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsService.class */
@StabilityInferred(parameters = 0)
public final class UploaderToolsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f97199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HalfScreenDanmakuInputService f97200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final VideoMentionedDialogService f97201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InteractiveSettingsService f97202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<UploaderToolsComponent.b> f97203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final UploaderToolsComponent f97204f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f97205a;

        static {
            int[] iArr = new int[ToolsType.values().length];
            try {
                iArr[ToolsType.CommandDanmaku.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ToolsType.InteractiveSettings.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ToolsType.UPVideoMentions.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ToolsType.UNIVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f97205a = iArr;
        }
    }

    @Inject
    public UploaderToolsService(@NotNull PageReportService pageReportService, @NotNull HalfScreenDanmakuInputService halfScreenDanmakuInputService, @NotNull VideoMentionedDialogService videoMentionedDialogService, @NotNull InteractiveSettingsService interactiveSettingsService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97199a = pageReportService;
        this.f97200b = halfScreenDanmakuInputService;
        this.f97201c = videoMentionedDialogService;
        this.f97202d = interactiveSettingsService;
        MutableStateFlow<UploaderToolsComponent.b> MutableStateFlow = StateFlowKt.MutableStateFlow(new UploaderToolsComponent.b(null));
        this.f97203e = MutableStateFlow;
        this.f97204f = new UploaderToolsComponent(FlowKt.asStateFlow(MutableStateFlow), introContentSizeRepository.f100020a);
    }

    @Nullable
    public final RunningUIComponent a(@NotNull g gVar) {
        if (((ArrayList) gVar.f97224b).isEmpty()) {
            return null;
        }
        MutableStateFlow<UploaderToolsComponent.b> mutableStateFlow = this.f97203e;
        ((UploaderToolsComponent.b) mutableStateFlow.getValue()).getClass();
        mutableStateFlow.setValue(new UploaderToolsComponent.b(gVar));
        return new RunningUIComponent(this.f97204f, 0, new UploaderToolsService$create$1(this, null), 2);
    }
}
