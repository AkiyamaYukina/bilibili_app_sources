package com.bilibili.studio.videoeditor.capturev3.logic;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/Accelerometer.class */
public class Accelerometer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static CLOCKWISE_ANGLE f109184d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f109185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109186b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f109187c = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/Accelerometer$CLOCKWISE_ANGLE.class */
    public enum CLOCKWISE_ANGLE {
        Deg0(0),
        Deg90(1),
        Deg180(2),
        Deg270(3);

        private int value;

        CLOCKWISE_ANGLE(int i7) {
            this.value = i7;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/Accelerometer$a.class */
    public final class a implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i7) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float f7 = fArr[0];
                float f8 = fArr[1];
                float f9 = fArr[2];
                if (Math.abs(f7) > 3.0f || Math.abs(f8) > 3.0f) {
                    if (Math.abs(f7) > Math.abs(f8)) {
                        if (f7 > 0.0f) {
                            Accelerometer.f109184d = CLOCKWISE_ANGLE.Deg0;
                            return;
                        } else {
                            Accelerometer.f109184d = CLOCKWISE_ANGLE.Deg180;
                            return;
                        }
                    }
                    if (f8 > 0.0f) {
                        Accelerometer.f109184d = CLOCKWISE_ANGLE.Deg90;
                    } else {
                        Accelerometer.f109184d = CLOCKWISE_ANGLE.Deg270;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.studio.videoeditor.capturev3.logic.Accelerometer$a, java.lang.Object] */
    public Accelerometer(Context context) {
        this.f109185a = (SensorManager) context.getSystemService("sensor");
        f109184d = CLOCKWISE_ANGLE.Deg90;
    }
}
