package com.bilibili.live.streaming.source;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraGlobalConfig.class */
public class CameraGlobalConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static int primaries;
    private static int range;
    private static int receiver;
    private static int transfer;
    private static int yuvMatrix;
    private static int zteHacks;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CameraGlobalConfig$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getPrimaries() {
            return CameraGlobalConfig.primaries;
        }

        public final int getRange() {
            return CameraGlobalConfig.range;
        }

        public final int getReceiver() {
            return CameraGlobalConfig.receiver;
        }

        public final int getTransfer() {
            return CameraGlobalConfig.transfer;
        }

        public final int getYuvMatrix() {
            return CameraGlobalConfig.yuvMatrix;
        }

        public final int getZteHacks() {
            return CameraGlobalConfig.zteHacks;
        }

        public final void setPrimaries(int i7) {
            CameraGlobalConfig.primaries = i7;
        }

        public final void setRange(int i7) {
            CameraGlobalConfig.range = i7;
        }

        public final void setReceiver(int i7) {
            CameraGlobalConfig.receiver = i7;
        }

        public final void setTransfer(int i7) {
            CameraGlobalConfig.transfer = i7;
        }

        public final void setYuvMatrix(int i7) {
            CameraGlobalConfig.yuvMatrix = i7;
        }

        public final void setZteHacks(int i7) {
            CameraGlobalConfig.zteHacks = i7;
        }
    }
}
