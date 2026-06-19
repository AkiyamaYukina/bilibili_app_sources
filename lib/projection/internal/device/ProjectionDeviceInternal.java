package com.bilibili.lib.projection.internal.device;

import com.bilibili.lib.projection.internal.projectionitem.NoItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import ge0.InterfaceC7274d;
import ge0.f;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal.class */
public interface ProjectionDeviceInternal extends InterfaceC7274d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal$DeviceState.class */
    public static final class DeviceState {
        private static final EnumEntries $ENTRIES;
        private static final DeviceState[] $VALUES;
        public static final DeviceState INITIALIZED = new DeviceState("INITIALIZED", 0);
        public static final DeviceState DISCONNECTED = new DeviceState("DISCONNECTED", 1);
        public static final DeviceState CONNECTING = new DeviceState("CONNECTING", 2);
        public static final DeviceState CONNECTED = new DeviceState("CONNECTED", 3);
        public static final DeviceState DESTROYED = new DeviceState("DESTROYED", 4);

        private static final /* synthetic */ DeviceState[] $values() {
            return new DeviceState[]{INITIALIZED, DISCONNECTED, CONNECTING, CONNECTED, DESTROYED};
        }

        static {
            DeviceState[] deviceStateArr$values = $values();
            $VALUES = deviceStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(deviceStateArr$values);
        }

        private DeviceState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DeviceState> getEntries() {
            return $ENTRIES;
        }

        public static DeviceState valueOf(String str) {
            return (DeviceState) Enum.valueOf(DeviceState.class, str);
        }

        public static DeviceState[] values() {
            return (DeviceState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal$GlobalLinkRecoveryStep.class */
    public static final class GlobalLinkRecoveryStep {
        private static final EnumEntries $ENTRIES;
        private static final GlobalLinkRecoveryStep[] $VALUES;
        public static final GlobalLinkRecoveryStep SUCCEED = new GlobalLinkRecoveryStep("SUCCEED", 0);
        public static final GlobalLinkRecoveryStep LOADING = new GlobalLinkRecoveryStep("LOADING", 1);
        public static final GlobalLinkRecoveryStep DISCONNECTED = new GlobalLinkRecoveryStep("DISCONNECTED", 2);

        private static final /* synthetic */ GlobalLinkRecoveryStep[] $values() {
            return new GlobalLinkRecoveryStep[]{SUCCEED, LOADING, DISCONNECTED};
        }

        static {
            GlobalLinkRecoveryStep[] globalLinkRecoveryStepArr$values = $values();
            $VALUES = globalLinkRecoveryStepArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(globalLinkRecoveryStepArr$values);
        }

        private GlobalLinkRecoveryStep(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<GlobalLinkRecoveryStep> getEntries() {
            return $ENTRIES;
        }

        public static GlobalLinkRecoveryStep valueOf(String str) {
            return (GlobalLinkRecoveryStep) Enum.valueOf(GlobalLinkRecoveryStep.class, str);
        }

        public static GlobalLinkRecoveryStep[] values() {
            return (GlobalLinkRecoveryStep[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal$PlayerState.class */
    public static final class PlayerState {
        private static final EnumEntries $ENTRIES;
        private static final PlayerState[] $VALUES;
        public static final PlayerState UNKNOWN = new PlayerState("UNKNOWN", 0);
        public static final PlayerState IDLE = new PlayerState("IDLE", 1);
        public static final PlayerState PLAYING = new PlayerState("PLAYING", 2);
        public static final PlayerState PAUSED = new PlayerState("PAUSED", 3);
        public static final PlayerState LOADING = new PlayerState("LOADING", 4);
        public static final PlayerState STOPPED = new PlayerState("STOPPED", 5);
        public static final PlayerState COMPLETED = new PlayerState("COMPLETED", 6);

        private static final /* synthetic */ PlayerState[] $values() {
            return new PlayerState[]{UNKNOWN, IDLE, PLAYING, PAUSED, LOADING, STOPPED, COMPLETED};
        }

        static {
            PlayerState[] playerStateArr$values = $values();
            $VALUES = playerStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(playerStateArr$values);
        }

        private PlayerState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<PlayerState> getEntries() {
            return $ENTRIES;
        }

        public static PlayerState valueOf(String str) {
            return (PlayerState) Enum.valueOf(PlayerState.class, str);
        }

        public static PlayerState[] values() {
            return (PlayerState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal$VolumeAction.class */
    public static final class VolumeAction {
        private static final EnumEntries $ENTRIES;
        private static final VolumeAction[] $VALUES;
        public static final VolumeAction VOLUME_UP = new VolumeAction("VOLUME_UP", 0);
        public static final VolumeAction VOLUME_DOWN = new VolumeAction("VOLUME_DOWN", 1);
        public static final VolumeAction VOLUME_MUTE = new VolumeAction("VOLUME_MUTE", 2);

        private static final /* synthetic */ VolumeAction[] $values() {
            return new VolumeAction[]{VOLUME_UP, VOLUME_DOWN, VOLUME_MUTE};
        }

        static {
            VolumeAction[] volumeActionArr$values = $values();
            $VALUES = volumeActionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(volumeActionArr$values);
        }

        private VolumeAction(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<VolumeAction> getEntries() {
            return $ENTRIES;
        }

        public static VolumeAction valueOf(String str) {
            return (VolumeAction) Enum.valueOf(VolumeAction.class, str);
        }

        public static VolumeAction[] values() {
            return (VolumeAction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal$a.class */
    public interface a {
        void a();

        void b(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/ProjectionDeviceInternal$b.class */
    public static final class b implements ProjectionDeviceInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f63069a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static String f63070b = "";

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<f> A() {
            return Observable.empty();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void B(@NotNull IProjectionPlayableItem iProjectionPlayableItem, float f7, long j7, boolean z6) {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void D() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @Nullable
        public final DeviceSnapshot F() {
            return null;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final DeviceState b() {
            return DeviceState.DISCONNECTED;
        }

        @Override // ge0.InterfaceC7274d
        public final int e() {
            return 0;
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getBrand() {
            return "stub";
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getChannel() {
            return "";
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getDisplayName() {
            return f63070b;
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getManufacturer() {
            return "stub";
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final IProjectionPlayableItem getMediaSource() {
            return NoItem.f63473a;
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getModel() {
            return "stub";
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getName() {
            return "";
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final PlayerState getPlayerState() {
            return PlayerState.UNKNOWN;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final String getRealName() {
            return "stub";
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getUuid() {
            return "stub";
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final String h() {
            return "stub";
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<DeviceState> i() {
            return Observable.just(DeviceState.DISCONNECTED);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<IProjectionPlayableItem> j() {
            return Observable.just(NoItem.f63473a);
        }

        @Override // ge0.InterfaceC7274d
        public final void l(@NotNull String str) {
            f63070b = str;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void n() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void p(boolean z6) {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void pause() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void q(@NotNull NoItem noItem) {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void resume() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void seekTo(long j7) {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void stop() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void u(boolean z6) {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<PlayerState> w() {
            return Observable.just(PlayerState.UNKNOWN);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Pair<Integer, Integer> y() {
            return new Pair<>(0, 0);
        }
    }

    @NotNull
    Observable<f> A();

    void B(@NotNull IProjectionPlayableItem iProjectionPlayableItem, float f7, long j7, boolean z6);

    void D();

    @Nullable
    DeviceSnapshot F();

    @NotNull
    DeviceState b();

    default void c(boolean z6) {
    }

    default void destroy() {
    }

    @NotNull
    default String getId() {
        return "";
    }

    @NotNull
    IProjectionPlayableItem getMediaSource();

    @NotNull
    PlayerState getPlayerState();

    @NotNull
    String getRealName();

    @NotNull
    String h();

    @NotNull
    Observable<DeviceState> i();

    @NotNull
    Observable<IProjectionPlayableItem> j();

    void n();

    default boolean o() {
        return true;
    }

    void p(boolean z6);

    void pause();

    void q(@NotNull NoItem noItem);

    default void r(@Nullable InterfaceC7845m interfaceC7845m) {
    }

    void resume();

    void seekTo(long j7);

    default boolean sendDanmaku(@NotNull String str, int i7, int i8, int i9) {
        return false;
    }

    default void setId(@NotNull String str) {
    }

    default void setSpeed(float f7) {
    }

    void stop();

    default void switchQuality(int i7) {
    }

    void u(boolean z6);

    default boolean v() {
        return false;
    }

    @NotNull
    Observable<PlayerState> w();

    @NotNull
    Pair<Integer, Integer> y();

    default void z() {
        stop();
    }
}
