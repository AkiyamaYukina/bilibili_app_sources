package com.bilibili.live.streaming.helper;

import android.hardware.Camera;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/helper/CameraHelper.class */
public final class CameraHelper {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/helper/CameraHelper$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getNumOfCameras() {
            return Camera.getNumberOfCameras();
        }

        public final void setColorFormat(@NotNull Camera.Parameters parameters) {
            if (parameters.getSupportedPreviewFormats().contains(17)) {
                parameters.setPreviewFormat(17);
            }
        }

        public final void setFlashMode(@NotNull Camera.Parameters parameters, @NotNull String str) {
            if (parameters.getSupportedFlashModes() == null || !parameters.getSupportedFlashModes().contains(str)) {
                return;
            }
            parameters.setFlashMode(str);
        }

        public final void setFocusMode(@NotNull Camera.Parameters parameters) {
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes == null) {
                return;
            }
            if (supportedFocusModes.contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            } else if (supportedFocusModes.contains("auto")) {
                parameters.setFocusMode("auto");
            } else if (supportedFocusModes.contains("fixed")) {
                parameters.setFocusMode("fixed");
            }
        }

        public final void setPreviewSize(@NotNull Camera.Parameters parameters, int i7, int i8) {
            parameters.setPreviewSize(i7, i8);
        }
    }
}
